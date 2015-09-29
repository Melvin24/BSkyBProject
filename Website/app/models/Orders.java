package models;

import play.db.ebean.*;
import javax.persistence.*;


@Entity
public class Orders extends Model {
  
  @Id
  public Long order_id;
  public Long customer_id;
  public String date;
  public Long price;
  public Long order_status_id;
 
}
