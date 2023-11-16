package com.example.ss10.serviceimpl;

import com.example.ss10.model.Product;
import com.example.ss10.service.IProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductService implements IProductService {
    List<Product> products = new ArrayList<>();

    public ProductService() {
        Product p1 = new Product(1l, "Haley Davidson", 10000, "Xe đẹp vl", "https://www.harley-davidson.com/content/dam/h-d/images/product-images/bikes/motorcycle/2023/2023-sportster-s/2023-sportster-s-f89/2023-sportster-s-f89-motorcycle.jpg?impolicy=myresize&rw=500", 20);
        products.add(p1);
    }

    @Override
    public List<Product> findAllProduct() {
        return products;
    }

    @Override
    public Optional<Product> findById(Long aLong) {
        return products.stream().filter(a -> a.getId() == aLong).findFirst();
    }

    @Override
    public void deleteProduct(Long aLong) {
//        products.remove(findById(aLong));
        findById(aLong).ifPresent(pro->{
            products.remove(pro);
        });
        }


    @Override
    public void save(Product product) {
        Product oldPro = findById(product.getId()).orElse(null);
        if (oldPro!=null){
            products.set(products.indexOf(oldPro),product);
        }else {
            products.add(product);
        }
    }
}
