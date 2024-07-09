package kinoteca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class KinotecaClientApp {

    public static void main(String[] args) {
        SpringApplication.run(KinotecaClientApp.class, args);
    }

}
