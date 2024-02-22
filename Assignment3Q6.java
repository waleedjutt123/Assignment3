public class Assignment3Q6 {
    public static void main(String args[]) {
        // i)
        int rows1 = 4;
        int columns1 = 10;
        int i1 = 0;
        while (i1 < rows1) {
            int j1 = 0;
            while (j1 < columns1) {
                System.out.print("*");
                j1++;
            }
            System.out.println();
            i1++;
        }

        // ii)
        System.out.println();
        int rows2 = 5;
        int i2 = 0;
        while (i2 < rows2) {
            int j2 = 0;
            while (j2 <= i2) {
                System.out.print("*");
                j2++;
            }
            System.out.println();
            i2++;
        }

        // iii)
        System.out.println();
        int rows3 = 5;
        int i3 = 0;
        while (i3 < rows3) {
            
            int j3 = 0;
            while (j3 < rows3 - i3) {
                System.out.print(" ");
                j3++;
            }
            
            j3 = 0;
            while (j3 < 2 * i3 + 1) {
                System.out.print("*");
                j3++;
            }
            System.out.println();
            i3++;
        }

        // iv)
        System.out.println();
        int rows4 = 5;
        int i4 = 0;
        while (i4 < rows4) {
            
            int j4 = 0;
            while (j4 < rows4 - i4) {
                System.out.print(" ");
                j4++;
            }
            
            j4 = 0;
            while (j4 < 2 * i4 + 1) {
                System.out.print("*");
                j4++;
            }
            System.out.println();
            i4++;
        }

        // v)
        System.out.println();
        int rows5 = 5;
        int i5 = 1;
        while (i5 <= rows5) {
            
            int j5 = 1;
            while (j5 <= rows5 - i5) {
                System.out.print(" ");
                j5++;
            }
            
            j5 = 1;
            while (j5 <= 2 * i5 - 1) {
                System.out.print(i5);
                j5++;
            }
            System.out.println();
            i5++;
        }

        // vi)
        System.out.println();
        int rows6 = 5;
        int i6 = 1;
        while (i6 <= rows6) {
            
            int j6 = 1;
            while (j6 <= rows6 - i6) {
                System.out.print(" ");
                j6++;
            }
            
            j6 = 1;
            while (j6 <= i6) {
                System.out.print(j6);
                j6++;
            }
            
            j6 = i6 - 1;
            while (j6 >= 1) {
                System.out.print(j6);
                j6--;
            }
            System.out.println();
            i6++;
        }
    }
}