package com.example.myproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myproject.model.Shop;

//Marker Interface
public interface ShopRepo extends JpaRepository<Shop,Integer> {

}
