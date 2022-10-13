import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MusikPlayerGUI extends Application {
    PLAYLIST playlist;

    public void loadPlaylist() {
        this.playlist = new PLAYLIST();

        // SONG 1
        KNOTEN k1 = new KNOTEN(new SONG("BigBillBroonzy", "BabyPleaseDontGo"));

        this.playlist.hinzufügen(k1);
    }

  @Override
  public void start(Stage primaryStage) {
    loadPlaylist();
    primaryStage.setTitle("Spotifayke");
    Button btn = new Button();
    btn.setText("Play");
    btn.setOnAction(
      new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            // play event
          System.out.println("Hello World!");
        }
      }
    );
    
    Button stop = new Button();
    stop.setText("STOP!!!");
    stop.setOnAction(
        new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // stop event
            System.out.println("STOP! Wie sieht es denn HIER aus?!?");
        }
        }
    );
    
    FlowPane root = new FlowPane();
    root.getChildren().add(btn);
    root.getChildren().add(stop);
    primaryStage.setScene(new Scene(root, 300, 250));
    primaryStage.show();
  }
}
