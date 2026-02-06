package seng2050.lab2;
//code initially coppied from HelloWorldServlet.

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GenerateValidHTML extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head> <title> example title </title> </head>");
        out.println("<body>");
        out.println("\t<h1> example html text</h1>");
        out.println("\t<p> example paragraph tag text</p>");
        out.println("</body>");
        out.println("</html>");

    }
}
