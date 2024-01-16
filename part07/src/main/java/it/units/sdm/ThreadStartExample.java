package it.units.sdm;

public class ThreadStartExample {

    public static void main(String[] args) throws Exception {
        var thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Running");
                    try {
                        Thread.sleep(2000);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        thread.start();
        System.out.println("End of main");
    }
}
