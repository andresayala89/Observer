/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package histograma;

import java.util.Random;

/**
 *
 * @author f212
 */
public class Conjunto {
 int x[];
 
public Conjunto() {
    x=new int[50];
    Random r=new Random();
    for (int i = 0; i < x.length; i++) {
        x[i]=r.nextInt(100);       
    }
    ordenarBurbuja();
    
}
public int[] getX() {
    return x;
}

    private void ordenarBurbuja() {
    
                 int i, j, aux;
         for(i=0;i<x.length-1;i++)
              for(j=0;j<x.length-i-1;j++)
                   if(x[j+1]>x[j]){
                      aux=x[j+1];
                      x[j+1]=x[j];
                      x[j]=aux;
                   }
            }
}
