package com.example.demo.service;

import org.springframework.stereotype.Service;

import lombok.extern.java.Log;

@Service
@Log
public class DemoService {
    public void execute() throws Exception {
        log.info("### execute() called.");
    }
}
