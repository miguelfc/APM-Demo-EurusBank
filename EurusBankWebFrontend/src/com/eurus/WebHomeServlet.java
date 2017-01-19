package com.eurus;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WebHomeServlet
 */
@WebServlet("/")
public class WebHomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public WebHomeServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String homepage = "<html><head><title>Eurus Bank Web Portal</title></head><body>";
		homepage += "<h1>Welcome to Eurus Bank!</h1>";
		homepage += "<p>Please select one option to continue (we trust you, and you don't need to input a password!):</p>";
		homepage += "<ul><li><a href='./queryAccounts'>Check my accounts</a></li>"
				+ "<li><a href='./queryAccountsByBranch?branch=caimanIslands'>Check my accounts in Caiman Islands</a></li>"
				+ "<li><a href='./queryAccountsByBranch?branch=andorra'>Check my accounts in Andorra</a></li>"
				+ "<li><a href='./currencyConversion'>Convert to other currency</a></li>"
				+ "</ul>";
		homepage += "<p>Served at " + new Date() + "</p>";
		homepage += "</body></html>";
		response.getWriter().append(homepage);
	}

}
