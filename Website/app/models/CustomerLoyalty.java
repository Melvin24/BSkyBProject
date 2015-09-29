package models;

import play.db.ebean.Model;
import javax.persistence.*;


@Entity
public class CustomerLoyalty extends Model {

  @Id
  public Long loyalty_id;
  public Long customer_id;

}
