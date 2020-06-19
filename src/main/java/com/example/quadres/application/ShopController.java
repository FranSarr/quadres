package com.example.quadres.application;

import com.example.quadres.domain.Shop;
import com.example.quadres.persistence.HelperShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This means that this class is a Controller
@RequestMapping //(path="/shops") This means URL's start with /shops (after Application path)

public class ShopController {
    @Autowired
    private HelperShopRepository helperShopRepository;

    @GetMapping(path="/shops")
    public @ResponseBody
    Iterable<Shop> getAllShops() {
        // This returns a JSON or XML with all the shops
        return helperShopRepository.findAll();
    }
}
