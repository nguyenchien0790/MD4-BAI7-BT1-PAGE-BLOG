package rikkei.academy.repository;

import rikkei.academy.model.Blog;
import rikkei.academy.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends PagingAndSortingRepository<Category,Long> {
}