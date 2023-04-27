<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>
<c:import url="header.jsp"></c:import>
<div class="container">

    <div class="col-6 offset-3">
        <h1>Registration</h1>

        <form action="${pageContext.request.contextPath}/new-user" method="post">
            <div class="form-group mb-2">
                <label for="name">name</label>
                <input type="text" id="name" class="form-control" name="name" placeholder="Enter your name">
            </div>
            <div class="form-group mb-2">
                <label for="firstname">firstname</label>
                <input type="text" id="firstname" class="form-control" name="firstname" placeholder="Enter your firstname">
            </div>
            <div class="form-group mb-2">
                <label for="email">email</label>
                <input type="text" id="email" class="form-control" name="email" placeholder="Enter your email">
            </div>
            <div class="form-group mb-2">
                <label for="urlphoto">email</label>
                <input type="text" id="urlphoto" class="form-control" name="urlphoto" placeholder="Enter your url photo">
            </div>
            <div class="form-group mb-2">
                <label for="password">Password</label>
                <input type="password" class="form-control" id="password" name="password" placeholder="Enter your Password">
            </div>
            <div class="form-group mb-2">
                <button type="submit" class="btn btn-primary">Registration</button>
            </div>

        </form>

    </div>
</div>
</body>
</html>
