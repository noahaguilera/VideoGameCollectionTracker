<%@include file="head.jsp"%>
<html>
<body>
<h2>Add Game</h2>
<form action="adminAddGame" method="POST">
    <p>Game Title:</p>
    <input type="text" id="title" name="titleInput" placeholder="Title" value="">
    <br/>
    <br/>
    <input type="submit" name="signup" value="Add Game" />
</form>
</body>
</html>
