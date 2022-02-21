class Pattern {
    public void pattern1() {
        System.out.println("Pattern-1(Stars 1-10)");
        int no = 10;
        for (int i = 0; i < no; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public void pattern2() {
        System.out.println("Pattern-2(Stars 10 -1)");
        int no = 10;
        for (int i = no; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public void pattern3() {
        System.out.println("Pattern-3");
        int no = 10;
        for (int i = 0; i < no; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

    public void pattern4() {
        System.out.println("Pattern-4(reverse 0-10)");
        int no = 10;
        for (int i = 0; i < no; i++) {
            for (int j = (no - i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public void pattern5() {
        System.out.println("Pattern-5(Alphabet)");
        for (char ch = 65; ch < 91; ch++) {
            System.out.print(ch + " ");
        }
    }
}