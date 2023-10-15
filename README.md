# Проект по автоматизации тестовых сценариев для сайта компании [Сибирское здоровье](https://siberianhealth.com/ru))

[![images](assets/images/logo_company.jpg)](https://siberianhealth.com/ru)

## Содержание:
+ [Стек технологий](#стек-технологий)  
+ [Тестовые сценарии](#Тестовые-сценарии)
+ [Сборка в Jenkins](#Сборка-в-Jenkins)
+ [Команды запуска тестов в терминале](#Команды-запуска-тестов-в-терминале)
+ [Интеграция с Allure report](#Интеграция-с-Allure-report)
+ [Видео прохождения тестов](#cinema-Пример-видео-прохождения-тестов)
+ [Интеграция с Jira](#-Интеграция-с-Jira)
+ [Информирование в Telegram](#Информирование-в-Telegram)

## <a name="стек-технологий"></a>Стек технологий
<p align="center">
<a href="https://www.java.com/"><img src="assets/images/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="assets/images/GitHub.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://www.jetbrains.com/idea/"><img src="assets/images/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://gradle.org/"><img src="assets/images/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="assets/images/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://junit.org/junit5/"><img src="assets/images/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://aerokube.com/selenoid/"><img src="assets/images/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://www.jenkins.io/"><img src="assets/images/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="assets/images/Allure_Report.svg" width="50" height="50"  alt="Allure Reports"/></a>
<a href="https://telegram.org/"><img src="assets/images/Telegram.svg" width="50" height="50"  alt="Telegram"/></a>
</p>

## <a name="Тестовые-сценарии"></a>Тестовые сценарии
- Проверка центральной страницы
- Проверка шапки сайта
- Проверка страницы "О нас"
- Проверка стараницы "Новости компании"
- Проверка старинцы "Начни бизнес с нами"

## <a name="Сборка-в-Jenkins"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/sveta_siberianhealth_com_test/)

<p align="center">
<img src="assets/screenshots/JenkinsScreenshot.jpg" alt="Jenkins Build">
</p>

### Параметры сборки проекта

| Параметр        | Назначение                               |
|-----------------|------------------------------------------|
| TASK            | Опция выбора запуска определённых тестов |
| SELENOID_URL    | Удаленный сервер для запуска тестов      |
| BROWSER         | Браузер для запуска                      |
| BROWSER_VERSION | Версия браузера                          |
| BROWSER_SIZE    | Разрешение экрана                        |
| COMMENT         | Комментарий                              |

## <a name="Команды-запуска-тестов-в-терминале"></a>Команды запуска тестов в терминале
```bash
gradle clean
${TASK}
-DbrowserServer=${BROWSER_SERVER}
-DserverCreds=${SERVER_CREDS}
-Dbrowser=${BROWSER}
-DbrowserVersion=${BROWSER_VERSION}
-DbrowserSize=${BROWSER_SIZE}
```

## <a name="Интеграция-с-Allure-report"></a>Интеграция с [Allure report](https://jenkins.autotests.cloud/job/sveta_siberianhealth_com_test/6/allure/)

### Главная страница отчета
<p align="center">
<img src="assets/screenshots/Allure-report.jpg" alt="Allure report">
</p>

### Тест-кейсы

<p align="center">
<img src="assets/screenshots/Allure-testCase.jpg" alt="Test Case">
</p>

### Графики

<p align="center">
<img src="assets/screenshots/Allure-graph.jpg" alt="Allure-graph">
</p>

## <a name="Информирование-в-Telegram"></a>Информирование в Telegram

### Уведомление из переписки с чат ботом

<p align="center">
<img src="assets/screenshots/Telegram.jpg" alt="TestOps launch">
</p>


#### Содержание уведомления в Telegram

- Проект
- Комментарий
- Длительность прохождения тестов
- Общее количество сценариев
- Процент прохождения тестов
- Ссылка на Allure отчет
