package com.example.blogapp.controller;

import com.example.blogapp.dto.BlogDTO;
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
@RequestMapping("/api/user")
public class UserController {

    private final BlogService blogService;

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

    @PostMapping("/summarize/{id}")
    public ResponseEntity<String> summarizeBlog(@PathVariable UUID id) {
        return ResponseEntity.ok(blogService.summarizeBlog(id));
    }
}
