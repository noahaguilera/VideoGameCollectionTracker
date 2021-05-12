<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="head.jsp" />
<html>
<body class="bg-gradient-primary">

<div class="container">

    <div class="card o-hidden border-0 shadow-lg my-5">
        <div class="card-body p-0">
            <!-- Nested Row within Card Body -->
            <div class="row">
                <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
                <div class="col-lg-7">
                    <div class="p-5">
                        <div class="text-center">
                            <h1 class="h4 text-gray-900 mb-4">Add Game to Your Collection</h1>
                        </div>
                        <form action="addUserGame" method="POST">
                            <c:forEach items="${games}" var="gameList">
                            <input type="radio" id="id" name="idInput" value="${gameList.id}" checked>
                            <label for="id">Id: ${gameList.id}</label>
                            <h2>Want to add ${gameList.title} to your games?
                                <br/>
                                <br/>
                                <p>Platform:</p>
                                <input type="text" id="platform" name="platformInput" placeholder="Ex: Xbox One" value="">
                                <br/>
                                <br/>
                                <div class="text-center">
                                <input type="submit" name="addUserGame" value="Add Game" />
                                </c:forEach>
                        </form>
                        <hr>

                            <a href="game.jsp">Back to Games</a>
                            <br>
                            <a href="home.jsp">Back Home</a>
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


