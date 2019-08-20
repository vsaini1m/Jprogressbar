import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main {
    public static void main(String[] args) {
      frame f=new frame();
    }
}
class frame extends JFrame implements ActionListener {
public static int i;
    JProgressBar progressBar;
    JButton btn=new JButton("Click me to progress");
    public  frame(){
        progressBar=new JProgressBar(0,20);
        JFrame frame=new JFrame();
        setSize(400,400);
        setVisible(true);
        setLayout(new FlowLayout());
        add(btn);
        add(progressBar);
        Timer t=new Timer(1000,this);

btn.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
t.start();

    }
});
        }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (i==20) {
            dispose();
        }
        progressBar.setValue(i);
        i++;
    }
}