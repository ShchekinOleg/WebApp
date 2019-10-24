<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<fmt:setLocale value="${locale}"/>
<fmt:setBundle basename="${bundle}"/>

<div class="container d-flex m-auto">

    <div class="menu d-flex">
        <a class="admin_menu_button d-block" href="${pageContext.request.contextPath}/library/admin/show_all">
            <img src="/images/change-language-ua" width="30"
                 height="30" alt="Catalogue"></a>

        <%--<a style="color: #8C4637">&#8195|&#8195</a>--%>

        <%--<a class="admin_menu_button d-block" href="${pageContext.request.contextPath}/library/admin/add_book_page">--%>
            <%--<img src="/images/change-language-u" width="30"--%>
                 <%--height="30" alt="Add the book"></a>--%>


        <a style="color: #8C4637">&#8195|&#8195</a>

        <a class="admin_menu_button d-block" href="${pageContext.request.contextPath}/library/admin/orders_page">
            <img src="/images/change-language-u" width="30"
                 height="30" alt="Orders"></a>


    </div>
</div>

</div>
