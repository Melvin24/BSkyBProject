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
public class Address extends Model {
  
  @Id
  public Long address_id;
  public String addressLine1;
  public String addressLine2;
  public String postcode;
  public String city;
    
  public static Finder<Integer,Address> find = new Finder<Integer,Address>(
    Integer.class, Address.class
  ); 
}
