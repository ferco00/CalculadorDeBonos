
package com.mycompany.calculadordebonos;

/**
 *
 * @author Luis Fernando
 */
public class CalculadordeBonos {
int salario;
String mensajeDeBono;
public void Calculo(){
    salario=50000;
    mensajeDeBono= "Bono=$"+(.02*salario);
    System.out.println(mensajeDeBono);
}

    public static void main(String[] args) {
        CalculadordeBonos Calcular = new CalculadordeBonos();
        Calcular.Calculo();
    }
}
