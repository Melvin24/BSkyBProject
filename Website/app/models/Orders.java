package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class Orders extends Model {
  
  @Id
  public Long order_id;
  public Long customer_id;
  public String date;
  public Long price;
  public Long order_status_id;

  public static Finder<Long,Orders> find = new Finder<Long,Orders>(Long.class,Orders.class);
 
}
