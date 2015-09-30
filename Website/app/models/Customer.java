package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Customer extends Model {
  
  @Id
  public Long customer_id;
  public Long address_id;
  public Long skyCustomer_id;
  public String surname;
  public String forename;
  
  public static Finder<Long,Customer > find = new Finder<Long,Customer >(Long.class,Customer.class);
  
}
