package models;

import play.db.ebean.*;
import javax.persistence.*;


@Entity
public class OrderedItems extends Model {

  @Id
  public Long ordered_items_id;
  public Long order_id;
  public Long stock_id;
  public Long quantity;

}
