package br.com.studproject.gestorcontab.application;

import br.com.studproject.gestorcontab.GestorContabApplication;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

public class StartSpringJavaFX extends Application {
    private ConfigurableApplicationContext applicationContext;
    @Override
    public void init() throws Exception {
        super.init();
        applicationContext = new SpringApplicationBuilder(GestorContabApplication.class).run();
    }

    @Override
    public void stop() throws Exception {
        super.stop();
        applicationContext.close();
        Platform.exit();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        applicationContext.publishEvent(new StageStartReadyEvent(primaryStage));
    }
}
