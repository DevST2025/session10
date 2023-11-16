package com.example.ss10.controller;

import com.example.ss10.model.Product;
import com.example.ss10.service.IProductService;
import com.example.ss10.serviceimpl.ProductService;
import com.example.ss10.service.IProductService;
import com.example.ss10.serviceimpl.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@WebServlet(name = "ProductServlet", value = "/ProductServlet")
public class ProductServlet extends HttpServlet {
    IProductService productService = new ProductService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch(action){
            case "FINDALL":
                List<Product> products =  productService.findAllProduct();
                request.setAttribute("list",products);
                request.getRequestDispatcher("/WEB-INF/views/product/list-product.jsp").forward(request,response);
                break;
            case "DELETE":
               long id = Long.parseLong(request.getParameter("id"));
                productService.deleteProduct(id);
                request.setAttribute("list",productService.findAllProduct());
                request.getRequestDispatcher("/WEB-INF/views/product/list-product.jsp").forward(request,response);
                break;
            case "DETAIL":
                Long idDetail =Long.parseLong(request.getParameter("id"));
                Optional<Product> product = productService.findById(idDetail);
                product.ifPresent(cus->{
                    request.setAttribute("c",cus);
                    try {
                        request.getRequestDispatcher("/WEB-INF/views/product/detail-product.jsp").forward(request,response);
                    } catch (ServletException | IOException e) {
                        throw new RuntimeException(e);
                    }
                });

                break;
            case "EDIT":
                Long id1 = Long.parseLong(request.getParameter("id"));
                Optional<Product> product1 =  productService.findById(id1);
                product1.ifPresent(cus->{
                    request.setAttribute("pro",cus);
                    try {
                        request.getRequestDispatcher("/WEB-INF/views/product/list-product.jsp").forward(request,response);
                    } catch (ServletException | IOException e) {
                        throw new RuntimeException(e);
                    }
                });
                break;

        }
    }

    protected  void edit(HttpServletRequest request, HttpServletResponse response){

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String action = request.getParameter("action");
       switch(action){
           case "ADD":
               long id = Long.parseLong(request.getParameter("id"));
               String name = request.getParameter("name");
               String des = request.getParameter("description");
               int stock = Integer.parseInt(request.getParameter("stock"));
               String img = request.getParameter("imgProduct");
               double price = Double.parseDouble(request.getParameter("price"));
               Product product = new Product(id,name,price,des, img,stock);
               productService.save(product);
               List<Product> products =  productService.findAllProduct();
               request.setAttribute("list",products);
               request.getRequestDispatcher("/WEB-INF/views/product/list-product.jsp").forward(request,response);
               break;
           case "EDIT":

               break;
       }
    }
}