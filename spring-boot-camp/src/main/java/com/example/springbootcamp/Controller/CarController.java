/**
 * 
 */
package com.example.springbootcamp.Controller;

import java.util.HashMap;
import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.springbootcamp.model.Car;
import javax.validation.Valid;

/**
 * @author kkk88
 *
 */
@RestController
public class CarController {
	
    private final static Logger LOGGER = Logger.getLogger(CarController.class.getName());
    private static HashMap<Long, Car> g_data = new HashMap<>();
    private static Long g_counter = 0L;

    @PostMapping("/car")
    public Long create( @RequestBody @Valid Car car ) {
    	car.setCarId(g_counter);
    	g_counter++;
    	g_data.put(car.getCarId(), car);
    	
    	LOGGER.info( "POST-/car Id " + car.getCarId() + " created " + car );
		
    	return car.getCarId();
    }

    @GetMapping("/car/{carId}")
    public Car read( @PathVariable Long carId ) {
    	Car car = null;
    	ensureExistence(carId);
    	car = g_data.get(carId);
    	
    	LOGGER.info( "GET-/car/"+carId + " returns " + car );
    	
    	return car;
    }
    
    @PutMapping("/car/{carId}")
    public void update(@PathVariable Long carId, @RequestBody Car car) {
    	 ensureExistence(carId);
    	 car.setCarId(carId);
    	 
    	 LOGGER.info( "PUT-/car/ "+carId + " updates " + g_data.get(carId) + " to " + car );
    	 
    	 g_data.put(car.getCarId(), car);
    }
    
    @DeleteMapping("/car/{carId}")
    public void delete( @PathVariable Long carId) {
   	 	ensureExistence(carId);

   	 	LOGGER.info( "DELETE-/car/ "+carId + " deletes " + g_data.get(carId) );
   	 	
   	 	g_data.remove(carId);
    }

    /**
     * 
     * @param carId
     * 
     */
    private void ensureExistence( Long carId ) {
        if( ! g_data.containsKey( carId ) ){
            throw new ResponseStatusException( HttpStatus.NOT_FOUND, "car with id " + carId + " wasn't found" );
        }
    }
    
}
