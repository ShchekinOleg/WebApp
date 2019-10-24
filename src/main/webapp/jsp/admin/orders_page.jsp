<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <jsp:include page="/jsp/head_tag.jsp"/>
</head>
<body style="width: 100%">
<div class="admin_page d-flex">
    <%--<jsp:include page="left_part.jsp"/>--%>
    <jsp:include page="header_admin.jsp"/>
    <div class="admin_right">
        <div class="margin_block">

        </div>
        <div>
            <p class="admin_title_content">Books</p>
        </div>
        <div class="book_list w-100">
            <div class="table_book_list mb-5 ">
                <p class="text-center" style="color: #218DA6">Booked</p>
                <table class="table table-primary table-striped w-auto">
                    <thead>
                    <tr>
                        <th>#</th>
                        <th>Title</th>
                        <th>Author</th>
                        <th>Number of pages</th>
                        <th>Reader email</th>
                        <th>Reader telephone number</th>
                        <th>Status</th>
                        <th></th>
                        <th></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${requestScope.orders}" var="order">
                        <tr>
                            <td>${order.book.id}</td>
                            <td>${order.book.title}</td>
                            <td>${order.book.author.firstName} ${order.book.author.lastName}</td>
                            <td>${order.book.numberOfPages}</td>
                            <td>${order.reader.email}</td>
                            <td>${order.reader.telephoneNumber}</td>
                            <td>${order.status}</td>
                            <c:if test="${!(order.status == 'TAKEN_BY_READER')}">
                                <td>
                                    <form method="post"
                                          action="${pageContext.request.contextPath}/library/admin/confirm_order">
                                        <input type="hidden" name="from" value="/admin/orders_page">
                                        <input type="hidden" name="order_id" value="${order.id}">
                                        <input type="submit" value="Confirm">
                                    </form>
                                </td>
                                <td>
                                    <form method="post"
                                          action="${pageContext.request.contextPath}/library/admin/refuse_order">
                                        <input type="hidden" name="from" value="/admin/orders_page">
                                        <input type="hidden" name="order_id" value="${order.id}">
                                        <input type="submit" value="Refuse">
                                    </form>
                                </td>
                            </c:if>
                            <c:if test="${order.status == 'TAKEN_BY_READER'}">
                                <td>
                                    <form method="post"
                                          action="${pageContext.request.contextPath}/library/admin/return_order">
                                        <input type="hidden" name="from" value="/admin/orders_page">
                                        <input type="hidden" name="order_id" value="${order.id}">
                                        <input type="submit" value="Return">
                                    </form>
                                </td>
                            </c:if>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>