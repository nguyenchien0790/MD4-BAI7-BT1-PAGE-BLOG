package rikkei.academy.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import rikkei.academy.model.Blog;
import rikkei.academy.model.Category;

import java.time.LocalDateTime;

@Repository
public interface IBlogRepository extends PagingAndSortingRepository<Blog, Long> {
    Page<Blog> findAllByNameContaining(String name, Pageable pageable);
    Page<Blog> findAllByCategory(Category category, Pageable pageable);
    Page<Blog> findAllByOrderByCreatedDate(Pageable pageable);
}
