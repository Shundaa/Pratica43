package utfpr.ct.dainf.if62c.pratica;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de interface em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class TrianguloEquilatero implements FiguraComLados {
    
    private double lado;
    public TrianguloEquilatero (double lado) {
        this.lado=lado;
    }
    @Override
    public double getArea(){
        return ((lado*lado*Math.sqrt(3))/4);
    }
    @Override
    public double getPerimetro(){
        return lado*3;
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
