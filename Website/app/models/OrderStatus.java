package models;

import play.db.ebean.*;
import javax.persistence.*;


@Entity
public class OrderStatus extends Model {

  @Id
  public Long order_status_id;
  public String name;

}
