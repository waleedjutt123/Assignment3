public class Assignment3Q4 {
    public static void main(String args[]) {
        // i)
        int rows1 = 4;
        int columns1 = 10;
        for (int i1 = 0; i1 < rows1; i1++) {
            for (int j1 = 0; j1 < columns1; j1++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // ii)
        System.out.println();
        int rows2 = 5;
        for (int i2 = 0; i2 < rows2; i2++) {
            for (int j2 = 0; j2 <= i2; j2++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // iii)
        System.out.println();
        int rows3 = 5;
        for (int i3 = 0; i3 < rows3; i3++) {
            
            for (int j3 = 0; j3 < rows3 - i3; j3++) {
                System.out.print(" ");
            }
            
            for (int j3 = 0; j3 < 2 * i3 + 1; j3++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // iv)
        System.out.println();
        int rows4 = 5;
        for (int i4 = 0; i4 < rows4; i4++) {
            
            for (int j4 = 0; j4 < rows4 - i4; j4++) {
                System.out.print(" ");
            }
            
            for (int j4 = 0; j4 < 2 * i4 + 1; j4++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // v)
        System.out.println();
        int rows5 = 5;
        for (int i5 = 1; i5 <= rows5; i5++) {
            
            for (int j5 = 1; j5 <= rows5 - i5; j5++) {
                System.out.print(" ");
            }
            
            for (int j5 = 1; j5 <= 2 * i5 - 1; j5++) {
                System.out.print(i5);
            }
            System.out.println();
        }

        // vi)
        System.out.println();
        int rows6 = 5;
        for (int i6 = 1; i6 <= rows6; i6++) {
            
            for (int j6 = 1; j6 <= rows6 - i6; j6++) {
                System.out.print(" ");
            }
            
            for (int j6 = 1; j6 <= i6; j6++) {
                System.out.print(j6);
            }
            
            for (int j6 = i6 - 1; j6 >= 1; j6--) {
                System.out.print(j6);
            }
            System.out.println();
        }
    }
}