import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gio Maulany
 */
public class InputView extends JFrame {
    JLabel LNama= new JLabel("Nama : ");
    JLabel LNIM= new JLabel("NIM : ");
    JLabel LAlamat = new JLabel("Alamat : ");
    JTextField TFNama = new JTextField();
    JTextField TFNIM = new JTextField();
    JTextField TFAlamat = new JTextField();
    JButton Submit = new JButton("Input");
    JButton Delete = new JButton("Delete");
    JScrollPane panel;
    JTable table;
    DefaultTableModel tableModel;
    String colom[] = {"NIM","Nama","Alamat"};
    public InputView(){
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setVisible(true);
        setLayout(null);
        setSize(600, 500);
        tableModel = new DefaultTableModel(colom, 0);
        table = new JTable(tableModel);
        panel = new JScrollPane(table);
        panel.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        add(LNIM);
        LNIM.setBounds(5, 5, 90, 20);
        add(TFNIM);
        TFNIM.setBounds(110, 5, 120, 20);
        add(LNama);
        LNama.setBounds(5, 30, 90, 20);
        add(TFNama);
        TFNama.setBounds(110, 30, 120, 20);
        add(LAlamat);
        LAlamat.setBounds(5, 55, 90, 20);
        add(TFAlamat);
        TFAlamat.setBounds(110, 55, 120, 20);
        add(Submit);
        Submit.setBounds(5, 90, 90, 20);
        add(Delete);
        Delete.setBounds(100, 90, 90, 20);
        add(panel);
        panel.setBounds(5, 120, 480, 300);
    }
    
    public String getNama(){
        return TFNama.getText();
    }
    public String getNIM(){
        return TFNIM.getText();
    }
    public String getAlamat(){
        return TFAlamat.getText();
    }
}
