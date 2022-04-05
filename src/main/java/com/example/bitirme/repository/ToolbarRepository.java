package com.example.bitirme.repository;

import java.util.UUID;
import com.example.bitirme.entity.Toolbar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "toolbar")
public interface ToolbarRepository extends JpaRepository<Toolbar,UUID> 
{}
