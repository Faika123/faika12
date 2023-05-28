<%--
  Created by IntelliJ IDEA.
  User: 21656
  Date: 27/05/2023
  Time: 20:11
  To change this template use File | Settings | File Templates.
--%>


<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">users</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarText">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">

                <li class="nav-item">
                    <a class="nav-link" href=hello-servlet>Hello</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled">Bonjour ${sessionScope.pNom} </a>
                </li>
            </ul>
            <span class="navbar-text">
      <strong>Vous avez la bienvenue!</strong>
      </span>
        </div>
    </div>
</nav>