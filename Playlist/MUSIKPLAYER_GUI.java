import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.FlowPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;

public class MUSIKPLAYER_GUI extends Application {
    private PLAYLIST playlist;
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("MUSIKPLAYER");
        
        ladePlaylist();
        
        FileInputStream play_file = new FileInputStream("play.png");
        Image play_image = new Image(play_file);
        ImageView play_imageView = new ImageView(play_image);
        
        Button play = new Button("Play!", play_imageView);
        play.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {
                    playlist.starten();
                }
            });
            
        FileInputStream stop_file = new FileInputStream("stop.png");
        Image stop_image = new Image(stop_file);
        ImageView stop_imageView = new ImageView(stop_image);    
            
        Button stop = new Button("Stop!", stop_imageView);
        stop.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {
                    playlist.stoppen();
                }
            });

        FlowPane root = new FlowPane();
        root.getChildren().add(play);
        root.getChildren().add(stop);
        primaryStage.setScene(new Scene(root, 300, 125));
        primaryStage.show();
    }
    
    public void ladePlaylist() {
        playlist = new PLAYLIST();
        //...
    }
}