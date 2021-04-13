package com.renancso.fullstackcourse.services;

import com.renancso.fullstackcourse.models.Category;
import com.renancso.fullstackcourse.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repo;

    public Category getCategory(Integer ID) {
        Optional<Category> category = repo.findById(ID);
        return category.orElse(null);
    }
}
