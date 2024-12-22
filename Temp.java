import java.util.function.Function;
public class Temp {
    public static void main(String[] args) {
    if (args.length != 1){
     System.out.println("You must insert one value");
     return ;}
     
      double centigradeTemp =Double.parseDouble(args[0]);
      
	TemperatureConverter object = new TemperatureConverter();
	 double fahrenheitTemp=object.apply(centigradeTemp);
        System.out.println(centigradeTemp + "°C is equal to " + fahrenheitTemp + "°F");
    }
static public class TemperatureConverter implements Function<Double, Double> {	 
       @Override
        public Double apply(Double celsius) {
            return (celsius * 9 / 5) + 32;
        }
        }
};
