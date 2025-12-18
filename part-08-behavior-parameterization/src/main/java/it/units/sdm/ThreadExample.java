package it.units.sdm;

public class ThreadExample {

    static void main() {
        var thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    IO.println("Running");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        thread.start();
        IO.println("End of main");
    }
}
