package com.mdv.vaidyasETP;

import com.mdv.vaidyasETP.entities.TouristPlace;
import com.mdv.vaidyasETP.repository.TouristPlaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Optional;

@SpringBootApplication
@ComponentScan
public class PuneDarshanApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(PuneDarshanApplication.class, args);

		/*

		TouristPlaceRepository touristPlaceRepo = context.getBean(TouristPlaceRepository.class);

		//create
		TouristPlace touristPlace = new TouristPlace();
		touristPlace.setPlacename("Pune");
		touristPlace.setDescription("Shaniwar Wada");
		touristPlaceRepo.save(touristPlace);
		int id = touristPlace.getId();

		touristPlace = new TouristPlace();
		touristPlace.setPlacename("Delhi");
		touristPlace.setDescription("Lal Killa");
		touristPlaceRepo.save(touristPlace);

		//read
		Optional<TouristPlace> touristPlaceRetrived = touristPlaceRepo.findById(id);
		if(touristPlaceRetrived.isPresent()){
			touristPlace =   touristPlaceRetrived.get();
			System.out.println(touristPlace.getPlacename());
			System.out.println(touristPlace.getDescription());
		}

		//update
		touristPlaceRetrived = touristPlaceRepo.findById(id);
		if(touristPlaceRetrived.isPresent()){
			touristPlace =   touristPlaceRetrived.get();
			touristPlace.setPlacename("Lal Mahal");
			touristPlace.setDescription("Lal Mahal");
			touristPlaceRepo.save(touristPlace);
		}

		//delete
		touristPlaceRetrived = touristPlaceRepo.findById(id);
		if(touristPlaceRetrived.isPresent()){
			touristPlaceRepo.deleteById(id);
		}
		touristPlaceRetrived = touristPlaceRepo.findById(id);
		if(!touristPlaceRetrived.isPresent()){
			System.out.println("Record got deleted");
		}

		 */
	}

	/*
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*").allowedMethods("*");
			}
		};
	}
	*/

}
