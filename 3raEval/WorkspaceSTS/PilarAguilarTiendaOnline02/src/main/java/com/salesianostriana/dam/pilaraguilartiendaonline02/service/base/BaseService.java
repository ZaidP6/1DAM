package com.salesianostriana.dam.pilaraguilartiendaonline02.service.base;

import java.util.List;
import java.util.Optional;

import com.salesianostriana.dam.pilaraguilartiendaonline02.model.Product;

public interface BaseService<T, ID> {

    List<T> findAll();

    Optional<T> findById(ID id);

    T save(T t);

    T edit(T t);

    void delete(T t);

    void deleteById(ID id);

	List<Product> showAllProducts();


}