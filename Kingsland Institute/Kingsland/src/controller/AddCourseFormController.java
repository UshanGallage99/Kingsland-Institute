package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AddCourseFormController {
    public AnchorPane root;
    public JFXButton btnClose;

    public void btnCloseOnAction(ActionEvent actionEvent) {
        Stage exitStage=(Stage)btnClose.getScene().getWindow();
        exitStage.close();
    }

    public void backToHomeOnAction(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/view/MainForm.fxml"))));
    }
}
