class TemperatureConverter:
    value = 0

    def __init__(self):
        self.value = 0

    def toCelcius(self):
        return (self.value - 32) * 5/9

    def toFahrenheit(self):
        return self.value * 9/5 + 32;

tc = TemperatureConverter(32)
println tc.toFahrenheit()
