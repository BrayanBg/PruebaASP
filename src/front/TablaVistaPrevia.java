package front;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author BRAYAN-PC
 */
public class TablaVistaPrevia extends JFrame {

    private JTable table;
    private int x;
    private int y;

    public TablaVistaPrevia(int x, int y) {
        super("Sopa de letras");
        DefaultTableModel model = new DefaultTableModel();

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < y; j++) {
                model.addColumn("" + i);
            }
        }

        for (int i = 0; i < x; i++) {
            model.addRow(new Object[y]);
        }

        JTable table = new JTable(model);
        table.setBounds(10, 10, 500, 500);
        setSize(550, 750);
        this.table = table;
        this.x = x;
        this.y = y;
        add(table);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }
    
    public char[][] getInformation() {
        char[][] response = new char[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                response[i][j] = ((String) table.getValueAt(i, j)).charAt(0);
                table.getComponentAt(i, j);
            }
        }
        return response;
    }
}
