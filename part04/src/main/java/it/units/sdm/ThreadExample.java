package it.units.sdm;

public class ThreadExample {

    public static void main(String[] args) {
        var thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println("Running");
                    try {
                        Thread.sleep(1000);
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
