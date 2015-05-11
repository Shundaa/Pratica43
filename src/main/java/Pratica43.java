
import utfpr.ct.dainf.if62c.pratica.Quadrado;
import utfpr.ct.dainf.if62c.pratica.Retangulo;
import utfpr.ct.dainf.if62c.pratica.TrianguloEquilatero;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Pratica43 {
    public static void main(String[] args) {
        Quadrado maroto =new Quadrado (5);
        Retangulo maroto2 =new Retangulo (7,3);
        TrianguloEquilatero maroto3 =new TrianguloEquilatero (3);
        
        System.out.println(maroto.getArea());
        System.out.println(maroto.getPerimetro());
        System.out.println(maroto2.getArea());
        System.out.println(maroto2.getPerimetro());
        System.out.println(maroto3.getArea());
        System.out.println(maroto3.getPerimetro());
        System.out.println(maroto.getLadoMaior());
        System.out.println(maroto2.getLadoMaior());
        System.out.println(maroto3.getLadoMaior());
    }
    
}
