//this program will create a file and write in it.

import java.io.*;

class write {
    public static void main(String[] args) {
        try {
            FileOutputStream f = new FileOutputStream("ankur.txt");
            String s = "meow";
            byte[] b = s.getBytes();
            f.write(b);
            f.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

// output (create file before uWu)
// java.io.FileNotFoundException: ankur.txt (The system cannot find the file
// specified)
