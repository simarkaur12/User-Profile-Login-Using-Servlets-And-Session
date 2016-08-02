<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
input[type=text], input[type=number]{
	width: 80%;
	float: right;
	padding: 12px 20px;
	box-sizing: border-box;
}
</style>
</head>
<body>

    <h1>User Profile</h1>
    <form name="profileFrm" action="SaveUserProfile" method="post">
        <font size="5">Name: </font>
        <input type="text" name="name" placeholder="User Name" required />
        <br><br>
        <font size="5">Age:</font>
        <input type="number" min="1" name="age" placeholder="Age(for eg. 25)" required/>
        <br><br>
        <font size="5">Mobile Number:</font>
        <input type="text" name="mobile" placeholder="Mobile Number(for eg. 9706859605)"  required/>
        <br><br>
        <font size="5">City:</font>
        <input type="text" name="city" placeholder="City(for eg. Pune)" required/>
        <br><br>
        <font size="5">State:</font>
        <input type="text" name="state" placeholder="State(for eg. Maharastra)" required/>
        <br><br>
        <font size="5">Pin Code:</font>
        <input type="text" name="pincode" placeholder="Pin code(for eg. 141001)" required/>
        <br><br>
        <input type="submit" name="btn" value="Submit" />
    </form>

</body>
</html>