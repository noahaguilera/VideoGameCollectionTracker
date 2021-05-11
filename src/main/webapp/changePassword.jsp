<%@include file="head.jsp"%>
<html>
<head>
    <title>Change Password</title>
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
                        <div class="col-lg-6 d-none d-lg-block bg-password-image"></div>
                        <div class="col-lg-6">
                            <div class="p-5">
                                <div class="text-center">
                                    <h1 class="h4 text-gray-900 mb-4">Change Password</h1>

                                <form action="updateUser" method="POST">
                                    <p>Please enter username:</p>
                                    <input type="text" id="userName" name="userNameInput" placeholder="User Name" value="">
                                    <br/>
                                    <br/>
                                    <p>Please enter new password:</p>
                                    <input type="text" id="password" name="passwordInput" placeholder="Password123" value="">
                                    <br/>
                                    <br/>
                                    <input type="submit" name="changePassword" value="Change Password" />
                                </form>
                                </div>
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
