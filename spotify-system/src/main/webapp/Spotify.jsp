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
            margin: 0;
            padding: 0;
             background-color: #242449;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        form {
            background: #aaabfb;
    padding: 57px;
    border-radius: 43px;
    box-shadow: 13 20px 12px rgba(2, 3, 4, 0.1);
    max-width: 438px;
    width: 234%;
        }
        form div {
            margin-bottom: 15px;
        }
        label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
        }
        input[type="text"],
        input[type="First Name"],
        input[type="Last Name"] {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 14px;
        }
        input[type="submit"],
        input[type="reset"] {
            background-color: #007BFF;
            color: #fff;
            border: none;
            padding: 10px 15px;
            border-radius: 5px;
            cursor: pointer;
            font-size: 14px;
        }
        input[type="submit"]:hover,
        input[type="reset"]:hover {
            background-color: #0056b3;
        }
        input[type="reset"] {
            background-color: #6c757d;
            margin-left: 10px;
        }
        h1{
                    text-align: center;
                    color: greenyellow;
                }
    </style>
</head>
<body>
    <h1>Spotify</h1>
    <form action = "mysong"  method="post" >
        <div><lable>Song:</lable>
            <input type="Name" placeholder="enter Song name " name = "songName" required/>
        </div>
        <br>
         <div>
             <lable>Language:</lable>
             <input type="language" placeholder="enter language" name="Language" required/>
         </div>
        <br>
        <div>
            <label>Singer</label>
            <input type="text" placeholder="singer" name= "SingerName" required/>
        </div>
        <br>

            <div><input  type="submit" value="submit">
                <input type="reset" value="reset"/></div>
    </form>


</body>
</html>