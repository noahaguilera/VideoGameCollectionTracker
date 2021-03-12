<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="head.jsp"%>

<html><body>

<div class="container-fluid">
    <h2>Search Results: ${filter}</h2>

    <table width="35%">
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Rating</th>
            <th>Description</th>
            <th>Release Date</th>
        </tr>

        <c:forEach items="${games}" var="gameList">
            <tr>
                <td>${gameList.id}</td>
                <td>${gameList.title}</td>
                <td>${gameList.rating}</td>
                <td>${gameList.description}</td>
                <td>${gameList.release_date}</td>
                <td>
                    <form action="formFill" method="POST">
                        <label>
                            <input type="submit" class="pencil" name="pencil" value=${gameList.id} />
                            <img src="images/pencil.png" class="pencilimg">
                        </label>

                    </form>
                </td>
                <td>
                    <form action="formFill" method="POST">
                        <label>
                            <input type="submit" class="add" name="add" value=${gameList.id} />
                            <img src="images/add.png" class="addimg">
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
