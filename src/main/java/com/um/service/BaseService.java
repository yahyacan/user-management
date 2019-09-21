package com.um.service;

import java.util.List;
import java.util.Optional;

public interface BaseService<T> {

    public List<T> findAll();

    public T saveOrUpdate(T entity);

    public Optional<T> findById(Long id);

    public void delete(Long id);

}
