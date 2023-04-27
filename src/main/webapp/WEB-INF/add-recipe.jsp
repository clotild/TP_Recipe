<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
<c:import url="header.jsp"></c:import>

<div class="container">

    <form method="post" action="add-recipe">
        <div class="input-group mb-3">
            <input type="text" class="form-control" name="recipename" placeholder="name of the recipe...">
        </div>

        <div class="input-group mb-3">
            <input type="text" class="form-control" name="recipedescription" placeholder="what do you want to say about this recipe...">
        </div>

        <div class="input-group mb-3">
            <textarea class="form-control" name="recipeingredient" placeholder="ingredients of this recipe.."></textarea>
        </div>
        <div class="input-group mb-3">
            <textarea class="form-control" name="urlpicture" placeholder="do you want to add a photo?.."></textarea>
        </div>
        <div class="input-group">
            <button type="submit" class="btn btn-outline-dark">Submit</button>
        </div>
    </form>


</div>



</body>
</html>
