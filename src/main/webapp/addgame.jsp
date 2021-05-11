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
                                    <h1 class="h4 text-gray-900 mb-4">Add a Game</h1>
                                </div>
                                <form action="addGame" method="POST">
                                    <p>Game Title:</p>
                                    <input type="text" id="title" name="titleInput" placeholder="Title" value="">
                                    <br/>
                                    <br/>
                                    <p>Age Rating:</p>
                                    <input type="text" id="rating" name="ratingInput" placeholder="ex E" value="">
                                    <br/>
                                    <br/>
                                    <p>Game Description:</p>
                                    <input type="text" id="description" name="descriptionInput" placeholder="" value="">
                                    <br/>
                                    <br/>
                                    <p>Image Url:</p>
                                    <input type="text" id="gameImg" name="gameImgInput" placeholder="something.jpg" value="">
                                    <br/>
                                    <br/>
                                    <p>Release Date:</p>
                                    <input type="text" id="release_date" name="releaseDateInput" placeholder="2021-03-26" value="">
                                    <br/>
                                    <br/>
                                    <input type="submit" name="signup" value="Add Game" />
                                </form>
                                <hr>
                                <div class="text-center">
                                    <a class="small" href="home.jsp">Back Home</a>
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