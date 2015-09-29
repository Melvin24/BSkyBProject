package models;

import play.db.ebean.*;
import javax.persistence.*;

@Entity
public class Users extends Model {
    @Id
    public Long sky_id;
}
