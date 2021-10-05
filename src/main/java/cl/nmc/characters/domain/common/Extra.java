package cl.nmc.characters.domain.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@NoArgsConstructor
public class Extra implements Serializable {
    private String name;
    private String url;
    private String dimensions;
    private String[] residents;
}
