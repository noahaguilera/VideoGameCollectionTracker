<%@include file="head.jsp"%>
<html>
<body>
<h2>Change Password</h2>
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
</body>
</html>
