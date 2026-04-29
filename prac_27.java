import java.io.*;

class StudentFile {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedReader br = null;

        try {
            fw = new FileWriter("students.txt");
            fw.write("1 A 80\n2 B 85\n3 C 90\n");
            fw.close();

            br = new BufferedReader(new FileReader("students.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try { if (br != null) br.close(); } catch (Exception e) {}
        }
    }
}