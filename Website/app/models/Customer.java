package models;

import play.db.ebean.Model;
import javax.persistence.*;

@Entity
public class Customer extends Model {
  
  @Id
  public Long customer_id;
  public Long address_id;
  public Long skyCustomer_id;
  public String surname;
  public String forename;
  
}
