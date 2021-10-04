package com.epam.spring_boot.repository;

import java.io.Serializable;
import java.util.List;

public interface BasicDAO<T extends Serializable> {

    List<T> findAll();
    T findById(int idEntity);
    void add(T entity);
    T update(int idEntity, T entity);
    void deleteById(int idEntity);
}
