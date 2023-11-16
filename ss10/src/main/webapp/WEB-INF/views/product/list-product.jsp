<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 11/13/2023
  Time: 4:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
<jsp:include page="../assets/head.jsp"></jsp:include>
</head>
<body>
<div class="container">
    <form action="<%=request.getContextPath()%>/ProductServlet" method="post" >
        <div class="mb-3">
            <label for="id" class="form-label">ID</label>
            <input type="number" min="1" class="form-control" value="${pro.id}"  id="id" name="id">
        </div>
        <div class="mb-3">
            <label  class="form-label">Name</label>
            <input type="text" class="form-control" value="${pro.name}" name="name">
        </div>
        <div class="mb-3">
            <label class="form-label">Price</label>
            <input type="text" class="form-control" value="${pro.price}" name="price">
        </div>
        <div class="mb-3">
            <label class="form-label">Description</label>
            <input type="text" class="form-control" value="${pro.description}"  name="description">
        </div>
        <div class="mb-3">
            <label class="form-label">imgProduct</label>
            <input type="text" class="form-control" value="${pro.imgProduct}" name="imgProduct">
        </div>
        <div class="mb-3">
            <label class="form-label">Stock</label>
            <input type="text" class="form-control" value="${pro.stock}"  name="stock">
        </div>
        <input class="btn btn-success"  type="submit" value="ADD" name="action">
    </form>
</div>

<div class="container">
    <div class="row row-cols-1 row-cols-md-3 g-4 container">
        <c:forEach items="${list}" var="c">
            <div class="col">
                <div class="card h-100">
                    <img src="${c.imgProduct}" class="card-img-top" alt="Hollywood Sign on The Hill"/>
                    <div class="card-body">
                        <h5 class="card-title">${c.name}</h5>
                        <div clas="d-flex justify-content-center">
                            <p class="card-text">
                                    ${c.description}
                            </p>
                            <p class="card-text">
                                    ${c.price}
                            </p>
                        </div>
                        <div class="container d-flex">
                                <a href="<%=request.getContextPath()%>/ProductServlet?action=DETAIL&id=${c.id}"
                                   class="btn btn-info">Detail</a>
                                <a href="<%=request.getContextPath()%>/ProductServlet?action=EDIT&id=${c.id}"
                                   class="btn btn-warning">Edit</a>
                                <a href="<%=request.getContextPath()%>/ProductServlet?action=DELETE&id=${c.id}"
                                   onclick="return confirm('Bạn có chắc muốn xóa không?')" class="btn btn-danger">Delete</a>
                        </div>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>
<jsp:include page="../assets/foot.jsp"></jsp:include>
</body>
</html>
