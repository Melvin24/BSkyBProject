package models;

import play.db.ebean.*;
import javax.persistence.*;


@Entity
public class ItemCategory extends Model {

  @Id
  public Long category_id;
  public String name;


}
