<%@include file="head.jsp"%>
<html>
<body>
<h2>Sign Up</h2>
<form action="addUser" method="POST">
    <p>User Name:</p>
    <input type="text" id="userName" name="userNameInput" placeholder="User Name" value="">
    <br/>
    <br/>
    <p>Email:</p>
    <input type="text" id="email" name="emailInput" placeholder="example@gmail.com" value="">
    <br/>
    <br/>
    <p>Password:</p>
    <input type="text" id="password" name="passwordInput" placeholder="Password123" value="">
    <br/>
    <br/>
    <input type="submit" name="signup" value="Sign Up" />
</form>
</body>
</html>
