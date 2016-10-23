package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private Text output;
    private Double firstNum, secondNum;
    private String operator = "";
    private Model model = new Model();

    private boolean start = true;


    @FXML
    private void pressedNum(ActionEvent event){
        if(!start){
            output.setText("");
            start = false;
        } else {
            String value = ((Button)event.getSource()).getText();
            output.setText(output.getText() + value);
        }
    }

    @FXML
    private void pressedOperator(ActionEvent event){
        String value = ((Button)event.getSource()).getText();
        if(!"=".equals(value)){
            if(!operator.isEmpty()){
                output.setText(String.valueOf(model.calculation(firstNum, Double.parseDouble(output.getText()), operator)));
                start = true;
            }
            operator = value;
            firstNum = Double.parseDouble(output.getText());
            output.setText("");
        } else {
            if(operator.isEmpty()){
                return;
            }
            output.setText(String.valueOf(model.calculation(firstNum, Double.parseDouble(output.getText()), operator)));
            operator = "";
            start = true;
        }
    }
}
