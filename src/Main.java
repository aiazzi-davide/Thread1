public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ContaContrario("t1", 5));
        Thread t2 = new Thread(new Conta("t2", 5));
        
        System.out.println("THREAD MAIN HA FINITO. ORA LANCIO I DUE THREAD");
        
        t1.start();
        t2.start();
    }
}

