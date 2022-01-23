package com.example.demo.Repository;

import com.example.demo.Entity.Game;
import com.example.demo.Entity.Inbox;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {
}
