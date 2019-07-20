package com.tft.teamfighttacticsstatistics.champions;

import lombok.Data;

import java.util.List;

@Data
class Ability {

    private String name;
    private String description;
    private String type;
    private Integer manaCost;
    private Integer manaStart;
    private List<Stat> stats;
}