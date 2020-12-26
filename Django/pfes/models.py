from django.db import models

# Create your models here.


class Type(models.Model):
    type = models.CharField(max_length=20, null=False, blank=False)


class Pfe(models.Model):
    title = models.CharField(max_length=254, null=False, blank=False)
    type = models.ForeignKey(Type, on_delete=models.CASCADE, null=False, blank=False)

  