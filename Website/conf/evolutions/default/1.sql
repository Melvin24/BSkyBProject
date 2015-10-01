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

create table customer_loyalty (
  loyalty_id                bigint auto_increment not null,
  customer_id               bigint,
  constraint pk_customer_loyalty primary key (loyalty_id))
;

create table item_category (
  category_id               bigint auto_increment not null,
  name                      varchar(255),
  constraint pk_item_category primary key (category_id))
;

create table loyalty_points (
  loyalty_id                bigint auto_increment not null,
  name                      varchar(255),
  points                    bigint,
  is_percent                varchar(255),
  constraint pk_loyalty_points primary key (loyalty_id))
;

create table order_status (
  order_status_id           bigint auto_increment not null,
  name                      varchar(255),
  constraint pk_order_status primary key (order_status_id))
;

create table ordered_items (
  ordered_items_id          bigint auto_increment not null,
  order_id                  bigint,
  stock_id                  bigint,
  quantity                  integer,
  constraint pk_ordered_items primary key (ordered_items_id))
;

create table orders (
  order_id                  integer auto_increment not null,
  customer_id               integer,
  date                      datetime(6),
  price                     integer,
  order_status_id           integer,
  constraint pk_orders primary key (order_id))
;

create table stock (
  stock_id                  bigint auto_increment not null,
  category_id               bigint,
  name                      varchar(255),
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

drop table customer_loyalty;

drop table item_category;

drop table loyalty_points;

drop table order_status;

drop table ordered_items;

drop table orders;

drop table stock;

drop table users;

SET FOREIGN_KEY_CHECKS=1;

