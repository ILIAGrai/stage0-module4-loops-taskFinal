package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        int kre=1,prob=cathetusLength-1;
        for(int i=0;i<cathetusLength;i++){
            for(int n1=0;n1<prob;n1++){
                System.out.print(" ");
            }
            for(int n1=0;n1<kre;n1++) {
                System.out.print("*");
            }
            prob--;
            kre++;
            System.out.print("\n");
        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
