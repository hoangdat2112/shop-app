package com.project.shopapp.repositories;

import com.project.shopapp.models.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ProductImageRepository extends JpaRepository<ProductImage, Long> {
    List<ProductImage> findByProductId(Long productId);
    @Transactional
    void deleteByProductId(Long productId);

}
