package mz.co.backendchallenge2ibi.models;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Data
@NoArgsConstructor
@AllArgsConstructor
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

}
