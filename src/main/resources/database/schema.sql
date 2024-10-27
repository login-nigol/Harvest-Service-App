CREATE TABLE "administrators"
(
    "admin_id"       SERIAL PRIMARY KEY,
    "admin_name"     VARCHAR(125) NOT NULL,
    "admin_surname"  VARCHAR(125) NOT NULL,
    "admin_email"    VARCHAR(50)  NOT NULL,
    "admin_phone"    VARCHAR(50)  NOT NULL,
    "admin_password" VARCHAR(25)  NOT NULL,
    "admin_role"     VARCHAR(25)  NOT NULL DEFAULT 'ROLE_ADMIN',
    "user_id"        INTEGER
);
COMMENT ON TABLE "administrators" IS 'Управление пользователями, билетами, заказами.';


CREATE TABLE "users"
(
    "user_id"       SERIAL PRIMARY KEY,
    "user_name"     VARCHAR(125) NOT NULL,
    "user_surname"  VARCHAR(125),
    "user_email"    VARCHAR(50)  NOT NULL,
    "user_phone"    VARCHAR(50),
    "user_password" VARCHAR(25)  NOT NULL,
    "user_role"     VARCHAR(25)  NOT NULL DEFAULT 'ROLE_USER',
    "order_id"      INTEGER
);
COMMENT ON TABLE "users" IS 'Просмотр и бронирование билетов, оплата заказов.';


CREATE TABLE "orders"
(
    "order_id"         SERIAL PRIMARY KEY,
    "order_title"      VARCHAR(50),
    "order_info"       VARCHAR(255),
    "order_created_at" TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    "order_amount"     DECIMAL(10, 2),
    "order_state"      VARCHAR(25),
    "ticket_id"      INTEGER,
    "payment_id"     INTEGER
);
COMMENT ON TABLE "orders" IS 'Cодержит информацию о пользователе, билете, статусе оплаты.';


CREATE TABLE "tickets"
(
    "ticket_id"          SERIAL PRIMARY KEY,
    "ticket_title"       VARCHAR(50),
    "ticket_description" VARCHAR(1000),
    "ticket_price"       DECIMAL(10, 2),
    "ticket_discount"    DECIMAL(5, 2) DEFAULT 0,
    "ticket_image_path"  VARCHAR(255)
);
COMMENT ON TABLE "tickets" IS 'Содержит данные о маршруте, стоимости.';


CREATE TABLE "payments"
(
    "payment_id"         SERIAL PRIMARY KEY,
    "payment_info"       VARCHAR(255),
    "payment_created_at" TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
COMMENT ON TABLE "payments" IS 'Содержит данные об оплате.';
