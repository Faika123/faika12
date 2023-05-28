package com.example.faika.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class userDao {


    private Connection conn ;



    public void ConnectPostGreSql() {
        try {
            Class.forName("org.postgresql.Driver"); // chargement du driver
//            String url = "jdbc:postgresql://localhost/postgres?userClass.forName(" org.postgresql.Driver")
            String url = "jdbc:postgresql://localhost/postgres?user=postgres&password=faika";

            conn = DriverManager.getConnection(url);
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (SQLException e) {
            throw new RuntimeException (e) ;
        }

    }

    public List<user> listuser()
    {
        List<user> users = new ArrayList<user>();
        ConnectPostGreSql();

        Statement st = null ;
        try {
            st = conn.createStatement();
            ResultSet rs = st.executeQuery("select *  FROM users");
            while (rs.next()) {
                users.add(new user(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom"), rs.getString("email"), rs.getString("motdepasse")));
            }

            return users;
        }
        catch  (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }

    public void adduser(user u) {
        try {
            ConnectPostGreSql();
            PreparedStatement preparedStatement =
                    conn.prepareStatement("INSERT INTO users(nom, prenom,email,motdepasse) VALUES(?, ?,?,?);");
            preparedStatement.setString(1, u.getNom());
            preparedStatement.setString(2, u.getPrenom());
            preparedStatement.setString(3, u.getEmail());
            preparedStatement.setString(4, u.getMotdepasse());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException();

        }


    }
    public void deleteuser(user u) {
        try {
            ConnectPostGreSql();
            PreparedStatement preparedStatement =
                    conn.prepareStatement("DELETE FROM users WHERE id=?,?,?,?");
            preparedStatement.setString(1, u.getNom());
            preparedStatement.setString(2, u.getPrenom());
            preparedStatement.setString(3, u.getEmail());
            preparedStatement.setString(4, u.getMotdepasse());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException();

        }


    }
    public void updateuser(user u) {
        try {
            ConnectPostGreSql();
            PreparedStatement preparedStatement =
                    conn.prepareStatement("UPDATE users SET nom=?, prenom=?, email=?, motdepasse=? WHERE id=?");
            preparedStatement.setString(1, u.getNom());
            preparedStatement.setString(2, u.getPrenom());
            preparedStatement.setString(3, u.getEmail());
            preparedStatement.setString(4, u.getMotdepasse());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException();

        }


    }



}
