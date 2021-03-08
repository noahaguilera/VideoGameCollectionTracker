<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="head.jsp"%>

<html><body>

<div class="container-fluid">
    <h2>Your Games: ${userGameList.user.userName}${filter}</h2>

    <table width="35%">
        <tr>
            <th>ID</th>
            <th>Username</th>
            <th>Game</th>
        </tr>

        <c:forEach items="${games}" var="userGameList">
            <tr>
                <td>${userGameList.id}</td>
                <td>${userGameList.user.userName}</td>
                <td>${userGameList.gameList.title}</td>
                <td>
                    <form action="formFill" method="POST">
                        <label>
                            <input type="submit" class="pencil" name="pencil" value=${gameList.id} />
                            <img src="images/pencil.png" class="pencilimg">
                        </label>

                    </form>
                </td>
                <td>
                    <form action="deleteGame" method="POST">
                        <label>
                            <input type="submit" class="trashcan" name="trashcan" value=${gameList.id} />
                            <img src="images/trash.png" class="trashcanimg">
                        </label>

                    </form>
                </td>
            </tr>
        </c:forEach>

    </table>
</div>

</body>
</html>
