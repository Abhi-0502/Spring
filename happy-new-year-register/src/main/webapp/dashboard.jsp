<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>

     <nav>
    <div> hi <span>${dto.getFirstName()}</span></div>

        <h1>Welcome to Your Dashboard!</h1>
        <p class="welcome-message">
            You have successfully signed in.
        </p>

    </div>
    <div><a href= "update/${dto.getEmail()}">Update</a></div>

</body>
</html>
