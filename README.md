***Практикумы Нетологии по Java***

## Задание

Дан набор данных о продажах конкретного предприятия по месяцам: `[8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18]`. Компании могут быть крупными, продажи могут быть до 5 млрд в месяц.

Необходимо написать небольшой сервис, который умеет по предоставленному ему массиву месячных продаж рассчитывать:

* номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*;
* номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*;
* сумму всех продаж;
* среднюю сумму продаж в месяц;
* количество месяцев, в которых продажи были ниже среднего;
* количество месяцев, в которых продажи были выше среднего.
  
*Примечание: в задании нужно найти последний месяц, соответствующий условиям.

Сервис должен представлять собой один класс с шестью методами — по методу на пункт. Входные данные для расчёта сервис должен принимать в параметрах своих методов.

Написать на каждый метод по одному автотесту, который проверяет правильность работы на тестовых данных.

**Ход выполнения и результаты:**

1. Создаем проект на базе Maven и сервисный класс [`StatsService`](https://github.com/SvetlanaKh-1/StatsSales/blob/master/src/main/java/ru/netology/StatsService/services/StatsService.java) со всеми необходимыми методами.
2. Создаем тестовый класс [`StatsServiceTest`](https://github.com/SvetlanaKh-1/StatsSales/blob/master/src/test/java/ru/netology/StatsService/services/StatsServiceTest.java) с тестовыми данными.
3. Запускаем тесты с помощью `mvn clean test` и убеждаемся что они все запускаются и проходят.