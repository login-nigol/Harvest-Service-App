create table app_users
(
    u_id       bigint generated by default as identity primary key,
    u_email    varchar(255),
    u_name     varchar(255),
    u_password varchar(255),
    u_role     varchar(50)
        constraint app_user_u_role_check
            check ((u_role)::text = ANY
                   ((ARRAY ['ADMIN':: character varying, 'APP_USER':: character varying, 'CLIENT':: character varying])::text[])
                )
);
alter table app_users
    owner to postgres;


create table foot_products
(
    foot_pr_id  bigint generated by default as identity primary key,
    pr_title_id varchar(255),
    pr_desc_id  varchar(255),
    pr_price_id numeric(38, 2),
    user_id     bigint,
    constraint fk_user_id foreign key (user_id) references app_users
);
alter table foot_products
    owner to postgres;


create table product_carts
(
    pr_cart_id   bigint generated by default as identity primary key,
    pr_cart_info varchar(255),
    user_id      bigint,
    constraint fk_user_id foreign key (user_id) references app_users
);
alter table product_carts
    owner to postgres;


create table product_orders
(
    pr_order_id    bigint generated by default as identity primary key,
    order_amount   double precision,
    order_date     timestamp(6) with time zone,
    pr_order_desc  varchar(255),
    pr_order_title varchar(255),
    order_status   varchar(50)
        constraint order_id_order_status_check
            check ((order_status)::text = ANY
                   ((ARRAY ['ORDER_ACCEPTED'::character varying, 'ORDER_PAYD'::character varying])::text[])),
    pr_cart_id     bigint,
    constraint fk_cart_id foreign key (pr_cart_id) references product_carts
);
alter table product_orders
    owner to postgres;
