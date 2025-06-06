package metodos.calculadora;

public class Calculadora {

    private float num1;
    private float num2;

    public Calculadora(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float soma() {
        return this.num1 + this.num2;
    }

    public float subtracao() {
        return this.num1 - this.num2;
    }
    public float multiplicacao() {
        return this.num1 * this.num2;
    }

    public float divisao() {
        if (this.num2 == 0) {
            System.out.println("Divisão por zero não é permitida.");
            return Float.NaN;
        }
        return this.num1 / this.num2;
    }

}
