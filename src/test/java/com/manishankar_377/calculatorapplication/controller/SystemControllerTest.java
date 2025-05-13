package com.manishankar_377.calculatorapplication.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

@WebMvcTest(SystemController.class)
public class SystemControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testHealthCheck() throws Exception {
        mockMvc.perform(get("/system/health"))
                .andExpect(status().isOk())
                .andExpect(content().string("System is up and running!"));
    }

    @Test
    public void testSystemVersion() throws Exception {
        mockMvc.perform(get("/system/version"))
                .andExpect(status().isOk())
                .andExpect(content().string("version 1.0.0"));
    }

}
