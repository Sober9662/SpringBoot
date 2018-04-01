package com.springboot.chapter211.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class General {
    @Value("${com.general.name}")
    private String name;

    @Value("${com.general.title}")
    private String title;


    @Value("${com.general.random.string}")
    private String string1;

    @Value("${com.general.random.int}")
    private String int1;

    @Value("${com.general.random.long}")
    private String long1;

    @Value("${com.general.random.int10}")
    private String int10;

    @Value("${com.general.random.int10_20}")
    private String int10_20;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getString1() {
        return string1;
    }

    public void setString1(String string1) {
        this.string1 = string1;
    }

    public String getInt1() {
        return int1;
    }

    public void setInt1(String int1) {
        this.int1 = int1;
    }

    public String getLong1() {
        return long1;
    }

    public void setLong1(String long1) {
        this.long1 = long1;
    }

    public String getInt10() {
        return int10;
    }

    public void setInt10(String int10) {
        this.int10 = int10;
    }

    public String getInt10_20() {
        return int10_20;
    }

    public void setInt10_20(String int10_20) {
        this.int10_20 = int10_20;
    }
}
