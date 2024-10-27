## Система онлайн-бронирования билетов.


### Диаграмма структуры проекта:

![ticket booking servise diagram.png](src%2Fmain%2Fjava%2Fbooking_service%2Fproject_info%2Fticket%20booking%20servise%20diagram.png)

### Схемы таблиц базы данных:

![administrator entity table.png](src%2Fmain%2Fjava%2Fbooking_service%2Fproject_info%2Fadministrator%20entity%20table.png)
![user entity table.png](src%2Fmain%2Fjava%2Fbooking_service%2Fproject_info%2Fuser%20entity%20table.png)
![order entity table.png](src%2Fmain%2Fjava%2Fbooking_service%2Fproject_info%2Forder%20entity%20table.png)
![ticket entity table.png](src%2Fmain%2Fjava%2Fbooking_service%2Fproject_info%2Fticket%20entity%20table.png)
![peyment entity table.png](src%2Fmain%2Fjava%2Fbooking_service%2Fproject_info%2Fpeyment%20entity%20table.png)


## Архитектура и основные модули


### Основные модули:

o Модуль авторизации: Реализован через Spring Security с JWT токенами.

o Модуль управления сервисом: Все необходимые операции по пользователям и билетам.

o Модуль бронирования билетов: Поиск билетов, оформление заказов.

o Платёжный сервис: Имитация оплаты с фиктивными ответами.


## Основные сущности


### Admin (Администратор):

o Управление пользователями, билетами.

### User (Пользователь): 

o Поиск билетов, управление заказами, оплата заказа.

### Ticket (Билет):

o Данные о маршруте и стоимости.

### Order (Заказ): 

o Содержит информацию о пользователе, билете, статусе оплаты.

### Payment (Оплата): 

o Содержит информацию об оплате.