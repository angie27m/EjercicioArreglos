/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectormatriz;

import java.util.Scanner;

/**
 *
 * @author Pavilion 15
 */
public class VectorMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,c;
         
        System.out.println("           Menu");
        System.out.println(" Va crear vector o matriz?");
        System.out.println("1.Vector ");
        System.out.println("2.Matriz ");
        System.out.print(": ");
        Scanner opc = new Scanner(System.in);
        a= opc.nextInt();
        switch(a){
            case 1:
                Vector p =new Vector();
                p.vector();
                
            break;
            case 2:
                Matriz m=new Matriz();
                m.matriz();
            break;
        }
    }
    
}
