import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.geometry.Pos;

public class BarChart extends Application {
    public void start(Stage stage) {
        HBox root = new HBox(20);
        root.setAlignment(Pos.CENTER);

        root.getChildren().add(createBar(20, Color.RED, "Projects — 20%"));
        root.getChildren().add(createBar(10, Color.BLUE, "Quizzes — 10%"));
        root.getChildren().add(createBar(30, Color.GREEN, "Midterm — 30%"));
        root.getChildren().add(createBar(40, Color.ORANGE, "Final — 40%"));

        Scene scene = new Scene(root, 500, 300);
        stage.setScene(scene);
        stage.show();
    }

    VBox createBar(int value, Color color, String text) {
        Rectangle r = new Rectangle(50, value * 3);
        r.setFill(color);

        Label l = new Label(text);

        VBox v = new VBox(5);
        v.setAlignment(Pos.BOTTOM_CENTER);
        v.getChildren().addAll(r, l);

        return v;
    }

    public static void main(String[] args) {
        launch(args);
    }
}