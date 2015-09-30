package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class Address extends Model {
  
  @Id
  public Long address_id;
  public String addressLine1;
  public String addressLine2;
  public String postcode;
  public String city;
  
  public static Finder<Long,Address > find = new Finder<Long,Address >(Long.class,Address.class);
    
}
