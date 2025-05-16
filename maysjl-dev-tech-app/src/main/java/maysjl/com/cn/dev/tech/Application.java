package maysjl.com.cn.dev.tech;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: AI-RAG
 * @description: 启动类
 * @author: May's_JL
 * @create: 2025-05-16 21:09
 **/
@SpringBootApplication
@Configurable
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
