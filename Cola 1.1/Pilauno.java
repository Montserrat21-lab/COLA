/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cola;

import java.util.Scanner;

/**
 *
 * @author sale7
 */
class Pilauno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt, tope = 0, tam;
        System.out.println("ingresa el tamaño de la pila");
 
        int[] pila = new int[ tam =  sc.nextInt()];
        do{
            System.out.println("\n1 - agregar\n"
                    + "2 - mostrar\n"
                    + "3 - eliminar\n"
                    + "5 - salir\n");
            switch(opt = sc.nextInt()){
                case 1:
                    if(tope < tam){
                    System.out.println("ingresa un valor");
                    pila[tope]=sc.nextInt();
                    tope++;
                    }else{System.out.println("pila llena..");}
                break;
                case 2:
                    if(tope > 0){
                    for(int i= tope-1 ; i >=0  ; i--){
                        System.out.print(" "+pila[i]);
                    }}else{System.out.println("pila vacia...");}
                break;
                case 3:
                    if(tope > 0){
                    System.out.println("dato eliminado...");
                    tope--;
                    }else{System.out.println("pila vacia...");}
                break;
            }
        }while(opt != 5 );
       
    }

}


