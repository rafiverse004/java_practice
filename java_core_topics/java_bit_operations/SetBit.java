// Get the 3rd bit (position = 2) of a number n. (n = 0101)
// Bit Mask: 1<<i
// Operation: OR
// In bit manipulation, bit positions always start from the right (least significant bit) and are numbered 0, 1, 2….

import java.util.Scanner;

public class SetBit {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);

        int n = 5;       // Number in which we want to check the bit (0101 in binary)
        int pos = 3;     // Position of bit to check (0-based indexing from right)
        
        int bitMask = 1 << pos; // Create bit mask by shifting 1 to the position
        int newNumber = bitMask | n;

        System.out.println(newNumber);

        scanf.close();
    }
}
