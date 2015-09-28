package models;

import play.*;
import play.mvc.*;
import play.db.*;

import com.avaje.ebean.Model;
import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import java.sql.*;
import java.util.*;
import javax.persistence.*;

@Entity
public class Users extends Model {
    @Id
    public Long sky_id;
    
    public static Finder<Integer,Users> find = new Finder<Integer,Users>(
        Integer.class, Users.class
    ); 
    
}
