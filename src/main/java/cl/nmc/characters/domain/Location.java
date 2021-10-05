package cl.nmc.characters.domain;

import lombok.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Location implements Serializable {
    private int id;
    private String name;
    private String type;
    private String dimension;
    private String[] residents;
    private String url;
    private Date create;
}
