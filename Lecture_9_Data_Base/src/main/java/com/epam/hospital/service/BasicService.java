package com.epam.hospital.service;

import java.io.Serializable;
import java.util.List;

public interface BasicService<T extends Serializable> {

    List<T> findAll();
    T findById(Integer idEntity);
    void add(T entity);
    T update(Integer idEntity, T entity);
    void deleteById(Integer idEntity);
}
