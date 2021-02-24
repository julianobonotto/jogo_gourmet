package engine;

import messages.Food;
import ui.PopUpConfirmBtnOK;
import ui.PopUpConfirmBtnSimNao;
import ui.PopUpConfirmInputBtnOkCancela;

public class Service {

    public void run() {

        Food food = Food.getInstance();
        while (true){
            PopUpConfirmBtnOK popUpConfirmBtnOK = new PopUpConfirmBtnOK();
            PopUpConfirmBtnSimNao popUpConfirmBtnSimNao = new PopUpConfirmBtnSimNao();
            PopUpConfirmInputBtnOkCancela popUpConfirmInputBtnOkCancela = new PopUpConfirmInputBtnOkCancela();

            popUpConfirmBtnOK.showPopUp("Pense em um prato que gosta");


            boolean discovered = false;
            for (String foodItem : food.getList()) {
                if (popUpConfirmBtnSimNao.showPopUp("Confirm", "O prato que vc pensou é " + foodItem + "?") == 0) {
                    if(!foodItem.equals("Bolo de Chocolate")) {
                        if(popUpConfirmBtnSimNao.showPopUp("Confirm", "O prato que vc pensou é " + food.getHashMapNewFoodPair().get(foodItem) + "?") == 0){
                            gotIt(popUpConfirmBtnOK);
                            discovered = true;
                            break;
                        }
                    }
                    gotIt(popUpConfirmBtnOK);
                    discovered = true;
                    break;
                }
            }
            if(discovered) break;


            String newFood = popUpConfirmInputBtnOkCancela.showPopUp("Desisto", "Qual prato você pensou?");
            String newFoodToList = popUpConfirmInputBtnOkCancela.showPopUp("Complete", newFood+" é ______ mas Bolo de Chocolate não.");
            food.addItemToFoodList(newFoodToList);
            food.addItemTohashMapNewFoodPair(newFoodToList, newFood);
        }

    }

    private void gotIt(PopUpConfirmBtnOK popUpConfirmBtnOK) {
            popUpConfirmBtnOK.showPopUp("Acertei de novo!");
    }
}
