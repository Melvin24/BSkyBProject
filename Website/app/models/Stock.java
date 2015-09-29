package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

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
