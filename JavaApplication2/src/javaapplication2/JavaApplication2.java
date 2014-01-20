/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;

/**
 *
 * @author Hani
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=calc(2, 3);
        System.out.println(x);
    }
    public static int calc(int a,int b)
    {
        int sum= a+b;
        return sum;
        
    }
    
}
