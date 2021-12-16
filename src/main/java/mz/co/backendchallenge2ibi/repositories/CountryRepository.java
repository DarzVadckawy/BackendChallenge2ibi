package mz.co.backendchallenge2ibi.repositories;

import mz.co.backendchallenge2ibi.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Dário Silvano Maxaieie
 * This is the repository of the Country
 */
@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {


    Country findByid(long id);

    List<Country> findAllByOrderByIdAsc();

    List<Country> findAllByOrderByIdDesc();

    List<Country> findAllByOrderByNameAsc();

    List<Country> findAllByOrderByNameDesc();

    List<Country> findAllByOrderByCapitalAsc();

    List<Country> findAllByOrderByCapitalDesc();

    List<Country> findAllByOrderByRegionAsc();

    List<Country> findAllByOrderByRegionDesc();

    List<Country> findAllByOrderBySubregionAsc();

    List<Country> findAllByOrderBySubregionDesc();

    List<Country> findAllByOrderByAreaAsc();

    List<Country> findAllByOrderByAreaDesc();

}
