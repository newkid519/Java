/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kennyzx.demo.repositories;

import com.kennyzx.demo.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author kennyzx
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByProdName(final String prodName);
}
