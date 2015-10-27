package com.spring.controllers;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

/**
 * Created by Stanislav Markov mailto: stasmarkov88@gmail.com
 */
public class LoginControllerTest {

    @Test
    public void testHome() throws Exception {
        LoginController controller = new LoginController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/")).andExpect(view().name("homePage"));
    }
}