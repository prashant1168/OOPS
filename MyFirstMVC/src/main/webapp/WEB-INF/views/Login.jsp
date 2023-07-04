<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
<div class="container">
  <h1>${msg}</h1>
  <form action="validate" method="post">
    <div class="form-group">
      <label for="uname">Username</label>
      <input type="text" class="form-control" id="uname" name="uname" placeholder="Username">
    </div>
    <div class="form-group">
      <label for="pass">Password</label>
      <input type="password" class="form-control" id="pass" name="pass" placeholder="Password">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>


<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>
