package controllers;


import models.*;

import play.mvc.*;
import java.util.*;
import java.lang.*;
import play.data.*;
import static play.data.Form.*;

import views.html.*;


public class Application extends Controller {

    public Result index() {
        return ok(index.render("Hello"));
    }
    public Result products() {
        List<Stock> stock = Stock.find.all();
        return ok(products.render(stock));
    }
    public Result createItem(){
        Form<Stock> productForm = form(Stock.class);
        return ok(
            create_item.render(productForm)
        );
    }
    public Result save(){
        Form<Stock> productForm = form(Stock.class).bindFromRequest();
        if(productForm.hasErrors()){
            return badRequest(create_item.render(productForm));
        }
        productForm.get().save();
        return redirect(routes.Application.index());
    }
    public Result item(Long id) {
      Stock stock = Stock.find.byId(id);
      return ok(item.render(stock));
    }


}
