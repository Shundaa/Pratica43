package utfpr.ct.dainf.if62c.pratica;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de interface em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class TrianguloEquilatero extends Retangulo {
    public double lado;
    public double altura;

    public TrianguloEquilatero(double lado) {
        super(lado, lado * Math.sqrt(3) / 2);
        this.lado=lado;
        this.altura=lado * Math.sqrt(3) / 2;
    }

    @Override
    public double getArea() {
        return base*altura/ 2;
    }

    @Override
    public double getPerimetro() {
        return 3 * lado;
    }

    public double getLado() {
        return lado;
    }

    public String getNome() {
        return getNome() + " [" + lado + "]";
    }

}
