<%@include file="head.jsp"%>
<html>
<body>
<h2>Users</h2>
<form action="searchUser" method="POST">
    <input type="text" id="userName" name="userNameInput" placeholder="User Name" value="">
    <input type="submit" name="search" value="Search" />
    <input type="submit" name="all" value="Show All Users" />
</form>
<br/>
<a href="signup.jsp">Sign Up</a>
<br/>
<a href="changePassword.jsp">Change Password</a>
</body>
</html>
