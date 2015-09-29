package models;


import play.db.ebean.*;
import javax.persistence.*;

@Entity
public class Address extends Model {
  
  @Id
  public Long address_id;
  public String addressLine1;
  public String addressLine2;
  public String postcode;
  public String city;
    
}
