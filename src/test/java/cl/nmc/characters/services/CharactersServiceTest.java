package cl.nmc.characters.services;

import cl.nmc.characters.Data;
import cl.nmc.characters.repository.ICharactersRepository;
import cl.nmc.characters.response.CharacterLocationResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CharactersServiceTest {

    @Mock
    ICharactersRepository repository;

    @InjectMocks
    CharactersService service;

    @Test
    void getCharacterAndLocation(){
        Mockito.when(repository.getSingleCharacter(Data.CHARACTER_ID)).thenReturn(Data.CHARACTER);
        Mockito.when(repository.getCharacterLocation(Data.CHARACTER.getLocation().getUrl())).thenReturn(Data.LOCATION);
        CharacterLocationResponse response = service.getCharacterAndLocation(Data.CHARACTER_ID);
        assertEquals("Rick Sanchez",response.getName());
    }

//    @Test
//    void notFoundCharacterTest(){
//        Mockito.when(repository.getSingleCharacter("2")).thenThrow(ResponseStatusException.class);
//        CharacterLocationResponse response = service.getCharacterAndLocation(Data.CHARACTER_ID);
//        assertThrows(ResponseStatusException.class, () -> {
//            service.getCharacterAndLocation("2");
//        });
//    }
}