package org.nagarro.repository;

import java.util.Optional;

import org.nagarro.models.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductDetails, Integer> {

}
