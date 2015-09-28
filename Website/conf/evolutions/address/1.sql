# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table address (
  address_id                bigint not null,
  address_line1             varchar(255),
  address_line2             varchar(255),
  postcode                  varchar(255),
  city                      varchar(255),
  constraint pk_address primary key (address_id))
;

create sequence address_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists address;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists address_seq;

