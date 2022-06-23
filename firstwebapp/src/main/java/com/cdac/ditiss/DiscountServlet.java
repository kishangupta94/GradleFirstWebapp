 package com.cdac.ditiss;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
			String coupon = request.getParameter ("coupon");
			int discountValue = 0;
if ( coupon.equals ("SUPERSALE" ))
	discountValue = 70;
else if ( coupon.equals ("HOLI" ))
	discountValue = 20;

			request.setAttribute ("discount", "Enjoy its free of cost FOR " + coupon + " is " + discountValue + "%");
			request.getRequestDispatcher ("response.jsp").forward( request, response);
            		
}
}
