import java.io.*;

class FileData {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            int lines = 0, words = 0, chars = 0;
            String line;

            while ((line = br.readLine()) != null) {
                lines++;
                words += line.split("\\s+").length;
                chars += line.replace(" ", "").length();
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