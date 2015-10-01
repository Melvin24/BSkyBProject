package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;



@Entity
public class OrderStatus extends Model {

  @Id
  public Long order_status_id;
  public String name;
  
  public static Finder<Long,OrderStatus> find = new Finder<Long,OrderStatus>(Long.class,OrderStatus.class);

}
