package cl.nmc.characters.controllers;

import cl.nmc.characters.Data;
import cl.nmc.characters.services.CharactersService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.server.ResponseStatusException;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(CharactersController.class)
class CharactersControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private CharactersService charactersService;

    @Test
    void getCharacterAndLocationTest() throws Exception {
        Mockito.when(charactersService.getCharacterAndLocation("1")).thenReturn(Data.RESPONSE);
        mvc.perform(get("/api/nmc/rick-and-morty/v1/character/1/location").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.name").value("Rick Sanchez"))
                .andExpect(jsonPath("$.status").value("Alive"));
    }

    @Test
    void notFoundCharacterTest() throws Exception {
        Mockito.when(charactersService.getCharacterAndLocation("1")).thenThrow(new ResponseStatusException(HttpStatus.NOT_FOUND));
        mvc.perform(get("/api/nmc/rick-and-morty/v1/character/1/location").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNotFound());
    }
}