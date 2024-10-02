public class Main {
    public static void main(String[] args) {
        // Triangle part 1 of the tree
        for (int row=1; row<=3; row++) {
            for(int space=7; space>row; space--) {
                System.out.print(" ");
            }

            for (int star=1; star<=row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Triangle part 2 of the tree
        for (int row=2; row<=5; row++) {
            for(int space=7; space>=row; space--) {
                System.out.print(" ");
            }

            for (int star=2; star<=row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Triangle part 3 of the tree
        for (int row=3; row<=7; row++) {
            for(int space=7; space>=row; space--) {
                System.out.print(" ");
            }

            for (int star=2; star<=row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Tree trunk
        for (int row=1; row<=3; row++) {
            for(int space=6; space>1; space--) {
                System.out.print(" ");
            }
            System.out.println("* * ");
        }
    }
}