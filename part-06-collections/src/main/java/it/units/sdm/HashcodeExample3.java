package it.units.sdm;

import java.util.HashMap;
import java.util.Objects;

public class HashcodeExample3 {

    public static void main(String[] args) {
        var fileSizes = new HashMap<File, Long>();
        fileSizes.put(new File("C:\\Users\\pvercesi\\Desktop\\lesson8.pdf"), 342340L);
        fileSizes.put(new File("C:\\Users\\pvercesi\\Desktop\\lesson9.pdf"), 512956L);

        String fromName = "C:\\Users\\pvercesi\\Desktop\\lesson8.pdf";
        String toName = "C:\\Users\\pvercesi\\Desktop\\lesson8a.pdf";

        for (File file : fileSizes.keySet()) {
            if (file.getName().equals(fromName)) {
                file.rename(toName);
            }
            break;
        }

        File file = new File("C:\\Users\\pvercesi\\Desktop\\lesson8a.pdf");
        System.out.println(fileSizes.get(file));
    }


    public static class File {
        private String name;

        public File(String name) {
            this.name = name;
        }

        public void rename(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
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
