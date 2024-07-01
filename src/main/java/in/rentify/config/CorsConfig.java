package in.rentify.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
 *  This configuration allows the fronend at local server -> 3000 to access the backed resolving CORS issue
 *  enabling testing of the REST end points;
 */

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("https://makanclient.onrender.com")
                .allowedOriginPatterns("https://makanclient.onrender.com") // Allow requests from this origin
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Allow these HTTP methods
                .allowedHeaders(CorsConfiguration.ALL)
                .allowCredentials(true); // Allow sending cookies

    }
}