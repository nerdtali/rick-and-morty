package cl.nmc.characters.models;

import cl.nmc.characters.models.common.Extra;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
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
