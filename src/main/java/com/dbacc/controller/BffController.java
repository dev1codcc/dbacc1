package com.dbacc.controller;


import com.dbacc.domain.Shop;
import com.dbacc.domain.ShopQueryBody;
import org.jetbrains.annotations.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/shop")
class BffController {

    // e.g. localhost:8089/api/v1/shop/35
    @GetMapping("/{id}")
    public Shop getShop(@PathVariable Long id) {
        Shop shop = new Shop();
        shop.setId(id);
        shop.setName("GY");

        return shop;
    }


    //e.g. localhost:8089/api/v1/shop/byId?id=75
    @GetMapping("byId")
    public Shop getShop2(@RequestParam("id") Long id) {
        Shop shop = new Shop();
        shop.setId(id);
        shop.setName("GY");

        return shop;
    }

    @PostMapping("byQueryBody")
    public Shop getShop3(@RequestBody @NotNull ShopQueryBody shopQueryBody){
        Shop shop = new Shop();
        shop.setProvince(shopQueryBody.getProvince());
        //shop.setStatus(shopQueryBody.getStatus());

        return shop;
    }

    @GetMapping("/info")
    public String getInfo(){
        return "I am living.";
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void add(@RequestBody Shop shop) {

    }
}
