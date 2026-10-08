package it.units.sdm;

public class ThreadJoinExample {

    static void main() throws Exception {
        var thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
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
        IO.println("Start waiting for the thread to finish");
        thread.join();
        IO.println("End of main");
    }

}
