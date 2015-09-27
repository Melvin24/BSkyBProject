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
public class OrderStatus extends Model {
  @Id
  public int orderStatusID;
  public String name;
}
