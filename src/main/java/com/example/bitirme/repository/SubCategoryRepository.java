package com.example.bitirme.repository;

import java.util.UUID;
import com.example.bitirme.entity.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "subcategory")
public interface SubCategoryRepository extends JpaRepository<SubCategory,UUID> 
{}