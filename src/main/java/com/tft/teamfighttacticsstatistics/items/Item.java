package com.tft.teamfighttacticsstatistics.items;

import lombok.Data;

import java.util.List;

@Data
class Item {

    private String key;
    private String name;
    private String type;
    private String bonus;
    private Integer tier;
    private Integer depth;
    private List<Stat> stats;
    private String kind;
    private List<String> buildsInto;
    private List<String> champs;
    private List<String> buildsFrom;
}