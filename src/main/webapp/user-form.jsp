<%--
  Created by IntelliJ IDEA.
  User: 21656
  Date: 27/05/2023
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>

<head>
    <title>welcome</title>
    <%@include file = "links.jsp"%>

</head>
<body>

<%@include file="menu.jsp"%>
<div class=container pt-5>
    <div>
        <h1> Bonjour DevOps & Cloud </h1>
        <form action="hello-servlet" method = "post" name="form1">
            <label class ="form-label" for="nom">Nom:</label>
            <input class="form-control" name="nom" id="nom" type="text" placeholder="Donner votre nom" required />
            <label class ="form-label" for="prenom">Prenom:</label>
            <input class="form-control" name="prenom" id="prenom" type="text" placeholder="Donner votre prenom" required />
            <label class ="form-label" for="email">Email:</label>
            <input class="form-control" name="email" id="email" type="text" placeholder="Donner votre email" required />
            <label class ="form-label" for="motdepasse">Motdepasse:</label>
            <input class="form-control" name="motdepasse" id="motdepasse" type="text" placeholder="Donner votre motdepasse" required />
            <button class="btn btn-primary" type="submit" name="save">save</button>


        </form>
        <c:if test = "${ !empty pNom }">
            <div>
                Bonjour <c:out value="${ sessionScope.pNom }" />
            </div>
        </c:if>

        <a class ="btn btn-success" href="#">Test</a>
    </div
</div>
</body>
</html>
