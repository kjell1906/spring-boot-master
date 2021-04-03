package com.example.demo.jsonplaceholder;

import com.example.demo.jsonplaceholder.Post;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(
        value = "jsonplaceholder",
        url = "http://jsonplaceholder.typicode.com/"
)
public interface JsonPlaceholderClient {

    @GetMapping("/posts")
    List<Post> getPosts();

    @GetMapping("/posts/{postId}")
    Post getPost(@PathVariable("postId") Integer postId);
}
