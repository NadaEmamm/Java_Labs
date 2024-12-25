import java.util.concurrent.atomic.AtomicReference;
import java.util.Map;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercise5 {

   public static void main(String[] args) {
   
        InMemoryWorldDao worldDao = InMemoryWorldDao.getInstance();  
        Map<String, Country> allCountries = worldDao.getCountries();

        for (String code : allCountries.keySet()) {
            Country countryNameByCode = allCountries.get(code);
            List<City> cities = countryNameByCode.getCities();
            Optional<City> capitalCity = cities.stream()
                .filter(city -> city.getId() == countryNameByCode.getCapital())  
                .findFirst();
            capitalCity.ifPresent(city -> System.out.println("Country: " + countryNameByCode.getName() + " its capital is " + city.getName()));
        }
    }
}

