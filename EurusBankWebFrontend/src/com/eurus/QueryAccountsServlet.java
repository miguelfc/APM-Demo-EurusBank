package com.eurus;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

/**
 * Servlet implementation class QueryAccountsServlet
 */
@WebServlet("/queryAccounts")
public class QueryAccountsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public QueryAccountsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		QueryAccountsWsLocator locator = new QueryAccountsWsLocator();
		String error = "";
		String accountBalance = "";
		try {
			accountBalance = locator.getqueryAccountsWsHttpSoap11Endpoint().queryAccountsByName("Josete");
		} catch (ServiceException e) {
			e.printStackTrace();
			error = e.getMessage();
		}

		String homepage = "<html><head><title>Eurus Bank Web Portal</title></head><body>";
		homepage += "<h1>Welcome to Eurus Bank!</h1>";
		homepage += "<p>Your account statement is: </p><pre>" + accountBalance
				+ "</pre><p>Don't worry, we are keeping your money safe.</p>";
		homepage += "<p>Served at " + new Date() + "</p>";
		if (!error.equals("")) {
			homepage += "<p>Error caught: <pre>" + error + "</pre></p>.";
		}
		homepage += "</body></html>";
		response.getWriter().append(homepage);
	}

}
