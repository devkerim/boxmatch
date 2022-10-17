public class Main {

    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 15 , 100, 90,10);
        Fighter alex = new Fighter("Alex" , 10 , 125, 100,30);
        Match m = new Match(marc,alex,100,200);
        m.run();
    }
}
