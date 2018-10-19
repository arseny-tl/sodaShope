create table product (
  id serial not null,
  product_name varchar(50) not null,
  product_price decimal (19,2) not null,
  product_balance integer,
  primary key (id)
);

create table purchase_order (
  id serial not null,
  varchar(50) not null,
  description varchar(512) not null,
  primary key (id)
);

create table user_account (
  id serial not null,
  exam_id bigint not null references exam (id),
  question_order bigint not null,
  description text not null,
  primary key (id)
);

create table alternative (
  id serial not null,
  question_id bigint not null references question (id),
  alternative_order bigint not null,
  description text not null,
  correct boolean not null,
  primary key (id)
);

create table attempt (
  id serial not null,
  user_id varchar(255) not null references "user" (id),
  alternative_id bigint not null references alternative (id),
  correct boolean not null,
  date timestamp without time zone not null,
  primary key (id)
);