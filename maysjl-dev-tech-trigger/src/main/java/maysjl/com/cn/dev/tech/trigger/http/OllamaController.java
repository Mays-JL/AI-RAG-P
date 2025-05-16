package maysjl.com.cn.dev.tech.trigger.http;

import jakarta.annotation.Resource;
import maysjl.com.cn.dev.tech.api.IAiService;
import org.springframework.ai.chat.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatClient;
import org.springframework.ai.ollama.api.OllamaOptions;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

/**
 * @program: AI-RAG
 * @description: Ollama触发器
 * @author: May's_JL
 * @create: 2025-05-16 21:19
 **/
@RestController()
@CrossOrigin("*")
@RequestMapping("/api/v1/ollama")
public class OllamaController implements IAiService {
    @Resource
    private OllamaChatClient chatClient;

    /**
     * <a href="http://localhost:8090/api/v1/ollama/generate?model=deepseek-r1:1.5b&message=1+1">...</a>
     */
    @RequestMapping(value = "generate",method = RequestMethod.GET)
    @Override
    public ChatResponse generate(@RequestParam String model, @RequestParam String message) {
        return chatClient.call(new Prompt(message, OllamaOptions.create().withModel(model)));
    }

    /**
     * <a href="http://localhost:8090/api/v1/ollama/generate_stream?model=deepseek-r1:1.5b&message=hi">...</a>
     */
    @RequestMapping(value = "generate_stream",method = RequestMethod.GET)
    @Override
    public Flux<ChatResponse> generateStream(@RequestParam String model, @RequestParam String message) {
        return chatClient.stream(new Prompt(message, OllamaOptions.create().withModel(model)));
    }
}
