# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table orders (
  order_id                  bigint not null,
  customer_id               bigint,
  date                      varchar(255),
  price                     bigint,
  order_status_id           bigint,
  constraint pk_orders primary key (order_id))
;

create sequence orders_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists orders;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists orders_seq;

