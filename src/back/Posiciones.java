/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package back;

/**
 *
 * @author BRAYAN-PC
 */
public class Posiciones {

    private int XI;
    private int YI;
    private int XF;
    private int YF;
    private int dir;

    public Posiciones(int XI, int YI, int XF, int YF, int dir) {
        this.XI = XI;
        this.YI = YI;
        this.XF = XF;
        this.YF = YF;
        this.dir = dir;
    }

    public Posiciones(SopaLetras sl) {
        this.XI = sl.getXI();
        this.YI = sl.getYI();
        this.XF = sl.getXF();
        this.YF = sl.getYF();
        this.dir = sl.getDir();
    }

    public Posiciones() {
        this.XI = -1;
        this.YI = -1;
        this.XF = -1;
        this.YF = -1;
        this.dir = 0;
    }

    public int getXI() {
        return XI;
    }

    public void setXI(int XI) {
        this.XI = XI;
    }

    public int getYI() {
        return YI;
    }

    public void setYI(int YI) {
        this.YI = YI;
    }

    public int getXF() {
        return XF;
    }

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public void setXF(int XF) {
        this.XF = XF;
    }

    public int getYF() {
        return YF;
    }

    public void setYF(int YF) {
        this.YF = YF;
    }
}
