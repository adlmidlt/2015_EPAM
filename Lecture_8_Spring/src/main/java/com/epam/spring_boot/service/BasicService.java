package com.epam.spring_boot.service;

import java.io.Serializable;
import java.util.List;

public interface BasicService<T extends Serializable> {

    List<T> findAll();
    T findById(int idEntity);
    void add(T entity);
    T update(int idEntity, T entity);
    void deleteById(int idEntity);
}
