<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <title>Insert title here</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</head>
<body>
<table class="table table-striped table-darktable table-striped" >
<thead>
<tr>
<th scope="col">Pid</th>
<th scope="col">Pname</th>
<th scope="col">qty</th>
<th scope="col">price</th>
<th scope="col">edit</th>
<th scope="col">delete</th>
</tr>
</thead>
<tbody>
<c:forEach var="prod" items="${plist}">
<tr>
<td>${prod.pid}</td>
<td>${prod.pname}</td>
<td>${prod.qty}</td>
<td>${prod.price}</td>
<td>
<a href="edit/${prod.pid}">edit</a>
</td>
<td>
<a href="delete/${prod.pid}">delete</a>
</td>
</tr>
</c:forEach>
</tbody>

</table><br>
<a href="addnewproduct">Add new product</a><br>
<a href="logout">logout</a>
</body>
</html>