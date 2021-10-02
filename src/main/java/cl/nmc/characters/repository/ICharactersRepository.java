package cl.nmc.characters.repository;

import cl.nmc.characters.models.Character;
import cl.nmc.characters.models.Location;

public interface ICharactersRepository {

    Character getSingleCharacter(String id);

    Location getCharacterLocation(String locationUrl);
}
