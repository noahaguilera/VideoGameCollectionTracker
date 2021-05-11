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
                                    <h1 class="h4 text-gray-900 mb-4">Edit Game</h1>
                                </div>
                                <form action="editGame" method="POST">
                                    <c:forEach items="${games}" var="gameList">
                                        <input type="radio" id="id" name="idInput" value="${gameList.id}" checked>
                                        <label for="id">Game id: ${gameList.id}</label>
                                        <p>Game Title:</p>
                                        <input type="text" id="title" name="titleInput" placeholder="ex Minecraft" value="${gameList.title}">
                                        <br/>
                                        <br/>
                                        <p>Age Rating:</p>
                                        <input type="text" id="rating" name="ratingInput" placeholder="ex E" value="${gameList.rating}">
                                        <br/>
                                        <br/>
                                        <p>Game Description:</p>
                                        <input type="text" id="description" name="descriptionInput" placeholder="" value="${gameList.description}">
                                        <br/>
                                        <br/>
                                        <p>Release Date:</p>
                                        <input type="text" id="release_date" name="releaseDateInput" placeholder="2021-03-26" value="${gameList.release_date}">
                                        <br/>
                                        <p>Game Cover URL:</p>
                                        <input type="text" name="coverInput" placeholder="something.jpg" value="${gameList.cover}">
                                        <br/>
                                        <br/>
                                        <br/>

                                        <input type="submit" name="editGame" value="Complete Edit" />
                                    </c:forEach>
                                </form>
                                <hr>
                                <div class="text-center">
                                    <a class="small" href="game.jsp">Back to Games</a>
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
