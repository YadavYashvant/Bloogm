package com.yashvant.bloogm.repositories;

import com.yashvant.bloogm.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
