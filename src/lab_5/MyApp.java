package lab_5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.File;

// App class
class MyApp extends JFrame {
    int WINDOW_WIDTH = 600;
    int WINDOW_HEIGHT = 600;
    String background_image_path;

    int method;

    // Init
    MyApp() {
        super("Some shapes");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setLocation(300, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        this.method = 0;
    }

    void set_background_image_path(String path) {
        this.background_image_path = path;
    }


    // Start app
    public static void main(String[] args) {
        MyApp app = new MyApp();
        if (args.length == 1) {
            app.set_background_image_path(args[0]);
        }
        else {
            System.out.println("Background image path is empty");
        }
    }
}

// C:\Users\karin\OneDrive\Рабочий стол\Универ\Java_3sem\src\lab_5\Perlamutrovy.png