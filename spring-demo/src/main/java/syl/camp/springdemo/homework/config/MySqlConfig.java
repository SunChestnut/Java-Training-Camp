package syl.camp.springdemo.homework.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author sunyl
 * @date 2021/9/5 6:25 下午
 * @see syl.camp.springdemo.homework.config
 */
@Slf4j
@Component
public class MySqlConfig {

    public static final String CONNECTION_URL = "jdbc:mysql://192.168.33.10:3306/practice-db?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false&nullCatalogMeansCurrent=true&allowPublicKeyRetrieval=true";

    @Bean
    public Connection connection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(CONNECTION_URL, "root", "example123");
            System.out.println(DriverManager.getDriver("jdbc:mysql://192.168.33.10:3306/practice-db?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false&nullCatalogMeansCurrent=true&allowPublicKeyRetrieval=true"));
        } catch (SQLException ex) {
            log.error("SQLException: {}", ex.getMessage());
            log.error("SQLState: {}", ex.getSQLState());
            log.error("VendorError: {}", ex.getErrorCode());
        }
        return conn;
    }

}
