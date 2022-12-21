package lab_5;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.WindowConstants;

class MyApp extends JFrame {
    private JLabel imgLabel;
    private int imgNum = 1;

    private MyApp(){
        this.setSize(1200, 1200);
        imgLabel = new JLabel("", new ImageIcon(getClass().getResource("Perlamutrovy.png")), SwingConstants.CENTER);

        getContentPane().add(imgLabel);

        //Timer timer = new Timer(2000, e -> nextImg());
        //timer.start();
    }
    private void nextImg(){
        imgLabel.setIcon(new ImageIcon(getClass().getResource((++imgNum)+".jpeg")));
        if(imgNum == 5) imgNum = 0;

    }

    public static void main(String[] args) {
        MyApp mf = new MyApp();
        mf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mf.setVisible(true);

    }
}

// C:\Users\karin\OneDrive\Рабочий стол\Универ\Java_3sem\src\lab_5\Perlamutrovy.png