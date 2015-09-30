package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class ItemCategory extends Model {

  @Id
  public Long category_id;
  public String name;

  public static Finder<Long,ItemCategory > find = new Finder<Long,ItemCategory >(Long.class,ItemCategory.class);
}
