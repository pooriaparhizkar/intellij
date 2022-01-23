package com.example.demo.Repository;

import com.example.demo.Entity.MatchMake;
import com.example.demo.Entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchMakeRepository extends JpaRepository<MatchMake, Long> {
}
