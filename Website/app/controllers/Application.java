package controllers;

import models.*;
import play.*;
import play.mvc.*;
import play.db.ebean.Model;
import java.sql.*;
import java.util.*;
import java.lang.*;

import static play.libs.Json.toJson;

import views.html.*;


public class Application extends Controller {

    public Result index() {
        return ok(index.render("Hello"));
    }
    public Result products() {
        List<Stock> stock = new Model.Finder(Long.class,Stock.class).all();
        return ok(products.render(stock));
    }
    

    public Result item(String itemName) {
      return ok(item.render(itemName));
    }


}
