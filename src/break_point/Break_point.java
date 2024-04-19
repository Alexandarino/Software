/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package break_point;

/**
 *
 * @author Jamil
 */
public class Break_point {

    /**
     * @param args the command line arguments
     */
    public static int sumEvenNumbers(int limit) {
        int sum = 0;
        for (int i = 0; i <= limit; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        sumEvenNumbers (5);
    }
    
}
