<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Enter</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Your-Font&display=swap">

    <style>
        /* Apply the font to the heading */
        h4 {
            font-family: 'Your-Font', sans-serif;
            /* Additional styling if needed */
            color: #007BFF; /* Blue color, you can change it */
            text-align: center;
        }
    </style>
</head>
<body class="bg-light d-flex " style="min-height: 100vh;">

 <div class="container text-center mt-5">
 <div class="mt-5">
 <form action="getnum">
    <div class="text-center">
    <h4>Enter Number</h4><br>
        <div class="text-center">
        <input type="number" class="form-control mb-3"  name="num" placeholder="Enter Positive Number" autofocus="autofocus" ><br><br>
       </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </div>
</form>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.0.8/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</div>
</div>
 </body>
</html>