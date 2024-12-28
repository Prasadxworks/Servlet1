<%@ page language="java" contentType="text/html; charset=US-ASCII"
       pageEncoding="US-ASCII"%>
       <%@ page isELIgnored="false" %>
       <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="ref" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>List of Songs</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        h1 {
            color: #1db954;
            text-align: center;
            margin-bottom: 20px;
        }

        form {
            margin-bottom: 20px;
        }

        input[type="submit"] {
            padding: 10px 20px;
            background-color: #1db954;
            color: white;
            border: none;
            border-radius: 5px;
            font-weight: bold;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #14843b;
        }

        table {
            width: 90%;
            border-collapse: collapse;
            margin-top: 20px;
            background-color: white;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
        }

        th, td {
            border: 1px solid #ddd;
            text-align: left;
            padding: 12px;
        }

        th {
            background-color: #1db954;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        tr:hover {
            background-color: #f1f1f1;
        }

        a {
            text-decoration: none;
            color: white;
            background-color: #ff5757;
            padding: 5px 10px;
            border-radius: 4px;
            font-size: 14px;
            transition: background-color 0.3s ease;
        }

        a:hover {
            background-color: #d33f3f;
        }

        a.update {
            background-color: #1db954;
        }

        a.update:hover {
            background-color: #14843b;
        }
    </style>
</head>
<body>
    <form action="getallsong" method="GET">
        <h1>List of Songs</h1>
        <input type="submit" value="Click Here">
    </form>

    <table>
        <tr>
            <th>Sl.no</th>
            <th>Song Name</th>
            <th>Song Language</th>
            <th>Singer Name</th>
            <th>Action</th>
            <th>Update</th>
        </tr>
        <ref:forEach var="dto" items="${listOfSongs}">
        <tr>
            <td>${dto.getSongId()}</td>
            <td>${dto.getSongName()}</td>
            <td>${dto.getLanguage()}</td>
            <td>${dto.getSingerName()}</td>
            <td><a href="delete?id=${dto.getSongId()}">Delete</a></td>
            <td><a href="fetch?id=${dto.getSongId()}" class="update">Update</a></td>
        </tr>
        </ref:forEach>
    </table>
</body>
</html>
