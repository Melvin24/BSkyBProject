package controllers;


import models.*;

import play.mvc.*;
import java.util.*;
import java.lang.*;
import play.data.*;
import static play.data.Form.*;
import static play.libs.Json.toJson;

import com.twilio.sdk.*;
import com.twilio.sdk.resource.factory.*;
import com.twilio.sdk.resource.instance.*;
import com.twilio.sdk.resource.list.*;

import org.apache.http.NameValuePair;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import views.html.*;



public class Application extends Controller {
    
     // Find your Account Sid and Token at twilio.com/user/account
     public static final String ACCOUNT_SID = "AC051c9238648d83634e82a75f82a9d44a";
     public static final String AUTH_TOKEN = "d0b002329c305948e9293997e3e42242";

    public Result index() {
         return ok(home.render("Advertisments and shop"));
    }
    
    public Result sendsms(String to, String body) throws TwilioRestException {
        TwilioRestClient client = new TwilioRestClient(ACCOUNT_SID, AUTH_TOKEN);

	    // Build the parameters
	    List<NameValuePair> params = new ArrayList<NameValuePair>();
	    params.add(new BasicNameValuePair("To", to));
	    params.add(new BasicNameValuePair("From", "Sky Store"));
	    params.add(new BasicNameValuePair("Body", body));

	    MessageFactory messageFactory = client.getAccount().getMessageFactory();
	    Message message = messageFactory.create(params);
	    //System.out.println(message.getSid());
	    
	    return null;
	 
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
    
    public Result viewallorders(){
        List<Orders> orders= Orders.find.all();

        return ok(viewallorders.render(orders));
    }

    public Result item(Long id) {
      Stock stock = Stock.find.byId(id);
      if(stock == null){
          return redirect(routes.Application.index());
       }
      return ok(item.render(stock));
    }

    public Result faq() {
      return ok(faq.render("FAQ page"));
    }

    public Result shoppingBag() {
        return ok(shoppingBag.render("shopping Bag page"));
        // Checkout
    }
    
    public Result checkout(int id, int price) {
        //String id = form().bindFromRequest().get("id");
        
        Orders orders = new Orders();
        orders.createOrder(id, price);
        orders.save();
        
        //Orders checkoutData = form().bindFromRequest();
        //sendsms("+44750816679","Order confirmation: Thank you very much for shopping at the Sky Store.");
        return redirect(routes.Application.index());
   
    }

    public Result backofhouse() {
        return ok(backofhouse.render());
    }

    public Result addItem() {
        String id = form().bindFromRequest().get("id");
        
        OrderedItems ordereditems = new OrderedItems();
        ordereditems.orderStock();
        ordereditems.update(id);
        
        //return ok();
        
        //flash("success", "Stock has been ordered!");
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
