<%@include file="head.jsp"%>
<html>
<body>
<h2>Look through your games</h2>
<form action="searchUserGame" method="POST">
    <input type="text" id="username" name="usernameInput" placeholder="Username" value="">
    <input type="submit" name="search" value="Search" />
</form>
<br/>
<a href="game.jsp">Add Game to your collection</a>
<br/>
<a href="index.jsp">Home</a>
</body>
</html>
