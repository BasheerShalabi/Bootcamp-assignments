from django.db import models

class Book(models.Model):
    title = models.CharField(max_length=255)
    desc = models.TextField(blank=True) 
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)



class Author(models.Model):
    first_name = models.CharField(max_length=45)
    last_name = models.CharField(max_length=45)
    notes=models.TextField(blank=True)
    books = models.ManyToManyField(Book, related_name="authors")
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

def add_book(post):
    return Book.objects.create(title=post['title'],desc=post['desc'])

def get_book():
    return Book.objects.all()

def add_author(post):
    return Author.objects.create(first_name=post['first_name'],last_name=post['last_name'])

def get_author():
    return Author.objects.all()

def get_book_by_id(id):
    return Book.objects.get(id=id)

def get_author_by_id(id):
    return Author.objects.get(id=id)

def add_author_to_book(book_id,author_id):
    book =Book.objects.get(id=book_id)
    book.authors.add(Author.objects.get(id=author_id))

def add_book_to_author(book_id,author_id):
    author =Author.objects.get(id=author_id)
    author.books.add(Book.objects.get(id=book_id))