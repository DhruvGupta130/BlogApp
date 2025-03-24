package com.example.blogapp.service;

import com.example.blogapp.dto.BlogDTO;
import com.example.blogapp.entity.Blog;
import com.example.blogapp.repository.BlogRepo;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class BlogService {

    private final BlogRepo blogRepo;
    private final OpenAiBlogService openAiBlogService;

    @CacheEvict(value = {"blogs", "allBlogs"}, allEntries = true)
    public String createBlog(Blog blog) {
        blogRepo.save(blog);
        return "Blog created Successfully";
    }

    @Cacheable(value = "allBlogs", key = "#pageable.pageNumber")
    public Page<BlogDTO> getAllBlogs(Pageable pageable) {
        return blogRepo.findAll(pageable).map(this::convertToDTO);
    }

    @Cacheable(value = "blogs", key = "#id")
    public BlogDTO getBlogById(UUID id) {
        return convertToDTO(blogRepo.findById(id).orElseThrow(() -> new RuntimeException("Blog not found")));
    }

    @CacheEvict(value = {"blogs", "allBlogs"}, allEntries = true)
    public String updateBlog(UUID id, Blog updatedBlog) {
        blogRepo.findById(id)
                .map(blog -> {
                    blog.setTitle(updatedBlog.getTitle());
                    blog.setContent(updatedBlog.getContent());
                    blog.setAuthor(updatedBlog.getAuthor());
                    return blogRepo.save(blog);
                })
                .orElseThrow(() -> new RuntimeException("Blog not found"));
        return "Blog updated Successfully";
    }

    @CacheEvict(value = {"blogs", "allBlogs"}, allEntries = true)
    public String deleteBlog(UUID id) {
        blogRepo.deleteById(id);
        return "Blog deleted Successfully";
    }

    private BlogDTO convertToDTO(Blog blog) {
        return new BlogDTO(blog.getId(), blog.getTitle(), blog.getAuthor(), blog.getContent());
    }

    public String summarizeBlog(UUID id) {
        Blog blog = blogRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Blog not found"));
        return openAiBlogService.summarizeBlog(blog.getContent());
    }
}
