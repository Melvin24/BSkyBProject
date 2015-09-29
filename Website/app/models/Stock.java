package models;

import play.db.ebean.Model;
import javax.persistence.*;

import com.avaje.ebean.*;


@Entity
public class Stock extends Model {
  
  @Id
  public Long stock_id;
  public Long category_id;
  public String name;
  public Long total_stock;
  public Long unit_price;
  
  public static Finder<Long,Stock> find = new Finder<Long,Stock>(Long.class,Stock.class);
 
}
