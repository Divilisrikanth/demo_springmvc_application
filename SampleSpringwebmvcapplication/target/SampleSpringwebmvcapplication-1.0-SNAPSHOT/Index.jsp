<%-- 
    Document   : Index
    Created on : Sep 13, 2025, 6:56:41 PM
    Author     : saibhagawan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="${pageContext.request.contextPath}/Users/create">

            <label>Id</label>
            <input type="text" name="id" placeholder="Please Enter your Id"/>
            <label>UserName</label>
            <input type="text" name="userName" placeholder="please Enter your userName"/>
            <label>Account Number</label>
            <input type="text" name="userAccountNumber" placeholder="Please Enter your Account Number"/>
            <label>unique Id</label>
            <input type="text" name="uniqueId" placeholder="Please Enter your Unique id"/>
            <label>pan Number</label>
            <input type="text" name="panNumber" placeholder="Please Enter your pan number"/>
            <label>Address</label>
            <input type="text" name="Address" placeholder="Please Enter your Address"/>
            <label>phone Number</label>
            <input type="text" name="phoneNumber" placeholder="Please Enter your Phone number"/>
            <label>account Type</label>
            <input type="text" name="accountType" placeholder="Please Enter your Account Type "/>
            <label>ifsc code</label>
            <input type="text" name="ifsccode" placeholder="Please Enter your ifsc code "/>
           <button>Submit</button>
        </form>
        <form method="post" action="${pageContext.request.contextPath}/deposit">
            <label>Please Enter your Account number</label>
            <input type="text"  name="amount",placeHolder="Please Enter the amount"/>
            <h2Deposit</></h2>
             <button onclick="getuseramount">Submit</button>
        </form>
            <form method="post" action="${pageContext.request.contextPath}/withdrawl">
                <h2>With draw</h2>
                <label>Please Enter your Account number</label>
                <input type="text"  name="amount",placeHolder="Please Enter the amount"/>
                <button onclick="getuseramount">Submit</button>
            </form>  
                <script>
                    function getuseramount(){
                        const nameofthefield =document.getElementbyName("amount");
                    console.log("inside index",nameofthefield);
                    }
                    
                  </script>  
    </body>
</html>
