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

public class MainFormController {
    public AnchorPane root;
    public JFXButton btnClose;

    public void openStudentForm(MouseEvent mouseEvent) throws IOException {
        setUI("StudentForm.fxml");
    }

    public void openCourseForm(MouseEvent mouseEvent) throws IOException {
        setUI("CourseForm.fxml");
    }

    public void openRegistrstionForm(MouseEvent mouseEvent) throws IOException {
        setUI("RegistrationForm.fxml");
    }
    private void setUI(String location) throws IOException {
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("../view/" + location))));
    }


    public void btnCloseOnAction(ActionEvent actionEvent) throws Exception {
        Stage exitStage=(Stage)btnClose.getScene().getWindow();
        exitStage.close();
        dispose();
    }
}
