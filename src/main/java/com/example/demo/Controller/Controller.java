package com.example.demo.Controller;

import com.example.demo.DTO.*;
import com.example.demo.Entity.*;
import com.example.demo.Service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(value = "/web/v1")
public class Controller {
    @Autowired
    Services service;

    @PostMapping("/signup")
    private BaseResponseDTO signup(@RequestBody UserRequestDTO UserRequestDTO) {
        return service.signup(UserRequestDTO);
    }
    @PutMapping("/user")
    private BaseResponseDTO putuser(@RequestParam Long id,@RequestBody UserRequestDTO UserRequestDTO) {
        return service.putuser(id,UserRequestDTO);
    }
    @GetMapping("/user")
    private User getuser(@RequestParam Long id) {
        return service.getuser(id);
    }
    @GetMapping("/leaderboard")
    private List<User> getuserList() {
        return service.getuserList();
    }
    @PostMapping("/inbox")
    private BaseResponseDTO createinbox(@RequestBody InboxRequest inboxRequest) {
        return service.createinbox(inboxRequest);
    }
    @GetMapping("/inbox")
    private Set<Inbox> getinbox(@RequestParam Long id) {
        return service.getinbox(id);
    }
    @PostMapping("/creategame")
    private BaseResponseDTO creategame(@RequestBody CreateGameRequestDTO createGameRequestDTO) {
        return service.creategame(createGameRequestDTO);
    }
    @PostMapping("/matchMaking")
    private BaseResponseDTO matchMaking(@RequestBody MatchMakingRequestDTO matchMakingRequestDTO) {
        return service.matchMaking(matchMakingRequestDTO);
    }
    @PostMapping("/createteam")
    private BaseResponseDTO createteam(@RequestBody CreateTeamRequestDTO createTeamRequestDTO) {
        return service.createteam(createTeamRequestDTO);
    }
    @PostMapping("/jointeam")
    private BaseResponseDTO jointeam(@RequestBody JoinTeamRequestDTO joinTeamRequestDTO) {
        return service.jointeam(joinTeamRequestDTO);
    }
    @PostMapping("/teamlist")
    private Set<TeamUser> teamlist(@RequestParam Long id) {
        return service.teamlist(id);
    }
    @PostMapping("/purchase")
    private BaseResponseDTO purchase(@RequestBody PurchaseDTO purchaseDTO) {
        return service.purchase(purchaseDTO);
    }
    @GetMapping("/purchaselog")
    private Set<Purchase> purchaselog(@RequestParam Long id) {
        return service.purchaselog(id);
    }
    @PostMapping("/shop")
    private BaseResponseDTO shop(@RequestBody ShopRequestDTO shopRequestDTO) {
        return service.shop(shopRequestDTO);
    }
    @GetMapping("/shop")
    private List<Shop> shoplist() {
        return service.shoplist();
    }
}
