<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 11/13/2023
  Time: 11:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="/WEB-INF/views/assets/head.jsp"></jsp:include>
</head>
<body>
<section class="vh-100" style="background-color: #f4f5f7;">
    <div class="container py-5 h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col col-lg-6 mb-4 mb-lg-0">
                <div class="card mb-3" style="border-radius: .5rem;">
                    <div class="row g-0">
                        <div class="col-md-4 gradient-custom text-center text-white"
                             style="border-top-left-radius: .5rem; border-bottom-left-radius: .5rem;">
                            <img src="${c.imgProduct}"
                                 alt="Avatar" class="img-fluid my-4" style="width: 500px;"/>
                            <h5>Marie Horwitz</h5>
                            <p>Web Designer</p>
                            <i class="far fa-edit mb-5"></i>
                        </div>
                        <div class="col-md-8">
                            <div class="card-body p-4">
                                <h6>Information</h6>
                                <hr class="mt-0 mb-4">
                                <div class="row pt-1">
                                    <div class="col-6 mb-3">
                                        <h6>Name</h6>
                                        <p class="text-muted">${c.name}</p>
                                    </div>
                                    <div class="col-6 mb-3">
                                        <h6>Price</h6>
                                        <p class="text-muted">${c.price}</p>
                                    </div>

                                    <div class="col-6 mb-3">
                                        <h6>Description</h6>
                                        <p class="text-muted">${c.description}</p>
                                    </div>
                                    <div class="col-6 mb-3">
                                        <h6>Stock</h6>
                                        <p class="text-muted">${c.stock}</p>
                                    </div>
                                </div>
                                <div class="row pt-1">
                                    <div class="col-6 mb-3">
                                        <h6>Description</h6>
                                        <p class="text-muted">${c.description}</p>
                                    </div>
                                </div>
                                <div class="d-flex justify-content-start">
                                    <a href="#!"><i class="fab fa-facebook-f fa-lg me-3"></i></a>
                                    <a href="#!"><i class="fab fa-twitter fa-lg me-3"></i></a>
                                    <a href="#!"><i class="fab fa-instagram fa-lg"></i></a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
<jsp:include page="/WEB-INF/views/assets/foot.jsp"></jsp:include>
</body>
</html>
