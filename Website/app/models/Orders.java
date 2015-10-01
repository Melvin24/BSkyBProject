package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class Orders extends Model {

  @Id
  public int order_id;
  public int customer_id;
  public Date date;
  public int price;
  public int order_status_id;

  public static Finder<Long,Orders> find = new Finder<Long,Orders>(Long.class,Orders.class);
  
  public void createOrder(int customer_id, int price) {
      this.price = price;
      this.customer_id = customer_id;
      this.order_status_id = 2;
      this.date = new Date();
      
      /*foreach (item in items) {
          
      }*/
  }

}
