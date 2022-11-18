package com.ghartur.blogserver.repository;

import com.ghartur.blogserver.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
