package com.aquar.game.database;

// Generated Jan 3, 2014 2:58:47 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * Company generated by hbm2java
 */
public class Company implements java.io.Serializable {

    private Integer id;
    private String name;
    private Set games = new HashSet(0);

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    public Company(String name, Set games) {
        this.name = name;
        this.games = games;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set getGames() {
        return this.games;
    }

    public void setGames(Set games) {
        this.games = games;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        boolean ret = false;
        if (this == obj) {
            ret = true;
        } else if (obj instanceof Company) {
            ret = this.name.equals(((Company) obj).getName());
        } 
        return ret;
    }
}