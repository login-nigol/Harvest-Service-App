INSERT INTO app_users (u_email, u_name, u_password, u_role)
VALUES ('admin@mail.ru', 'Admin', 'admin', 'ADMIN'),
       ('user@mail.ru', 'User', 'user', 'APP_USER');

--получаем id пользователей для использования в других таблицах
WITH user_ids AS (SELECT u_id AS admin_id FROM app_users WHERE u_name = 'Admin User' LIMIT 1),
     regular_user AS (SELECT u_id AS user_id FROM app_users WHERE u_name = 'Regular User' LIMIT 1)
--добавляем корзины для пользователей
INSERT
INTO product_carts (pr_cart_info, user_id)
VALUES ('Admin Cart', (SELECT admin_id FROM user_ids)),
       ('User Cart', (SELECT user_id FROM regular_user));

--получаем id корзин для добавления заказов
WITH cart_ids AS (SELECT pr_cart_id AS admin_cart_id FROM product_carts WHERE pr_cart_info = 'Admin Cart' LIMIT 1),
     user_cart AS (SELECT pr_cart_id AS user_cart_id FROM product_carts WHERE pr_cart_info = 'User Cart' LIMIT 1)
--добавляем заказы в корзины
INSERT
INTO product_orders (order_amount, order_date, pr_order_desc, pr_order_title, order_status, pr_cart_id)
VALUES (150.75, NOW(), 'Admin Order Meat', 'Meat', 'ORDER_ACCEPTED',
        (SELECT admin_cart_id FROM cart_ids)),
       (200.50, NOW(), 'Admin Order Milk', 'Milk', 'ORDER_PAYD',
        (SELECT admin_cart_id FROM cart_ids)),
       (75.00, NOW(), 'User Order Cheese', 'Cheese', 'ORDER_ACCEPTED',
        (SELECT user_cart_id FROM user_cart)),
       (120.25, NOW(), 'User Order Bread', 'Bread', 'ORDER_PAYD',
        (SELECT user_cart_id FROM user_cart));



--получаем id пользователей для привязки продуктов
WITH admin_user_id AS (SELECT u_id AS admin_id FROM app_users WHERE u_name = 'Admin User' LIMIT 1),
     regular_user_id AS (SELECT u_id AS user_id FROM app_users WHERE u_name = 'Regular User' LIMIT 1)
--добавляем продукты для каждого пользователя
INSERT
INTO foot_products (pr_title_id, pr_desc_id, pr_price_id, user_id)
VALUES ('Admin Product Meat', 'Description for Admin Product Meat', 50.25,
        (SELECT admin_id FROM admin_user_id)),
       ('Admin Product Milk', 'Description for Admin Product Milk', 100.50,
        (SELECT admin_id FROM admin_user_id)),
       ('User Product Cheese', 'Description for User Product Cheese', 30.75,
        (SELECT user_id FROM regular_user_id)),
       ('User Product Bread', 'Description for User Product Bread', 45.00,
        (SELECT user_id FROM regular_user_id));
