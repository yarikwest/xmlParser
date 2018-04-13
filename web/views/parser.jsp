<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8");%>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="/done" method="post">
        <input type="submit" value="saveToDB">
    </form>

    <c:forEach items="${feed.getEntry()}" var="item" varStatus="loop">
        ${item.getId()}: ${item.getTitle()}<br/>
        <form action="/change" method="post">
            <button type="submit" name="index_id" value="${loop.index}">change</button>
        </form>
    </c:forEach>

    <c:if test="${not empty doneSave}">
        <script>alert('Done!!!!');</script>
    </c:if>


</body>
</html>
