import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        CorsConfiguration config = new CorsConfiguration();

        // Allow specific origin
        config.addAllowedOrigin("http://localhost:4200");

        // Allow specific methods
        config.addAllowedMethod("GET");
        config.addAllowedMethod("POST");
        config.addAllowedMethod("PUT");
        config.addAllowedMethod("DELETE");

       // Add any custom headers as needed
//        config.addAllowedHeader("Authorization");
//        config.addAllowedHeader("Content-Type");

        source.registerCorsConfiguration("/**", config); // Adjust the path pattern accordingly
        return new CorsFilter(source);
    }
}
