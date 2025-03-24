package com.example.blogapp.controller;

import com.example.blogapp.dto.BlogDTO;
import com.example.blogapp.entity.Blog;
import com.example.blogapp.service.BlogService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@AllArgsConstructor
@RequestMapping("/api/blogs")
public class BlogController {

    private final BlogService blogService;

    @PostMapping
    public ResponseEntity<String> createBlog(@RequestBody Blog blog) {
        return ResponseEntity.ok(blogService.createBlog(blog));
    }

    @GetMapping
    public ResponseEntity<PagedModel<EntityModel<BlogDTO>>> getAllBlogs(
            Pageable pageable,
            PagedResourcesAssembler<BlogDTO> pagedResourcesAssembler) {
        Page<BlogDTO> blogs = blogService.getAllBlogs(pageable);
        return ResponseEntity.ok(pagedResourcesAssembler.toModel(blogs));
    }

    @GetMapping("/{id}")
    public ResponseEntity<BlogDTO> getBlogById(@PathVariable UUID id) {
        return ResponseEntity.ok(blogService.getBlogById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateBlog(@PathVariable UUID id, @RequestBody Blog blog) {
        return ResponseEntity.ok(blogService.updateBlog(id, blog));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBlog(@PathVariable UUID id) {
        return ResponseEntity.ok(blogService.deleteBlog(id));
    }
}
