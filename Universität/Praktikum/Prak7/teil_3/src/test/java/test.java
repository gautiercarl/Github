import static org.assertj.core.api.Assertions.*;

import com.htw.CelsiusToFahrenheitStrategy;
import com.htw.FahrenheitToCelsiusStrategy;
import com.htw.KilometerToMileStrategy;
import com.htw.MileToKilometerStrategy;

public class test {
    public static void main(String[] args) {
      float value= 20.0f;

      // CelsiusToFahrenheitStrategy
      CelsiusToFahrenheitStrategy celsiusToFahrenheit= new CelsiusToFahrenheitStrategy();
      float result= celsiusToFahrenheit.convert(value);
       assertThat(result).isEqualTo(68.0f, offset(0.1f));

       //FahrenheitToCelsiusStrategy
       FahrenheitToCelsiusStrategy fahrenheitToCelsius= new FahrenheitToCelsiusStrategy();
       result=fahrenheitToCelsius.convert(value);
       assertThat(result).isEqualTo(-6.67f,offset(0.01f));

       //KilometerToMileStrategy
       KilometerToMileStrategy kilometerToMile= new KilometerToMileStrategy();
       result= kilometerToMile.convert(value);
       assertThat(result).isEqualTo(20000.0f,offset(0.1f));

       //MileToKilometerStrategy
      MileToKilometerStrategy mileToKilometer= new MileToKilometerStrategy();
      result=mileToKilometer.convert(value);
      assertThat(result).isEqualTo(0.02f,offset(0.01f));


        System.out.println("Alle Assertions erfolgreich!");

    }



}
