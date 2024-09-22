package com.mdv.vaidyasETP.repository;

import com.mdv.vaidyasETP.entities.TouristPlace;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TouristPlaceRepository extends CrudRepository<TouristPlace,Integer> {
    public TouristPlace findByPlacename(String placename);
}
