<%@ page language= "java" contentType="text/html; charset=US-ASCII"
pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Spotify</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            background-color: #f4f4f4;
            color: #333;
        }
        h1 {
            margin-top: 35vh;
            text-align: center;
            color: #1db954;
        }
        nav {
            display: flex;
            flex-direction: column;
            align-items: center;
            gap: 15px;
            margin-top: 20px;
        }
        a {
            text-decoration: none;
            color: white;
            background-color: #1db954;
            padding: 10px 20px;
            border-radius: 5px;
            font-size: 18px;
            transition: background-color 0.3s ease;
        }
        a:hover {
            background-color: #14843b;
        }
    </style>
</head>
<body>

<h1>Spotify Management</h1>
<nav>
    <a href="Spotify.jsp">Add Song</a>
    <a href="getsongname.jsp">Get Table List</a>
    <a href="getallspotifysongs.jsp">Get All Table List</a>
</nav>

</body>
</html>
