// Get the 3rd bit (position = 2) of a number n. (n = 0101)
// Bit Mask: 1<<i
// Operation: AND with bitMask's NOT

import java.util.Scanner;

public class ClearBit {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        int n = 5;       // Number in which we want to check the bit (0101 in binary)
        int pos = 2;     // Position of bit to check (0-based indexing from right)
        
        int bitMask = 1 << pos; // Create bit mask by shifting 1 to the position
        int notBitMask = ~(bitMask);
        int newNumber = notBitMask & n;

        System.out.println(newNumber);

        scanf.close();
    }
}