package com.example.ss10.service;

import java.util.List;
import java.util.Optional;

public interface IGenericService <T,E>{
    List<T> findAllProduct();
    Optional<T> findById(E e);
    void deleteProduct(E e);
    void save(T t);
}
