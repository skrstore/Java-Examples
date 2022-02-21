class TypeWrappersDemo{
    // ::::::::: NOT COMPLETE ::::::::::::
    public static void main(String[] args) {
        System.out.println("Type Wrappers Demo");

        // Character Wrapper
        Character co = new Character('a');
        System.out.println("Character Object : " + co);
        System.out.println("Character Object : " + co.charValue());

        // Boolean Wrapper
        Boolean bo1 = new Boolean("tue");
        Boolean bo2 = new Boolean(false);
        System.out.println("Boolean Object : " + bo1 +  " : " + bo2);
        
        // Numerical Wrappers
        Short so1 = new Short("12");
        // Short so2 = new Short(13);

        Integer io1 = new Integer("100");
        Integer io2 = new Integer(120);

        System.out.println("Integer Object : ");
        System.out.println("\t" + so1 + " : " + so1);
        System.out.println("\t" + io1 + " : " + io2);
    }
}