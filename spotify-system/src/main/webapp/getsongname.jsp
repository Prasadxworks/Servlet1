<%@ page language= "java" contentType="text/html; charset=US-ASCII"
pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        color: #333;
        margin: 0;
        padding: 0;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        min-height: 100vh;
    }

    h1 {
        color: #1db954;
        margin-bottom: 20px;
    }

    div {
        margin-bottom: 20px;
    }

    form {
        display: flex;
        flex-direction: column;
        gap: 10px;
        align-items: flex-start;
    }

    label {
        font-weight: bold;
    }

    input[type="text"] {
        padding: 5px;
        border: 1px solid #ccc;
        border-radius: 4px;
        width: 250px;
    }

    input[type="submit"] {
        padding: 10px 20px;
        background-color: #1db954;
        color: white;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        font-weight: bold;
    }

    input[type="submit"]:hover {
        background-color: #14843b;
    }

    table {
        border-collapse: collapse;
        width: 80%;
        margin-top: 20px;
        background-color: white;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    }

    th, td {
        border: 1px solid #ccc;
        padding: 10px;
        text-align: left;
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
</style>
</head>
<body>

<h1>Spotify Songs Table</h1>
<div>
    <form action="getdetails" method="GET">
        <label for="id">Enter First Name:</label>
        <input type="text" name="firstName" required />
        <input type="submit" value="Search">
    </form>
</div>

<table>
    <tr>
        <th>SongId</th>
        <th>SongName</th>
        <th>SongLanguage</th>
        <th>SingerName</th>
    </tr>
    <tr>
        <td>${spotifyDto.getSongId}</td>
        <td>${spotifyDto.getSongName}</td>
        <td>${spotifyDto.getLanguage}</td>
        <td>${spotifyDto.getSingerName}</td>
    </tr>
</table>

</body>
</html>
