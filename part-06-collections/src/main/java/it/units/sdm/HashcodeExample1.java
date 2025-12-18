package it.units.sdm;

import java.util.HashMap;

public class HashcodeExample1 {

    static void main() {
        var fileSizes = new HashMap<File, Long>();
        fileSizes.put(new File("C:\\Users\\pvercesi\\lesson8.pdf"), 342340L);
        fileSizes.put(new File("C:\\Users\\pvercesi\\lesson9.pdf"), 512956L);

        File file = new File("C:\\Users\\pvercesi\\lesson8.pdf");
        IO.println(fileSizes.get(file));
    }

    public static class File {

        private String name;

        public File(String name) {
            this.name = name;
        }
    }

}
