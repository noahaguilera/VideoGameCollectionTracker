<%@include file="head.jsp"%>
<html>
<body>
<h2>Search Users</h2>
<form action="searchUser" method="POST">
    <input type="text" id="userName" name="userNameInput" placeholder="User Name" value="">
    <input type="submit" name="search" value="Search" />
    <input type="submit" name="all" value="Show All Users" />
</form>
<br/>
<a href="index.jsp">Home</a>
</body>
</html>
