package controllers;

import play.*;
import play.mvc.*;
import play.db.*;
import java.sql.*;
import java.util.*;

import views.html.*;

public class Application extends Controller {

    DataSourceConnection databaseModelSource;

    public Result index() {
        return ok(index.render("Hello World"));
    }

    public Result products() {
        return ok(products.render("list of all the products"));
    }

    public Result item(String itemName) {
      return ok(item.render(itemName));
    }

}
