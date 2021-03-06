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
                            <h1 class="h4 text-gray-900 mb-4">Create an Account!</h1>
                        </div>
                        <form action="addUser" method="POST" class="user">
                            <div class="form-group row">
                                <div class="col-sm-6 mb-3 mb-sm-0">
                                    <input type="text" id="userName" name="userNameInput" class="form-control form-control-user"
                                           placeholder="Username" value="" maxlength="25" required>
                                </div>
                            </div>
                            <div class="form-group">
                                <input type="email" class="form-control form-control-user" id="email" name="emailInput"
                                       placeholder="Email Address" value="" maxlength="50" required>
                            </div>
                            <div class="form-group row">
                                <div class="col-sm-6 mb-3 mb-sm-0">
                                    <input type="password" id="password" name="passwordInput" class="form-control form-control-user"
                                           placeholder="Password" value="" maxlength="30" required>
                                </div>
                                <div class="col-sm-6">
                                    <input type="password" id="secondPassword" name="secondPasswordInput" class="form-control form-control-user"
                                           placeholder="Repeat Password" value="" maxlength="30" required oninput="check(this)">
                                    <script language='javascript' type='text/javascript'>
                                        function check(input) {
                                            if (input.value != document.getElementById('password').value) {
                                                input.setCustomValidity('Password Must be Matching.');
                                            } else {
                                                // input is valid -- reset the error message
                                                input.setCustomValidity('');
                                            }
                                        }
                                    </script>
                                </div>
                            </div>
                            <input type="submit" name="signup" value="Sign Up" class="btn btn-primary btn-user btn-block"/>
                        </form>
                        <hr>
                        <div class="text-center">
                            <a class="small" href="login.jsp">Already have an account? Login!</a>
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
