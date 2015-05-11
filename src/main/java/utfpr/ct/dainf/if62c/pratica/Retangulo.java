package utfpr.ct.dainf.if62c.pratica;

/**
 * IF62C Fundamentos de Programação 2
 * Exemplo de interface em Java.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Retangulo  implements FiguraComLados {
    private double ladoMenor;
    private double ladoMaior;
    public Retangulo (double ladoMaior,double ladoMenor) {
        this.ladoMenor=ladoMenor;
        this.ladoMaior=ladoMaior;
    }
    public double getArea(){
        return ladoMenor*ladoMaior;
    }
    public double getPerimetro(){
        return 2*(ladoMenor+ladoMaior);
    }
    @Override
    public double getLadoMenor() {
        return ladoMenor;
    }

    @Override
    public double getLadoMaior() {
        return ladoMaior;
    }

    @Override
    public String getNome() {
        return super.toString() + " [" + ladoMenor + " x " + ladoMaior + "]";
    }
    
}
