<%@ page language= "java" contentType="text/html; charset=US-ASCII"
pageEncoding="US-ASCII"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <title>Registration From</title>

   <style>
    body{
       background-color: blanchedalmond;
       }
   h1{
     width: 530px;
     height: 46px;
     background-color: red;
     position: relative;
     animation-name: example;
     animation-duration: 6s;
         margin-left: 65vh;
         margin-top: 46vh;

   }

   @keyframes example {
     0%   {background-color:red; left:0px; top:0px;}
     25%  {background-color:yellow; left:200px; top:0px;}
     50%  {background-color:blue; left:200px; top:200px;}
     75%  {background-color:green; left:0px; top:200px;}
     100% {background-color:red; left:0px; top:0px;}
   }
   </style>
</head>
<body>
<h1>Thank You ${key} For Registration </h1>

</html>