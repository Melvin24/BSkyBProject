package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class CustomerLoyalty extends Model {

  @Id
  public Long loyalty_id;
  public Long customer_id;
  
  public static Finder<Long,CustomerLoyalty > find = new Finder<Long,CustomerLoyalty >(Long.class,CustomerLoyalty.class);

}
