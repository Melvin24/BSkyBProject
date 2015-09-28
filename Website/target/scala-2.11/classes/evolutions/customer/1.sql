# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table customer (
  customer_id               bigint not null,
  address_id                bigint,
  sky_customer_id           bigint,
  surname                   varchar(255),
  forename                  varchar(255),
  constraint pk_customer primary key (customer_id))
;

create sequence customer_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists customer;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists customer_seq;

