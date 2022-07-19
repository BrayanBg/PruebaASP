package front;

import back.Posiciones;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author BRAYAN-PC
 */
public class TablaVistaFinal extends JFrame {

    public TablaVistaFinal(Object[][] sopa, Posiciones p) {
        super("Sopa de letras");
        DefaultTableModel model = new DefaultTableModel();

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < sopa[i].length; j++) {
                model.addColumn("" + i);
            }
        }

        for (int i = 0; i < sopa.length; i++) {
            model.addRow(sopa[i]);
        }

        StringBuilder text = new StringBuilder(crearRspuesta(p));
        switch (p.getDir()) {
            case 0:
                text.append("PROGRAMA SIN EJECUTAR");
                break;
            case 1:
                text.append(crearRspuesta(p));
                text.append("Superior");
                break;
            case 2:
                text.append(crearRspuesta(p));
                text.append("Diagonal Superior Izquierda");
                break;
            case 3:
                text.append(crearRspuesta(p));
                text.append("Diagonal Superior Derecha");
                break;
            case 4:
                text.append(crearRspuesta(p));
                text.append("Inferior");
                break;
            case 5:
                text.append(crearRspuesta(p));
                text.append("Diagonal Inferior Izquierda");
                break;
            case 6:
                text.append(crearRspuesta(p));
                text.append("Diagonal Inferior Derecha");
                break;
            case 7:
                text.append("Izquierda");
                break;
            case 8:
                text.append("Derecha");
                break;
            case 9:
                text.append("Palabra no encontrada en sopa de letras");
                break;
            default:
                throw new AssertionError();
        }

        JTextArea textArea = new JTextArea();
        textArea.setText(text.toString());
        textArea.setBounds(10, 550, 300, 100);
        textArea.setEditable(false);
        textArea.setBackground(Color.BLACK);
        textArea.setForeground(Color.WHITE);
        JTable table = new JTable(model);
        table.setBounds(10, 10, 500, 500);
        setSize(550, 750);
        table.setForeground(Color.GREEN);
        table.setBackground(Color.BLACK);
        table.setEnabled(false);
        add(table);
        add(textArea);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setLayout(null);
        setVisible(true);
    }

    String crearRspuesta(Posiciones p) {
        StringBuilder text = new StringBuilder("La palabra inicia en las coordeanada [").append(p.getXI()).append(",").append(p.getYI()).append("]");
        text.append("\nLa palabra termina en las coordeanada [").append(p.getXF()).append(",").append(p.getYF()).append("]");
        text.append("\n en direccion ");
        return text.toString();
    }
}
