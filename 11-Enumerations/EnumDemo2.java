// Use the built-in enumeration methods.
// An enumeration of apple varieties.
enum Mobile {
    Samsung, Nokia, Mi, Apple
}

class EnumDemo2 {
    public static void main(String args[]) {
        Mobile mob;
        System.out.println("Here are all Mobile constants:");
        // use values()
        Mobile allMobile[] = Mobile.values();
        for (Mobile a : allMobile){
            System.out.println(a);
        }
        System.out.println();
        // use valueOf()
        mob = Mobile.valueOf("Apple");
        System.out.println("mob contains " + mob);
    }
}