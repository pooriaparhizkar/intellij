package com.example.demo.Repository;

import com.example.demo.Entity.MatchMake;
import com.example.demo.Entity.TeamUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamUserRepository  extends JpaRepository<TeamUser, Long> {
}
