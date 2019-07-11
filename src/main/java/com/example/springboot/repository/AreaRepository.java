package com.example.springboot.repository;

import com.example.springboot.entity.Area;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AreaRepository extends JpaRepository<Area, Long>  {
}
