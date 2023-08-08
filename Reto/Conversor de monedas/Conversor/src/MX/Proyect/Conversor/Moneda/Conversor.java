package MX.Proyect.Conversor.Moneda;

import javax.swing.*;

public class Conversor {

    public static void PesoMexicano(){
        double pesoMX;
        double dolar = 0.059;
        double rublo = 5.48;
        double won = 76.37;
        int conversor = 0;
        double cv;

        conversor = Integer.parseInt(JOptionPane.showInputDialog(null, "  Ingresa una opcion \n 1 = Peso a Dolar \n 2 = Peso a Rublo \n 3 = Peso a Won \""));
        switch(conversor){
            case 1 :
                pesoMX = Integer.parseInt(JOptionPane.showInputDialog(null," Ingresa la cantidad"));
                cv = pesoMX * dolar;
                JOptionPane.showMessageDialog(null, " Resultado " + cv);
                break;
            case 2 :
                pesoMX = Integer.parseInt(JOptionPane.showInputDialog(null," Ingresa la cantidad"));
                cv = pesoMX * rublo;
                JOptionPane.showMessageDialog(null, " Resultado " + cv);
                break;
            case 3 :
                pesoMX = Integer.parseInt(JOptionPane.showInputDialog(null," Ingresa la cantidad"));
                cv = pesoMX * won;
                JOptionPane.showMessageDialog(null, " Resultado " + cv);
                break;
        }

    }

    public static void Dolar(){
        double dolar;
        double pesoMX = 16.87;
        double rublo = 92.41;
        double won = 1288.94;
        int conversor = 0;
        double cv;

        conversor = Integer.parseInt(JOptionPane.showInputDialog(null, "  Ingresa una opcion \n 1 = Dolar a Peso \n 2 = Dolar a Rublo \n 3 = Dolar a Won \""));
        switch(conversor){
            case 1 :
                dolar = Integer.parseInt(JOptionPane.showInputDialog(null," Ingresa la cantidad"));
                cv = dolar * pesoMX;
                JOptionPane.showMessageDialog(null, " Resultado " + cv);
                break;
            case 2 :
                dolar = Integer.parseInt(JOptionPane.showInputDialog(null," Ingresa la cantidad"));
                cv = dolar * rublo;
                JOptionPane.showMessageDialog(null, " Resultado " + cv);
                break;
            case 3 :
                dolar = Integer.parseInt(JOptionPane.showInputDialog(null," Ingresa la cantidad"));
                cv = dolar * won;
                JOptionPane.showMessageDialog(null, " Resultado " + cv);
                break;
        }

    }
    public static void Rublo(){
        double rublo;
        double dolar = 0.011;
        double pesoMX = 0.18;
        double won = 13.96;
        int conversor = 0;
        double cv;

        conversor = Integer.parseInt(JOptionPane.showInputDialog(null, "  Ingresa una opcion \n 1 = Rublo a Peso \n 2 = Rublo a Dolar \n 3 = Rublo a Won \""));
        switch(conversor){
            case 1 :
                rublo = Integer.parseInt(JOptionPane.showInputDialog(null," Ingresa la cantidad"));
                cv = rublo * pesoMX;
                JOptionPane.showMessageDialog(null, " Resultado " + cv);
                break;
            case 2 :
                rublo = Integer.parseInt(JOptionPane.showInputDialog(null," Ingresa la cantidad"));
                cv = rublo * dolar;
                JOptionPane.showMessageDialog(null, " Resultado " + cv);
                break;
            case 3 :
                rublo = Integer.parseInt(JOptionPane.showInputDialog(null," Ingresa la cantidad"));
                cv = rublo * won;
                JOptionPane.showMessageDialog(null, " Resultado " + cv);
                break;
        }

    }
    public static void Won(){
        double won;
        double rublo = 0.072;
        double dolar = 0.00077;
        double pesoMX = 0.013;

        int conversor = 0;
        double cv;

        conversor = Integer.parseInt(JOptionPane.showInputDialog(null, "  Ingresa una opcion \n 1 = won a Peso \n 2 = Won a Dolar \n 3 = Won a Rublo \""));
        switch(conversor){
            case 1 :
                won = Integer.parseInt(JOptionPane.showInputDialog(null," Ingresa la cantidad"));
                cv = won * pesoMX;
                JOptionPane.showMessageDialog(null, " Resultado " + cv);
                break;
            case 2 :
                won = Integer.parseInt(JOptionPane.showInputDialog(null," Ingresa la cantidad"));
                cv = won * dolar;
                JOptionPane.showMessageDialog(null, " Resultado " + cv);
                break;
            case 3 :
                won = Integer.parseInt(JOptionPane.showInputDialog(null," Ingresa la cantidad"));
                cv = won * rublo;
                JOptionPane.showMessageDialog(null, " Resultado " + cv);
                break;
        }

    }

    public static void main(String[] args) {
       JOptionPane.showMessageDialog(null, " Hola Bienvenido Al Conversor");
       double Entrada = Integer.parseInt(JOptionPane.showInputDialog(null," Ingresa Tu Moneda Local \n 1= Peso \n 2 = Dolar \n 3 = Rublo \n 4 = Won"));
        if (Entrada == 1) {
            PesoMexicano();
        }if (Entrada == 2) {
            Dolar();
        }if (Entrada == 3) {
            Rublo();
        }if (Entrada == 4) {
            Won();
        }else{
            System.out.println(" Ya no hay mas opciones");
        }
    }


}
