package com.epam.hospital_spring_boot.repository;

import java.io.Serializable;
import java.util.List;

public interface BasicRepository<T extends Serializable> {

    List<T> displayAll();
    void add(T obj);
    void deleteById(Long idObj);
    void update(Long idObj, T obj);
    T findById(Long idObj);
}
