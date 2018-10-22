create table product (
  id serial not null,
  product_name varchar(50) not null,
  product_price decimal (19,2) not null,
  product_balance integer,
  primary key (id)
);

create table purchase_order (
  id serial not null,
  purchase_id integer not null,
  customer_id integer not null references user_account.id,
  product_id integer not null references product.id,
  quaintity integer not null,
  price numeric (19,2) not null references product.id,
  primary key (id)
);

create table user_account (
  id serial not null,
  username varchar(255) not null,
  password varchar (255) not null,
  wallet_blance numeric (19,2) not null default 0.00,
  primary key (id)
);