package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class OrderedItems extends Model {

  @Id
  public Long ordered_items_id;
  public Long order_id;
  public Long stock_id;
  public Long quantity;
  
  public static Finder<Long,OrderedItems> find = new Finder<Long,OrderedItems>(Long.class,OrderedItems.class);

}
