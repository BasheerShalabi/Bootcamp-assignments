from django.db import models

class User(models.Model):
    first_name = models.CharField(max_length=50)
    last_name = models.CharField(max_length=50)
    email_address = models.CharField(max_length=50)
    age = models.IntegerField()
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)


def create(post):
    return User.objects.create(first_name=post["first"],last_name=post["last"],email_address=post["email"],age=post["age"])

def get_all():
    return User.objects.all()