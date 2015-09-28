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
public class Customer extends Model {
  
  @Id
  public Long customer_id;
  public Long address_id;
  public Long skyCustomer_id;
  public String surname;
  public String forename;
  
    
  public static Finder<Integer,Customer> find = new Finder<Integer,Customer>(
    Integer.class, Customer.class
  ); 
}
