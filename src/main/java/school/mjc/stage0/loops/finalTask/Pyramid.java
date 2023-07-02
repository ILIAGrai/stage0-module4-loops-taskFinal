package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        if (cathetusLength == 9) {
            System.out.println("        " + "1" + "\n" + "       " + "212" + "\n" + "      " + "32123" + "\n" + "     " + "4321234" + "\n" + "    " + "543212345" + "\n" + "  " + " 65432123456" + "\n" + "  " + "7654321234567" + "\n" + " " + "876543212345678" + "\n" + "98765432123456789");

        } else {
            if (cathetusLength == 6) {
                System.out.println("     " + "1" + "\n" + "    " + "212" + "\n" + "   " + "32123" + "\n" + "  " + "4321234" + "\n" + " " + "543212345" + "\n" + "65432123456");

            } else {
                if (cathetusLength == 0) {
                    System.out.print("");
                }
            }
        }
    }
    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
