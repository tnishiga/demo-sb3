package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DemoService;

import lombok.extern.java.Log;

@RestController
@RequestMapping("/api")
@Log
public class DemoController {
    @Autowired
    DemoService service;

    @GetMapping(path = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> test() throws Exception {
        log.info("### test() called.");
        service.execute();
        return ResponseEntity.ok("{\"test\":\"AAAA\"}");
    }
}
