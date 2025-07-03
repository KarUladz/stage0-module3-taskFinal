package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        double fahrenheit = (temperatureCelsius * (double) 9/5) + 32;

        System.out.println(fahrenheit);
    }
}
