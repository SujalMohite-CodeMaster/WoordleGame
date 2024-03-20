import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class wordle_frame extends JFrame implements ActionListener {
    JPanel p1, main;
    JLabel chn;
    JButton check , clear;
    int chances = 5;
    Font f1 = new Font("Tahoma", Font.BOLD, 20);
    boolean[] flags = new boolean[wordle_logic.wordsize];
    static ArrayList<JTextField> tf = new ArrayList<>();

    wordle_frame(){
        setSize(500,500);
        main = new JPanel();
        setContentPane(main);
        main.setBackground(Color.decode("#1a1918"));

        p1 = new JPanel();
//        p1.setBackground(Color.BLACK);
        p1.setBounds(100,60,300,60);
        p1.setLayout(new BoxLayout(p1, BoxLayout.X_AXIS));
        add(p1);
        generateTextfields();

        chn = new JLabel("Chances Remaining "+chances);
        chn.setBounds(120,180,250,60);
        chn.setFont(f1);
        chn.setForeground(Color.white);
        add(chn);

        check = new JButton("Check");
        check.setBounds(90,350,150,50);
        check.setFont(f1);
        check.addActionListener(this);
        add(check);

        clear = new JButton("Clear");
        clear.setBounds(300,350,150,50);
        clear.setFont(f1);
        clear.addActionListener(this);
        add(clear);


        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    void generateTextfields(){

        for(int i = 0 ; i<wordle_logic.wordsize; i++){
            tf.add(new JTextField());
            tf.get(i).setFont(new Font("Tahoma",Font.BOLD, 32));
            tf.get(i).setBackground(Color.decode("#3b3a39"));
            tf.get(i).setForeground(Color.WHITE);
            tf.get(i).setHorizontalAlignment(JTextField.CENTER);
        }
        for(int i = 0 ; i<wordle_logic.wordsize; i++){
            p1.add(tf.get(i));
        }
    }

    public void actionPerformed(ActionEvent ae){
        UIManager.put("OptionPane.messageFont", f1);
        if(ae.getSource()==check){
            if(chances>0){
//            bunty vala loop
                for(int i = 0 ; i < wordle_logic.wordsize; i++){
                    if(wordle_logic.matchExactLetter(i)==true){
//                    green color
                        tf.get(i).setBackground(Color.decode("#2fa84f"));
                        flags[i]= true;
                    }
                    else if(wordle_logic.containsLetter(i)==true){
//                    yellow color
                        tf.get(i).setBackground(Color.decode("#d1d424"));
                    }
                }

                boolean allTrue = true;
                for(boolean ele : flags){
                    if(ele == false){
                        allTrue = false;
                        break;
                    }
                }

                if(allTrue==true){
                    JOptionPane.showMessageDialog(null,"You guessed it correct!");
                    System.exit(0);
                }
                chances--;
                chn.setText("Chances Remaining: "+chances);
            }
            else{
                JOptionPane.showMessageDialog(null,"You couldn't make it noob!");
                System.exit(0);
            }

        }

        if(ae.getSource()==clear){
            for(int i = 0 ; i<wordle_logic.wordsize; i++){
                tf.get(i).setText("");
                tf.get(i).setBackground(Color.decode("#3b3a39"));
                flags[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        new wordle_logic();
        new wordle_frame();// design ka logic
}

}