package Métodos.conversorTemperatura;

public class ConversorTemperatura {

    private float temperatura;

    public ConversorTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float celsiusParaFahrenheit() {
        temperatura = (temperatura * 9/5) + 32;
        return  temperatura;
    }

    public float fahrenheitParaCelsius() {
        temperatura = (temperatura -32) * 5/9;
        return temperatura;
    }

}
