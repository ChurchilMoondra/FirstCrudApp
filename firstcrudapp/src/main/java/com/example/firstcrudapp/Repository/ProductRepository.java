package com.example.firstcrudapp.Repository;

import com.example.firstcrudapp.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,Long> {


}
