package com.example.kea_shop.ViewController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class PagesController {

    @GetMapping("/")
    public String frontPage(Model model) {
        ArrayList<String> features = new ArrayList<>();
        features.add("You can see products");
        features.add("You can contact us");
        features.add("You can purchase things");
        model.addAttribute("features", features);

        model.addAttribute("webshopName", "Kea Shop");

        return "frontpage/index";
    }

    @GetMapping("/products")
    public String productsPage(Model model) {
        return "products/products";
    }

    @GetMapping("/contact")
    public String contactPage() {
        return "contact/contact";
    }

}
