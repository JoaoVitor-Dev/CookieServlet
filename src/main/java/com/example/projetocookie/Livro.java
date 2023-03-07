package com.example.projetocookie;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Livro", value = "/Livro")
public class Livro extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try(PrintWriter out=response.getWriter()){
            Cookie cookie=new Cookie("produto","livro");
            cookie.setMaxAge(3600*24);
            response.addCookie(cookie);
            out.println("<body>\n" +
                    "    <h1>Livro</h1>\n" +
                    "    <p>Promoção de Livro.</p>\n" +
                    "</body>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
