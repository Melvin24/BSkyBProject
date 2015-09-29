package models;

import play.db.ebean.Model;
import javax.persistence.*;


@Entity
public class Stock extends Model {
  
  @Id
  public Long stock_id;
  public Long category_id;
  public String name;
  public Long total_stock;
  public Long unit_price;
 
}
