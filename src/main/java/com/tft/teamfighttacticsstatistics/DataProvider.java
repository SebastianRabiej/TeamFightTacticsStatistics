package com.tft.teamfighttacticsstatistics;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;

@Slf4j
@Component
public class DataProvider {

    @Value("classpath:json/origins.json")
    private Resource originsResource;

    @Value("classpath:json/classes.json")
    private Resource classesResource;

    @Value("classpath:json/champions.json")
    private Resource championsResource;

    @Value("classpath:json/items.json")
    private Resource itemsResource;

    File getOrigins(){
        try {
            return originsResource.getFile();
        } catch (IOException e) {
            log.error("Resource failed to open. Name: " +originsResource.getFilename());
        }
        return null;
    }

    File getClasses(){
        try {
            return classesResource.getFile();
        } catch (IOException e) {
            log.error("Resource failed to open. Name: " +classesResource.getFilename());
        }
        return null;
    }

    File getChampions(){
        try {
            return championsResource.getFile();
        } catch (IOException e) {
            log.error("Resource failed to open. Name: " +championsResource.getFilename());
        }
        return null;
    }

    File getItems(){
        try {
            return itemsResource.getFile();
        } catch (IOException e) {
            log.error("Resource failed to open. Name: " +itemsResource.getFilename());
        }
        return null;
    }
}
