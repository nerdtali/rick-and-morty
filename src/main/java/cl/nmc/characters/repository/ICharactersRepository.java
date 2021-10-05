package cl.nmc.characters.repository;

import cl.nmc.characters.domain.Character;
import cl.nmc.characters.domain.Location;

public interface ICharactersRepository {

    Character getSingleCharacter(String id);

    Location getCharacterLocation(String locationUrl);
}
