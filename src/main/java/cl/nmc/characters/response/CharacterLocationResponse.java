package cl.nmc.characters.response;

import cl.nmc.characters.domain.common.Extra;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CharacterLocationResponse {
    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    @JsonProperty("episode_count")
    private int episodeCount;
    private Extra origin;
}
