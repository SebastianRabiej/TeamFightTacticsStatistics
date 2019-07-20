package com.tft.teamfighttacticsstatistics;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;

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

    InputStream getOrigins(){
        try {
            return originsResource.getInputStream();
        } catch (IOException e) {
            log.error("Resource failed to open. Name: " +originsResource.getFilename());
        }
        log.error("No file " + originsResource);
        return null;
    }

    InputStream getClasses(){
        try {
            return classesResource.getInputStream();
        } catch (IOException e) {
            log.error("Resource failed to open. Name: " +classesResource.getFilename());
        }
        return null;
    }

    InputStream getChampions(){
        try {
            return championsResource.getInputStream();
        } catch (IOException e) {
            log.error("Resource failed to open. Name: " +championsResource.getFilename());
        }
        return null;
    }

    InputStream getItems(){
        try {
            return itemsResource.getInputStream();
        } catch (IOException e) {
            log.error("Resource failed to open. Name: " +itemsResource.getFilename());
        }
        return null;
    }
}
