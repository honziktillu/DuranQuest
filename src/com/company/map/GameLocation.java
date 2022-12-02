package com.company.map;

import com.company.Game;

import java.util.ArrayList;

public class GameLocation {

    private String name;
    private byte maxMoves;
    private byte movesCount;
    private ArrayList<GameLocation> paths = new ArrayList<>();

    public GameLocation(String name, byte maxMoves, byte movesCount) {
        this.name = name;
        this.maxMoves = maxMoves;
        this.movesCount = movesCount;
    }

    public void addPath(GameLocation gameLocation) {
        paths.add(gameLocation);
    }

    public void removePath(GameLocation gameLocation) {
        paths.remove(gameLocation);
    }
    
    public void printPaths() throws Exception {
        System.out.println("Dostupné lokace:");
        if (paths.isEmpty()) {
            throw new Exception("Lokace " + name + " nemá další cesty");
        }
        for (GameLocation path : paths) {
            System.out.println(path.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getMaxMoves() {
        return maxMoves;
    }

    public void setMaxMoves(byte maxMoves) {
        this.maxMoves = maxMoves;
    }

    public byte getMovesCount() {
        return movesCount;
    }

    public void setMovesCount(byte movesCount) {
        this.movesCount = movesCount;
    }
}
