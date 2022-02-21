class Main {
    public static void main(String[] args) {
        int[][] a = { { 7 }, { 6, 8 }, { 5, 9 }, { 4, 10 }, { 3, 4, 5, 6, 7, 8, 9, 10, 11 }, { 2, 12 }, { 1, 13 } };

        int[][] b = { { 1, 2, 3, 4, 5, 6, 7, 8 }, { 1, 8 }, { 1, 8 }, { 1, 2, 3, 4, 5, 6, 7, 8 }, { 1, 8 }, { 1, 8 },
                { 1, 2, 3, 4, 5, 6, 7, 8 } };

        for (int h = 0; h < a.length; h++) {
            for (int i = 0; i < 13; i++) {
                boolean con = false;
                for (int j = 0; j < a[h].length; j++) {
                    if ((i + 1) == a[h][j]) {
                        con = true;
                        break;
                    } else {
                        con = false;
                    }
                }
                if (con == true) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

        for (int h = 0; h < b.length; h++) {
            for (int i = 0; i < 13; i++) {
                boolean con = false;
                for (int j = 0; j < b[h].length; j++) {
                    if ((i + 1) == b[h][j]) {
                        con = true;
                        break;
                    } else {
                        con = false;
                    }
                }

                if (con == true) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
