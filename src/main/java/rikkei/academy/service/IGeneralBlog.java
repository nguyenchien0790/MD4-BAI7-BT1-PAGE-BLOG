package rikkei.academy.service;



import rikkei.academy.model.Category;

import java.util.Optional;

public interface IGeneralBlog<T> {
    Iterable<Category> findAll();

    Optional<Category> findById(Long id);

    void save(T t);

    void remove(Long id);

    void update(T t);
}
