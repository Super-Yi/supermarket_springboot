<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>超市账单管理系统</title>
    <link rel="stylesheet" href="css/public.css"/>
    <link rel="stylesheet" href="css/style.css"/>

</head>
<body>
<!--头部-->
    <header class="publicHeader">
        <h1>超市账单管理系统</h1>
        <div class="publicHeaderR">
            <p><span>下午好！</span><span style="color: #fff21b"> ${admin.userName}</span> , 欢迎你！</p>
            <a href="login.jsp">退出</a>
        </div>
    </header>
<!--时间-->
    <section class="publicTime">
        <span id="time">2015年1月1日 11:11  星期一</span>
        <a href="#">温馨提示：为了能正常浏览，请使用高版本浏览器！（IE10+）</a>
    </section>
<!--主体内容-->
    <section class="publicMian ">
        <div class="left">
            <h2 class="leftH2"><span class="span1"></span>功能列表 <span></span></h2>
            <nav>
                <ul class="list">
                    <li ><a href="billList.jsp">账单管理</a></li>
                    <li><a href="providerList.jsp">供应商管理</a></li>
                    <li><a href="userList.jsp">用户管理</a></li>
                    <li id="active"><a href="password.jsp">密码修改</a></li>
                    <li><a href="login.jsp">退出系统</a></li>
                </ul>
            </nav>
        </div>
        <div class="right">
            <div class="location">
                <strong>你现在所在的位置是:</strong>
                <span>密码修改页面</span>
            </div>
            <div class="providerAdd">
                <form action="">
                    <!--div的class 为error是验证错误，ok是验证成功-->
                    <div class="">
                        <label for="oldPassword">旧密码：</label>
                        <input type="password" name="oldPassword" id="oldPassword" required/>
                        <span>*请输入原密码</span>
                    </div>
                    <div>
                        <label for="newPassword">新密码：</label>
                        <input type="password" name="newPassword" id="newPassword" required/>
                        <span >*请输入新密码</span>
                    </div>
                    <div>
                        <label for="reNewPassword">确认新密码：</label>
                        <input type="password" name="reNewPassword" id="reNewPassword" required/>
                        <span id="password_msg" name="password_msg">*请输入新确认密码，保证和新密码一致</span>
                    </div>
                    <div class="providerAddBtn">
                        <!--<a href="#">保存</a>-->
                        <input type="button" value="保存" onclick="save()"/>

                    </div>
                </form>
            </div>
        </div>
    </section>
    <footer class="footer">
    </footer>
<script src="js/time.js"></script>

</body>

<script src="js/jquery.js"></script>

<script type="text/javascript">
    var isright = false;

    $(function(){
        $("#reNewPassword").blur(function () {
            var reNewPassword = $("#reNewPassword").val();
            var newPassword = $("#newPassword").val();
            if(reNewPassword === newPassword)
            {
                $("#password_msg").css("color", "green");
                $("#password_msg").html("密码相同");
                password = reNewPassword;
                isright=true;
            }else{
                $("#password_msg").css("color", "red");
                $("#password_msg").html("两次密码输入不同");
                isright = false;
            }
        });
    });

    function save() {
        var oldPassword = $("#oldPassword").val();
        var password = $("#reNewPassword").val();
        $.post("/passwordAjaxServlet",
            {"password": oldPassword},
            function(result) {
                if(!result) {
                    alert("原密码错误");
                } else {
                    if (isright) {
                        document.location = "/updatePasswordServlet?password=" + password;
                    } else {
                        alert("新密码输入不一致");
                    }
                }
            },
            "json"
        );
    }
</script>

</html>