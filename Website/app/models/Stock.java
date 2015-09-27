package models;

import play.*;
import play.mvc.*;
import play.db.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import java.sql.*;
import java.util.*;
import javax.persistence.*;

@Entity
public class Stock extends Model {
  @Id
  public int stockID;
  public int categoryID;
  public String name;
  public long total_stock;
  public double unit_price;

}
