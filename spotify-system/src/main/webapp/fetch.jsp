<%@ page language= "java" contentType="text/html; charset=US-ASCII"
pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Song</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            padding: 0;
        }

        form {
           ackground-color: white;
               padding: 53px;
               border-radius: 54px;
               box-shadow: 20px 16px 0px 6px rgba(0, 0, 0, 0.1);
               width: 108%;
               max-width: 400px;
               display: flex
           ;
               flex-direction: column;
               gap: 15px;
           ;
               flex-direction: column;
               gap: 15px;
        }

        label {
            font-weight: bold;
            margin-bottom: 5px;
        }

        input[type="text"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            font-size: 16px;
        }

        input[type="submit"] {
            padding: 10px 20px;
            background-color: #1db954;
            color: white;
            border: none;
            border-radius: 5px;
            font-weight: bold;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        input[type="submit"]:hover {
            background-color: #14843b;
        }

        h1 {
            text-align: center;
            color: #1db954;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <form action="update?id=${song.songId}" method="post">
        <h1>Update Song</h1>
        <label for="songName">Song Name:</label>
        <input type="text" id="songName" name="songName" value="${song.getSongName()}">

        <label for="songLanguage">Song Language:</label>
        <input type="text" id="songLanguage" name="song_languages" value="${song.getLanguage()}">

        <label for="singerName">Singer Name:</label>
        <input type="text" id="singerName" name="singerName" value="${song.getSingerName()}">

        <input type="submit" value="Update">
    </form>
</body>
</html>
