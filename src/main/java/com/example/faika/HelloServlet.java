package com.example.faika;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.ServletException;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String nom = "faika";
        String prenom = "benzaara";
        String email = "faikabenzaara@gmail.com";
        String motdepasse = "0000";
        String [] users = {"faika" , "siwar" ,"ghofrane"};

        request.setAttribute("prenom" , prenom);
        request.setAttribute("nom", nom);
        request.setAttribute("email", email);
        request.setAttribute("motdepasse", motdepasse);
        request.setAttribute("users", users);


        this.getServletContext().getRequestDispatcher("/user-form.jsp").forward(request, response);//redirection vers user-form.jsp
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pNom = req.getParameter("nom");
        String pPrenom = req.getParameter("prenom");
        String pEmail = req.getParameter("email");
        String pMotdepasse = req.getParameter("nom");

        HttpSession session = req.getSession();
        session.setAttribute("pNom" , pNom);
        session.setAttribute("pPrenom" , pPrenom);
        session.setAttribute("pEmail" , pEmail);
        session.setAttribute("pMotdepasse" , pMotdepasse);

        this.getServletContext().getRequestDispatcher("/user-form.jsp").forward(req, resp) ; //redirection vers user-form.jsp

    }
}




