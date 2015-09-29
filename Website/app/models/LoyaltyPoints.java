package models;

import play.db.ebean.*;
import javax.persistence.*;


@Entity
public class LoyaltyPoints extends Model {

  @Id
  public Long loyalty_id;
  public String name;
  public Long points;
  public String is_percent;

}
