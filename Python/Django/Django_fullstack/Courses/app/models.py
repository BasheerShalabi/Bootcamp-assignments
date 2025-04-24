from django.db import models

# Create your models here.
class CourseManager(models.Manager):
    def validate(self,post):
        errors = {}
        if len(post['name']) < 5:
            errors['name'] = "Course name must be at least 5 characters"
        if len(post['description']) < 15:
            errors['description'] = "Description must be at least 15 characters"
        return errors
    
    

class Description(models.Model):
    description = models.TextField()
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)

class Course(models.Model):
    name = models.CharField(max_length=255)
    description = models.OneToOneField(Description, on_delete=models.CASCADE, related_name="course")
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)
    
    objects = CourseManager()

class Comment(models.Model):
    comment = models.TextField()
    course = models.ForeignKey(Course, on_delete=models.CASCADE, related_name="comments")
    created_at = models.DateTimeField(auto_now_add=True)
    updated_at = models.DateTimeField(auto_now=True)


def get_all_courses():
    return Course.objects.all()

def get_all_comments_of_course(course_id):
    course = Course.objects.get(id=course_id)
    comments = course.comments.all()
    return comments

def add_course(name, text):
    description = Description.objects.create(description=text)
    course = Course.objects.create(name=name, description=description)
    return course

def add_comment_to_course(course_id, comment):
    course = Course.objects.get(id=course_id)
    new_comment = Comment.objects.create(comment=comment, course=course)
    return new_comment

def delete_course(course_id):
    course = Course.objects.get(id=course_id)
    course.delete()
