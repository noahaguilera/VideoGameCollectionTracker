<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="head.jsp"%>
<html>
<body>
<h2>Edit Game</h2>
<form action="editGame" method="POST">
<c:forEach items="${games}" var="gameList">
    <input type="radio" id="id" name="idInput" value="${gameList.id}" checked>
    <label for="id">Id: ${gameList.id}</label>
    <p>Game Title:</p>
    <input type="text" id="title" name="titleInput" placeholder="ex Minecraft" value="${gameList.title}">
    <br/>
    <br/>
    <p>Age Rating:</p>
    <input type="text" id="rating" name="ratingInput" placeholder="ex E" value="${gameList.rating}">
    <br/>
    <br/>
    <p>Game Description:</p>
    <input type="text" id="description" name="descriptionInput" placeholder="" value="${gameList.description}">
    <br/>
    <br/>
    <p>Release Date:</p>
    <input type="text" id="release_date" name="releaseDateInput" placeholder="2021-03-26" value="${gameList.release_date}">
    <br/>
    <br/>
    <input type="submit" name="editGame" value="Complete Edit" />
</c:forEach>
</form>
</body>
</html>
