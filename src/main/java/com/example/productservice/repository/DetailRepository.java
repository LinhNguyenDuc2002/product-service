package com.example.productservice.repository;

import com.example.productservice.entity.Detail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailRepository extends BaseRepository<Detail, String> {
}
