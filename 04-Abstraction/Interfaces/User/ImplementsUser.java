class ImplementsUser implements User {
    int id;
    String name;

    public void setD(int a, String s) {
        id = a;
        name = s;
    }

    public void getD() {
        System.out.println("Id of the User: " + id + " " + "\nName of the user : " + name);
    }
}