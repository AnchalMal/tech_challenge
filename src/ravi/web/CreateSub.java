package ravi.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import ravi.model.myJson;
import ravi.services.OAuthDataHandel;

public class CreateSub extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        String eventUrl = (String) request.getParameter("eventUrl");
        System.out.println("**************"+eventUrl);
        
    //    String OAuthdata = OAuth.hitEvent(eventUrl);
        String outhdata;
        outhdata =  OAuthDataHandel.hitEventData(eventUrl) ; 
 

        ObjectMapper mapper = new ObjectMapper();
/*
        BufferedReader reader = request.getReader();
        User user1 = mapper.readValue(reader, User.class);
*/
        myJson js = new myJson("true", "999");
		String json = mapper.writeValueAsString(js);
        out.print(json);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        ObjectMapper mapper = new ObjectMapper();
        
        
        
    }
}


