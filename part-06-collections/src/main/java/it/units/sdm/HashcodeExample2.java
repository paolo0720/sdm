package it.units.sdm;

import java.util.HashMap;
import java.util.Objects;

public class HashcodeExample2 {

    public static void main(String[] args) {
        var fileSizes = new HashMap<File, Long>();
        fileSizes.put(new File("C:\\Users\\pvercesi\\lesson8.pdf"), 342340L);
        fileSizes.put(new File("C:\\Users\\pvercesi\\lesson9.pdf"), 512956L);

        File file = new File("C:\\Users\\pvercesi\\lesson8.pdf");
        System.out.println(fileSizes.get(file));
    }

    public static class File {
        private String name;

        public File(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            File file = (File) o;
            return Objects.equals(name, file.name);
        }

        @Override
        public int hashCode() {
            return name.hashCode();
        }
    }
}
