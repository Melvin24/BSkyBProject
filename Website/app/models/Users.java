package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class Users extends Model {
    @Id
    public Long sky_id;
    
    public static Finder<Long,Users> find = new Finder<Long,Users>(Long.class,Users.class);
}
