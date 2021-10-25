// Tendai Nyasha  Mupezeni
/**
 * @Author Tendai Nyasha Mupezeni
 */

package RandomRectangleGUI;
//Packages for the java project
import com.sun.glass.ui.Size;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Super class with it's objects and methods
public class RandomRectangleGUI  {
    JFrame frame = new JFrame();
    JPanel panel=new JPanel();
    JButton TopButton = new JButton("Click me to change color");
    JButton BottomButton = new JButton("Click me to change size");


    public RandomRectangleGUI(){
        // Assigning events to buttons
        TopButton.addActionListener(new RandomColorListener());
        BottomButton.addActionListener(new SizeListener());

        //Setting up panel attributes
        panel.setBorder(BorderFactory.createEmptyBorder(50,50,50,50));
        panel.setLayout(new GridLayout(0,1));
        panel.setBackground(Color.black);
        panel.add(TopButton);
        panel.add(BottomButton);

        //attributes of a frame
        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(100,200));
        frame.pack();
        frame.setVisible(true);

    }
    class RandomColorListener implements ActionListener {
        //ActionListener method for random colors
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            int red,green,blue;
            red=(int)(Math.random()*225);
            green=(int)(Math.random()*225);
            blue=(int)(Math.random()*225);
            Color bc = new Color(red,green,blue);
            panel.setBackground(bc);


        }
    }
    class SizeListener implements ActionListener{

        //Action Listener method for random size
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            int length,width;
            length=(int)(Math.random()*500);
            width =(int)(Math.random()*500);
            Dimension sz= new Dimension(length,width) ;
            frame.setSize(sz);

        }
    }

    public static void main(String[] args) {
        new RandomRectangleGUI();

    }

}
