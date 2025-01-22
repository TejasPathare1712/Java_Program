<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP JDBC</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
    <div class="container mt-5">
        <div class="card shadow">
            <div class="card-header bg-primary text-white text-center">
                <h3>Add Student Details</h3>
            </div>
            <div class="card-body">
                <form action="Add.jsp" method="post">
                    <div class="mb-3">
                        <label for="txtroll" class="form-label">Enter Roll No</label>
                        <input type="number" class="form-control" id="txtroll" name="txtroll" placeholder="Enter roll number" required>
                    </div>
                    <div class="mb-3">
                        <label for="txtname" class="form-label">Enter Name</label>
                        <input type="text" class="form-control" id="txtname" name="txtname" placeholder="Enter name" required>
                    </div>
                    <div class="mb-3">
                        <label for="txtmarks" class="form-label">Enter Marks</label>
                        <input type="number" class="form-control" id="txtmarks" name="txtmarks" placeholder="Enter marks (1-100)" min="1" max="100" required>
                    </div>
                    <div class="d-grid">
                        <button type="submit" class="btn btn-success">Add</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-7xkUuoXiWycE0XI7ZcfVgy2ZT0dNDo2LNzIoWPIHgfRZ7RwaNz68oYwSo9lNp1GM" crossorigin="anonymous"></script>
</body>
</html>
