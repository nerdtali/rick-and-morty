package cl.nmc.characters.services;

import cl.nmc.characters.response.CharacterLocationResponse;

public interface ICharactersService {

    CharacterLocationResponse getCharacterAndLocation(String id);
}
