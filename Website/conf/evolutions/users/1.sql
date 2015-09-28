# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table users (
  sky_id                    bigint not null,
  constraint pk_users primary key (sky_id))
;

create sequence users_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists users;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists users_seq;

