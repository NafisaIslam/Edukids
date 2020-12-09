import java.awt.Cursor;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class Frame extends JFrame implements ActionListener {
	
	 JButton btn;
     JLabel lbl;
     JPanel P;
     
	public Frame (){
		init();
		this.setLayout(new BorderLayout());
		this.setSize(470,380);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addcompo();
		this.Addlis();
	}
	
	//continue_button_work
	
	public void Addlis()
	{
		this.btn.addActionListener(this);
	}
	
	 public void actionPerformed(ActionEvent e) {
		JButton butn = (JButton)e.getSource();
		if(butn == btn)
			{
			dispose();
			framecall();
			
			
			}
		}
		
	private void framecall() {
		
	    JPanel  p = new JPanel();
            p.setLayout(null);
            JButton btnext =new JButton();
	    btnext.setIcon(new ImageIcon("E:\\fall14-25\\Edukids\\bunny.jpg"));
	    btnext.setBorderPainted(false);
	    btnext.setFocusable(false);
	    btnext.setContentAreaFilled(false);
            btnext.setCursor(new Cursor(Cursor.HAND_CURSOR));
	    btnext.setBounds(400,200,100,180);
	    p.add(btnext);
		JLabel l= new JLabel();
		l.setText("A");
		l.setBounds(290, 100, 100, 100);
		l.setFont(new Font("Serif", Font.PLAIN, 100));
		l.setForeground(Color.RED);
		p.add(l);
		JFrame f = new JFrame ();
		f.setSize(600, 400);
	    f.setLocationRelativeTo(null);
	    f.setResizable(false);
		f.add(p);
		f.setVisible(true);	
	    JLabel L =new JLabel();
	    L.setIcon(new ImageIcon("E:\\fall14-25\\Edukids\\apple"));
	    L.setBounds(0, 0, 600,400);	    
	    p.add(L);
	    
	    
	}
  //add_components
	public void addcompo()
	{
      this.add(btn);this.add(lbl);
	}
   public void init()
   {
	//continue button
	this.btn = new JButton();
	btn.setIcon(new ImageIcon("E:\\fall14-25\\Edukids\\bunny.jpg"));
	btn.setBorderPainted(false);
    btn.setFocusable(false);
    btn.setContentAreaFilled(false);
    btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    btn.setBounds(370,175,100,180);
    
    
    //label_background
    this.lbl = new JLabel();
    this.lbl = new JLabel();
    this.lbl.setIcon(new ImageIcon("E:\\fall14-25\\Edukids\\edukids.jpg"));
    this.lbl.setBounds(0, 0, 500,400);

    
   
  }

  public static void main (String [] args)
  {
	Frame f = new Frame();
	f.setVisible(true);
  }
 }