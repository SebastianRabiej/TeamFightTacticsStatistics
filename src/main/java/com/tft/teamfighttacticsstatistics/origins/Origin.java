package com.tft.teamfighttacticsstatistics.origins;

import lombok.Data;

import java.util.List;

@Data
public class Origin {
    private String key;
    private String name;
    private String description;
    private String accentChampionImage;
    private List<Bonus> bonuses;
}