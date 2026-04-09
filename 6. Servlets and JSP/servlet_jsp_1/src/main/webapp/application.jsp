<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JSP WEB APP</title>
</head>
<body>
    <h1>JSP Web app to generate Dynamic Response</h1>
    <%!
        int age = 18;
    %>
    <%
        String name = request.getParameter("uname");
        String city = request.getParameter("ucity");

    %>
</body>
</html>