package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        if (numberToPrint == 0) {
            System.out.println(0);
        } else {
            for (int i = 0,da=1; i < power; i++) {
                da *= numberToPrint;
                if (i == power-1) {
                    System.out.println(da);
                }
            }

        }
    }

        public static void main (String[]args){
            new Power().printPower(10, 3);
        }
    }

