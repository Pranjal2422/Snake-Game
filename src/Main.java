
import java.awt.Color;
import javax.swing.JFrame;


public class Main {

   
    public static void main(String[] args) {
        JFrame obj=new JFrame();
        Gameplay game=new Gameplay();
        obj.setBounds(10,10,905,700);
        obj.setBackground(Color.DARK_GRAY);
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(game);
        // TODO code application logic here
    }
    
}
