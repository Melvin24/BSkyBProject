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
public class CustomerLoyaltyPoints extends Model {
  @Id
  public int loyaltyID;

  public String name;
  public int points;
  public byte is_percent;
}