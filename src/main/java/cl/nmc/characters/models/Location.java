package cl.nmc.characters.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@ToString
public class Location implements Serializable {
    private int id;
    private String name;
    private String type;
    private String dimension;
    private String[] residents;
    private String url;
    private Date create;
}
