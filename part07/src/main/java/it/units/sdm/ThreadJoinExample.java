package it.units.sdm;

public class ThreadJoinExample {

    public static void main(String[] args) throws Exception {
        var thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
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
        System.out.println("Start waiting for the thread to finish");
        thread.join();
        System.out.println("End of main");
    }

}
