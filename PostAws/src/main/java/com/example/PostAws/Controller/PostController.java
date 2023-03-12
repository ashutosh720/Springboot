package com.example.PostAws.Controller;


import com.example.PostAws.Model.Post;
import com.example.PostAws.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("/all")
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }

    @PostMapping("/")
    public void addPost(@RequestBody Post post) {
        postService.addPost(post);
    }
}