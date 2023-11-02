package br.com.studproject.gestorcontab;

import br.com.studproject.gestorcontab.application.StartSpringJavaFX;
import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = {HibernateJpaAutoConfiguration.class, DataSourceAutoConfiguration.class})
public class GestorContabApplication {

    public static void main(String[] args) {

        Application.launch(StartSpringJavaFX.class, args);
    }

}
