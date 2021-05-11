<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="head.jsp"%>
<html>
<head>
    <title>Login</title>
</head>
<body class="bg-gradient-primary">
<div class="container">

    <!-- Outer Row -->
    <div class="row justify-content-center">

        <div class="col-xl-10 col-lg-12 col-md-9">

            <div class="card o-hidden border-0 shadow-lg my-5">
                <div class="card-body p-0">
                    <!-- Nested Row within Card Body -->
                    <div class="row">
                        <div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
                        <div class="col-lg-6">
                            <div class="p-5">
                                <div class="text-center">
                                    <h1 class="h4 text-gray-900 mb-4">Edit Your Game</h1>
                                </div>
                                <form action="editUserGame" method="POST">
                                    <c:forEach items="${games}" var="userGameList">
                                        <input type="radio" id="id" name="idInput" value="${userGameList.id}" checked>
                                        <label for="id">Id: ${userGameList.id}</label>
                                        <p>Platform:</p>
                                        <input type="text" id="title" name="platformInput" placeholder="ex Xbox One" value="${userGameList.platform}">
                                        <br/>
                                        <br/>
                                        <div class="text-center">
                                        <input type="submit" name="editUserGame" value="Complete Edit" />
                                    </c:forEach>
                                </form>
                                <hr>

                                    <a class="small" href="usergame.jsp">Back to Your Games</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- Bootstrap core JavaScript-->
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="js/sb-admin-2.min.js"></script>
</body>
</html>
