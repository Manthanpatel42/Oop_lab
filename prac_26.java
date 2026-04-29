import java.io.*;

class FileCount {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            int lines = 0, words = 0, chars = 0;
            String line;

            while ((line = br.readLine()) != null) {
                lines++;
                words += line.split("\\s+").length;
                chars += line.length();
            }

            br.close();

            System.out.println(lines);
            System.out.println(words);
            System.out.println(chars);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}