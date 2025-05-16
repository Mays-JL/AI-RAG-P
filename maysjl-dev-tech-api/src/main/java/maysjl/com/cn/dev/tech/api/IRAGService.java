package maysjl.com.cn.dev.tech.api;

import maysjl.com.cn.dev.tech.api.reponse.Response;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @program: AI-RAG
 * @description: RAG接口服务类
 * @author: May's_JL
 * @create: 2025-05-16 22:13
 **/
public interface IRAGService {

    Response<List<String>> queryRagTagList();

    Response<String> uploadFile(String ragTag, List<MultipartFile> files);

    Response<String> analyzeGitRepository(String repoUrl, String userName, String token) throws Exception;
}
