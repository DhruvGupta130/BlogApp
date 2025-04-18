package com.example.blogapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private UUID id;
    private String title;
    private String author;
    private String content;
}
