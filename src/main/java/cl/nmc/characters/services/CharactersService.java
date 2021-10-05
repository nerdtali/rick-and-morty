package cl.nmc.characters.services;

import cl.nmc.characters.domain.Character;
import cl.nmc.characters.domain.Location;
import cl.nmc.characters.domain.common.Extra;
import cl.nmc.characters.repository.ICharactersRepository;
import cl.nmc.characters.response.CharacterLocationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.logging.Logger;

@Service
public class CharactersService implements ICharactersService {

    @Autowired
    private ICharactersRepository charactersRepository;

    Logger logger = Logger.getLogger(CharactersService.class.getName());

    public CharactersService(ICharactersRepository charactersRepository){
        this.charactersRepository = charactersRepository;
    }

    public CharacterLocationResponse getCharacterAndLocation(String id) {

        try{
            Character character = charactersRepository.getSingleCharacter(id);
            logger.info(character.toString());

            Location location = charactersRepository.getCharacterLocation(character.getLocation().getUrl());
            logger.info(location.toString());

            CharacterLocationResponse response = new CharacterLocationResponse();

            response.setId(character.getId());
            response.setName(character.getName());
            response.setStatus(character.getStatus());
            response.setSpecies(character.getSpecies());
            response.setType(character.getType());
            response.setEpisodeCount(character.getEpisode().length);

            Extra origin = new Extra();
            origin.setName(location.getName());
            origin.setUrl(location.getUrl());
            origin.setDimensions(location.getDimension());
            origin.setResidents(location.getResidents());

            response.setOrigin(origin);
            logger.info(response.toString());
            return response;

        }catch(Exception e){
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
