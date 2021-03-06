import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HelloWorld {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        SimpleJButton simpleJButton = new SimpleJButton();


//        new java.util.Timer().schedule(
//                new java.util.TimerTask() {
//                    @Override
//                    public void run() {
//
//                        // Methods here are goingt to be executed after delay ends, set to 120mp
//                        System.out.println("Hey whats up?");
//                        System.out.println("test");
//                    }
//                },
//                120000
//        );


        //ReadMic.read();
        //fromInput();

        byte[] bFile = null;
        try {
            bFile = Files.readAllBytes(Paths.get("otpt"));
            for (int i = 0; i < bFile.length; i++) {
                System.out.println(bFile[i]);
            }
            System.out.println(bFile.length);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileOutputStream fos = new FileOutputStream("otpt_out")) {
            fos.write(bFile);
            fos.close();// There is no more need for this line since you had created the instance of "fos" inside the try. And this will automatically close the OutputStream
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}