from django.db import models
import bcrypt
import re
from datetime import datetime, timedelta ,timezone
# Create your models here.
class UserManager(models.Manager):
    def validate_login(self, postData):
        errors = {}
        if len(postData['email']) < 5:
            errors['email'] = "Email must be at least 5 characters"
        return errors
    def validate_register(self, postData):
        errors = {}
        EMAIL_REGEX = re.compile(r'^[a-zA-Z0-9.+_-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]+$')
        if len(postData['first_name']) < 2:
            errors['first_name'] = "First name must be at least 2 characters"
        if len(postData['last_name']) < 2:
            errors['last_name'] = "Last name must be at least 2 characters"
        if User.objects.filter(email=postData['email']).exists():
            errors['email'] = "Email already in use"
        if not EMAIL_REGEX.match(postData['email']):
            errors['email'] = "Invalid email address"
        if len(postData['password']) < 8:
            errors['password'] = "Password must be at least 8 characters"
        if postData['password'] != postData['confirm_password']:
            errors['password'] = "Passwords do not match"
        return errors

class User(models.Model):
    first_name = models.CharField(max_length=255)
    last_name = models.CharField(max_length=255)
    email = models.EmailField()
    password = models.CharField(max_length=255)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects = UserManager()

class Message(models.Model):
    message = models.TextField()
    user = models.ForeignKey(User, related_name="messages", on_delete=models.CASCADE)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

class Comment(models.Model):
    comment = models.TextField()
    user = models.ForeignKey(User, related_name="comments", on_delete=models.CASCADE)
    message = models.ForeignKey(Message, related_name="comments", on_delete=models.CASCADE)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)



def register_user(first_name, last_name, email, password):
    hashed = bcrypt.hashpw(password.encode(), bcrypt.gensalt()).decode()
    user = User.objects.create(first_name=first_name, last_name=last_name, email=email, password=hashed)
    return user

def login_user(email, password):
        user = User.objects.filter(email=email).first()
        if not user:
            return None
        if bcrypt.checkpw(password.encode(), user.password.encode()):
            return user
        else:
            return None

def get_messages():
    return Message.objects.all()
def get_comments():
    return Comment.objects.all()

def add_message(user_id, message):
    user = User.objects.get(id=user_id)
    Message.objects.create(user=user, message=message)

def add_comment(user_id, message_id, comment):
    user = User.objects.get(id=user_id)
    message = Message.objects.get(id=message_id)
    Comment.objects.create(user=user, message=message, comment=comment)

def delete_message(message_id):
    message = Message.objects.get(id=message_id)
    if datetime.now(timezone.utc) - message.created_at > timedelta(minutes=30):
        return False
    else:
        message.delete()
        return True