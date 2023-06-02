package mx.Post.Server.UI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.io.IoBuilder;

import java.io.IOException;
import java.io.InputStream;

public class LogUI extends Application {
    Label logLabel;
    InputStream logStream;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Logger logger = LogManager.getLogger(LogUI.class).get;
        Scene scene = new Scene(new StackPane(logLabel), 640, 480);
        primaryStage.setScene(scene);
        primaryStage.show();
        while(true){
            if(logStream.available() > 0)
                logLabel.setText(logLabel.getText()+logStream.read());
        }

    }
}
