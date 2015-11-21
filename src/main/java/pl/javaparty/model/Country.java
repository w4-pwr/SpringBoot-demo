package pl.javaparty.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by evelan on 11/21/15.
 */
@Entity
public class Country {

    @GeneratedValue
    @Id
    @Getter
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private Long population;

}
