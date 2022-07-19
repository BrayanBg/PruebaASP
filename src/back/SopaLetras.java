/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package back;

/**
 *
 * @author BRAYAN-PC
 */
public class SopaLetras {

    private char[][] sopaLetras;
    private int xI, yI, xF, yF, dir;

    /*variable dir indica direccion de la palabra: 
        1.Up, 2.UpLeft, 3. UpRight
        4.Dowm, 5. DowmLeft, 6. DowmRight
        7. Left
        8. Right
        9. Not Found
     */
    public char[][] getSopaLetras() {
        return sopaLetras;
    }

    public void setSopaLetras(char[][] sopaLetras) {
        this.sopaLetras = sopaLetras;
    }

    public int getXI() {
        return xI;
    }

    public void setXI(int xI) {
        this.xI = xI;
    }

    public int getYI() {
        return yI;
    }

    public void setYI(int yI) {
        this.yI = yI;
    }

    public int getXF() {
        return xF;
    }

    public void setXF(int xF) {
        this.xF = xF;
    }

    public int getYF() {
        return yF;
    }

    public void setYF(int yF) {
        this.yF = yF;
    }

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public SopaLetras() {
        this.xI = -1;
        this.yI = -1;
        this.xF = -1;
        this.yF = -1;
        this.dir = 0;
    }

    public char[][] SopaLetrasDefault() {
        char[][] matriz = new char[6][7];
        matriz[0][0] = 'D';
        matriz[0][1] = 'E';
        matriz[0][2] = 'Y';
        matriz[0][3] = 'Q';
        matriz[0][4] = 'A';
        matriz[0][5] = 'U';
        matriz[0][6] = 'G';
        matriz[1][0] = 'X';
        matriz[1][1] = 'R';
        matriz[1][2] = 'G';
        matriz[1][3] = 'T';
        matriz[1][4] = 'U';
        matriz[1][5] = 'A';
        matriz[1][6] = 'V';
        matriz[2][0] = 'S';
        matriz[2][1] = 'C';
        matriz[2][2] = 'A';
        matriz[2][3] = 'S';
        matriz[2][4] = 'A';
        matriz[2][5] = 'B';
        matriz[2][6] = 'E';
        matriz[3][0] = 'X';
        matriz[3][1] = 'A';
        matriz[3][2] = 'J';
        matriz[3][3] = 'G';
        matriz[3][4] = 'U';
        matriz[3][5] = 'H';
        matriz[3][6] = 'V';
        matriz[4][0] = 'F';
        matriz[4][1] = 'M';
        matriz[4][2] = 'O';
        matriz[4][3] = 'R';
        matriz[4][4] = 'O';
        matriz[4][5] = 'L';
        matriz[4][6] = 'B';
        matriz[5][0] = 'G';
        matriz[5][1] = 'A';
        matriz[5][2] = 'H';
        matriz[5][3] = 'J';
        matriz[5][4] = 'E';
        matriz[5][5] = 'N';
        matriz[5][6] = 'E';

        return matriz;
    }

    public void buscarPalabra(char[][] sopaLetras, String palabra) {
        this.sopaLetras = sopaLetras;
        for (int i = 0; i < sopaLetras.length; i++) {
            for (int j = 0; j < sopaLetras[i].length; j++) {
                if (this.sopaLetras[i][j] == palabra.charAt(0)) {
                    xI = i;
                    yI = j;
                    if (findUp(palabra, i, j)) {
                        dir = 1;
                    } else if (findUpLeft(palabra, i, j)) {
                        dir = 2;
                    } else if (findUpRigth(palabra, i, j)) {
                        dir = 3;
                    } else if (findDowm(palabra, i, j)) {
                        dir = 4;
                    } else if (findDowmLeft(palabra, i, j)) {
                        dir = 5;
                    } else if (findDowmRigth(palabra, i, j)) {
                        dir = 6;
                    } else if (findLeft(palabra, i, j)) {
                        dir = 7;
                    } else if (findRight(palabra, i, j)) {
                        dir = 8;
                    } else {
                        dir = 9;
                    }
                }
            }
        }
    }

    public boolean findUp(String palabra, int x, int y) {
        try {
            for (int i = 1; i < palabra.length(); i++) {
                if (this.sopaLetras[x - i][y] != palabra.charAt(i)) {
                    return false;
                }
                xF = x - i;
                yF = y;
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public boolean findUpLeft(String palabra, int x, int y) {
        try {
            for (int i = 1; i < palabra.length(); i++) {
                if (this.sopaLetras[x - i][y - i] != palabra.charAt(i)) {
                    return false;
                }
                xF = x - i;
                yF = y - i;
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public boolean findUpRigth(String palabra, int x, int y) {
        try {
            for (int i = 1; i < palabra.length(); i++) {
                if (this.sopaLetras[x - i][y + i] != palabra.charAt(i)) {
                    return false;
                }
                xF = x - i;
                yF = y + i;
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public boolean findDowm(String palabra, int x, int y) {
        try {
            for (int i = 1; i < palabra.length(); i++) {
                if (this.sopaLetras[x + i][y] != palabra.charAt(i)) {
                    return false;
                }
                xF = x + i;
                yF = y;
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public boolean findDowmLeft(String palabra, int x, int y) {
        try {
            for (int i = 1; i < palabra.length(); i++) {
                if (this.sopaLetras[x + i][y - i] != palabra.charAt(i)) {
                    return false;
                }
                xF = x + i;
                yF = y - i;
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public boolean findDowmRigth(String palabra, int x, int y) {
        try {
            for (int i = 1; i < palabra.length(); i++) {
                if (this.sopaLetras[x + i][y + i] != palabra.charAt(i)) {
                    return false;
                }
                xF = x + i;
                yF = y + i;
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public boolean findRight(String palabra, int x, int y) {
        try {
            for (int i = 1; i < palabra.length(); i++) {
                if (this.sopaLetras[x][y + i] != palabra.charAt(i)) {
                    return false;
                }
                xF = x;
                yF = y + i;
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    public boolean findLeft(String palabra, int x, int y) {
        try {
            for (int i = 1; i < palabra.length(); i++) {
                if (this.sopaLetras[x][y - i] != palabra.charAt(i)) {
                    return false;
                }
                xF = x;
                yF = y - i;
            }
        } catch (Exception e) {
            return false;
        }

        return true;
    }
}
