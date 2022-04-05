package com.example.bitirme.repository;

import java.util.UUID;
import com.example.bitirme.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product")
public interface ProductRepository extends JpaRepository<Product,UUID> 
{}
