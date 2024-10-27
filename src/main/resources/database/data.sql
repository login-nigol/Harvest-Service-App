INSERT INTO administrators (admin_name, admin_surname, admin_email, admin_phone, admin_password, admin_role)
VALUES ('Вадим', 'Антипов', 'vadim.antipov@gmx.de', '+491744843902',
        'admin', 'ROLE_ADMIN', 1);

INSERT INTO users (user_name, user_surname, user_email, user_phone, user_password, user_role)
VALUES ('Вася', 'Пупкин', 'pupkin@gmx.de', '+19876543210',
        'user', 'ROLE_USER', 1);

INSERT INTO orders (order_title, order_info, order_created_at, order_amount, order_state)
VALUES ('Concert Ticket Order', 'Ordering tickets for the concert of the band "Kino"',
        NOW(), 150.00, 'AWAITING_PAYMENT', 1);

INSERT INTO tickets (ticket_title, ticket_description, ticket_price, ticket_discount, ticket_image_path)
VALUES ('Ticket for the concert of the band "Kino"', 'VIP access to the concert',
        200.00, 20.00, 'src/main/java/booking_service/images/band kino.jpg',
        1);

INSERT INTO payments (payment_info, payment_created_at)
VALUES ('Payment for concert tickets', NOW(), 1);
