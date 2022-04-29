package com.example.kea_shop.DAO;

import com.example.kea_shop.Models.ShopName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class WebShopNameDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public String getShopName() {
        List<ShopName> webshopName = jdbcTemplate.query(
                "SELECT * FROM shop_name;",
                new BeanPropertyRowMapper<>(ShopName.class));
        return webshopName.get(0).getShopName();
    }

}
