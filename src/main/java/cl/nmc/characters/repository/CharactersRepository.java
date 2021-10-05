package cl.nmc.characters.repository;

import cl.nmc.characters.domain.Character;
import cl.nmc.characters.domain.Location;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

@Repository
public class CharactersRepository implements ICharactersRepository{

    @Value("${get-character-url}")
    private String GET_CHARACTER_URL;

    RestTemplate restTemplate = new RestTemplate();

    public Character getSingleCharacter(String id) {
        try{
            ResponseEntity<Character> response =  restTemplate.getForEntity(GET_CHARACTER_URL + id, Character.class);
            return response.getBody();
        }catch (HttpClientErrorException errorException) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }


    public Location getCharacterLocation(String locationUrl){
        try{
            ResponseEntity<Location> response = restTemplate.getForEntity(locationUrl, Location.class);
            return response.getBody();

        }catch (HttpClientErrorException errorException){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

    }

}
