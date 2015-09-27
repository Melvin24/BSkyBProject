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
public class OrderedItems extends Model {
  @Id
  public int orderedItemsID;
  public int orderID;
  public int stockID;
  public int quantity;
}
