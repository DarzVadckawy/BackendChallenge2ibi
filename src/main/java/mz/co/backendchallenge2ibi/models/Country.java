package mz.co.backendchallenge2ibi.models;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * @author Dário Silvano Maxaieie
 * This is the country model
 */
@Getter
@Setter
@ToString
@Entity
public class Country {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @NotBlank
    @Size(max = 100)
    private String name;

    @Column(nullable = false)
    @NotBlank
    @Size(max = 100)
    private String capital;

    @Column(nullable = false)
    @NotBlank
    @Size(max = 100)
    private String region;

    @Column(nullable = false)
    @NotBlank
    @Size(max = 100)
    private String subregion;

    @Column(nullable = false)
    @NotBlank
    @Size(min = 1, max = 30000)
    private double area;

    public Country(String name, String capital, String region, String subregion, double area) {

        this.name = name;
        this.capital = capital;
        this.region = region;
        this.subregion = subregion;
        this.area = area;

    }

    public Country() {

    }


    @Override
    public String toString() {

        ObjectMapper mapper = new ObjectMapper();
        String jsonString = getClass().getSimpleName() + "\n";

        try {

            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            jsonString = mapper.writeValueAsString(this);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return jsonString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Country country = (Country) o;
        return id != null && Objects.equals(id, country.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
