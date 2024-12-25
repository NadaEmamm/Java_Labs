import java.util.concurrent.atomic.AtomicReference;
import java.util.Map;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;




public class Exercise1 {

   public static void main(String[] args) {
   
		InMemoryWorldDao worldDao=	InMemoryWorldDao.getInstance();
		
		Map<String, Country> allCountries=worldDao.getCountries();
		
    for (String code : allCountries.keySet()) {
   AtomicReference<Integer> Population = new AtomicReference<>(0);
   AtomicReference<String> cityName = new AtomicReference<>("");

        Country country = allCountries.get(code);
        List<City> cities = country.getCities();
       cities.stream()
            .filter(city -> city.getCountryCode().equals(code)) 
            .forEach(city -> { 
            if (city.getPopulation()>Population.get()) {
          Population.set(city.getPopulation());
          cityName.set(city.getName());
            }
            });
            if (Population.get()!=0 ){
         System.out.println("Country: " + country.getName() + " has a highest population city of: " + Population.get() +"and the city name is :" + cityName.get() );}
         else
          System.out.println("Country: " + country.getName() + " has no city ");
    }
}  

}
