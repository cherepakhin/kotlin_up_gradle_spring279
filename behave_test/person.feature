Feature: Проверка работы метода person

  Scenario: Echo test
    Given a request url http://127.0.0.1:8080/api/person/1
    When the request sends GET
    Then Получен текст aaa
