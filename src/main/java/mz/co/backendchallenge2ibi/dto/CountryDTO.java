package mz.co.backendchallenge2ibi.dto;

import mz.co.backendchallenge2ibi.models.Country;


/**
 * @author Dário Silvano Maxaieie
 *This is a class that is used to implement DTO on Country
 */
public class CountryDTO {

    private String name;
    private String capital;
    private String region;
    private String subregion;
    private double area;


    public Country transformToCountry(){

        return new Country(name, capital, region, subregion, area);
    }

}
