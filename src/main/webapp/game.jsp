<%@include file="head.jsp"%>
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
                            <h1 class="h4 text-gray-900 mb-4">Games</h1>

                        <form action="searchGame" method="POST">
                            <input type="text" id="title" name="titleInput" placeholder="Game Title" value="">
                            <input type="submit" name="search" value="Search" />
                            <input type="submit" name="all" value="Show All Games" />
                        </form>
                        </div>
                        <hr>
                        <div class="text-center">
                            <a href="addgame.jsp">Add a Game</a>
                            <br>
                            <a href="home.jsp">Home</a>
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

