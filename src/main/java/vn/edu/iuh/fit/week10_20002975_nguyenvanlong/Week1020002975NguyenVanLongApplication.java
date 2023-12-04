package vn.edu.iuh.fit.week10_20002975_nguyenvanlong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;

import vn.edu.iuh.fit.week10_20002975_nguyenvanlong.services.JdbcUserServices;


@SpringBootApplication
public class Week1020002975NguyenVanLongApplication {
    @Autowired
    private JdbcUserServices jdbcUserServices;
    @Autowired
    private PasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(Week1020002975NguyenVanLongApplication.class, args);
    }
    @Bean
    CommandLineRunner add() {
        return args -> {
            UserDetails userDetails = User.withUsername("d")
                    .password(passwordEncoder.encode("d"))
                    .roles("ADMIN", "USER")
                    .build();

            jdbcUserServices.add(userDetails);
        };
    }

}
