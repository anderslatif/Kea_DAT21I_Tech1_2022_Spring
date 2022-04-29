package com.example.kea_shop.DAO;

import com.example.kea_shop.Models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductsDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Product> getProducts() {
        return jdbcTemplate.query(
        "SELECT * FROM products;",
            new BeanPropertyRowMapper<>(Product.class)
        );
    }

}
