package com.example.quadres.persistence;

import com.example.quadres.domain.Shop;
import org.springframework.data.repository.CrudRepository;

public interface HelperShopRepository extends CrudRepository<Shop, Integer> {

    public Shop findByName(String name);
}
