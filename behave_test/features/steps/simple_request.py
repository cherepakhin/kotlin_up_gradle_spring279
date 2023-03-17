from behave_restful.lang import *

@given('Запрос на')
def step_impl(context,test_url):
    context.execute_steps('given a request url {}'.format(context.settings['test_host']+test_url))

@then('Получена какая-то цифра')
def step_impl(context):
    assert context.response.status_code == 200
    assert context.response.text.isdigit()

@then('Получен какой-то json')
def step_impl(context):
    assert context.response.status_code == 200
    print(context.response.text)

@then('Получен текст {text}')
def step_impl(context,text):
    assert context.response.status_code == 200
    assert context.response.text == text
