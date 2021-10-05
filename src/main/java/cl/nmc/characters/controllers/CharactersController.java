package cl.nmc.characters.controllers;


import cl.nmc.characters.response.CharacterLocationResponse;
import cl.nmc.characters.services.ICharactersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/nmc/rick-and-morty")
public class CharactersController {

    @Autowired
    private ICharactersService characterService;

    public CharactersController(ICharactersService charactersService){
        this.characterService = charactersService;
    }

    @GetMapping("/v1/character/{id}/location")
    public ResponseEntity<CharacterLocationResponse> getCharacterAndLocation(@PathVariable(name = "id") int id){

        return new ResponseEntity<CharacterLocationResponse>(characterService.getCharacterAndLocation(String.valueOf(id)),HttpStatus.OK);
    }
}
