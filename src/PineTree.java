public class PineTree {

    // test
    public static void main(String[] args) {
        int treeHeight = 8; // Adjust the height of the tree as needed

        // Print the tree
        printTree(treeHeight);
    }

    // Method to print the pine tree
    public static void printTree(int height) {
        // Loop for each level of the tree
        for (int i = 0; i < height; i++) {
            // Print spaces for each level
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }

            // Print asterisks for the tree
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }

            // Move to the next line after printing each level
            System.out.println();
        }

        // Print the tree trunk
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < height - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}
