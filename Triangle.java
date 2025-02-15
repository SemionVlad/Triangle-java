import java.util.Scanner;
/**
 * The Triangle class identifies and classifies triangles based on three input integers.
 * This class takes three integers representing potential side lengths of a triangle
 * and determines whether they can form a valid triangle. If valid, it further
 * classifies the triangle as equilateral, isosceles, right-angled, or common.
 * 
 * Classification Rules:
 * 1. Triangle Validity:
 *    - The sum of any two sides must be greater than the third side
 *    - All sides must be positive integers
 * 
 * 2. Triangle Types:
 *    - Equilateral: All three sides are equal
 *    - Isosceles: Exactly two sides are equal
 *    - Right-angled: Satisfies the Pythagorean theorem (a² + b² = c²)
 *    - Common: Valid triangle that doesn't fit any special category
 * 
 * Note: The class processes triangle types in the following priority order:
 * 1. Invalid triangle check
 * 2. Equilateral triangle check
 * 3. Right-angle triangle check
 * 4. Isosceles triangle check
 * 5. Common triangle (if none of the above)
 * 
 * @version 2023B
 * @author - Shimon Esterkin (SemionVlad)
 */

public class Triangle {
    /**
     * The main method handles the program execution, including input processing,
     * triangle validation, and type classification.
     * 
     * Algorithm Steps:
     * 1. Read three integers from standard input
     * 2. Validate triangle inequality theorem
     * 3. Check for special triangle types in priority order
     * 4. Output appropriate classification message
     * 
     * Input Handling:
     * - Uses java.util.Scanner for input
     * - Assumes valid integer inputs (no input validation)
     * - Reads three integers in sequence
     * 
     * Output Messages:
     * - Triangle invalidity message
     * - Equilateral triangle classification
     * - Right-angle triangle classification
     * - Isosceles triangle classification
     * - Common triangle classification
     * 
     * Mathematical Validations:
     * - Triangle Inequality: a + b > c for all combinations
     * - Pythagorean Theorem: a² + b² = c² for right triangles
     * - Side Equality Comparisons for classification
     * 
     * Resource Management:
     * - Properly closes Scanner object after use
     * 
     * @param args Command line arguments (not used in this implementation)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int x, y, z;
        
        // Read three integers
        
        System.out.println("Please insert three numbers\n");
        x = scanner.nextInt();
        y = scanner.nextInt();
        z = scanner.nextInt();
        
        // First check if these numbers can form a triangle
        // Triangle inequality theorem: sum of any two sides must be greater than the third side
        if (x + y <= z || x + z <= y || y + z <= x) {
            System.out.println("The numbers: " + x + ", " + y + " and " + z + " cannot represent a triangle");
        }
        
        // Check for equilateral triangle (all sides equal)
        if (x == y && y == z) {
            System.out.println("The numbers: " + x + ", " + y + " and " + z + " represent an equilateral triangle");
        }
        
        // Check for right triangle using Pythagorean theorem
        // Need to check all three possible combinations
        if (x*x + y*y == z*z || x*x + z*z == y*y || y*y + z*z == x*x) {
            System.out.println("The numbers: " + x + ", " + y + " and " + z + " represent a right-angle triangle");
        }
        
        // Check for isosceles triangle (exactly two sides equal)
        if (x == y || y == z || x == z) {
            System.out.println("The numbers: " + x + ", " + y + " and " + z + " represent an isosceles triangle");
        }
        
        // If we reach here, it must be a common triangle
        System.out.println("The numbers: " + x + ", " + y + " and " + z + " represent a common triangle");
        
        scanner.close();
    }
}