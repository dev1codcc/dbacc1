package com.dbacc.controller;

import com.dbacc.service.impl.SampleServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbacc.domain.*;

import java.io.IOException;
import java.util.List;

@RestController
public class DbAcc1 {
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    /**
     * test for sample
     * @param name
     * @return
     */
    @GetMapping("/sample")
    public String sample(@RequestParam(value = "name", defaultValue = "sample") String name) {
        return String.format("Hello %s!", name);
    }

    /**
     * Get the data list
     * @Author Lu
     * @return
     */
    @GetMapping("/list")
    public List<SaData> list(){
        SampleServiceImpl saImpl = new SampleServiceImpl();
        try {
            return saImpl.getSaDataList();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}