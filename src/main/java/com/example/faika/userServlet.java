package com.example.faika;

import com.example.faika.model.userDao;
import com.example.faika.model.user;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;
@WebServlet(name = "userServlet", value = "/user")

public class userServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //usDAao est un objet de classe StudentDao
        userDao usDao = new userDao();
        List<user> users = usDao.listuser();

        request.setAttribute("users", users);
        this.getServletContext().getRequestDispatcher("/user-List.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String nom = req.getParameter("nom");
        String prenom = req.getParameter("prenom");
        String email = req.getParameter("email");
        String motdepasse = req.getParameter("motdepasse");


        userDao usDao =new userDao();
        usDao.adduser(new user(+1, nom,prenom,email,motdepasse));
        usDao.deleteuser(new user(-1, nom,prenom,email,motdepasse));
        usDao.updateuser(new user(-1, nom,prenom,email,motdepasse));


        doGet(req , res);


    }
}

