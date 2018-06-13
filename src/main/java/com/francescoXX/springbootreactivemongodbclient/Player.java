package com.francescoXX.springbootreactivemongodbclient;


/**
 * Created by FrancescoXX on 10/06/2018.
 */

public class Player {

    private String id;
    private String name;
    private Long recordModeOne;
    private Long recordModeTwo;
    private Long recordModeThree;

    public Player() {
    }

    public Player(String id, String name, Long recordModeOne, Long recordModeTwo, Long recordModeThree) {
        this.id = id;
        this.name = name;
        this.recordModeOne = recordModeOne;
        this.recordModeTwo = recordModeTwo;
        this.recordModeThree = recordModeThree;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRecordModeOne() {
        return recordModeOne;
    }

    public void setRecordModeOne(Long recordModeOne) {
        this.recordModeOne = recordModeOne;
    }

    public Long getRecordModeTwo() {
        return recordModeTwo;
    }

    public void setRecordModeTwo(Long recordModeTwo) {
        this.recordModeTwo = recordModeTwo;
    }

    public Long getRecordModeThree() {
        return recordModeThree;
    }

    public void setRecordModeThree(Long recordModeThree) {
        this.recordModeThree = recordModeThree;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", recordModeOne=" + recordModeOne +
                ", recordModeTwo=" + recordModeTwo +
                ", recordModeThree=" + recordModeThree +
                '}';
    }
}
