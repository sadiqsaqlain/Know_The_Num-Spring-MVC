<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="d" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bootstrap JSP Example</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom CSS for animation and spacing -->
    <style>
        .center-text {
            text-align: center;
        }
        .fade-in {
            opacity: 0;
            transform: translateX(-20px);
            transition: opacity 0.5s ease-in-out, transform 0.5s ease-in-out;
        }
        .fade-in.visible {
            opacity: 1;
            transform: translateX(0);
        }
        .internal-space {
            margin-top: 60px; /* Adjust the value as needed for internal spacing */
        }
        .heading-margin {
            margin-bottom: 10px; /* Adjust the value for the distance between Heading 1 and paragraphs */
        }
    </style>
</head>
<body>

    <div class="container mt-5">
        <!-- First paragraph with h1 tag, centered, and fading in after 2 seconds -->
        <div class="center-text fade-in heading-margin" style="animation-delay: 2s;">
          <h1 class="display-4"><c:out value="${n }"></c:out> </h1>
        </div>
        <!-- Internal spacing -->
        <div class="internal-space"></div>
        <!-- Rest of the paragraphs with h5 tags, fading in one by one after 4 seconds -->
        
        <div class="fade-in" style="animation-delay: 4s;">
            <h5><c:out value="${positive }"></c:out></h5>
        </div>
        
        <div class="fade-in" style="animation-delay: 4s;">
            <h5><c:out value="${negative }"></c:out></h5>
        </div>
        
        
        
       <div class="fade-in" style="animation-delay: 4s;">
            <h5><c:out value="${natural }"></c:out></h5>
        </div>
        
        
        <div class="fade-in" style="animation-delay: 4s;">
            <h5><c:out value="${integer }"></c:out></h5>
        </div>
        
        <div class="fade-in" style="animation-delay: 4s;">
            <h5><c:out value="${whole }"></c:out></h5>
        </div>
        
        <div class="fade-in" style="animation-delay: 4s;">
            <h5><c:out value="${even }"></c:out></h5>
        </div>
        
        <div class="fade-in" style="animation-delay: 4s;">
            <h5><c:out value="${odd }"></c:out></h5>
        </div>
        
        <div class="fade-in" style="animation-delay: 4s;">
            <h5><c:out value="${prime }"></c:out></h5>
        </div>
        
        <div class="fade-in" style="animation-delay: 4s;">
            <h5><c:out value="${composite }"></c:out></h5>
        </div>
        
        <div class="fade-in" style="animation-delay: 4s;">
            <h5><c:out value="${perfect }"></c:out></h5>
        </div>
        
        <div class="fade-in" style="animation-delay: 4s;">
            <h5><c:out value="${square }"></c:out></h5>
        </div>
        
        <div class="fade-in" style="animation-delay: 4s;">
            <h5><c:out value="${cube }"></c:out></h5>
        </div>
        
        <div class="fade-in" style="animation-delay: 4s;">
            <h5><c:out value="${armstrong }"></c:out></h5>
        </div>
        
        <div class="fade-in" style="animation-delay: 4s;">
            <h5><c:out value="${factors }"></c:out></h5>
        </div>
        
        <div class="fade-in" style="animation-delay: 4s;">
            <h5><c:out value="${palindrome }"></c:out></h5>
        </div>
        
        <div class="fade-in" style="animation-delay: 4s;">
            <h5><c:out value="${happy }"></c:out></h5>
        </div>
        
        <form action="home">
        <div class="container text-center">
        <button type="submit" class="btn btn-primary">Back</button>
        
        </div>
        </form>
        
    </div>

    <!-- Bootstrap JS and Popper.js (required for Bootstrap JavaScript plugins) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
    <!-- Custom JavaScript to add visibility class for fading in -->
    <script>
        document.addEventListener("DOMContentLoaded", function() {
            let fadeIns = document.querySelectorAll(".fade-in");
            fadeIns.forEach(function(element) {
                element.classList.add("visible");
            });
        });
    </script>
</body>
</html>
