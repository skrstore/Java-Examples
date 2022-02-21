class AutoBoxDemo1 {
    public static void main(String[] args) {
        Integer io = 1000; // auto-box an int
        int i = io; // auot unbox
        System.out.println(i + " : " + io);
    }
}