package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class LoyaltyPoints extends Model {

  @Id
  public Long loyalty_id;
  public String name;
  public Long points;
  public String is_percent;
  
  public static Finder<Long,LoyaltyPoints > find = new Finder<Long,LoyaltyPoints >(Long.class,LoyaltyPoints.class);

}
