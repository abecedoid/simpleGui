import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SnakeWindow extends JFrame {

    public Grid g;
    public JTextField txtField;
    public JLabel label;
    public DrawWidget dw;

    public SnakeWindow(int height, int width) {
        super("Best program ever");
        setLayout(new FlowLayout());

        txtField = new JTextField(20);
        label = new JLabel("Ahojte vsici");
        dw = new DrawWidget();
        g = new Grid(20, 20);
        add(label);
        add(txtField);
        //add(dw);
        add(g);
    }

    public void refresh() {
        System.out.println("Refreshing...");
    }

    public class Grid extends JPanel implements ActionListener {

        int width;
        int height;
        private boolean[][] arr;
        Timer timer;

        public Grid(int x, int y) {
            super();
            width = x;
            height = y;
            arr = new boolean[height][width];
            Timer timer = new Timer(500, this);
            timer.start();
        }

        public void actionPerformed(ActionEvent event){
            System.out.println("Timer callback called, duh..");
            repaint();
        }

        public Dimension getPreferredSize(){
            return new Dimension(300, 300);
        }

        public void paintComponent(Graphics g) {
            //public void paint(Graphics g){
            super.paintComponent(g);
            System.out.println("painting grid..");
            int actSizeX = this.getWidth() / width;
            int actSizeY = this.getWidth() / height;
            //g.setColor(Color.BLACK);
            //g.fillRect(20, 50, 100, 100);
            for(int m=0; m<actSizeX; m++){
                for(int n=0; n<actSizeY; n++){
                    g.setColor(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
                    //g.setColor(Color.BLACK);
                    //g.fillRect(20, 50, 100, 100);
                    g.fillRect(m*actSizeX, n*actSizeY, actSizeX, actSizeY);
                }
            }
        }

    }
}
