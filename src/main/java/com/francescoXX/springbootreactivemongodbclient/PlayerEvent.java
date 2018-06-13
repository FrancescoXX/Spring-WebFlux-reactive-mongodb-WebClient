package com.francescoXX.springbootreactivemongodbclient;

import java.util.Date;

/**
 * Created by FrancescoXX on 10/06/2018.
 */
public class PlayerEvent {

    private Player player;
    private Date date;

    public PlayerEvent(Player player, Date date) {
        this.player = player;
        this.date = date;
    }

    public PlayerEvent() {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "PLayerEvent{" +
                "player=" + player +
                ", date=" + date +
                '}';
    }
}
