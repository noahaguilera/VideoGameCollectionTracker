<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="head.jsp"%>
<html>
<body>
<h2>Edit Your Game</h2>
<form action="editUserGame" method="POST">
    <c:forEach items="${games}" var="userGameList">
        <input type="radio" id="id" name="idInput" value="${userGameList.id}" checked>
        <label for="id">Id: ${userGameList.id}</label>
        <p>Platform:</p>
        <input type="text" id="title" name="platformInput" placeholder="ex Xbox One" value="${userGameList.platform}">
        <br/>
        <br/>
        <input type="submit" name="editUserGame" value="Complete Edit" />
    </c:forEach>
</form>
</body>
</html>
