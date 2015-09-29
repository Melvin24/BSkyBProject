# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table address (
  address_id                bigint auto_increment not null,
  address_line1             varchar(255),
  address_line2             varchar(255),
  postcode                  varchar(255),
  city                      varchar(255),
  constraint pk_address primary key (address_id))
;

create table customer (
  customer_id               bigint auto_increment not null,
  address_id                bigint,
  sky_customer_id           bigint,
  surname                   varchar(255),
  forename                  varchar(255),
  constraint pk_customer primary key (customer_id))
;

create table orders (
  order_id                  bigint auto_increment not null,
  customer_id               bigint,
  date                      varchar(255),
  price                     bigint,
  order_status_id           bigint,
  constraint pk_orders primary key (order_id))
;

create table stock (
  stock_id                  bigint auto_increment not null,
  category_id               bigint,
  name                      bigint,
  total_stock               bigint,
  unit_price                bigint,
  constraint pk_stock primary key (stock_id))
;

create table users (
  sky_id                    bigint auto_increment not null,
  constraint pk_users primary key (sky_id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table address;

drop table customer;

drop table orders;

drop table stock;

drop table users;

SET FOREIGN_KEY_CHECKS=1;

