package Java;

// Problem Pattern:
// 12
// 23
// 34
// 45
// 56
// 67
// 78
// 89
// 910

public class hw3_16_Aug {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(i + j);
            }
            System.out.println();
        }
    }
}
