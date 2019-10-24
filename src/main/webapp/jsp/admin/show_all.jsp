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
            <div>
                <p class="admin_title_content">Catalogue</p>
            </div>

            <div class="table_book_list">
                <table class="table table-primary table-striped w-auto">
                    <thead>
                    <tr>
                        <th>#</th>
                        <th>Title</th>
                        <th>Author</th>
                        <th>Number of pages</th>
                        <th>Address</th>
                        <th>Edit/Delete</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach items="${requestScope.books}" var="book">
                        <tr>
                            <th>${book.id}</th>
                            <td>${book.title}</td>
                            <td>${book.author.firstName} ${book.author.lastName}</td>
                            <td>${book.numberOfPages}</td>
                            <td>${book.address}</td>
                            <td>
                                <form method="post"
                                      action="${pageContext.request.contextPath}/library/admin/delete_book">
                                    <input type="hidden" name="from" value="/admin/show_all">
                                    <input type="hidden" name="book_id" value="${book.id}">
                                    <input type="submit" value="Delete">
                                </form>
                            </td>
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