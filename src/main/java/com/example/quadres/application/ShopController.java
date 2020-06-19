package com.example.quadres.application;

import com.example.quadres.domain.Shop;
import com.example.quadres.persistence.HelperShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping(path="/shops")
    public @ResponseBody String addNewShop (@RequestParam String name, @RequestParam Integer capacity) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        Shop newShop = new Shop();
        newShop.setName(name);
        newShop.setCapacity(capacity);
        helperShopRepository.save(newShop);
        return "New Shop created";

        //public Shop newShop(@RequestBody Shop newShop) {
        //return helperShopRepository.save(newShop);
    }
}
