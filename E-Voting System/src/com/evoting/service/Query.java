package com.evoting.service;



import java.sql.Statement;

import com.evoting.service.DbConnection;

public class Query {

	public int doRegistration(String cName, String cAddress, String cWebsite,
			String cEmail, String voterDetails, String pass, String cpass)
	{
		int i=0;
		try {
			
			Statement st = DbConnection.getConn().createStatement();
			String strQuery = "INSERT INTO registration(cName,cAddress,cWebsite,cEmail,vDetails,pass,cpass)" +
					" VALUES ('"+cName+"','"+cAddress+"','"+cWebsite+"','"+cEmail+"','"+voterDetails+"','"+pass+"','"+cpass+"');";
			i = st.executeUpdate(strQuery);
			DbConnection.closeConn();
			return i;
			}	
		catch (Exception e) {
		      e.printStackTrace();
		    }
			
			return i;
			
		}

}
	
