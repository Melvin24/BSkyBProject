package controllers;

import play.*;
import play.mvc.*;
import play.db.*;
import java.sql.*;
import java.util.*;

public class DataSourceConnection{

    private DataSource connection;
    private boolean connected = false;

    private void connectMe(){
        try{
          if(this.connection!=null){
              this.connection = DB.getDatasource();
              this.connected  = true;
          }
        }
        catch(Exception e){
            throw new IllegalArgumentException("ERR_OPEN");
            this.connected  = false;
        }
    }
    private void closeConnection(){
        try{
            if(this.connection!=null){
                this.connection.close();
                this.connected = false;
            }
        }
        catch(Exception e){
            throw new IllegalArgumentException("ERR_CLOSE");
        }
        finally {
            this.connected = true;
        }
    }
}
