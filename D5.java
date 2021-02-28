/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d5;

/**
 *
 * @author Tanui
 */
public class D5 {

    /**
     * @param args the command line arguments
     */
    
    public static boolean getXO (String str) {
     boolean result = true;
        long count1 = str.chars().filter(ch -> ch == 'x').count();
        
        long count2 = str.chars().filter(ch -> ch == 'o').count();
   if (count1 == count2)
   {result = true;}
   else 
   { result = false ;}
    return result ;
    }
    public static void main(String[] args) {
        // TODO code application logic here
System.out.println(D5.getXO("ooxa"));


}
    
}
