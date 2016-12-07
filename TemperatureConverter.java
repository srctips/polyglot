/**
 * TemperatureConverter class
 * @author Jason Taylor
 */
public class TemperatureConverter {

  // hold value to convert
  private int tempValue = 0;

  public TemperatureConverter() {
    this.tempValue = 0;
  }

  public TemperatureConverter(int value) {
    this.tempValue = value;
  }

  public void setValue(int value) {
    this.tempValue = value;
  }

  public int getValue() {
    return this.tempValue;
  }

  /**
   * convert to celcius
   * @return double Fahrenheit temperature
   */
  public double toCelcius() {
    return (this.tempValue - 32) * 5/9;
  }

  /**
   * convert to Fahrenheit
   * @return double celcius temperature
   */
  public double toFahrenheit() {
    return this.tempValue * 9/5 + 32;
  }

  public static void main(String[] args) {
    TemperatureConverter tc = new TemperatureConverter(212);
    double boiling = tc.toCelcius();
    System.out.println("Boiling water in celcius is " + boiling);
  }
}
