<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>系统登录 - 超市账单管理系统</title>
    <link rel="stylesheet" href="css/style.css"/>

</head>
<body class="login_bg">
    <section class="loginBox">
        <header class="loginHeader">
            <h1>超市账单管理系统</h1>
        </header>
        <section class="loginCont">
            <form class="loginForm" action="/login" method="post">
                <div class="inputbox">
                    <label for="userCode">用户名：</label>
                    <input id="userCode" type="text" name="userCode" placeholder="请输入用户名" required/>
                </div>
                <div class="inputbox">
                    <label for="password">密码：</label>
                    <input type="password" name="userPassword" id="password" placeholder="请输入密码" required/>
                </div>
                <div class="subBtn">
                    <input type="submit" value="登录" />
                    <input type="reset" value="重置"/>
                </div>
            </form>
        </section>
    </section>
</body>
<script src="js/jquery.js"></script>
</html>