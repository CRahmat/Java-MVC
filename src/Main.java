
import java.sql.Connection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gio Maulany
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputView iv = new InputView();
        MahasiswaModel im = new MahasiswaModel();
        InputController ic = new InputController(im,iv);
    }
    
}
