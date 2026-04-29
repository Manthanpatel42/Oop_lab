import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.geometry.Insets;

public class RegistrationForm extends Application {
    public void start(Stage stage) {
        GridPane gp = new GridPane();
        gp.setPadding(new Insets(10));
        gp.setVgap(10);
        gp.setHgap(10);

        TextField roll = new TextField();
        TextField name = new TextField();
        TextField age = new TextField();
        TextField email = new TextField();
        Button btn = new Button("Submit");

        gp.add(new Label("Roll No"), 0, 0);
        gp.add(roll, 1, 0);
        gp.add(new Label("Name"), 0, 1);
        gp.add(name, 1, 1);
        gp.add(new Label("Age"), 0, 2);
        gp.add(age, 1, 2);
        gp.add(new Label("Email"), 0, 3);
        gp.add(email, 1, 3);
        gp.add(btn, 1, 4);

        btn.setOnAction(e -> {
            try {
                int r = Integer.parseInt(roll.getText());
                int a = Integer.parseInt(age.getText());
                String em = email.getText();

                if (!em.contains("@") || !em.contains(".")) throw new Exception("Invalid Email");

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setContentText("Roll: " + r + "\nName: " + name.getText() + "\nAge: " + a + "\nEmail: " + em);
                alert.show();
            } catch (NumberFormatException ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Roll No and Age must be integers");
                alert.show();
            } catch (Exception ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText(ex.getMessage());
                alert.show();
            }
        });

        Scene scene = new Scene(gp, 300, 250);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}