package prolab2_proje3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class vbBaglanti {
	
	static Connection baglantim;
	static Statement myStat;

	static ResultSet baglantiYap() {
		
      	ResultSet myRs = null;
      	try{
	        //Class.forName("com.mysql.jdbc.Driver");
      		String url2 = "jdbc:mysql://localhost:3306/muzýkveri?user=root&password=1234";
      		
             baglantim = DriverManager.getConnection(url2);
          	 myStat = (java.sql.Statement) baglantim.createStatement();
	         myRs = myStat.executeQuery("select * from sarki");
		 }
	        catch(Exception e){
	            e.printStackTrace();
	        }
		 return myRs;
	    }
	
	
	}

