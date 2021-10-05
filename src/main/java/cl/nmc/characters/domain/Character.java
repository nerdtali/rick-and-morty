package cl.nmc.characters.domain;

import cl.nmc.characters.domain.common.Extra;
import lombok.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Character implements Serializable {
    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private Extra origin;
    private Extra location;
    private String image;
    private String[] episode;
    private String url;
    private Date created;
}
