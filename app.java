package com.example.instagram;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class App extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
