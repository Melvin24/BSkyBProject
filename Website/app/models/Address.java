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
public class Address extends Model {
  @Id
  public int addressID;

  public String addressLine1;
  public String addressLine2;
  public String postcode;
  public String city;
}
