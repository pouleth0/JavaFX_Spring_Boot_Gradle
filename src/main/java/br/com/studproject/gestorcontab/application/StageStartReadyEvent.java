package br.com.studproject.gestorcontab.application;

import javafx.stage.Stage;
import org.springframework.context.ApplicationEvent;

public class StageStartReadyEvent extends ApplicationEvent {
    public StageStartReadyEvent(Stage primaryStage) {
        super(primaryStage);
    }
    public Stage getStage(){
        return ((Stage) getSource());
    }
}
