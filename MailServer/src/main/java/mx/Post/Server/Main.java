package mx.Post.Server;

import mx.Post.Server.UI.LogUI;
import org.apache.logging.log4j.*;
import org.apache.logging.log4j.io.IoBuilder;

public class Main {
    public static void main(String[] args) {
        LogUI.main(args);
        while (true)
            LogManager.getLogger(Main.class).info("Hello World!");
    }
}