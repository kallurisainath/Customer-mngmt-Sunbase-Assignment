<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<!DOCTYPE html>
<html>
<head>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            text-align: center;
        }
        .centered-div {
            display: inline-block;
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            border: 1px solid #ddd;
        }
        h1 {
            color: #333;
            margin-bottom: 20px;
        }
        h2 {
            color: #444;
            margin-bottom: 20px;
        }
        table {
            margin: 0 auto;
            border-collapse: collapse;
            width: 100%;
        }
        td {
            padding: 10px;
            text-align: left;
        }
        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 8px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            background-color: #007bff;
            color: white;
            border: none;
            padding: 10px 20px;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="centered-div">
            <h1>Sunbase Customer Management Assignment</h1>
            <h2>Enter Login Details</h2>
            <form action="login" method="post">
                <table>
                    <tr>
                        <td>Enter Username</td>
                        <td><input type="text" name="username" required></td>
                    </tr>
                    <tr>
                        <td>Enter Password</td>
                        <td><input type="password" name="password" required></td>
                    </tr>
                    <tr>
                        <td colspan="2" style="text-align:center">
                            <input type="submit" value="Login">
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </div>
</body>
</html>

</html>