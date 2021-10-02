package cl.nmc.characters.response;

import cl.nmc.characters.models.common.Extra;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CharacterLocationResponse {
    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private int episode_count;
    private Extra origin;
}
