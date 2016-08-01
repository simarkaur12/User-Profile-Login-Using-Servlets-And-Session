<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <h1>User Profile</h1>
    <form name="profileFrm" action="SaveUserProfile" method="post">
        Name: 
        <input type="text" name="name" placeholder="User Name" />
        <br>
        Age:
        <input type="number" min="1"  name="age" placeholder="Age(for eg. 25)" />
        <br>
        Mobile Number:
        <input type="text" name="mobile" placeholder="Mobile Number(for eg. 9706859605)" />
        <br>
        City:
        <input type="text" name="city" placeholder="City(for eg. Pune)" />
        <br>
        State:
        <input type="text" name="state" placeholder="State(for eg. Maharastra)" />
        <br>
        Pin Code:
        <input type="text" name="pincode" placeholder="Pin code(for eg. 141001)" />
        <br>
        <input type="submit" name="btn" value="Submit" />
    </form>

</body>
</html>