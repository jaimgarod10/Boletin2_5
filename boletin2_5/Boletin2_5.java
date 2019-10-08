
package boletin2_5;

import java.util.Scanner;

public class Boletin2_5 {

 
    public static void main(String[] args) {
        //Calcular sueldo
        Scanner sc = new Scanner(System.in);
        System.out.println("sueldo fijo?");
        float s_fijo = sc.nextFloat();
        System.out.println("ganado con las ventas?");
        float ventas = sc.nextFloat();
        float comision = (ventas * 5) / 100;
        System.out.println("quilómetros en el mes?");
        float km = sc.nextFloat();
        float quilometraje = km * 2;
        System.out.println("Cuantos días se ha desplazado?");
        float desplazamiento = sc.nextFloat();
        float dietas = desplazamiento * 30;
        float s_bruto = s_fijo + comision + quilometraje + dietas;
        System.out.println("sueldo bruto es " + s_bruto + "€");
        float irpf = (s_bruto * 18) / 100;
        float rss = 36f;
        float s_liquido = s_bruto - irpf - rss;
        System.out.println("sueldo líquido es " + s_liquido + "€");
    }
    
}
