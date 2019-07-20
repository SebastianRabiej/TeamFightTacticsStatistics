package com.tft.teamfighttacticsstatistics;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tft.teamfighttacticsstatistics.champions.Champions;
import com.tft.teamfighttacticsstatistics.classes.Classes;
import com.tft.teamfighttacticsstatistics.items.Items;
import com.tft.teamfighttacticsstatistics.origins.Origins;

import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@AllArgsConstructor
class Controller {

    private DataProvider dataProvider;

    @GetMapping("/origins")
    Origins getOrigins() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Origins origins = objectMapper.readValue(dataProvider.getOrigins(), Origins.class);
        return origins;
    }

    @GetMapping("/classes")
    Classes getClasses() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Classes classes = objectMapper.readValue(dataProvider.getClasses(), Classes.class);
        return classes;
    }

    @GetMapping("/champions")
    Champions getChampions() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Champions champions = objectMapper.readValue(dataProvider.getChampions(), Champions.class);
        return champions;
    }

    @GetMapping("/items")
    Items getItems() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Items items = objectMapper.readValue(dataProvider.getItems(), Items.class);
        return items;
    }

}
