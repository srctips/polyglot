use 'strict'

function toCelcius(fdegrees) {
  return (fdegrees - 32) * 5/9;
}

function toFahrenheit(cdegrees) {
  return cdegrees * 9/5 + 32;
}

var freezing = toFahrenheit(0);
var boiling = toCelcius(212);
