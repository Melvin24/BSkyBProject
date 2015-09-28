package models;

import play.*;
import play.mvc.*;
import play.db.*;

import com.avaje.ebean.Model;
import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import java.sql.*;
import java.util.*;
import javax.persistence.*;

@Entity
public class Orders extends Model {
  
  @Id
  public Long order_id;
  public Long customer_id;
  public String date;
  public Long price;
  public Long order_status_id;
    
  public static Finder<Integer,Orders> find = new Finder<Integer,Orders>(
    Integer.class, Orders.class
  ); 
}
