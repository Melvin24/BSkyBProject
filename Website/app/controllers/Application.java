package controllers;

import models.*;
import play.*;
import play.mvc.*;
import play.db.ebean.Model;
import java.sql.*;
import java.util.*;
import java.lang.*;
import play.data.Form;

import static play.libs.Json.toJson;

import views.html.*;

public class Application extends Controller {
  /*
    public Result index() {
         return ok(products.render("list of all the products"));
       // List<Customer> c = Customer.find.all();
        //List<Users> u = Users.find.all();
        //return ok(index.render(c,u));
    }*/

    public Result index() {

         return ok(home.render("Advertisments and shop"));
    }

    public Result tshirts() {
        return ok(tshirts.render("list of all the tshirts"));
    }

    public Result phones() {
        return ok(phones.render("list of all the phones"));
    }

    public Result gnomes() {
        return ok(gnomes.render("list of all the gnomes"));

    }
    public Result products() {
        List<Stock> stock = Stock.find.all();
        return ok(products.render(stock));

    }
    
    public Result item(Long id) {
      Stock stock = Stock.find.byId(id);
      return ok(item.render(stock));
    }

    public Result faq() {
      return ok(faq.render("FAQ page"));
    }


}
