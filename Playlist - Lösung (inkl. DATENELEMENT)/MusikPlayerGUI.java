import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import java.io.File;
import java.io.FileInputStream;
import javafx.scene.image.*;
import java.io.FileNotFoundException;

public class MusikPlayerGUI extends Application {
    PLAYLIST playlist;

    public void loadPlaylist() {
        this.playlist = new PLAYLIST();
        File dir = new File(".");
        File[] files = dir.listFiles((d, name) -> name.endsWith(".mp3"));

        for (File file : files) {
            this.playlist.hinzufügen(
                    new KNOTEN(new SONG(file.getName().split("-")[0], file.getName().split("-")[1].split("\\.")[0])));
        }
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        loadPlaylist();
        primaryStage.setTitle("Spotifayke");

        FileInputStream inputPlay = new FileInputStream("play.png");
        Image imagePlay = new Image(inputPlay);
        ImageView imageViewPlay = new ImageView(imagePlay);

        Button btn = new Button("", imageViewPlay);
        btn.setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        playlist.starten();
                    }
                });

        FileInputStream inputStop = new FileInputStream("stop.png");
        Image imageStop = new Image(inputStop);
        ImageView imageViewStop = new ImageView(imageStop);

        Button stop = new Button("", imageViewStop);
        stop.setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        playlist.stoppen();
                    }
                });

        FlowPane root = new FlowPane();
        // fill the background with a color #111111
        root.setStyle("-fx-background-color: #111111;");
        root.getChildren().add(btn);
        root.getChildren().add(stop);
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();
    }
}
