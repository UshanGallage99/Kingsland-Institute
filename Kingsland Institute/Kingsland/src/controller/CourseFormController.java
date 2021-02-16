package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;

public class CourseFormController {
    public AnchorPane root;
    public JFXButton btnClose;
    public JFXButton btnAddCourse;

    public void backToHomeOnAction(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/view/AddCourseForm.fxml"))));

    }

    public void btnCloseOnAction(ActionEvent actionEvent) throws Exception {
        Stage exitStage=(Stage)btnClose.getScene().getWindow();
        exitStage.close();
        dispose();
    }

    public void btnAddCourseOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/view/AddCourseForm.fxml"))));
    }
}
