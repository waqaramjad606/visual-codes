package sample;
/* @Waqar amjad
    17140040
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    Float number1=0f;
    int operation=-1;
    @FXML private TextField inputField;
    @FXML private Button btn0;
    @FXML private Button btn1;
    @FXML private Button btn2;
    @FXML private Button btn3;
    @FXML private Button btn4;
    @FXML private Button btn5;
    @FXML private Button btn6;
    @FXML private Button btn7;
    @FXML private Button btn8;
    @FXML private Button btn9;
    @FXML private Button plus;
    @FXML private Button minus;
    @FXML private Button multiply;
    @FXML private Button divide;
    @FXML private Button equal;
    @FXML private Button clear;
    @FXML
    void handleButtonActions(ActionEvent e){
        if (e.getSource()==btn0){
            inputField.setText(inputField.getText()+"0");
        }//btn0
        else if(e.getSource()==btn1){
            inputField.setText(inputField.getText()+"1");
        }//btn1
        else if(e.getSource()==btn2){
            inputField.setText(inputField.getText()+"2");
        }//btn2
        else if(e.getSource()==btn3){
            inputField.setText(inputField.getText()+"3");
        }//btn3
        else if(e.getSource()==btn4){
            inputField.setText(inputField.getText()+"4");
        }//btn4
        else if(e.getSource()==btn5){
            inputField.setText(inputField.getText()+"5");
        }//btn5
        else if(e.getSource()==btn6){
            inputField.setText(inputField.getText()+"6");
        }//btn6
        else if(e.getSource()==btn7){
            inputField.setText(inputField.getText()+"7");
        }//btn7
        else if(e.getSource()==btn8){
            inputField.setText(inputField.getText()+"8");
        }//btn8
        else if(e.getSource()==btn9){
            inputField.setText(inputField.getText()+"9");
        }//btn9
        else if(e.getSource()==plus){
            number1=Float.parseFloat(inputField.getText());
            operation=1;
            inputField.setText("");
        }//plus
        else if(e.getSource()==minus){
            number1=Float.parseFloat(inputField.getText());
            operation=2;
            inputField.setText("");
        }//plus
        else if(e.getSource()==multiply){
            number1=Float.parseFloat(inputField.getText());
            operation=3;
            inputField.setText("");
        }//plus
        else if(e.getSource()==divide){
            number1=Float.parseFloat(inputField.getText());
            operation=4;
            inputField.setText("");
        }//plus
        else if(e.getSource()==clear){
            inputField.setText("");
        }//plus

        else if(e.getSource()==equal){
           Float number2=Float.parseFloat(inputField.getText());
            switch (operation){

                case 1:
                    float ans=number1+number2;
                    inputField.setText(String.valueOf(ans));
                    break;
                case 2:
                     ans=number1-number2;
                    inputField.setText(String.valueOf(ans));
                    break;
                case 3:
                     ans=number1*number2;
                    inputField.setText(String.valueOf(ans));
                    break;
                case 4:
                        ans=0f;
                    try{
                        ans=number1/number2;
                    }//try
                    catch (Exception ex){
                        inputField.setText("Error");
                    }//catch
                    inputField.setText(String.valueOf(ans));
                    break;
            }//switch

        }//equal
    }//handleActionEvents

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //TODO
    }
}
