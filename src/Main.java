public class Main {
    public static void main(String[] args) {

        Spacesuit spacesuit = new Spacesuit(new Jumpsuit(), new Helmet(), new Spaceboots());
        System.out.println(spacesuit.toString());

    }


}
