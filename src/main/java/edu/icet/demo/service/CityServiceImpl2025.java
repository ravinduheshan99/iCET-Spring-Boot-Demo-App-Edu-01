package edu.icet.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Service //use to auto object creation
public class CityServiceImpl2025 implements CityService {

    public Map<String, String> getCityByPostalCode(String postalCode) {
        HashMap<String, String> cityList = new HashMap<>();
        cityList.put("10400", "Moratuwa");
        cityList.put("20000", "Angoda");
        cityList.put("3002", "Kalutara");
        cityList.put("20400", "Kandy");

        String city = cityList.get(postalCode);

        /*if (StringUtils.hasText(city)){
            return Collections.singletonMap("city",city);
        }
        return Collections.singletonMap("city","No City Available");*/

        return Collections.singletonMap("city", (StringUtils.hasText(city) ? city : "No City Available"));

        //return cityList.get(postalCode);
    }
}
