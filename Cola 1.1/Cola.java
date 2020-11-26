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
public class Cola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int opt, tope = 0, tam;
       
        do{
            System.out.println("Que programa deseas usar:");
            System.out.println("1.Pilauno");
            System.out.println("2.pilados");
            System.out.println("3.Trespilas");
            System.out.println("4.Pilacuatro");
            System.out.println ("5.Salir");
            switch(opt = sc.nextInt()){
            case 1:
               Pilauno.main(args); 
            break;
            case 2:
               pilados.main(args);
            break;
           case 3:
               Trespilas.main(args);
           break;
           case 4:
              Pilacuatro.main(args);
           break;
             }

    }while(opt!= 5);
    }
 }
    
        
