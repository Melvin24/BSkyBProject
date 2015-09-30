package controllers;


import models.*;

import play.mvc.*;
import java.util.*;
import java.lang.*;
import play.data.*;
import static play.data.Form.*;
import static play.libs.Json.toJson;

import views.html.*;


public class Application extends Controller {

    public Result index() {
        return ok(
            index.render()
            );
    }
    
    public Result products() {
        List<Stock> stock = Stock.find.all();
        if(stock == null){
          return redirect(routes.Application.index());
        }
        return ok(products.render(stock));
    }
    public Result createItem(){
        Form<Stock> productForm = form(Stock.class);
        return ok(
            create_item.render(productForm)
        );
    }
    
    public Result deleteItem(Long id) {
        Stock.find.ref(id).delete();
        flash("success", "Stock has been deleted from the catalogue.");
        
        return redirect(routes.Application.allstock());
    }
    
    public Result save() {
        Form<Stock> productForm = form(Stock.class).bindFromRequest();
        if(productForm.hasErrors()){
            return badRequest(create_item.render(productForm));
        }
        productForm.get().save();
        return redirect(routes.Application.allstock());
    }
    
    public Result getActiveOrders(){
        List<Orders> orders= Orders.find.all();
        if(orders == null){
            return redirect(routes.Application.index());
        }
        return ok(toJson(orders));
    }
    
    public Result item(Long id) {
      Stock stock = Stock.find.byId(id);
      if(stock == null){
          return redirect(routes.Application.index());
       }
      return ok(item.render(stock));
    }

    // Checkout

    public Result checkout() {
        
        // Check customer is signed in.
        // if not... ask for details (guest login?)
        
        Form<Customer> customerForm = form(Customer.class);
        return ok(
            checkout.render(customerForm)
        );
    }
    
    public Result backofhouse() {
        return ok(backofhouse.render());
    }
    
    public Result addItem() {
        //stock = Stock.class.bindFromRequest();
       // stock.update(id)
       
        flash("success", "Stock has been ordered!");
        return redirect(routes.Application.allstock());
    }
    
    public Result allstock() {
        List<Stock> stock = Stock.find.all();
        if(stock == null){
          return redirect(routes.Application.index());
        }
        return ok(allstock.render(stock));
    }

}
