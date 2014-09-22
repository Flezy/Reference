from django.contrib import admin
from polls.models import Question, Choice

class ChoiceinLine(admin.TabularInline):
    model = Choice
    extra = 3
        
    

class QuestionAdmin(admin.ModelAdmin):
    fieldsets = [
        (None,                  {'fields':  ['question_text']}),
        ('Date information',    {'fields':  ['pubdate']})
    ]
    inlines = [ChoiceinLine]
    list_display = ('question_text', 'pubdate', 'was_published_recently')
admin.site.register(Question, QuestionAdmin)

# Register your models here.
