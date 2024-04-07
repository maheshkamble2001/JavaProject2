package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Customer;
import com.utility.CustomerDao;

@WebServlet("/DeleteCustomer")
public class DeleteCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public DeleteCustomer() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Customer cust = new Customer();
		cust.setCid(Integer.parseInt(request.getParameter("cid")));
		CustomerDao dao = new CustomerDao();
		
		if(dao.DeleteCustomer(cust)>0)
		{
			out.print("<h1>Data deleted successfully!</h1>");
			request.getRequestDispatcher("/ReadAllCustomer.jsp").include(request,response);
		}
		else {
			out.print("<h1>Data failed to delete !</h1>");
			request.getRequestDispatcher("/ReadAllCustomer.jsp").include(request,response);
		}

	}

}
