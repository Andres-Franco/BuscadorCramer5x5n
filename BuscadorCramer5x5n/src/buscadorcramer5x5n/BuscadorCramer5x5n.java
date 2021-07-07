/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscadorcramer5x5n;

import static java.lang.Math.abs;

/**
 *
 * @author Andres
 */
public class BuscadorCramer5x5n {
    
    

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {

        double 
                a11 = 1000, a12 , a21 , a13, a31, a22=0, 
                a23 , a32, a33=0, 
                a14, a15, a24, a25, a34, a35, a41, a42,
                a43, a44=0, a45, a51, a52, a53, a54, a55=0,
                
                b1 = 1, b2 = 2, b3 = 3, b4=4, b5=5, //Vector b
                
                l=0,p, 
                xn1, yn1, zn1,Xn1,Yn1,
                x=0, y=0, z=0 ,x4=0, x5=0;
        
        double c1 , c2 , c3 ,c4, c5;               //Vector c
                
        
        double a , b , c , d , e , f , g , h , i , 
               A, B, D, E,G, H, I ,J , K , L , 
               M , N , O , P , Q , R ;            //Matriz T
        
        double  r , s , t ,T,S,                  //Convergencia a 0
                detA, detx1,detx2,detx3,detx4,detx5,
                Cx_1,Cx_2,Cx_3,Cx_4,Cx_5,        //Cramer
                e1,e2,e3, e4, e5;               //Error Relativo
        int sig1;
        
        double matriz[][] =  new double[5][5];
        double matrizx1[][] =  new double[5][5];
        double matrizx2[][] =  new double[5][5];
        double matrizx3[][] =  new double[5][5];
        double matrizx4[][] =  new double[5][5];
        double matrizx5[][] =  new double[5][5];
        
    while(true){    
      
 while(true){ 
     
      
        //a11=Math.random();
        //a11= Math.round(a11 * 1000) / 1000.0;
        
        
        a12=Math.random();
        a12= Math.round(a12 * 1000) / 1000.0;
        
        
        a13=Math.random();
        a13= Math.round(a13 * 1000) / 1000.0;
        
        
        a14=Math.random();
        a14= Math.round(a14 * 1000) / 1000.0;
       
        
        a15=Math.random();
        a15= Math.round(a15 * 1000) / 1000.0;
        
        
        a21=Math.random();
        a21= Math.round(a21 * 1000) / 1000.0;
       
        
        a22=Math.random();
        a22= Math.round(a22 * 1000) / 1000.0;
       
        
        a23=Math.random();
        a23= Math.round(a23 * 1000) / 1000.0;
        
        
        a24=Math.random();
        a24= Math.round(a24 * 1000) / 1000.0;
        
        
        a25=Math.random();
        a25= Math.round(a25 * 1000) / 1000.0;
        
        
        a31=Math.random();
        a31= Math.round(a31 * 1000) / 1000.0;
        
        
        a32=Math.random();
        a32= Math.round(a32 * 1000) / 1000.0;
        
        
        a33=Math.random();
        a33= Math.round(a33 * 1000) / 1000.0;
       
        
        a34=Math.random();
        a34= Math.round(a34 * 1000) / 1000.0;
        
        
        a35=Math.random();
        a35= Math.round(a35 * 1000) / 1000.0;
        
        
        a41=Math.random();
        a41= Math.round(a41 * 1000) / 1000.0;
        
        
        a42=Math.random();
        a42= Math.round(a42 * 1000) / 1000.0;
        
        
        a43=Math.random();
        a43= Math.round(a43 * 1000) / 1000.0;
        
        
        a44=Math.random();
        a44= Math.round(a44 * 1000) / 1000.0;
        
        
        a45=Math.random();
        a45= Math.round(a45 * 1000) / 1000.0;
       
        
        a51=Math.random();
        a51= Math.round(a51 * 1000) / 1000.0;
        
        
        a52=Math.random();
        a52= Math.round(a52 * 1000) / 1000.0;
        
        
        a53=Math.random();
        a53= Math.round(a53 * 1000) / 1000.0;
       
        
        a54=Math.random();
        a54= Math.round(a54 * 1000) / 1000.0;
      
        
        a55=Math.random();
        a55= Math.round(a55 * 1000) / 1000.0;

     
//Criterio de convergencia 

a = 1- (
        Math.pow(( ( ( a21*a12 / (a11+1) ) + (1-a22) ) ),2)+
        Math.pow(( ( ( a31*a13 / (a11+1) ) + (1-a33) ) ),2)+
        Math.pow(( ( ( a41*a14 / (a11+1) ) + (1-a44) ) ),2)+
        Math.pow(( ( ( a51*a15 / (a11+1) ) + (1-a55) ) ),2) 
        );
a = Math.round(a * 1000000000) / 1000000000.0;

b = Math.pow(( ( ( a21*a13 / (a11+1) ) - a23 ) ),2)+
        Math.pow(( ( ( a21*a14 / (a11+1) ) - a24 ) ),2)+
        Math.pow(( ( ( a21*a15 / (a11+1) ) - a25 ) ),2)+
        Math.pow(( ( ( a31*a12 / (a11+1) ) - a32 ) ),2)+
        Math.pow(( ( ( a31*a14 / (a11+1) ) - a34 ) ),2)+
        Math.pow(( ( ( a31*a15 / (a11+1) ) - a35 ) ),2)+
        Math.pow(( ( ( a41*a12 / (a11+1) ) - a42 ) ),2)+
        Math.pow(( ( ( a41*a13 / (a11+1) ) - a43 ) ),2)+
        Math.pow(( ( ( a41*a15 / (a11+1) ) - a45 ) ),2)+
        Math.pow(( ( ( a51*a12 / (a11+1) ) - a52 ) ),2)+
        Math.pow(( ( ( a51*a13 / (a11+1) ) - a53 ) ),2)+
        Math.pow(( ( ( a51*a14 / (a11+1) ) - a54 ) ),2);
b = Math.round(b * 1000000000) / 1000000000.0;

c= 1+ Math.pow(a12,2)+ Math.pow(a13,2)+ Math.pow(a14,2)+Math.pow(a15,2)+
      Math.pow(a21,2)+Math.pow(a31,2)+Math.pow(a41,2)+Math.pow(a51,2);
c = Math.round(c * 1000000000) / 1000000000.0;

d= (a-b)/c;
d = Math.round(d * 1000000000) / 1000000000.0;

/*System.out.print("a= "+a+" "+"b"+b+" "+"c"+c+"\n");
System.out.print("a-b "+(a-b)+"\n");
System.out.print("d= "+d+"\n");
*/
 if((1/Math.pow((a11+1),2))<d){
           break;
      }
    }
 
p=0;
l++;
System.out.print("Ejemplo " + l + "\n" + "MATRIZ A " + "\n" + 
        "a11= " + a11 + "   " + "a12=" + a12 + "   " + "a13= " + a13 +"   " + "a14= " + a14 +"   " + "a15= " + a15 + "\n" 
       + "a21= " + a21 + "   " + "a22= " + a22 +"   " + "a23= " + a23 +"   " + "a24= " + a24 +"   " + "a25= " + a25 + "\n" 
       + "a31= " + a31 + "   " + "a32= " + a32 + "   " + "a33= " + a33 +"   " + "a34= " + a34 +"   " + "a35= " + a35 + "\n"
       + "a41= " + a41 + "   " + "a42= " + a42 + "   " + "a43= " + a43 +"   " + "a44= " + a44 +"   " + "a45= " + a45 + "\n"
       + "a51= " + a51 + "   " + "a52= " + a52 + "   " + "a53= " + a53 +"   " + "a54= " + a54 +"   " + "a55= " + a55 + "\n");



System.out.print("\n\n"+"VECTOR b: " + "\n" + "b1= " + b1 + "\n"+
        "b2= " + b2 + "\n" + "b3= " + b3 +"\n"+ "b4= " + b4 + "\n"+
        "b5= " + b5 + "\n\n");



//Método Cramer

        matriz[0][0]= a11;
        
        matriz[0][1]= a12;
        
        matriz[0][2]= a13;
        
        matriz[0][3]= a14;
        
        matriz[0][4]= a15;
        
        matriz[1][0]= a21;
        
        matriz[1][1]= a22;
        
        matriz[1][2]= a23;
        
        matriz[1][3]= a24;
        
        matriz[1][4]= a25;
        
        matriz[2][0]= a31;
        
        matriz[2][1]= a32;
        
        matriz[2][2]= a33;
        
        matriz[2][3]= a34;
        
        matriz[2][4]= a35;
        
        matriz[3][0]= a41;
        
        matriz[3][1]= a42;
        
        matriz[3][2]= a43;
        
        matriz[3][3]= a44;
        
        matriz[3][4]= a45;
        
        matriz[4][0]= a51;
        
        matriz[4][1]= a52;
        
        matriz[4][2]= a53;
        
        matriz[4][3]= a54;
        
        matriz[4][4]= a55;
        

detA = determinante.determinanteMatriz(matriz,5);
detA = Math.round(detA * 1000000000) / 1000000000.0;

System.out.print("det(A): "+detA+ "\n\n");

        matrizx1[0][0]= b1;
        
        matrizx1[0][1]= a12;
        
        matrizx1[0][2]= a13;
        
        matrizx1[0][3]= a14;
        
        matrizx1[0][4]= a15;
        
        matrizx1[1][0]= b2;
        
        matrizx1[1][1]= a22;
        
        matrizx1[1][2]= a23;
        
        matrizx1[1][3]= a24;
        
        matrizx1[1][4]= a25;
        
        matrizx1[2][0]= b3;
        
        matrizx1[2][1]= a32;
        
        matrizx1[2][2]= a33;
        
        matrizx1[2][3]= a34;
        
        matrizx1[2][4]= a35;
        
        matrizx1[3][0]= b4;
        
        matrizx1[3][1]= a42;
        
        matrizx1[3][2]= a43;
        
        matrizx1[3][3]= a44;
        
        matrizx1[3][4]= a45;
        
        matrizx1[4][0]= b5;
        
        matrizx1[4][1]= a52;
        
        matrizx1[4][2]= a53;
        
        matrizx1[4][3]= a54;
        
        matrizx1[4][4]= a55;

detx1 = determinante.determinanteMatriz(matrizx1,5);
detx1 = Math.round(detx1 * 1000000000) / 1000000000.0;
        matrizx2[0][0]= a11;
        
        matrizx2[0][1]= b1;
        
        matrizx2[0][2]= a13;
        
        matrizx2[0][3]= a14;
        
        matrizx2[0][4]= a15;
        
        matrizx2[1][0]= a21;
        
        matrizx2[1][1]= b2;
        
        matrizx2[1][2]= a23;
        
        matrizx2[1][3]= a24;
        
        matrizx2[1][4]= a25;
        
        matrizx2[2][0]= a31;
        
        matrizx2[2][1]= b3;
        
        matrizx2[2][2]= a33;
        
        matrizx2[2][3]= a34;
        
        matrizx2[2][4]= a35;
        
        matrizx2[3][0]= a41;
        
        matrizx2[3][1]= b4;
        
        matrizx2[3][2]= a43;
        
        matrizx2[3][3]= a44;
        
        matrizx2[3][4]= a45;
        
        matrizx2[4][0]= a51;
        
        matrizx2[4][1]= b5;
        
        matrizx2[4][2]= a53;
        
        matrizx2[4][3]= a54;
        
        matrizx2[4][4]= a55;

detx2= determinante.determinanteMatriz(matrizx2,5);
detx2 = Math.round(detx2 * 1000000000) / 1000000000.0;
        matrizx3[0][0]= a11;
        
        matrizx3[0][1]= a12;
        
        matrizx3[0][2]= b1;
        
        matrizx3[0][3]= a14;
        
        matrizx3[0][4]= a15;
        
        matrizx3[1][0]= a21;
        
        matrizx3[1][1]= a22;
        
        matrizx3[1][2]= b2;
        
        matrizx3[1][3]= a24;
        
        matrizx3[1][4]= a25;
        
        matrizx3[2][0]= a31;
        
        matrizx3[2][1]= a32;
        
        matrizx3[2][2]= b3;
        
        matrizx3[2][3]= a34;
        
        matrizx3[2][4]= a35;
        
        matrizx3[3][0]= a41;
        
        matrizx3[3][1]= a42;
        
        matrizx3[3][2]= b4;
        
        matrizx3[3][3]= a44;
        
        matrizx3[3][4]= a45;
        
        matrizx3[4][0]= a51;
        
        matrizx3[4][1]= a52;
        
        matrizx3[4][2]= b5;
        
        matrizx3[4][3]= a54;
        
        matrizx3[4][4]= a55;

detx3= determinante.determinanteMatriz(matrizx3,5);
detx3 = Math.round(detx3 * 1000000000) / 1000000000.0;
        matrizx4[0][0]= a11;
        
        matrizx4[0][1]= a12;
        
        matrizx4[0][2]= a13;
        
        matrizx4[0][3]= b1;
        
        matrizx4[0][4]= a15;
        
        matrizx4[1][0]= a21;
        
        matrizx4[1][1]= a22;
        
        matrizx4[1][2]= a23;
        
        matrizx4[1][3]= b2;
        
        matrizx4[1][4]= a25;
        
        matrizx4[2][0]= a31;
        
        matrizx4[2][1]= a32;
        
        matrizx4[2][2]= a33;
        
        matrizx4[2][3]= b3;
        
        matrizx4[2][4]= a35;
        
        matrizx4[3][0]= a41;
        
        matrizx4[3][1]= a42;
        
        matrizx4[3][2]= a43;
        
        matrizx4[3][3]= b4;
        
        matrizx4[3][4]= a45;
        
        matrizx4[4][0]= a51;
        
        matrizx4[4][1]= a52;
        
        matrizx4[4][2]= a53;
        
        matrizx4[4][3]= b5;
        
        matrizx4[4][4]= a55;

detx4= determinante.determinanteMatriz(matrizx4,5);
detx4 = Math.round(detx4 * 1000000000) / 1000000000.0;
        matrizx5[0][0]= a11;
        
        matrizx5[0][1]= a12;
        
        matrizx5[0][2]= a13;
        
        matrizx5[0][3]= a14;
        
        matrizx5[0][4]= b1;
        
        matrizx5[1][0]= a21;
        
        matrizx5[1][1]= a22;
        
        matrizx5[1][2]= a23;
        
        matrizx5[1][3]= a24;
        
        matrizx5[1][4]= b2;
        
        matrizx5[2][0]= a31;
        
        matrizx5[2][1]= a32;
        
        matrizx5[2][2]= a33;
        
        matrizx5[2][3]= a34;
        
        matrizx5[2][4]= b3;
        
        matrizx5[3][0]= a41;
        
        matrizx5[3][1]= a42;
        
        matrizx5[3][2]= a43;
        
        matrizx5[3][3]= a44;
        
        matrizx5[3][4]= b4;
        
        matrizx5[4][0]= a51;
        
        matrizx5[4][1]= a52;
        
        matrizx5[4][2]= a53;
        
        matrizx5[4][3]= a54;
        
        matrizx5[4][4]= b5;

detx5=determinante.determinanteMatriz(matrizx5,5);
detx5 = Math.round(detx5 * 1000000000) / 1000000000.0;

Cx_1= detx1/detA;
Cx_1 = Math.round(Cx_1 * 1000000000) / 1000000000.0;

Cx_2= detx2/detA;
Cx_2 = Math.round(Cx_2 * 1000000000) / 1000000000.0;

Cx_3= detx3/detA;
Cx_3 = Math.round(Cx_3 * 1000000000) / 1000000000.0;

Cx_4= detx4/detA;
Cx_4 = Math.round(Cx_4 * 1000000000) / 1000000000.0;

Cx_5= detx5/detA;
Cx_5 = Math.round(Cx_5 * 1000000000) / 1000000000.0;




//Método Franco
//Matriz T
a = 1 / (a11 + 1);
a = Math.round(a * 1000000000) / 1000000000.0;
b = -a12 / (a11 + 1);
b = Math.round(b * 1000000000) / 1000000000.0;
c = -a13 / (a11 + 1);
c = Math.round(c * 1000000000) / 1000000000.0;
    
A = -a14 / (a11 + 1);
A = Math.round(A * 1000000000) / 1000000000.0;
B = -a15 / (a11 + 1);
B = Math.round(B * 1000000000) / 1000000000.0;

d = -a21 / (a11 + 1);
d = Math.round(d * 1000000000) / 1000000000.0;
e = (a21 * a12 / (a11 + 1)) + (1 - a22);
e = Math.round(e * 1000000000) / 1000000000.0;
f = (a21 * a13 / (a11 + 1)) - a23;
f = Math.round(f * 1000000000) / 1000000000.0;
D =(a21 * a14 / (a11 + 1)) - a24;
D = Math.round(D * 1000000000) / 1000000000.0;
E =(a21 * a15 / (a11 + 1)) - a25;
E = Math.round(E * 1000000000) / 1000000000.0;

g = -a31 / (a11 + 1);
g = Math.round(g * 1000000000) / 1000000000.0;
h = (a31 * a12 / (a11 + 1)) - a32;
h = Math.round(h * 1000000000) / 1000000000.0;
i = (a31 * a13 / (a11 + 1)) + (1 - a33);
i = Math.round(i * 1000000000) / 1000000000.0;
G = (a31 * a14 / (a11 + 1)) - a34;
G = Math.round(G * 1000000000) / 1000000000.0;
H = (a31 * a15 / (a11 + 1)) - a35;
H = Math.round(H * 1000000000) / 1000000000.0;

I = -a41 / (a11 + 1);
I = Math.round(I * 1000000000) / 1000000000.0;
J = (a41 * a12 / (a11 + 1)) - a42;
J = Math.round(J * 1000000000) / 1000000000.0;
K = (a41 * a13 / (a11 + 1)) - a43;
K = Math.round(K * 1000000000) / 1000000000.0;
L = (a41 * a14 / (a11 + 1)) + (1-a44);
L = Math.round(L * 1000000000) / 1000000000.0;
M = (a41 * a15 / (a11 + 1)) - a45;
M = Math.round(M * 1000000000) / 1000000000.0;

N = -a51 / (a11 + 1);
N = Math.round(N * 1000000000) / 1000000000.0;
O = (a51 * a12 / (a11 + 1)) - a52;
O = Math.round(O * 1000000000) / 1000000000.0;
P = (a51 * a13 / (a11 + 1)) - a53;
P = Math.round(P * 1000000000) / 1000000000.0;
Q = (a51 * a14 / (a11 + 1)) - a54;
Q = Math.round(Q * 1000000000) / 1000000000.0;
R = (a51 * a15 / (a11 + 1)) + (1-a55);
R = Math.round(R * 1000000000) / 1000000000.0;

System.out.print("Inicio del Método: \n\n");
System.out.print("MATRIZ T = (^1P+I)^-1(I-(^2P+^3^P)) " + "\n\n" 
       +"a= " + a + "  " + "b= " + b + "  " + "c= " + c +"A= " + A + "  " + "B= " + B + "\n" 
       +"d= " + d + "  " + "e= " + e + "  " + "f= " + f +"D= " + D + "  " + "E= " + E + "\n"
       +"g= " + g + "  " + "h= " + h + "  " + "i= " + i +"G= " + G + "  " + "H= " + H + "\n"
       +"I= " + I + "  " + "J= " + J + "  " + "K= " + K +"L= " + L + "  " + "M= " + M + "\n" 
       +"N= " + N + "  " + "O= " + O + "  " + "P= " + P +"L= " + Q + "  " + "R= " + R + "\n\n");
//Vector c = (^1P+I)^-1 b

c1 = b1 / (a11 + 1);
c1 = Math.round(c1 * 1000000000) / 1000000000.0;
c2 = (-b1 * a21 / (a11 + 1)) + b2;
c2 = Math.round(c2 * 1000000000) / 1000000000.0;
c3 = (-b1 * a31 / (a11 + 1)) + b3;
c3 = Math.round(c3 * 1000000000) / 1000000000.0;
c4 = (-b1 * a41 / (a11 + 1)) + b4;
c4 = Math.round(c4 * 1000000000) / 1000000000.0;
c5 = (-b1 * a51 / (a11 + 1)) + b5;
c5 = Math.round(c5 * 1000000000) / 1000000000.0;

System.out.print("VECTOR c = (^1P+I)^-1 b " + "\n\n" + "c1= " + 
        c1 + "\n" + "c2= " + c2 + "\n" + "c3= " + c3 
        + "\n" + "c4= " + c4 + "\n" + "c5= " + c5 +"\n\n");
while (true) {
p++;
xn1 = a * x + b * y + c * z + A * x4 + B * x5 + c1;
r = abs(x - xn1);
r = Math.round(r * 1000000000) / 1000000000.0;

yn1 = d * x + e * y + f * z + D * x4 + E * x5 + c2;
s = abs(y - yn1);
s = Math.round(s * 1000000000) / 1000000000.0;

zn1 = g * x + h * y + i * z + G * x4 + H * x5 + c3;
t = abs(z - zn1);
t = Math.round(t * 1000000000) / 1000000000.0;

Xn1 = I * x + J * y + K * z + L * x4 + M * x5 + c4;
T = abs(x4 - Xn1);
T = Math.round(T * 1000000000) / 1000000000.0;

Yn1 = N * x + O * y + P * z + Q * x4 + R * x5 + c5;
S = abs(x5 - Yn1);
S = Math.round(S * 1000000000) / 1000000000.0;

x = xn1;
xn1 = Math.round(xn1 * 1000000000) / 1000000000.0;

y = yn1;
yn1 = Math.round(yn1 * 1000000000) / 1000000000.0;

z = zn1;
zn1 = Math.round(zn1 * 1000000000) / 1000000000.0;

x4 = Xn1;
Xn1 = Math.round(Xn1 * 1000000000) / 1000000000.0;

x5 = Yn1;
Yn1 = Math.round(Yn1 * 1000000000) / 1000000000.0;

System.out.print("Iteración Número:" + p +"    | "+
        " x_1 = "+xn1+" "+" x_2 = "+yn1+" "+" x_3 = "+zn1+" x_4 = "+Xn1+" x_5 = "+Yn1+"\n");
System.out.print("Orden de Convergencia:  | "+
        " x_1 = "+r+" "+" x_2 = "+s+" "+" x_3 = "+t+" "+" x_4 = "+T+" "+" x_5 = "+S+"\n\n\n");

if ((r == 0) && (s == 0) && (t == 0)&& (S == 0) && (T == 0)) {
break;
                                                    }

                                                }

System.out.print("Cantidad de Iteraciones " + p + "\n\n" + "SOLUCIÓN FRANCO: " +
"\n"+"x_1 = "+xn1+" "+"x_2 = "+yn1+" "+"x_3 = "+zn1+" "+"x_4= "+Xn1+" "+"x_5= "+Yn1+ "\n\n");
System.out.print("SOLUCIÓN CRAMER: "+"\n"+"x_1= "+Cx_1+" x_2= "+Cx_2+
        " x_3= "+Cx_3+" x_4= "+Cx_4+" x_5= "+Cx_5+"\n\n");

//Calculo Error
e1=abs((Cx_1-xn1)/Cx_1)*100;
e2=abs((Cx_2-yn1)/Cx_2)*100;
e3=abs((Cx_3-zn1)/Cx_3)*100;
e4=abs((Cx_4-Xn1)/Cx_4)*100;
e5=abs((Cx_5-Yn1)/Cx_5)*100;
System.out.print("Error relativo respecto a Cramer en porcentaje: "+" Ex1: " 
        +e1+" Ex2: "+e2+" Ex3: "+e3+" Ex4: "+e4+" Ex5: "+e5+"\n\n\n\n" );
                                            }
                                        }
                                   }
    
//}
