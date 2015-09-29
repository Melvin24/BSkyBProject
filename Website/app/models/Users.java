package models;

import play.db.ebean.Model;
import javax.persistence.*;

@Entity
public class Users extends Model {
    @Id
    public Long sky_id;
}
