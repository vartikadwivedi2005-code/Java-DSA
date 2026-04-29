package lect_28;

public class num {
    public static void main(String[] args) {
        // 1. Initialize the number we want to check and a counter to track zeros
        int num = 102030;
        int count = 0;

        // 2. Edge Case: If the number is exactly 0, the loop below won't run.
        // We manually set count to 1 because '0' contains one zero.
        if (num == 0) count = 1; 

        // 3. Normalize: If the number is negative (e.g., -102), convert it to positive (102).
        // This ensures the modulo (%) and division (/) logic works correctly.
        num = (num < 0) ? -num : num; 

        // 4. The Extraction Loop:
        // This continues as long as there are digits left in 'num'
        while (num > 0) {
            
            // Step A: Use Modulo (%) to get the last digit.
            // Example: 102030 % 10 results in 0.
            if (num % 10 == 0) {
                count++; // If the last digit is 0, increment our counter
            }
            
            // Step B: Use Integer Division (/) to remove the last digit.
            // Example: 102030 / 10 becomes 10203.
            // This effectively "shifts" the number to the right.
            num /= 10;
        }

        // 5. Output the final result stored in the counter
        System.out.println(count);
    }
}