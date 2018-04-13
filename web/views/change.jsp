<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8");%>
<html>
<head>

</head>
<body>
<form action="/saveEntry" method="post">
    <div style="width: 50%; padding-bottom: 30px">
        Id:                     <br><input type="text" size="100" name="Id" value="${entry.getId()}"/><br>
        Title:                  <br><input type="text" size="100" name="Title" value="${entry.getTitle()}"/><br>
        GoogleProductCategory:  <br><input type="text" size="100" name="GoogleProductCategory" value=" ${entry.getGoogleProductCategory()}"/><br>
        ProductType:            <br><input type="text" size="100" name="ProductType" value="${entry.getProductType()}"/><br>
        Link:                   <br><input type="text" size="100" name="Link" value=" ${entry.getLink()}"/><br>
        ImageLink:              <br><input type="text" size="100" name="ImageLink" value="${entry.getImageLink()}"/><br>
        Condition:              <br><input type="text" size="100" name="Condition" value="${entry.getCondition()}"/><br>
        Availability:           <br><input type="text" size="100" name="Availability" value="${entry.getAvailability()}"/><br>
        Price:                  <br><input type="text" size="100" name="Price" value="${entry.getPrice()}"/><br>
        Gtin:                   <br><input type="text" size="100" name="Gtin" value="${entry.getGtin()}"/><br>
        Mpn:                    <br><input type="text" size="100" name="Mpn" value="${entry.getMpn()}"/><br>
        Brand:                  <br><input type="text" size="100" name="Brand" value="${entry.getBrand()}"/><br>
    </div>
    <button type="submit" name="index_id" value="${index_id}">save</button>

</form>

<%--<dialog>--%>
    <%--<p>Окно диалога</p>--%>
    <%--<button id="close">Закрыть</button>--%>
<%--</dialog>--%>

<%--<script>--%>
    <%--var dialog = document.querySelector('dialog');--%>
    <%--document.querySelector('#close').onclick = function() {--%>
        <%--dialog.close(); // close dialog window--%>
    <%--};</script>--%>
</body>
</html>
