package com.evnmck.springmvc.repositories;

import com.evnmck.springmvc.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
