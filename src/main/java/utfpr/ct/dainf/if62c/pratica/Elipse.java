/*
 * To change thiS licenSe headeR, chooSe LicenSe HeadeRS in PRoject PRopeRtieS.
 * To change thiS template file, chooSe ToolS | TemplateS
 * and open the template in the editoR.
 */
package utfpr.ct.dainf.if62c.pratica;


/**
 *
 * @authoR yolo
 */
public class Elipse implements FiguraComEixos {
    private double eixomaior;
    private double eixomenor;

    public Elipse(double x,double y) {
        if(x>y){
            this.eixomaior=x;
            this.eixomenor=y;
        }
        else{
            this.eixomaior=y;
            this.eixomenor=x;            
        }
    }

    @Override
    public double getArea(){
        return (Math.PI*eixomaior*eixomenor);
    }
    @Override
    public double getPerimetro(){
        return (Math.PI*(3*(eixomaior+eixomenor)-Math.sqrt(((3*eixomaior)+eixomenor)*((3*eixomenor)+eixomaior))));
    }
    @Override
    public double getEixoMaior(){
        return eixomaior;
    }
    @Override
    public double getEixoMenor(){
        return eixomenor;
    }

    @Override
    public String getNome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
