import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Example extends JFrame implements ActionListener {
    private JButton btn1 = new JButton("Wyślij");
    private JButton btn2 = new JButton("Wyczyść");
    private JTextField text1 = new JTextField("");
    private JTextField text2 = new JTextField("");
    private JLabel label1 = new JLabel("Podaj hasło:");
    private JLabel label2 = new JLabel("Użytkownik:");
    private JMenuBar bar = new JMenuBar();
    private JMenu m2 = new JMenu("- Gaming");
    private JMenu m3 = new JMenu("- Media Społecznościowe");
    private JMenu m4 = new JMenu("- Info");
    private JMenu m5 = new JMenu("- Szkoła");
    private JMenu m6 = new JMenu("- Zakupy");
    private JMenuItem i1 = new JMenuItem("gry-online.pl");
    private JMenuItem i2 = new JMenuItem("Epic Store");
    private JMenuItem i3 = new JMenuItem("Steam");
    private JMenuItem i4 = new JMenuItem("Battle.net");
    private JMenuItem i5 = new JMenuItem("Uplay");
    private JMenuItem i6 = new JMenuItem("LOL");
    private JMenuItem w1 = new JMenuItem("Facebook");
    private JMenuItem w2 = new JMenuItem("Twitter");
    private JMenuItem w3 = new JMenuItem("Instagram");
    private JMenuItem w4 = new JMenuItem("Youtube");
    private JMenuItem w5 = new JMenuItem("NK");
    private JMenuItem w6 = new JMenuItem("LinkedIn");
    private JMenuItem a1 = new JMenuItem("allegro");
    private JMenuItem b1 = new JMenuItem("tvn24");
    private JMenuItem b2 = new JMenuItem("wp.pl");
    private JMenuItem c1 = new JMenuItem("ZS Wieleń");
    private JMenuItem c2 = new JMenuItem("ESL");
    private JMenu submenu = new JMenu("ESports");
    private JLabel image = new JLabel(new ImageIcon("p30.jpg"));

    Example() {
        setTitle("Logowanie do aplikacji");
        setSize(540, 520);
        setVisible(true);
        setLayout(null);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
        i5.addActionListener(this);
        i6.addActionListener(this);
        w1.addActionListener(this);
        w2.addActionListener(this);
        w3.addActionListener(this);
        w4.addActionListener(this);
        w5.addActionListener(this);
        w6.addActionListener(this);
        a1.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        c1.addActionListener(this);
        c2.addActionListener(this);
        btn1.setBounds(50,400,150,30);
        btn2.setBounds(280,400,150,30);
        text1.setBounds(120,300,310,32);
        text2.setBounds(120,200,310,32);
        label1.setBounds(10,300,310,32);
        label2.setBounds(10,200,310,32);
        bar.setBounds(0,0,540,34);
        image.setBounds(0,0,540,60);
        add(btn1);
        add(btn2);
        add(text1);
        add(text2);
        add(label1);
        add(label2);
        add(bar);
        bar.add(m2);
        bar.add(m3);
        bar.add(m4);
        bar.add(m5);
        bar.add(m6);
        m2.add(i1);
        m2.add(i2);
        m2.add(i3);
        m2.add(i4);
        m2.add(i5);
        m2.add(i6);
        m3.add(w1);
        m3.add(w2);
        m3.add(w3);
        m3.add(w4);
        m3.add(w5);
        m3.add(w6);
        m6.add(a1);
        m4.add(b1);
        m4.add(b2);
        m5.add(c1);
        m2.add(submenu);
        submenu.add(c2);
        add(image);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            if (text1.getText().length() < 1) {
                JOptionPane.showMessageDialog(this, "Hasło jest zbyt krótkie");
            }
            if(text2.getText().length() < 1) {
                JOptionPane.showMessageDialog(this, "Nazwa użytkownika jest zbyt krótka");
            }
        }
        if(e.getSource() == btn2) {
            text1.setText("");
            text2.setText("");
        }
        if(e.getSource() == i1){
            Desktop d = Desktop.getDesktop();
            try {
                d.browse(new URI("http://gry-online.pl"));
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (URISyntaxException ex) {
                ex.printStackTrace();
            }
        }
        if(e.getSource() == i2){
            Desktop d = Desktop.getDesktop();
            try {
                d.browse(new URI("https://www.epicgames.com/store/pl/"));
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (URISyntaxException ex) {
                ex.printStackTrace();
            }
        }
        if(e.getSource() == i3){
            Desktop d = Desktop.getDesktop();
            try {
                d.browse(new URI("https://store.steampowered.com/"));
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (URISyntaxException ex) {
                ex.printStackTrace();
            }
        }
        if(e.getSource() == i4){
            Desktop d = Desktop.getDesktop();
            try {
                d.browse(new URI("https://www.blizzard.com/pl-pl/"));
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (URISyntaxException ex) {
                ex.printStackTrace();
            }
        }
        if(e.getSource() == i5){
            Desktop d = Desktop.getDesktop();
            try {
                d.browse(new URI("https://uplay.ubisoft.com/pl-PL"));
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (URISyntaxException ex) {
                ex.printStackTrace();
            }
        }
        if(e.getSource() == i6){
            Desktop d = Desktop.getDesktop();
            try {
                d.browse(new URI("https://play.eune.leagueoflegends.com/pl_PL"));
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (URISyntaxException ex) {
                ex.printStackTrace();
            }
        }
        if(e.getSource() == w1){
            Desktop d = Desktop.getDesktop();
            try {
                d.browse(new URI("https://www.facebook.com/"));
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (URISyntaxException ex) {
                ex.printStackTrace();
            }
        }
        if(e.getSource() == w2){
            Desktop d = Desktop.getDesktop();
            try {
                d.browse(new URI("https://twitter.com/?lang=pl"));
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (URISyntaxException ex) {
                ex.printStackTrace();
            }
        }
        if(e.getSource() == w3){
            Desktop d = Desktop.getDesktop();
            try {
                d.browse(new URI("https://www.instagram.com/?hl=pl"));
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (URISyntaxException ex) {
                ex.printStackTrace();
            }
        }
        if(e.getSource() == w4){
            Desktop d = Desktop.getDesktop();
            try {
                d.browse(new URI("https://www.youtube.com/?hl=pl&gl=PL"));
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (URISyntaxException ex) {
                ex.printStackTrace();
            }
        }
        if(e.getSource() == w5){
            Desktop d = Desktop.getDesktop();
            try {
                d.browse(new URI("https://nk.pl/logowanie"));
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (URISyntaxException ex) {
                ex.printStackTrace();
            }
        }
        if(e.getSource() == w6){
            Desktop d = Desktop.getDesktop();
            try {
                d.browse(new URI("https://pl.linkedin.com/"));
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (URISyntaxException ex) {
                ex.printStackTrace();
            }
        }
        if(e.getSource() == b1){
            Desktop d = Desktop.getDesktop();
            try {
                d.browse(new URI("https://tvn24.pl/"));
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (URISyntaxException ex) {
                ex.printStackTrace();
            }
        }
        if(e.getSource() == b2){
            Desktop d = Desktop.getDesktop();
            try {
                d.browse(new URI("https://www.wp.pl/"));
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (URISyntaxException ex) {
                ex.printStackTrace();
            }
        }
        if(e.getSource() == c1){
            Desktop d = Desktop.getDesktop();
            try {
                d.browse(new URI("http://zswielen.com.pl/"));
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (URISyntaxException ex) {
                ex.printStackTrace();
            }
        }
        if(e.getSource() == c2){
            Desktop d = Desktop.getDesktop();
            try {
                d.browse(new URI("https://www.eslgaming.com/"));
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (URISyntaxException ex) {
                ex.printStackTrace();
            }
        }
        if(e.getSource() == a1){
            Desktop d = Desktop.getDesktop();
            try {
                d.browse(new URI("https://allegro.pl/"));
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (URISyntaxException ex) {
                ex.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws Exception {
        new Example();
    }
}