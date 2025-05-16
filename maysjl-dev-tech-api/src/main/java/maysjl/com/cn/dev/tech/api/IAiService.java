package maysjl.com.cn.dev.tech.api;

import org.springframework.ai.chat.ChatResponse;
import reactor.core.publisher.Flux;

/**
 * @program: AI-RAG
 * @description: 无
 * @author: May's_JL
 * @create: 2025-05-16 21:18
 **/
public interface IAiService {

    ChatResponse generate(String model, String message);

    Flux<ChatResponse> generateStream(String model, String message);

}
