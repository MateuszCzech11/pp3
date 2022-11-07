public class TemperatureConvertor{
    
    public static double celciusToKelvin(double degrees){
        return 273.15 + degrees;
    }
    
    public static double celciusToFahrenheit(double degrees){
        return degrees * 1.8 +32;
    }
    
    public static void main(String[] args){
        System.out.println(celciusToKelvin(-273.15));
        System.out.println(celciusToFahrenheit(36.6));
        
    }
}