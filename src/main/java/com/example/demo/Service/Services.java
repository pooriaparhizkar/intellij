package com.example.demo.Service;

import com.example.demo.DTO.*;
import com.example.demo.Entity.*;

import java.util.List;
import java.util.Set;

public interface Services {
    BaseResponseDTO signup(UserRequestDTO userRequestDTO);

    BaseResponseDTO putuser(Long id, UserRequestDTO userRequestDTO);

    User getuser(Long id);


    List<User> getuserList();

    BaseResponseDTO createinbox(InboxRequest inboxRequest);

    Set<Inbox> getinbox(Long id);

    BaseResponseDTO creategame(CreateGameRequestDTO createGameRequestDTO);

    BaseResponseDTO matchMaking(MatchMakingRequestDTO matchMakingRequestDTO);

    BaseResponseDTO createteam(CreateTeamRequestDTO createTeamRequestDTO);

    BaseResponseDTO jointeam(JoinTeamRequestDTO joinTeamRequestDTO);

    Set<TeamUser> teamlist(Long id);

    BaseResponseDTO purchase(PurchaseDTO purchaseDTO);

    Set<Purchase> purchaselog(Long id);

    BaseResponseDTO shop(ShopRequestDTO shopRequestDTO);

    List<Shop> shoplist();
}
