/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToeMVC;
public class Model {
    private int[][] array;
    private boolean playerOne;
    private boolean playerTwo;
    
    int row,col;

    public Model() {
        array = new int[3][3];
        playerOne = false;
        playerTwo = false;
        row=0;
        col=0;
    }
    public void updateData(int place,boolean player){
        if (place == 1) {
            row = 0;
            col = 0;
        } else if (place == 2) {
            row = 0;
            col = 1;
        } else if (place == 3) {
            row = 0;
            col = 2;
        } else if (place == 4) {
            row = 1;
            col = 0;
        } else if (place == 5) {
            row = 1;
            col = 1;
        } else if (place == 6) {
            row = 1;
            col = 2;
        } else if (place == 7) {
            row = 2;
            col = 0;
        } else if (place == 8) {
            row = 2;
            col = 1;
        } else if (place == 9) {
            row = 2;
            col = 2;
        }
        
        if (player) {
            array[row][col]=1;
        }
        else{
            array[row][col]=2;
        }
    }
    public boolean checkWinner() {
        for (int i = 0; i < 3; i++) {
            if (array[i][0] != 0 && array[i][0] == array[i][1] && array[i][0] == array[i][2]) {
                if (array[i][0] == 1) {
                    playerOne = true;
                } else {
                    playerTwo = true;
                }
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (array[0][i] != 0 && array[0][i] == array[1][i] && array[0][i] == array[2][i]) {
                if (array[0][i] == 1) {
                    playerOne = true;
                } else {
                    playerTwo = true;
                }

                return true;
            }
        }
        if (array[0][0] != 0 && array[0][0] == array[1][1] && array[0][0] == array[2][2]) {
            if (array[0][0] == 1) {
                playerOne = true;
            } else {
                playerTwo = true;
            }
            return true;
        }
        if (array[0][2] != 0 && array[0][2] == array[1][1] && array[0][2] == array[2][0]) {
            if (array[0][2] == 1) {
                playerOne = true;
            } else {
                playerTwo = true;
            }
            return true;
        }

        return false;
    }
 
    public boolean isPlayerOne() {
        return playerOne;
    }

    public boolean isPlayerTwo() {
        return playerTwo;
    }

}

