//  Get the 3rd bit (position = 2) of a number n. (n = 0101)
//  Bit Mask: 1<<i
//  Operation: for 1 to 0 we do 'Clear' for 0 to 1 we do 'Set'

import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        int n = 5;
        int pos = 2;
        int oper = scanf.nextInt(); // Taking which operation to do Set or clear
        int bitMask = 1 << pos;
        
        if(oper == 0){ // here 0 means 'Clear'
            int newbitMask = ~(bitMask);
            int newNumber = newbitMask & n;
            System.out.println(newNumber);
        } else { // here 1 means 'Set'
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }

        scanf.close();
    }
}