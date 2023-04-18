class ContaContrario implements Runnable {
    private final String nomeThread;
    private final int limite;
    
    public ContaContrario(String nomeThread, int limite) {
        this.nomeThread = nomeThread;
        this.limite = limite;
    }
    
    @Override
    public void run() {
        for (int i = limite; i >= 0; i--) {
            System.out.println(nomeThread + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

