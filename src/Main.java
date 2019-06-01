


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
public class Main<scene> extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane ();
        Label labelUserName = new Label ("Username");
        Label labelPassWord = new Label ("PassWord");
        TextField txtUsername = new TextField ();
        PasswordField pwField = new PasswordField ();
        Button btnLogin = new Button ("Login");
        Button btnReset = new Button ("Reset");
        GridPane gridpane = new GridPane();

        gridpane.setMinSize(100, 100);
        gridpane.setPadding(new Insets (10, 10, 10, 10));
        gridpane.setVgap(10);
        gridpane.setHgap(10);
        gridpane.setAlignment(Pos.CENTER);
        gridpane.add( labelUserName, 0, 0);
        gridpane.add(txtUsername, 1, 0);
        gridpane.add(labelPassWord, 0, 1);
        gridpane.add(pwField, 1, 1);
        gridpane.add(btnLogin, 1, 2);
        gridpane.add(btnReset, 2, 2);
        HBox hBox = new HBox();
        hBox.getChildren().addAll(btnLogin, btnReset);
        hBox.setSpacing(10);
        gridpane.add(hBox, 1, 2);

        Scene scene = new Scene(gridpane);


//        labelUsername.setLayoutX(50);
//        labelUsername.setLayoutY(50);
//        txtUsername.setLayoutX(200);
//        txtUsername.setLayoutY(50);
//
//        labelPassword.setLayoutX(50);
//        labelPassword.setLayoutY(100);
//        pwdField.setLayoutX(200);
//        pwdField.setLayoutY(100);
//
//        btnLogin.setLayoutX(200);
//        btnLogin.setLayoutY(150);
//        btnReset.setLayoutX(280);
//        btnReset.setLayoutY(150);
        // add compontent to scene;
//        pane.getChildren().addAll(btnLogin, btnReset, labelPassword, labelUsername, txtUsername, pwdField );
//        Scene scene = new Scene(pane, 600, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}