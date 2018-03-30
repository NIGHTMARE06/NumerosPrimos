package matematicas;

import javax.swing.JOptionPane;

/**
 *
 * @author n1ght_m4re
 */
public class NumerosPrimos {
    public static void main(String[] args) {
        final int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos numeros primos deseas?"));
        primos(n);
    }
    
    private static void primos(final int n) {
        int divisores = 0;
        final int dPrimo = 2;
        int nPrimo = 1;
        
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    divisores++;
                }
            }
            
            if(divisores == dPrimo) {
                System.out.println(nPrimo + " - " + i);
                nPrimo++;
            }
            
            divisores = 0;
        }
    }
}
