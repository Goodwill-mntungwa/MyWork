/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countstrings;

/**
 *
 * @author 201733323
 */

public class CountStrings {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String text = "My name is, Goodwill' Zwelethu Nkosi";
        int count = 0;
        for(int i = 0; i < text.length()-1; i++)
        {
            if(text.charAt(i) == ' ' || text.charAt(i) ==',' && text.charAt(i+1) != ' ')
                count++;
        }
        System.out.println("There are "+(count+1)+" words in string.");  
    
    }
    
}
