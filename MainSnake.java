import javax.swing.JFrame;

public class MainSnake {
    public static void main(String[] args){
        SnakeWindow sw = new SnakeWindow(20, 20);
        sw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        sw.setSize(400, 400);
        sw.setVisible(true);

    }
}
