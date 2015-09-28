package controllers;

import com.avaje.ebean.Model;
import play.*;
import play.mvc.*;
import play.db.*;
import java.sql.*;
import java.util.*;
import java.lang.*;

import views.html.*;
import models.*;

public class Application extends Controller {

    public Result index() {
        List<Customer> c = Customer.find.all();
        List<Users> u = Users.find.all();
        return ok(index.render(c,u));
    }

    public Result products() {
        return ok(products.render("list of all the products"));
    }

    public Result item(String itemName) {
      return ok(item.render(itemName));
    }


}
