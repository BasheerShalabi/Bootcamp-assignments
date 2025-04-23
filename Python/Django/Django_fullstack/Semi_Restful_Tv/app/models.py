from django.db import models

# Create your models here.
class ShowManager(models.Manager):
    def validate_show(self, post):
        errors = {}
        if Show.objects.filter(title=post['title']).exists():
            errors['title'] = "Title already exists."
        if len(post['title']) < 2:
            errors['title'] = "Title must be at least 2 characters long."
        if len(post['network']) < 3:
            errors['network'] = "Network must be at least 3 characters long."
        if len(post['description']) < 10 and len(post['description']) != 0:
            errors['description'] = "Description must be at least 10 characters long."
        if len(post['release_date']) == 0:
            errors['release_date'] = "Release date cannot be empty."
        return errors

class Show(models.Model):
    title = models.CharField(max_length=100)
    network = models.CharField(max_length=100)
    description = models.TextField()
    release_date = models.DateField()
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    objects = ShowManager()

def add_show(post):
    new = Show.objects.create(
        title=post['title'],
        network=post['network'],
        description=post['description'],
        release_date=post['release_date']
    )
    return new.id

def get_all_shows():
    return Show.objects.all()

def get_show_by_id(show_id):
    return Show.objects.get(id=show_id)

def update_show(show_id, post):
    show = Show.objects.get(id=show_id)
    show.title = post['title']
    show.network = post['network']
    show.description = post['description']
    show.release_date = post['release_date']
    show.save()

def delete_show(show_id):
    show = Show.objects.get(id=show_id)
    show.delete()