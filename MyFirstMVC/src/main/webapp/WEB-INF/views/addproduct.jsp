<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<div class="container">
  <form action="addproduct" method="post">
    <div class="form-group">
      <label for="pid">Product ID:</label>
      <input type="text" class="form-control" id="pid" name="pid">
    </div>
    <div class="form-group">
      <label for="pname">Product Name:</label>
      <input type="text" class="form-control" id="pname" name="pname">
    </div>
    <div class="form-group">
      <label for="qty">Quantity:</label>
      <input type="text" class="form-control" id="qty" name="qty">
    </div>
    <div class="form-group">
      <label for="price">Price:</label>
      <input type="text" class="form-control" id="price" name="price">
    </div>
    <button type="submit" class="btn btn-primary" name="btn" id="btn" value="add">Add New Product</button>
  </form>
</div>


<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>
