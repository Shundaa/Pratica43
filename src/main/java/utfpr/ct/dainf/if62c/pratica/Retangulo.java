package utfpr.ct.dainf.if62c.pratica;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de interface em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Retangulo implements FiguraComLados {
    public double base;
    public double altura;

    public Retangulo(double base, double altura) {
        this.base=base;
        this.altura=altura;
    }

    @Override
    public double getArea() {
        return base*altura;
    }

    @Override
    public double getPerimetro() {
        return (base*altura) * 2;
    }

    @Override
    public double getLadoMenor() {
        if(base>altura)
            return base;
        else
            return altura;
    }

    @Override
    public double getLadoMaior() {
        if(base>altura)
            return altura;
        else
            return base;
    }

    @Override
    public String getNome() {
        return getNome() + " [" + base+ "]";
    }
}
