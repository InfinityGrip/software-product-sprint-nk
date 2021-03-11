package com.google.sps.servlets;
import java.util.ArrayList;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/MyServelt")
public class HelloWorld extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    ArrayList<String> contaner = new ArrayList<String>();
    contaner.add("stay cool");
    contaner.add("pace your self");
    contaner.add("believe yourself");
    contaner.add("gladiators go!");
    response.setContentType("text/html;");
    response.getWriter().println(contaner);
  }
}