package com.epam.hospital.dao;

import java.io.Serializable;
import java.util.List;

public interface BasicDAO<T extends Serializable> {

    List<T> findAll();
    T getById(Long id);
    void update(Long id, T t);
    void create(T t);
    void deleteById(Long id);
}
