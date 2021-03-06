#language: ru

Функционал: Страхование

  Сценарий: Заявка на оформление полиса Страхование Путешественника

    Когда Осуществлен переход на страницу сбербанка
    Когда Выбран пунк меню "Застраховать себя"
    Когда Выбран пунк меню - "Страхование путешественников"
    Когда Выполнена проверка текстовки Страхование путешественников на странице SP
    Когда Выполнено нажатие на кнопку - оформить онлайн
    Тогда Выполнен переход на страницу выбора полиса
    Когда Выполнено нажатие на поле 'выберите сумму страховой защиты' - Минимальная
    Когда Выполнено нажатие на кнопку Продолжить
    Когда заполняются поля:
      | Фамилия        | Иванов     |
      | Имя            | Иван       |
      | Отчество       | Иванович   |
      | Фамилия2       | Ivanov     |
      | Имя2           | Ivan       |
      | Дата рождения  | 01.01.1990 |
      | Дата рождения2 | 01.01.1990 |
    Тогда значения полей равны:
      | Фамилия        | Иванов     |
      | Имя            | Иван       |
      | Отчество       | Иванович   |
      | Фамилия2       | Ivanov     |
      | Имя2           | Ivan       |
      | Дата рождения  | 01.01.1990 |
      | Дата рождения2 | 01.01.1990 |
    Когда Выполнено нажатие на кнопку - Продолжить
    Тогда Проверка появления текста Заполнены не все обязательные поля


