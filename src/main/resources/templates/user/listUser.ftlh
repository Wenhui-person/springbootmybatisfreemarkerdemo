<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

<form action="toAddUser" method="post">
    <table class="querytable">
        <tr>
            <th class="textright">
                用户名：
            </th>
            <td class="textleft">
                <input type="text" name="username">
            </td>
            <th class="textright">
                用户角色：
            </th>
            <td class="textleft">
                <select name="userroles" id="">
                    <option value="00">--请选择--</option>
                    <option value="01">学生</option>
                    <option value="02">老师</option>
                    <option value="03">校长</option>
                    <option value="04">管理员</option>
                </select>
            </td>
        </tr>
        <tr>
            <td colspan="4" align="center">
                <input type="button" value="查询用户信息">
            </td>
        </tr>
    </table>
    <table id="ajaxtable">
        <tr>
            <th>用户编号</th>
            <th>用户名</th>
            <th>用户角色</th>
            <th>昵称</th>
            <th>注册日期</th>
            <th>操作</th>
        </tr>
        <#if users ?? &&(users?size>0)>
        <#list users as tbuser>
            <tr>
                <td>${tbuser.userid}</td>
                <td>${tbuser.username}</td>
                <td>
                    <#switch tbuser.userroles>
                        <#case "02">老师<#break >
                        <#case "03">校长<#break >
                        <#case "04">管理员<#break >
                        <#default >学生
                    </#switch>
                </td>
                <td>${tbuser.nickname}</td>
                <td>${tbuser.regtime?date}</td>
                <td>
                    <a href="detailUser?userid=${tbuser.userid}">查看</a>
                    <a href="toUpdateUser?userid=${tbuser.userid}">修改</a>
                    <a href="doDeleteUser?userid=${tbuser.userid}" onclick="return confirm('确认删除该用户吗？')">删除</a>
                </td>
            </tr>
        </#list>
         <#else >
            <tr>
                <td colspan="6" align="center">对不起，没有查到相关记录！！！</td>
            </tr>
        </#if>
        <tr>
            <td colspan="6" align="center">
                <input type="submit" value="保存用户信息">
            </td>
        </tr>
    </table>
</form>


<link rel="stylesheet" href="/css/editTablestyles.css">
<script type="text/javascript" src="/js/jquery.min.js"></script>
<script type="text/javascript" src="/js/listTable.js"></script>
<script type="text/javascript">
    $(function(){
        $("input[type='button']").click(function () {
            $("form").attr("action","queryUsers").submit();
        });
    });
</script>
</body>
</html>