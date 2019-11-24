
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;

public class InputController {
    MahasiswaModel im;
    InputView iv;
    
    public InputController(MahasiswaModel im, InputView iv){
        this.im = im;
        this.iv = iv;
            String data[][] = im.findAll();
            iv.table.setModel((new JTable(data, iv.colom)).getModel());
            iv.table.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e){
                    super.mousePressed(e);
                    int row = iv.table.getSelectedRow();
                    int col = iv.table.getSelectedColumn();
                    String nim = iv.table.getValueAt(row,0).toString();
                    System.out.println(nim);
                }
                
});
        iv.Submit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = iv.getNama();
                String nim = iv.getNIM();
                String alamat = iv.getAlamat();
                im.create(nim, nama, alamat);
                String data[][] = im.findAll();
            iv.table.setModel((new JTable(data, iv.colom)).getModel());
            }
        }
        );
    }
}
