<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="head.jsp" />

<html><body>

<div class="container-fluid">
    <h2>Search Results: ${filter}</h2>

    <table width="35%">
        <tr>
            <th>ID</th>
            <th>User Name</th>
            <th>Email</th>
            <th>Password</th>
        </tr>

        <c:forEach items="${users}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.userName}</td>
                <td>${user.email}</td>
                <td>${user.password}</td>
                <td>
                    <form action="deleteUser" method="POST">
                        <label>
                            <input type="submit" class="trashcan" name="trashcan" value=${user.id} />
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
