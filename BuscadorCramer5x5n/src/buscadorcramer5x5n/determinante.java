/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscadorcramer5x5n;

/**
 *
 * @author Andres
 */
public class determinante {
    
         static void obtenerCofactor(double matriz[][], double temp[][], int p, int q, int n) {
           
           int i=0,j=0;
           for(int fila = 0; fila < n; fila++){
               for (int columna =0 ; columna < n; columna++){
                   if(fila != p && columna != q){
                   temp[i][j++]= matriz[fila][columna];
                    if(j== n-1){
                        j=0;
                        i++;
                    }
                   }
               }
           }
   
} //Termina Cofactor
       
       static double determinanteMatriz(double matriz[][], int n){
       
           double Determinante = 0;
           
           if(n==1){
         return matriz[0][0];
          } 
          double temp[][]= new double[n][n];
          int multiplicador = 1;
            for(int f = 0 ; f < n ; f++){
                obtenerCofactor(matriz, temp, 0, f, n);
                Determinante += multiplicador * matriz[0][f] * determinanteMatriz(temp, n-1);
                multiplicador = -multiplicador;
          }
            return Determinante;
       }// Termina Determinante
}
