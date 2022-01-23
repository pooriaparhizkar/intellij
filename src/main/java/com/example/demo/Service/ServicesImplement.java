package com.example.demo.Service;

import com.example.demo.DTO.*;
import com.example.demo.Entity.*;
import com.example.demo.Repository.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

@Service
public class ServicesImplement implements Services {
    @Autowired
    UserRepository userRepository;
    @Autowired
    InboxRepository inboxRepository;
    @Autowired
    TeamRepository teamRepository;
    @Autowired
    GameRepository gameRepository;
    @Autowired
    MatchMakeRepository matchMakeRepository;
    @Autowired
    TeamUserRepository teamUserRepository;
    @Autowired
    ShopRepositry shopRepositry;
    @Autowired
    PurchaseRepository purchaseRepository;
    @Override
    public BaseResponseDTO signup(UserRequestDTO userRequestDTO) {
        User user = new User();
        user.setEmail(userRequestDTO.getEmail());
        user.setFirstName(userRequestDTO.getFirstname());
        user.setMobile(userRequestDTO.getMobile());
        user.setLastName(userRequestDTO.getLastname());
        user.setPassword(userRequestDTO.getPassword());
        user.setScore(0);
        user.setEnable(true);
        userRepository.save(user);
        BaseResponseDTO baseResponseDTO = new BaseResponseDTO();
        baseResponseDTO.setCode(200);
        baseResponseDTO.setMessage("ستون دمت گرم ساخته شد داداشمی");
        return  baseResponseDTO;

    }

    @Override
    public BaseResponseDTO putuser(Long id, UserRequestDTO userRequestDTO) {
        User user = userRepository.findById(id).get();
        user.setEmail(userRequestDTO.getEmail());
        user.setFirstName(userRequestDTO.getFirstname());
        user.setMobile(userRequestDTO.getMobile());
        user.setLastName(userRequestDTO.getLastname());
        user.setPassword(userRequestDTO.getPassword());
        user.setScore(userRequestDTO.getScore());
        user.setEnable(true);
        userRepository.save(user);
        BaseResponseDTO baseResponseDTO = new BaseResponseDTO();
        baseResponseDTO.setCode(200);
        baseResponseDTO.setMessage("ستون دمت گرم ادیت شد داداشمی");
        return  baseResponseDTO;
    }

    @Override
    public User getuser(Long id) {
        User user = userRepository.findById(id).get();
        return user;
    }

    @Override
    public List<User> getuserList() {
        List<User> users = userRepository.findAll();
        users.sort(Comparator.comparing(User::getScore).reversed());
        return users;
    }

    @Override
    public BaseResponseDTO createinbox(InboxRequest inboxRequest) {
        Inbox inbox = new Inbox();
        inbox.setCreateAt(System.currentTimeMillis()/1000);
        inbox.setDescription(inboxRequest.getDescription());
        inbox.setTitle(inboxRequest.getTitle());
        inbox.setMessageType(inboxRequest.getMessageType());
        User user = userRepository.findById(inboxRequest.getUserid()).get();
        inbox.setUser(user);
        inboxRepository.save(inbox);
        BaseResponseDTO baseResponseDTO = new BaseResponseDTO();
        baseResponseDTO.setCode(200);
        baseResponseDTO.setMessage("ستون دمت گرم ساخته شد داداشمی");
        return  baseResponseDTO;
    }

    @Override
    public Set<Inbox> getinbox(Long id) {
        User user = userRepository.findById(id).get();
       return user.getInboxes();
    }

    @Override
    public BaseResponseDTO creategame(CreateGameRequestDTO createGameRequestDTO) {
        Game game = new Game();
        game.setEnable(true);
        game.setName(createGameRequestDTO.getName());
        game.setAward(createGameRequestDTO.getAward());
        gameRepository.save(game);
        BaseResponseDTO baseResponseDTO = new BaseResponseDTO();
        baseResponseDTO.setCode(200);
        baseResponseDTO.setMessage("ستون دمت گرم ساخته شد داداشمی");
        return  baseResponseDTO;
    }

    @Override
    public BaseResponseDTO matchMaking(MatchMakingRequestDTO matchMakingRequestDTO) {
        MatchMake matchMake = new MatchMake();
        User user = userRepository.findById(matchMakingRequestDTO.getUserid()).get();
        Game game = gameRepository.findById(matchMakingRequestDTO.getGameid()).get();
        matchMake.setUser(user);
        matchMake.setGame(game);
        matchMakeRepository.save(matchMake);
        BaseResponseDTO baseResponseDTO = new BaseResponseDTO();
        baseResponseDTO.setCode(200);
        baseResponseDTO.setMessage("ستون دمت گرم پیدا شد داداشمی");
        return  baseResponseDTO;
    }

    @Override
    public BaseResponseDTO createteam(CreateTeamRequestDTO createTeamRequestDTO) {
        Team team = new Team();
        team.setName(createTeamRequestDTO.getName());
        team.setScore(createTeamRequestDTO.getScore());
        teamRepository.save(team);
        BaseResponseDTO baseResponseDTO = new BaseResponseDTO();
        baseResponseDTO.setCode(200);
        baseResponseDTO.setMessage("ستون دمت گرم ساخته شد داداشمی");
        return  baseResponseDTO;
    }

    @Override
    public BaseResponseDTO jointeam(JoinTeamRequestDTO joinTeamRequestDTO) {
        TeamUser teamUser = new TeamUser();
        Team team = teamRepository.findById(joinTeamRequestDTO.getTeamid()).get();
        User user = userRepository.findById(joinTeamRequestDTO.getUserid()).get();
        teamUser.setUser(user);
        teamUser.setTeam(team);
        teamUserRepository.save(teamUser);
        BaseResponseDTO baseResponseDTO = new BaseResponseDTO();
        baseResponseDTO.setCode(200);
        baseResponseDTO.setMessage("ستون دمت گرم جوین شدی داداشمی");
        return  baseResponseDTO;
    }

    @Override
    public Set<TeamUser> teamlist(Long id) {
        User user = userRepository.findById(id).get();
        return user.getTeamUsers();
    }

    @Override
    public BaseResponseDTO purchase(PurchaseDTO purchaseDTO) {
        Purchase purchase = new Purchase();
        Shop shop = shopRepositry.findById(purchaseDTO.getShopid()).get();
        User user = userRepository.findById(purchaseDTO.getUserid()).get();
        purchase.setUser(user);
        purchase.setShop(shop);
        purchaseRepository.save(purchase);
        BaseResponseDTO baseResponseDTO = new BaseResponseDTO();
        baseResponseDTO.setCode(200);
        baseResponseDTO.setMessage("ستون دمت گرم خرید انجام شد داداشمی");
        return  baseResponseDTO;
    }

    @Override
    public Set<Purchase> purchaselog(Long id) {
User user = userRepository.findById(id).get();
return  user.getPurchases();
    }

    @Override
    public BaseResponseDTO shop(ShopRequestDTO shopRequestDTO) {
        Shop shop = new Shop();
        shop.setAmount(shopRequestDTO.getAmount());
        shop.setName(shopRequestDTO.getName());
        shop.setEnable(true);
        shop.setValue(shopRequestDTO.getValue());
        shopRepositry.save(shop);
        BaseResponseDTO baseResponseDTO = new BaseResponseDTO();
        baseResponseDTO.setCode(200);
        baseResponseDTO.setMessage("ستون دمت گرم ساخته شد داداشمی");
        return  baseResponseDTO;
    }

    @Override
    public List<Shop> shoplist() {
        List<Shop>shopList=shopRepositry.findAll();
        return shopList;
    }
}
