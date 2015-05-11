/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author yolo
 */
public class Circulo extends Elipse {
    
    private double raio;
    public Circulo(double x) {
        super(x, x);
        raio=x;
    }
    @Override
    public double getPerimetro()
    {
        return (2*Math.PI*raio);
    }
}
