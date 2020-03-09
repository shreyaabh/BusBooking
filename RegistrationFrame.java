import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RegistrationFrame extends JFrame implements ActionListener
{
  Container c;
  JLabel titlelabel=new JLabel("Bus Booking"); 
  JLabel Firstlabel=new JLabel("First Name:");
  JLabel Fromlabel=new JLabel("From");
  JLabel Tolabel=new JLabel("To");
  JLabel Lastlabel=new JLabel("Last Name:");
  JLabel Buslabel=new JLabel(""); 
  JLabel Phonelabel=new JLabel("Phone No:");
  
  JTextField First_tf=new JTextField();
  JTextField Last_tf=new JTextField();
  JTextField From_tf=new JTextField();
  JTextField To_tf=new JTextField();
  JTextField Bus_tf=new JTextField();
  JTextField Phone_tf=new JTextField();
  JButton book_btn=new JButton("Confirm Booking");
  JButton cancel_btn=new JButton("Cancel");
  RegistrationFrame()
    {
      c=this.getContentPane();
      c.setLayout(null);
              
      titlelabel.setBounds(362, 52, 325, 50);
      Firstlabel.setBounds(58,152,99,43);
      Lastlabel.setBounds(58,243,110,29);
      Fromlabel.setBounds(58,324,124,36);
      Tolabel.setBounds(542,159,99,29);
      Buslabel.setBounds(542,245,99,24);
      Phonelabel.setBounds(542,329,139,26);
       
        
      First_tf.setBounds(214,151,228,50);
      Last_tf.setBounds(214,235,228,50);
      From_tf.setBounds(214,320,228,30);
      To_tf.setBounds(707,151,228,50);
      Bus_tf.setBounds(707,235,228,50);
      Phone_tf.setBounds(707,320,228,50);

      book_btn.setBounds(399, 440, 259, 74);
      cancel_btn.setBounds(399, 500, 259, 74);
      
      c.add(titlelabel);
      c.add(Firstlabel);
      c.add(Lastlabel);
      c.add(Fromlabel);
      c.add(Tolabel);
      c.add(Buslabel);
      c.add(Phonelabel);
      c.add(First_tf);
      c.add(From_tf);
      c.add(To_tf);
      c.add(Bus_tf);
      c.add(Phone_tf);
      c.add(Last_tf);
      c.add(book_btn);
      c.add(cancel_btn);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(10, 50, 1000, 700);

      book_btn.addActionListener(this);
      cancel_btn.addActionListener(this);

     
    }

    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == book_btn) {
        if (First_tf.getText().equals("")) {
          First_tf.setText("Please Fill Out This Field");
        }
        if (Last_tf.getText().equals("")) {
          Last_tf.setText("Please Fill Out This Field");
        }
        if (From_tf.getText().equals("")) {
          From_tf.setText("Please Fill Out This Field");
        }
        if (To_tf.getText().equals("")) {
          To_tf.setText("Please Fill Out This Field");
        }
        if (Bus_tf.getText().equals("")) {
          Bus_tf.setText("Please Fill Out This Field");
        }
        if (Phone_tf.getText().equals("")) {
          Phone_tf.setText("Please Fill Out This Field");
        }
        else {
          JOptionPane.showMessageDialog(c, "Your Ticked Has Been Confirmed");
        }
      }
      if (e.getSource() == cancel_btn) {
        First_tf.setText("");
        Last_tf.setText("");
        From_tf.setText("");
        To_tf.setText("");
        Bus_tf.setText("");
        Phone_tf.setText("");
      }
    }

  public static void main(String[] args)
  {
    new RegistrationFrame();
 
  }
}
