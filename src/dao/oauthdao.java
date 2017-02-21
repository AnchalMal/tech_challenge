package dao;
import bean.Bean;
import ravi.util.DBConnectionManager;
import java.sql.*;
import com.mysql.jdbc.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;


public class oauthdao {

	
	
	        public void create(Bean bean) throws SQLException{
	            System.out.println("Before Connection");
	           Connection con = (Connection) DBConnectionManager.getConnection();
	           System.out.println("Before ps");
	           PreparedStatement ps=null;
	           System.out.println("after ps");
	           String query1 = "INSERT INTO marketplace(partner, baseUrl, uuid, openId, email) VALUES (?,?,?,?,?)";
	           ps = (PreparedStatement) con.prepareStatement(query1);
	           ps.setString(1, bean.getMarketplace().getPartner());
	          ps.setString(2, bean.getMarketplace().getBaseUrl());
	          ps.setString(3, bean.getCreator().getUuid());
	           ps.setString(4, bean.getCreator().getOpenId());
	           ps.setString(5, bean.getCreator().getEmail());
	          
	           ps.executeUpdate();
	          
	          
	           String query2= "INSERT INTO Company(uuid,name,email,phoneno,website,country,m_uuid) VALUES (?,?,?,?,?,?,?) ";
	           ps = (PreparedStatement) con.prepareStatement(query2);
	           
	          ps.setString(1, bean.getPayload().getCompany().getUuid());
	           ps.setString(2, bean.getPayload().getCompany().getName());
	           ps.setString(3, bean.getPayload().getCompany().getEmail());
	           ps.setString(4, bean.getPayload().getCompany().getPhoneNumber());
	           ps.setString(5, bean.getPayload().getCompany().getWebsite());
	           ps.setString(6, bean.getPayload().getCompany().getCountry());
	           ps.setString(7, bean.getCreator().getUuid());
	         
	           ps.executeUpdate();
	        
	    }

	    
	}


