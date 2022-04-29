package com.example.kea_shop.ViewController;

import com.example.kea_shop.DAO.ProductsDAO;
import com.example.kea_shop.DAO.WebShopNameDAO;
import com.example.kea_shop.Models.ShopName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class PagesController {

    @Autowired
    WebShopNameDAO webShopNameDAO;

    @Autowired
    ProductsDAO productsDAO;

    @GetMapping("/")
    public String frontPage(Model model) {
        ArrayList<String> features = new ArrayList<>();
        features.add("You can see products");
        features.add("You can contact us");
        features.add("You can purchase things");
        model.addAttribute("features", features);

        model.addAttribute("webshopName", webShopNameDAO.getShopName());

        return "frontpage/index";
    }

    @GetMapping("/products")
    public String productsPage(Model model) {

        model.addAttribute("products", productsDAO.getProducts());

        return "products/products";
    }

    @GetMapping("/contact")
    public String contactPage() {
        return "contact/contact";
    }

}
