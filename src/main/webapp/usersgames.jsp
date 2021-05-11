<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="head.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>My Games</title>
</head>

<body id="page-top">

<!-- Page Wrapper -->
<div id="wrapper">

    <!-- Sidebar -->
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

        <!-- Sidebar - Brand -->
        <a class="sidebar-brand d-flex align-items-center justify-content-center" href="home.jsp">
            <div class="sidebar-brand-text mx-3">Home</div>
        </a>

        <!-- Divider -->
        <hr class="sidebar-divider my-0">

        <a class="sidebar-brand d-flex align-items-center justify-content-center" href="game.jsp">
            <div class="sidebar-brand-text mx-3">Games</div>
        </a>

        <!-- Divider -->
        <hr class="sidebar-divider">

        <a class="sidebar-brand d-flex align-items-center justify-content-center" href="usergame.jsp">
            <div class="sidebar-brand-text mx-3">My Games</div>
        </a>
        <!-- Divider -->
        <hr class="sidebar-divider">

        <a class="sidebar-brand d-flex align-items-center justify-content-center" href="profile">
            <div class="sidebar-brand-text mx-3">My Profile</div>
        </a>

    </ul>
    <!-- End of Sidebar -->

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

        <!-- Main Content -->
        <div id="content">

            <!-- Topbar -->
            <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

                <h1>Video Game Collection Tracker</h1>

                <!-- Sidebar Toggle (Topbar) -->
                <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
                    <i class="fa fa-bars"></i>
                </button>

                <!-- Topbar Navbar -->
                <ul class="navbar-nav ml-auto">

                    <!-- Nav Item - Search Dropdown (Visible Only XS) -->
                    <li class="nav-item dropdown no-arrow d-sm-none">
                        <a class="nav-link dropdown-toggle" href="#" id="searchDropdown" role="button"
                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <i class="fas fa-search fa-fw"></i>
                        </a>
                        <!-- Dropdown - Messages -->
                        <div class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in"
                             aria-labelledby="searchDropdown">
                            <form class="form-inline mr-auto w-100 navbar-search">
                                <div class="input-group">
                                    <input type="text" class="form-control bg-light border-0 small"
                                           placeholder="Search for..." aria-label="Search"
                                           aria-describedby="basic-addon2">
                                    <div class="input-group-append">
                                        <button class="btn btn-primary" type="button">
                                            <i class="fas fa-search fa-sm"></i>
                                        </button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </li>

                    <div class="topbar-divider d-none d-sm-block"></div>

                    <!-- Nav Item - User Information -->
                    <li class="nav-item dropdown no-arrow">
                        <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button"
                           data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                            <span class="mr-2 d-none d-lg-inline text-gray-600 small"><%= request.getUserPrincipal().getName() %></span>
                        </a>
                        <!-- Dropdown - User Information -->
                        <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in"
                             aria-labelledby="userDropdown">
                            <a href="profile">Profile</a>
                            <div class="dropdown-divider"></div>
                            <a href="LogoutServlet">Logout</a>
                        </div>
                    </li>

                </ul>

            </nav>
            <!-- End of Topbar -->
            <!-- Begin Page Content -->
            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="d-sm-flex align-items-center justify-content-between mb-4">
                    <h1 class="h3 mb-0 text-gray-800">Games</h1>
                </div>

                <a href="game.jsp">View our game catalogue</a>

                <c:forEach items="${games}" var="userGameList">
                <table width="100%" class="gametable">
                    <tr>
                        <td><img id="cover" src="${userGameList.gameList.cover}"></td>
                        <td><h1>${userGameList.gameList.title}(${userGameList.platform})</h1></td>
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
                </table>
                </c:forEach>


            </div>
            <!-- /.container-fluid -->
        </div>
        <!-- End of Main Content -->
    </div>
    <!-- End of Content Wrapper -->
</div>
<!-- End of Page Wrapper -->
<!-- Scroll to Top Button-->
<a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
</a>
<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
                <button class="close" type="button" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">×</span>
                </button>
            </div>
            <div class="modal-footer">
                <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
                <a class="btn btn-primary" href="LogoutServlet">Logout</a>
            </div>
        </div>
    </div>
</div>
<script src="vendor/jquery/jquery.min.js"></script>
<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<script src="vendor/jquery-easing/jquery.easing.min.js"></script>
<script src="js/sb-admin-2.min.js"></script>
</body>
</html>
