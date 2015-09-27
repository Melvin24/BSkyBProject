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
public class Customer extends Model {
  @Id
  public int customerID;
  public int addressID;
  public int skyCustomerID;
  public String surname;
  public String forename;
}
