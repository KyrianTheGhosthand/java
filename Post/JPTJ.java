package Post;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.gson.Gson;

import java.util.Date;
public class JPTJ {
    public static void main(String[] args) {
//        Object mapper
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
//        Post creation
        Post post = new Post();
        post.setTitle("Convert Java Object to String Json");
        post.setId(100L);
        post.setDescription("Use Jackson JSON API");
        post.setContent("HTML content");
        post.setLastUpdatedAt(new Date());
        post.setPostedAt(new Date());

        Gson gson = new Gson();
//        Post post1 = new Post("Convert Java Object to String Json", "Use Jackson JSON API", "HTML content");

        String result = gson.toJson(post);
        System.out.println(result);
    }
}
