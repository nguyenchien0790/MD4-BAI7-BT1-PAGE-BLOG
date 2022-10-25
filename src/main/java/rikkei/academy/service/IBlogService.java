package rikkei.academy.service;

import rikkei.academy.model.Blog;
import rikkei.academy.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import rikkei.academy.model.Blog;

public interface IBlogService extends IGeneralBlog<Blog> {
    Page<Blog> findAll(Pageable pageable);
    Page<Blog> findAllByNameContaining(String name, Pageable pageable);
    Page<Blog> findAllByCategory(Category category, Pageable pageable);
    Page<Blog> findAllByOrderByCreatedDate( Pageable pageable);
}
