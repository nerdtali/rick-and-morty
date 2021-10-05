package cl.nmc.characters;

import cl.nmc.characters.domain.Character;
import cl.nmc.characters.domain.Location;
import cl.nmc.characters.domain.common.Extra;
import cl.nmc.characters.response.CharacterLocationResponse;

public class Data {

    public final static String CHARACTER_ID = "1";

    public final static String[] EPISODES = {
            "https://rickandmortyapi.com/api/episode/1",
            "https://rickandmortyapi.com/api/episode/2",
            "https://rickandmortyapi.com/api/episode/3",
            "https://rickandmortyapi.com/api/episode/4",
            "https://rickandmortyapi.com/api/episode/5",
            "https://rickandmortyapi.com/api/episode/6",
            "https://rickandmortyapi.com/api/episode/7",
            "https://rickandmortyapi.com/api/episode/8",
            "https://rickandmortyapi.com/api/episode/9",
            "https://rickandmortyapi.com/api/episode/10"
    };

    public static final Character CHARACTER = new Character(
            1,
            "Rick Sanchez",
            "Alive",
            "Human",
            "",
            "Male",
            new Extra("Earth (C-137)",
                    "https://rickandmortyapi.com/api/location/1",
                    null,
                    null),
            new Extra("Earth (Replacement Dimension)",
                    "https://rickandmortyapi.com/api/location/20",
                    null,
                    null),
            "https://rickandmortyapi.com/api/character/avatar/1.jpeg",
            EPISODES,
            "https://rickandmortyapi.com/api/character/1",
            null


    );

    public static final String[] RESIDENTS = {

            "https://rickandmortyapi.com/api/character/1",
            "https://rickandmortyapi.com/api/character/2",
            "https://rickandmortyapi.com/api/character/3",
            "https://rickandmortyapi.com/api/character/4",
            "https://rickandmortyapi.com/api/character/5",
            "https://rickandmortyapi.com/api/character/9",
            "https://rickandmortyapi.com/api/character/11"
    };

    public static final Location LOCATION = new Location(
            20,
            "Earth (Replacement Dimension)",
            "Planet",
            "Replacement Dimension",
            RESIDENTS,
            "https://rickandmortyapi.com/api/location/20",
            null

    );

    public static final Extra EXTRA = new Extra(LOCATION.getName(),
            LOCATION.getUrl(),
            LOCATION.getDimension(),
            LOCATION.getResidents());

    public static final CharacterLocationResponse RESPONSE = new CharacterLocationResponse(
            CHARACTER.getId(),
            CHARACTER.getName(),
            CHARACTER.getStatus(),
            CHARACTER.getSpecies(),
            CHARACTER.getType(),
            CHARACTER.getEpisode().length,
            EXTRA
    );
}
