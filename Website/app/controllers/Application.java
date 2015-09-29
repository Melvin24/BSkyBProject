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

    public Result customers(){
        List<Customer> c = new Model.Finder(Long.class,Customer.class).all();
        return ok(toJson(c));
    }
    /*
    public Result addresses(){
        List<Address> c = new Model.Finder(Long.class,Address.class).all();
        return ok(toJson(c));
    }
    public Result orders(){
        List<Orders> c = new Model.Finder(Long.class,Orders.class).all();
        return ok(toJson(c));
    }
    */
    public Result products() {
        return ok(products.render("list of all the products"));
    }

    public Result item(String itemName) {
      return ok(item.render(itemName));
    }


}
