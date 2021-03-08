<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="head.jsp"%>
<html>
<body>
<h2>Add Game to Your Collection</h2>
<form action="addUserGame" method="POST">
    <c:forEach items="${games}" var="gameList">
        <input type="radio" id="id" name="idInput" value="${gameList.id}" checked>
        <label for="id">Id: ${gameList.id}</label>
        <h2>Want to add ${gameList.title} to your games?
        <p>Enter Your Username:</p>
        <input type="text" id="userName" name="userNameInput" placeholder="User Name" value="">
        <br/>
        <br/>
        <input type="submit" name="addUserGame" value="Add Game" />
    </c:forEach>
</form>
</body>
</html>
