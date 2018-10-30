create table user_account (
  id serial not null,
  username varchar(255) not null,
  password varchar (255) not null,
  primary key (id)
);

create table product (
  id serial not null,
  product_name varchar(50) not null,
  product_price decimal (19,2) not null,
  product_balance integer,
  primary key (id)
);

create table purchases (
  id serial not null,
  product_id integer not null references product (id),
  quaintity integer not null,
  price numeric (19,2) not null,
  primary key (id)
);

create table customer (
  id serial not null,
  full_name varchar (255) not null,
  wallet_balance numeric (19,2) not null default 0.00,
  primary key (id)
);

create table cheque(
  id serial not null,
  cheque_number integer not null,
  customer_id integer not null references customer (id),
  purchase_id integer not null references purchases (id),
  sell_timestamp timestamp not null,
  primary key (id)
);