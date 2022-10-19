package com.nestdigital.shopApp.Controller;


import com.nestdigital.shopApp.Dao.ShopDao;
import com.nestdigital.shopApp.Model.ShopModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShopController {
@Autowired
    private ShopDao dao;

@CrossOrigin(origins = "*")
    @PostMapping(path = "/addshop",consumes = "application/json",produces = "application/json")
    public String addshop(@RequestBody ShopModel shop){
    System.out.println(shop.toString());
    dao.save(shop);
        return "{status:'success'}";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewshop")
    public List<ShopModel> viewshop(){
    return (List<ShopModel>) dao.findAll();
    }
}
