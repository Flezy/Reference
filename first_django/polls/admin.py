from django.contrib import admin
from polls.models import Question

class QuestionAdmin(admin.ModelAdmin):
    fieldsets = [
        (None,                  {'fields':  ['question_text']}),
        ('Date information',    {'fields':  ['pubdate'],            'classes': ['collapse']})
      ]
admin.site.register(Question, QuestionAdmin)

# Register your models here.
