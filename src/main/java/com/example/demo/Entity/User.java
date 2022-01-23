package com.example.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @JsonIgnore
    private Long id;
    @Column(name = "first_name" , length = 65)
    private String firstName;
    @Column(name = "last_name" , length = 65)
    private String lastName;
    @Column(name = "email" )
    private String email;
    @Column(name = "mobile")
    private String mobile;
    @Column(name = "password")
    private String password;
    @Column(name = "score")
    private int score;
    @Column(name = "enable")
    private Boolean enable = true;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private Set<MatchMake> matches = new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private Set<Inbox> inboxes = new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private Set<TeamUser> teamUsers = new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private Set<Purchase> purchases = new HashSet<>();
    public User() {
    }

    public User(String firstName, String lastName, String email, String mobile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Set<MatchMake> getMatches() {
        return matches;
    }

    public void setMatches(Set<MatchMake> matches) {
        this.matches = matches;
    }

    public Set<Inbox> getInboxes() {
        return inboxes;
    }

    public void setInboxes(Set<Inbox> inboxes) {
        this.inboxes = inboxes;
    }

    public Set<TeamUser> getTeamUsers() {
        return teamUsers;
    }

    public void setTeamUsers(Set<TeamUser> teamUsers) {
        this.teamUsers = teamUsers;
    }

    public Set<Purchase> getPurchases() {
        return purchases;
    }

    public void setPurchases(Set<Purchase> purchases) {
        this.purchases = purchases;
    }
}

