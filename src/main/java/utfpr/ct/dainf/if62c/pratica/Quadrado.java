package utfpr.ct.dainf.if62c.pratica;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de interface em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Quadrado implements FiguraComLados {
    private double lado;
    public Quadrado (double lado) {
        this.lado=lado;
    }
    @Override
    public double getArea(){
        return lado*lado;
    }
    @Override
    public double getPerimetro(){
        return 4*lado;
    }
    @Override
    public double getLadoMenor() {
        return lado;
    }

    @Override
    public double getLadoMaior() {
        return lado;
    }

    @Override
    public String getNome() {
        return super.toString() + " [" + lado + " x " + lado + "]";
    }
    
}
