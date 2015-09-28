# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table customer (
  customer_id               bigint auto_increment not null,
  address_id                bigint,
  sky_customer_id           bigint,
  surname                   varchar(255),
  forename                  varchar(255),
  constraint pk_customer primary key (customer_id))
;

create table users (
  sky_id                    bigint auto_increment not null,
  constraint pk_users primary key (sky_id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table customer;

drop table users;

SET FOREIGN_KEY_CHECKS=1;

