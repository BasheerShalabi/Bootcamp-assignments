from django.db import models
import bcrypt
import re
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

class BookManager(models.Manager):
    def validate_book(self, postData):
        errors = {}
        if len(postData['title']) < 2:
            errors['title'] = "Title must be at least 2 characters"
        if len(postData['description']) < 5:
            errors['description'] = "Description must be at least 10 characters"
        return errors


class User(models.Model):
    first_name = models.CharField(max_length=255)
    last_name = models.CharField(max_length=255)
    email = models.EmailField()
    password = models.CharField(max_length=255)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

    objects = UserManager()

class Book(models.Model):
    title = models.CharField(max_length=255)
    description = models.TextField()
    favorited_by = models.ManyToManyField(User, related_name="favorite_books")
    uploaded_by = models.ForeignKey(User, related_name="uploaded_books", on_delete=models.CASCADE)
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

    objects = BookManager()

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
        
def get_all_books():
    return Book.objects.all()

def get_book_by_id(book_id):
    return Book.objects.get(id=book_id)

def get_favorites_by_user(user_id):
    user = User.objects.get(id=user_id)
    return user.favorite_books.all()

def get_favorites_by_book(book_id):
    book = Book.objects.get(id=book_id)
    return book.favorited_by.all()

def add_favorite(book_id, user_id):
    user = User.objects.get(id=user_id)
    book = Book.objects.get(id=book_id)
    book.favorited_by.add(user)
    return book

def add_book(post, user_id):
    user = User.objects.get(id=user_id)
    book = Book.objects.create(title=post['title'], description=post['description'], uploaded_by=user)
    add_favorite(book.id, user_id)
    return book

def update_book(post):
    book = Book.objects.get(id=post['book_id'])
    book.title = post['title']
    book.description = post['description']
    book.save()
    return book

def unfavorite_book(book_id, user_id):
    user = User.objects.get(id=user_id)
    book = Book.objects.get(id=book_id)
    book.favorited_by.remove(user)
    return book

def delete_book(book_id):
    book = Book.objects.get(id=book_id)
    book.delete()