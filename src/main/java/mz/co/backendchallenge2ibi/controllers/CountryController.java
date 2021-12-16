package mz.co.backendchallenge2ibi.controllers;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import mz.co.backendchallenge2ibi.dto.CountryDTO;
import mz.co.backendchallenge2ibi.models.Country;
import mz.co.backendchallenge2ibi.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author Dário Silvano Maxaieie
 * This is the rest controller (Country) of the API with the endpoints of the operations
 */
@RestController
@RequestMapping("/api/countries")
@Api(value = "Countries REST API")
@CrossOrigin(origins = "*")
public class CountryController {


    @Autowired
    CountryService countryService;

    @GetMapping("/list")
    @Operation(summary = "Returns all the countries")
    public List<Country> listAllCountries() {

        return countryService.getCountries();
    }

    @GetMapping("/list/id/asc")
    @Operation(summary = "Returns all the countries by ID ascending order")
    public List<Country> listAllCountriesOrderByIdAsc() {

        return countryService.findAllOrderByIdAsc();
    }


    @GetMapping("/list/id/desc")
    @Operation(summary = "Returns all the countries order by ID descending order")
    public List<Country> listAllCountriesOrderByIdDesc() {

        return countryService.findAllOrderByIdDesc();
    }


    @GetMapping("/list/name/asc")
    @Operation(summary = "Returns all the countries by Name ascending order")
    public List<Country> listAllCountriesOrderByNameAsc() {

        return countryService.findAllOrderByNameAsc();
    }


    @GetMapping("/list/name/desc")
    @Operation(summary = "Returns all the countries by Name descending order")
    public List<Country> listAllCountriesOrderByNameDesc() {

        return countryService.findAllOrderByNameDesc();
    }

    @GetMapping("/list/capital/asc")
    @Operation(summary = "Returns all the countries by Capital ascending order")
    public List<Country> listAllCountriesOrderByCapitalAsc() {

        return countryService.findAllOrderByCapitalAsc();
    }


    @GetMapping("/list/capital/desc")
    @Operation(summary = "Returns all the countries order by Capital descending order")
    public List<Country> listAllCountriesOrderByCapitalDesc() {

        return countryService.findAllOrderByCapitalDesc();
    }

    @GetMapping("/list/region/asc")
    @Operation(summary = "Returns all the countries by Region ascending order")
    public List<Country> listAllCountriesOrderByRegionAsc() {

        return countryService.findAllOrderByRegionAsc();
    }


    @GetMapping("/list/region/desc")
    @Operation(summary = "Returns all the countries order by Region descending order")
    public List<Country> listAllCountriesOrderByRegionDesc() {

        return countryService.findAllOrderByRegionDesc();
    }

    @GetMapping("/list/subregion/asc")
    @Operation(summary = "Returns all the countries by Subregion ascending order")
    public List<Country> listAllCountriesOrderBySubregionAsc() {

        return countryService.findAllOrderBySubregionAsc();
    }


    @GetMapping("/list/subregion/desc")
    @Operation(summary = "Returns all the countries order by Subregion descending order")
    public List<Country> listAllCountriesOrderBySubregionDesc() {

        return countryService.findAllOrderBySubregionDesc();
    }

    @GetMapping("/list/area/asc")
    @Operation(summary = "Returns all the countries by Area ascending order")
    public List<Country> listAllCountriesOrderByAreaAsc() {

        return countryService.findAllOrderByAreaAsc();
    }


    @GetMapping("/list/area/desc")
    @Operation(summary = "Returns all the countries order by Area descending order")
    public List<Country> listAllCountriesOrderByAreaDesc() {

        return countryService.findAllOrderByAreaDesc();
    }


    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "Saves a country")
    public Country save(@RequestBody CountryDTO countryDTO) {

        return countryService.addCountry(countryDTO.transformToCountry());
    }


    @GetMapping("/{id}")
    @Operation(summary = "Get a country by the ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the Country",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = Country.class))}),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Country not found",
                    content = @Content)})
    public Country getCountry(@PathVariable(value = "id") long id) {

        return countryService.getCountry(id);

    }


    @DeleteMapping("/delete")
    @Operation(summary = "Deletes a country")
    public boolean deleteCountry(@RequestBody Country country) {

        return countryService.deleteCountry(country);

    }


    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Updates a country")
    public Country updateCountry(@RequestBody Country country) {

        return countryService.updateCountry(country);

    }


}
