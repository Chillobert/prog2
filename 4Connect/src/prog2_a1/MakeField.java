/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog2_a1;

/**
 *
 * @author tim
 */
public class MakeField {
    public MakeField(){};
    	
        public void print(char[][] field){
        for (int row = 0; row < 7; ++row) {
        System.out.print("| ");
        for (int col = 0; col < 7; ++col)
            System.out.print(field[row][col] + "| ");
        System.out.println();
        }
 
        // Print bottom line
        for (int col = 0; col < 6; ++col)
            System.out.print("====");
        System.out.println();
    }
}
