## Система онлайн-бронирования билетов.


### Диаграмма структуры проекта:

![ticket booking servise diagram.png](src%2Fmain%2Fjava%2Fbooking_service%2Fproject_info%2Fticket%20booking%20servise%20diagram.png)

### Схемы таблиц базы данных:

![administrator entity table.png](src%2Fmain%2Fjava%2Fbooking_service%2Fproject_info%2Fadministrator%20entity%20table.png)

![user entity table.png](src%2Fmain%2Fjava%2Fbooking_service%2Fproject_info%2Fuser%20entity%20table.png)

![order entity table.png](src%2Fmain%2Fjava%2Fbooking_service%2Fproject_info%2Forder%20entity%20table.png)

![ticket entity table.png](src%2Fmain%2Fjava%2Fbooking_service%2Fproject_info%2Fticket%20entity%20table.png)

![peyment entity table.png](src%2Fmain%2Fjava%2Fbooking_service%2Fproject_info%2Fpeyment%20entity%20table.png)

![transfer entity table.png](src%2Fmain%2Fjava%2Fbooking_service%2Fproject_info%2Ftransfer%20entity%20table.png)

### Архитектура и основные модули


#### Пользовательские роли:

o Администратор: Управление билетами, пользователями.

o Клиент: Поиск и бронирование билетов, оплата заказов.

#### Основные модули:

o Модуль авторизации: Реализован через Spring Security с JWT токенами.

o Модуль бронирования билетов: Управление билетами и заказами.

o Платёжный сервис: Имитация оплаты с фиктивными ответами.


### Основные сущности


#### Admin (Администратор):

o Управление пользователями, билетами.

#### User (Пользователь): 

o Поиск билетов, управление заказами, оплата заказа.

#### Ticket (Билет):

o Данные о маршруте, стоимости.

#### Order (Заказ): 

o Содержит информацию о пользователе, билете, статусе оплаты.

#### Payment (Оплата): 

o Содержит информацию об оплате.