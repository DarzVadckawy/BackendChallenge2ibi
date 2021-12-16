package mz.co.backendchallenge2ibi.services;


import mz.co.backendchallenge2ibi.models.Country;
import mz.co.backendchallenge2ibi.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

/**
 * @author Dário Silvano Maxaieie
 *This is the service class of the API
 */

@Service
public class CountryService {


    @Autowired
    CountryRepository repository;


    Logger logger = Logger.getLogger(getClass().getName());


    public List<Country> getCountries() {

        return repository.findAll();

    }


    public Country addCountry(Country country) {

        return repository.save(country);
    }

    public Country getCountry(long id) {


        if(repository.findByid(id) == null){


        }

        return repository.findByid(id);

    }


    public boolean exists(Country country) {

        return repository.findByid(country.getId()) != null;
    }

    public boolean deleteCountry(Country country) {

        if (exists(country)) {

            repository.delete(country);

            return !exists(country);

        } else {

            logger.info("The country does not exist in the database");

            return true;
        }

    }

    public Country updateCountry(Country country) {

        return repository.save(country);
    }


    public List<Country> findAllOrderByIdAsc() {

        return repository.findAllByOrderByIdAsc();

    }

    public List<Country> findAllOrderByIdDesc() {
        return repository.findAllByOrderByIdDesc();
    }


    public List<Country> findAllOrderByNameAsc() {

        return repository.findAllByOrderByNameAsc();
    }

    public List<Country> findAllOrderByNameDesc() {

        return repository.findAllByOrderByNameDesc();

    }


    public List<Country> findAllOrderByCapitalAsc() {

        return repository.findAllByOrderByCapitalAsc();

    }


    public List<Country> findAllOrderByCapitalDesc() {

        return repository.findAllByOrderByCapitalDesc();

    }

    public List<Country> findAllOrderByRegionAsc() {

        return repository.findAllByOrderByRegionAsc();

    }

    public List<Country> findAllOrderByRegionDesc() {

        return repository.findAllByOrderByRegionDesc();

    }

    public List<Country> findAllOrderBySubregionAsc() {

        return repository.findAllByOrderBySubregionAsc();

    }

    public List<Country> findAllOrderBySubregionDesc() {

        return repository.findAllByOrderBySubregionDesc();

    }

    public List<Country> findAllOrderByAreaAsc() {

        return repository.findAllByOrderByAreaAsc();

    }

    public List<Country> findAllOrderByAreaDesc() {

        return repository.findAllByOrderByAreaDesc();

    }


}
