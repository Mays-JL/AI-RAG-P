package maysjl.com.cn.dev.tech.api.reponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @program: AI-RAG
 * @description: 响应类
 * @author: May's_JL
 * @create: 2025-05-16 22:14
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Response<T> implements Serializable {

    private String code;
    private String info;
    private T data;

}

