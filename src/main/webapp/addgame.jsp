<%@include file="head.jsp"%>
<html>
<body>
<h2>Add Game</h2>
<form action="addGame" method="POST">
    <p>Game Title:</p>
    <input type="text" id="title" name="titleInput" placeholder="Title" value="">
    <br/>
    <br/>
    <p>Game Platform:</p>
    <input type="text" id="platform" name="platformInput" placeholder="ex Playstation" value="">
    <br/>
    <br/>
    <p>Age Rating:</p>
    <input type="text" id="rating" name="ratingInput" placeholder="ex E" value="">
    <br/>
    <br/>
    <p>Game Description:</p>
    <input type="text" id="description" name="descriptionInput" placeholder="" value="">
    <br/>
    <br/>
    <p>Release Date:</p>
    <input type="text" id="release_date" name="releaseDateInput" placeholder="2021-03-26" value="">
    <br/>
    <br/>
    <input type="submit" name="signup" value="Add Game" />
</form>
</body>
</html>
