public class Conta implements Runnable {
    private final String nomeThread;
    private final int limite;
    
    public Conta(String nomeThread, int limite) {
        this.nomeThread = nomeThread;
        this.limite = limite;
    }
    
    @Override
    public void run() {
        for (int i = 0; i <= limite; i++) {
            System.out.println(nomeThread + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
