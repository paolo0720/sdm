package it.units.sdm;

public class ThreadStartExample {

    static void main() throws Exception {
        var thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    IO.println("Running");
                    try {
                        Thread.sleep(2000);
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
