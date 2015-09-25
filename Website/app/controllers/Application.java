package controllers;

import play.*;
import play.mvc.*;
import play.db.*;
import java.sql.*;
import java.util.*;

import views.html.*;

public class Application extends Controller {

    Connection connection;

    public Result index() {
        return ok(index.render(queryThis().toString()));
    }

    public Result product() {
      return ok(index.render(queryThis().toString()));
    }

    private void connectMe(){
        try{
            this.connection = DB.getConnection();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
    private void closeConnection(){
        try{
            this.connection.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("");
        }
    }
    private ArrayList<String> queryThis(){

        ArrayList<String> objects =  new ArrayList<String>();
        connectMe();
        try{
            Statement st = this.connection.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM products");
            while (rs.next() ){
                objects.add(rs.getString("name"));
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            closeConnection();
            return objects;
        }
    }
}
