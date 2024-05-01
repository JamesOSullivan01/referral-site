package config;

import Model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import services.PostService;

import java.util.List;

@Component
public class SeedData implements CommandLineRunner {

    @Autowired
    private PostService postService;


    @Override
    public void run(String... args) throws Exception {
        List<Post> posts = postService.getAll();

        if(posts.size() == 0){
            Post post1 = new Post();
            post1.setTitle("title of post1");
        }
    }
}
