<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Example</title>
    </head>
    <meta charset="ISO-8859-1">
     <body style="background-color:yellow;">
        <form method="post" action="login.jsp">
            <center>
            <h1>SHOPPING CART FOR BOOK SHOP </h1>
        <h2>welcome to LandMark Book Shop 
              Pune</h2>
        <h3>
          This site allows you to do in simple register yourself,buy a book that will be delivered to your home.</h3>
            
            <table border="1" width="30%" cellpadding="3">
                <thead>
                    <tr>
                        <th colspan="2">Login Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>User Name</td>
                        <td><input type="text" name="uname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="pass" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Login" /></td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">Yet Not Registered!! <a href="reg.jsp">Register Here</a></td>
                    </tr>
                    <tr>
                    <td colspan ="2"><a href="#">ForgetPassword?</a></td>
                    </tr>
                </tbody>
            </table>
            </center>
        </form>
    </body>
</html>