/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToeMVC;

public class Controller {

    private View view;
    private Model model;
    private boolean player;
    private boolean result;
    int moveCount;

    public Controller(View v, Model m) {
        this.view = v;
        this.model = m;
        player = true;
        moveCount=0;
    }

    public void handleClick(int position) {
        
        updateViewAndData(position);
        
        result = model.checkWinner();
        if (result == true && model.isPlayerOne()) {
            view.setStatus("Player 1 wins");
            view.disableAll();

        } else if (result == true && model.isPlayerTwo()) {
            view.setStatus("Player 2 wins");
            view.disableAll();
        }
        
    }

    public void updateViewAndData(int place) {
        String set;
        if (player) {
            set = "X";
        } else {
            set = "O";
        }
        if (moveCount==8 && !model.checkWinner()) {
            view.setStatus("It's a Draw!");
        }
        if (place == 1 && view.getOne().isEnabled()) {
            view.setOne(set);
            view.disableOne();
            
            model.updateData(place, player);
            player = !player;
            moveCount++;
        } 
        else if (place == 2 && view.getTwo().isEnabled()) {
            view.setTwo(set);
            view.disableTwo();
             
            model.updateData(place, player);
            player = !player;
            moveCount++;
        } 
        else if (place == 3 && view.getThree().isEnabled()) {
            view.setThree(set);
            view.disableThree();
             
            model.updateData(place, player);
            player = !player;
            moveCount++;
        } 
        else if (place == 4 && view.getFour().isEnabled()) {
            view.setFour(set);
            view.disableFour();
             
            model.updateData(place, player);
            player = !player;
            moveCount++;
        } 
        else if (place == 5 && view.getFive().isEnabled()) {
            view.setFive(set);
            view.disableFive();
             
            model.updateData(place, player);
            player = !player;
            moveCount++;
        } 
        else if (place == 6 && view.getSix().isEnabled()) {
            view.setSix(set);
            view.disableSix();
             
            model.updateData(place, player);
            player = !player;
            moveCount++;
        } 
        else if (place == 7 && view.getSeven().isEnabled()) {
            view.setSeven(set);
            view.disableSeven();
             
            model.updateData(place, player);
            player = !player;
            moveCount++;
        } 
        else if (place == 8 && view.getEight().isEnabled()) {
            view.setEight(set);
             view.disableEight();
             
             model.updateData(place, player);
             player = !player;
             moveCount++;
        } 
        else if (place == 9 && view.getNine().isEnabled()) {
            view.setNine(set);
            view.disableNine();
             
            model.updateData(place, player);
            player = !player;
            moveCount++;
        }
    }
}
