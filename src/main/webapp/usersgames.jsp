<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="head.jsp"%>

<html><body>

<div class="container-fluid">
    <h2>Your Games: ${userGameList.user.userName}${filter}</h2>

    <table width="35%">
        <tr>
            <th>ID</th>
            <th>Cover</th>
            <th>Game</th>
            <th>Platform</th>
        </tr>

        <c:forEach items="${games}" var="userGameList">
            <tr>
                <td>${userGameList.id}</td>
                <td>${userGameList.gamelist.cover}</td>
                <td>${userGameList.gameList.title}</td>
                <td>${userGameList.platform}</td>
                <td>
                    <form action="formFill" method="POST">
                        <label>
                            <input type="submit" class="pencil2" name="pencil2" value=${userGameList.id} />
                            <img src="images/pencil.png" class="pencilimg">
                        </label>

                    </form>
                </td>
                <td>
                    <form action="deleteUserGame" method="POST">
                        <label>
                            <input type="submit" class="trashcan" name="trashcan" value=${userGameList.id} />
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
