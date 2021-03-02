<%@include file="head.jsp"%>
<html>
<body>
<h2>Games</h2>
<form action="searchGame" method="POST">
    <input type="text" id="title" name="titleInput" placeholder="Game Title" value="">
    <input type="submit" name="search" value="Search" />
    <input type="submit" name="all" value="Show All Games" />
</form>
<br/>
<a href="addgame.jsp">Add Game</a>
<br/>
<a href="editgame.jsp">Edit Password</a>
</body>
</html>
