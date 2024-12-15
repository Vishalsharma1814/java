package _10_Miscellaneous;

public class TowerOfHanoi {
    // Recursive function to solve Tower of Hanoi
    public static void solveHanoi(int n, char source, char target, char auxiliary) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + target);
            return;
        }
        // Move n-1 disks from source to auxiliary
        solveHanoi(n - 1, source, auxiliary, target);
        // Move the nth disk from source to target
        System.out.println("Move disk " + n + " from " + source + " to " + target);
        // Move n-1 disks from auxiliary to target
        solveHanoi(n - 1, auxiliary, target, source);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        solveHanoi(n, 'A', 'C', 'B'); // A: Source, C: Target, B: Auxiliary
    }
}
