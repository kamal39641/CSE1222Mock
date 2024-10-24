package q1;

public class TestWorker {
    public static void main(String[] args) {

        Worker w = new Worker("M", 50500);
        System.out.println(w);

        Supervisor s = new Supervisor("S", 75000, "Marketing");
        System.out.println(s);

        Director d = new Director("Kamal", 120000, "Operations");
        System.out.println(d);
    }
}
