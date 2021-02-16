package controller;

import bo.BOFactory;
import bo.custom.StudentBO;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import dto.StudentDTO;
import entity.Student;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import view.tm.StudentTM;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;

public class StudentFormController {
    public AnchorPane root;
    public JFXButton btnClose;
    public TableView tableStudent;
    public TableColumn colStudentID;
    public TableColumn colStudentName;
    public TableColumn colStudentAddress;
    public TableColumn colContact;
    public TableColumn colDob;
    public TableColumn colGender;
    public Button btnSave;
    public JFXTextField txtID;
    public JFXTextField txtName;
    public JFXTextField txtAddress;
    public JFXTextField txtContact;
    public JFXTextField txtDOB;
    public JFXTextField txtGender;
    StudentBO bo;

    public void initialize() throws Exception {



        bo = BOFactory.getInstance()
                .getBo(BOFactory.BOType.STUDENT);

        //loadId();

        /*colStudentID.setCellValueFactory(new PropertyValueFactory("id"));
        colStudentName.setCellValueFactory(new PropertyValueFactory("name"));
        colStudentAddress.setCellValueFactory(new PropertyValueFactory("address"));
        colContact.setCellValueFactory(new PropertyValueFactory("salary"));
        colDob.setCellValueFactory(new PropertyValueFactory("btn"));
        colGender.setCellValueFactory(new PropertyValueFactory(""));
        //colOp.setCellValueFactory(new PropertyValueFactory(""));*/

        //loadAllCustomers();// Alt+ Enter
        //backToHomeOnAction();

        //------------------------------ set Listener-------------

        /*tableStudent.getSelectionModel().selectedItemProperty().
                addListener((observable, oldValue, newValue) -> {
                    setData(newValue);
                });*/

        //------------------------------ set Listener-------------
    }

    public void backToHomeOnAction(MouseEvent mouseEvent) throws IOException {
        Stage stage = (Stage) root.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/view/MainForm.fxml"))));
    }
    public void btnCloseOnAction(ActionEvent actionEvent) throws Exception {
        Stage exitStage=(Stage)btnClose.getScene().getWindow();
        exitStage.close();
    }
private void loadAllCustomers() throws Exception {
       ObservableList<StudentTM> tmList =
                FXCollections.observableArrayList();
        List<StudentDTO> allCustomers = bo.getAllStudent();
        for (StudentDTO dto : allCustomers
        ) {
            Button btn = new Button("Delete");
            StudentTM tm = new StudentTM(dto.getId(),dto.getStudentName (),
                    dto.getAddress(),dto.getContact(),dto.getDob(),dto.getGender(),btn);
            tmList.add(tm);
            btn.setOnAction((e) -> {
                try {
                    ButtonType ok = new ButtonType("OK",
                            ButtonBar.ButtonData.OK_DONE);
                    ButtonType no = new ButtonType("NO",
                            ButtonBar.ButtonData.CANCEL_CLOSE);

                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                            "Are You Sure ?", ok, no);
                    Optional<ButtonType> result = alert.showAndWait();
                    if (result.orElse(no) == ok) {
                        if (bo.deleteStudent(tm.getId())) {
                            new Alert(Alert.AlertType.CONFIRMATION,
                                    "Deleted", ButtonType.OK).show();
                            loadAllCustomers();
                            return;
                        }
                        new Alert(Alert.AlertType.WARNING,
                                "Try Again", ButtonType.OK).show();
                    } else {
                        //no
                    }


                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            });
        }
        tableStudent.setItems(tmList);

    }

    public void SaveOnAction(ActionEvent actionEvent) throws Exception {
        boolean isSaved = bo.saveStudent(
                new StudentDTO(
                        txtID.getText(),
                        txtName.getText(),
                        txtAddress.getText(),
                        txtContact.getText(),
                        txtDOB.getText(),
                        txtGender.getText()
                )
        );
        System.out.println(isSaved);
    }
}
