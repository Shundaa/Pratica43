package utfpr.ct.dainf.if62c.pratica;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de interface em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Quadrado extends Retangulo {
    public double lado;
    public Quadrado(double lado) {
        super(lado,lado);
        this.lado=lado;
    }
    
    @Override
    public double getArea() {
        return lado*lado;
    }

    @Override
    public double getPerimetro() {
        return lado * 4;
    }


    

}
