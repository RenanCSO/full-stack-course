package com.renancso.fullstackcourse.controllers;

import com.renancso.fullstackcourse.models.Category;
import com.renancso.fullstackcourse.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    @Autowired
    private CategoryService service;

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<?> find(@PathVariable Integer id) {
        Category category = service.getCategory(id);
        return ResponseEntity.ok().body(category);
    }
}
