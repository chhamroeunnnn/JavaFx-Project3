import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class ViewController implements Initializable   {

    @FXML
    private Button Button_Order;

    @FXML
    private Label Price_1;

    @FXML
    private Spinner<Integer> Spinner_1;

    @FXML
    private Spinner<Integer> Spinner_2;

    @FXML
    private Spinner<Integer> Spinner_3;

    @FXML
    private Spinner<Integer> Spinner_4;

    @FXML
    void Button_Order_Action1(ActionEvent event) {
        double Chicken_price = 2;
        double Bugger_price = 1;
        double CoCa_price = 0.50;
        double Donat_price=1;

        int Chicken_qty = Spinner_1.getValue();
        int Bugger_qty= Spinner_2.getValue();
        int CoCa_qty = Spinner_3.getValue();
        int Donat_qty = Spinner_4.getValue();

        double Total_Price = Chicken_price * Chicken_qty + Bugger_price * Bugger_qty + CoCa_price * CoCa_qty + Donat_price * Donat_qty;

        Price_1.setText(Total_Price + "$");
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Spinner_1.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0));
        Spinner_2.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0));
        Spinner_3.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0));
        Spinner_4.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100, 0));
    }


}
