package com.mdv.vaidyasETP.controller;

import com.mdv.vaidyasETP.entities.TouristPlace;
import com.mdv.vaidyasETP.repository.TouristPlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
public class TouristPlaceController {
    @Autowired
    TouristPlaceRepository touristPlaceRepo;

    @GetMapping("/places/{touristPlace}")
    public TouristPlace getTouristPlace(@PathVariable("touristPlace") String touristPlaceName){
        TouristPlace touristPlace = touristPlaceRepo.findByPlacename(touristPlaceName);
        return touristPlace;
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/private/places")
    public TouristPlace addTouristPlace(@RequestBody TouristPlace touristPlace){
        //first check if this place already exist in db.
        TouristPlace touristPlaceCheck =  touristPlaceRepo.findByPlacename(touristPlace.getPlacename());
        if(touristPlaceCheck==null){
            touristPlaceRepo.save(touristPlace);
        } //if it exists then update description
        else{
            touristPlaceCheck.setDescription(touristPlace.getDescription());
            touristPlaceRepo.save(touristPlaceCheck);
        }
        return touristPlaceCheck;
    }


    @DeleteMapping("/private/places/{touristPlace}")
    public String deleteTouristPlace(@PathVariable("touristPlace") String touristPlace){
        TouristPlace touristPlaceCheck =  touristPlaceRepo.findByPlacename(touristPlace);
        if(touristPlaceCheck!=null){
            touristPlaceRepo.deleteById(touristPlaceCheck.getId());
            return "This Tourist Place is Deleted";
        }else{
            return "This Tourist Place does not exists in DB";
        }
    }

    //handle error
    @GetMapping("/*")
    public String errorGet(){
        return "this page does not exists";
    }
    @PostMapping("/*")
    public String errorPost(){
        return "this page does not exists";
    }
    @DeleteMapping("/*")
    public String errorDelete(){
        return "this page does not exists";
    }
    @PutMapping("/*")
    public String errorPut(){
        return "this page does not exists";
    }
}
