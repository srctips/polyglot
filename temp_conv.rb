# Class

class TemperatureConverter
  def initialize(temp)
    @value = temp
  end

  def toCelcius
    return (self.value - 32) * 5/9
  end

  def toFahrenheit
    return self.value * 9/5 + 32;
  end

tc = TemperatureConverter.new(212)
print tc.toCelcius
