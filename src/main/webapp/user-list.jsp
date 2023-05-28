<%--
  Created by IntelliJ IDEA.
  User: 21656
  Date: 27/05/2023
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Management</title>
    <%@include file = "links.jsp"%>
    <
</head>
<body>
<%@include file="menu.jsp"%>
<div class = "container">
    <div class = "row">
        <div class = "col-6">
        </div>
    </div>
</div>
<form action="user" methode = "post" name="userform">
    <label class ="form-label" for="nom">Nom:</label>
    <input class="form-control" name="nom" id="nom" type="text" placeholder="Donner votre nom" required />
    <label class ="form-label" for="prenom">Prenom:</label>
    <input class="form-control" name="prenom" id="prenom" type="text" placeholder="Donner votre prenom" required /> <br>
    <label class ="form-label" for="email">Email:</label>
    <input class="form-control" name="email" id="email" type="text" placeholder="Donner votre email" required /> <br>
    <label class ="form-label" for="motdepasse">Motdepasse:</label>
    <input class="form-control" name="motdepasse" id="motdepasse" type="text" placeholder="Donner votre motdepasse" required /> <br>
    <button class="btn btn-primary" type="submit" name="save">Add</button><br>
    <button class="btn btn-primary" type="submit" name="save">delete</button><br>
    <button class="btn btn-primary" type="submit" name="save">update</button>
</form>
<table class="table">
    <thead>
    <tr>
        <th scope="col">#</th>
        <th scope="col">Nom</th>
        <th scope="col">Prenom</th>
        <th scope="col">Email</th>
        <th scope="col">Motdepasse</th>

    </tr>
    </thead>
    <tbody>
    <tr>
        <th scope="row">1</th>
        <td>Mark</td>
        <td>Otto</td>
        <td>@mdo</td>
    </tr>
    <tr>
        <th scope="row">2</th>
        <td>Jacob</td>
        <td>Thornton</td>
        <td>@fat</td>
    </tr>
    <tr>
        <th scope="row">3</th>
        <td colspan="2">Larry the Bird</td>
        <td>@twitter</td>
    </tr>
    </tbody>
</table>

</body>
</html>



