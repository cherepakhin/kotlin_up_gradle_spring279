Feature: Проверка работы метода echo

  Scenario: Echo test
    Given a request url http://127.0.0.1:8080/api/echo/aaa
    When the request sends GET
    Then Получен текст aaa

  Scenario: Echo с цифрой
    Given a request url http://127.0.0.1:8080/api/echo/111
    When the request sends GET
    Then Получена какая-то цифра
