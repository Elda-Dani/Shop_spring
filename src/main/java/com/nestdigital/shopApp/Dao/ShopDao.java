package com.nestdigital.shopApp.Dao;

import com.nestdigital.shopApp.Model.ShopModel;
import org.springframework.data.repository.CrudRepository;

public interface ShopDao extends CrudRepository <ShopModel,Integer> {
}
