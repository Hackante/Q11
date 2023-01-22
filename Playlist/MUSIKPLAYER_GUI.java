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
import javafx.scene.control.Label;
import javafx.geometry.Pos;

public class MUSIKPLAYER_GUI extends Application {
    private PLAYLIST playlist;
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("MUSIKPLAYER");
        
        ladePlaylist();
        
        FileInputStream play_file = new FileInputStream("play-button.png");
        Image play_image = new Image(play_file);
        ImageView play_imageView = new ImageView(play_image);
        
        Button play = new Button("", play_imageView);
        play.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {
                    playlist.starten();
                }
            });
            
        FileInputStream stop_file = new FileInputStream("stop-button.png");
        Image stop_image = new Image(stop_file);
        ImageView stop_imageView = new ImageView(stop_image);    
            
        Button stop = new Button("", stop_imageView);
        stop.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {
                    playlist.stoppen();
                }
            });
            
        FileInputStream next_file = new FileInputStream("next-button.png");
        Image next_image = new Image(next_file);
        ImageView next_imageView = new ImageView(next_image); 
        
        Button next = new Button("", next_imageView);
        next.setOnAction(new EventHandler<ActionEvent>() {

                @Override
                public void handle(ActionEvent event) {
                    
                }
            });
            
        FlowPane root = new FlowPane();
        root.getChildren().add(play);
        root.getChildren().add(stop);
        root.getChildren().add(next);
        
        primaryStage.setScene(new Scene(root, 440, 175));
        primaryStage.show();
    }
    
    public void ladePlaylist() {
        playlist = new PLAYLIST();
        playlist.hinzufügen(new SONG("BigBillBroonzy", "BabyPleaseDontGo"));
        playlist.hinzufügen(new SONG("BlindBlake", "EarlyMorningBlues"));
        playlist.hinzufügen(new SONG("BlindLemonJefferson", "matchBoxBlues"));
        playlist.hinzufügen(new SONG("BlindLemonJefferson", "OneDimeBlues"));
        playlist.initialisieren();
    }
}