package br.com.studproject.gestorcontab.view;

import br.com.studproject.gestorcontab.application.StageStartReadyEvent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class StartApplication implements ApplicationListener<StageStartReadyEvent> {

    private String title = "Hellow word! nice";

    @Override
    public void onApplicationEvent(StageStartReadyEvent event) {

        Stage stage = event.getStage();
        stage.setTitle(title);
        stage.setScene(new Scene(new Pane(),800,450));

        stage.show();
    }
}
