package com.example.demo.Repository;

import com.example.demo.Entity.MatchMake;
import com.example.demo.Entity.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShopRepositry  extends JpaRepository<Shop, Long> {
}
