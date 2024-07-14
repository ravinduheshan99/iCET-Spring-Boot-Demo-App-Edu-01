package edu.icet.demo.controller;

import edu.icet.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController //When network request sent from browser it only checks the classes with this annotation
@CrossOrigin
public class CityController {

@Autowired //use to auto object creation
    CityService service;

    @GetMapping("/city/{postalCode}") //use to decide the executable method, according to network request
    public Map<String, String> getCity(@PathVariable("postalCode") String postalCode){
        //HashMap response = new HashMap<>();
        //response.put("city",service.getCityByPostalCode(postalCode));
        //return response;
        return service.getCityByPostalCode(postalCode);
    }
}
