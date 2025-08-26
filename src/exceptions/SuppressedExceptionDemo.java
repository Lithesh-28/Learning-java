package exceptions;

import java.io.FileWriter;
import java.io.IOException;

class FaultyWriter extends FileWriter {
    private final String name;

    public FaultyWriter(String filename, String name) throws IOException {
        super(filename);
        this.name = name;
    }

    @Override
    public void close() throws IOException {
        super.close();
        // Intentionally throw exception while closing
        throw new IOException("Exception while closing " + name);
    }
}

public class SuppressedExceptionDemo {

    public static void main(String[] args) {
        try (FaultyWriter fw1 = new FaultyWriter("file1.txt", "File1");
             FaultyWriter fw2 = new FaultyWriter("file2.txt", "File2")) {

            // Main exception: divide by zero
            int a = 10 / 0;

        } catch (Exception e) {
            System.out.println("Main Exception: " + e);

            // Print suppressed exceptions
            Throwable[] suppressed = e.getSuppressed();
            for (Throwable t : suppressed) {
                System.out.println("Suppressed Exception: " + t);
            }
        }
    }
}
