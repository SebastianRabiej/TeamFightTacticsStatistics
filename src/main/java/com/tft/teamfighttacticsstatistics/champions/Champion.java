package com.tft.teamfighttacticsstatistics.champions;

import lombok.Data;

import java.util.List;

@Data
class Champion {

    private String id;
    private String key;
    private String name;
    private List<String> origin;
    private List<String> championClass;
    private Integer cost;
    private Ability ability;
    private Stats stats;
    private List<String> items;
}