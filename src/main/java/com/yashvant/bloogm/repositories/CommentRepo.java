package com.yashvant.bloogm.repositories;

import com.yashvant.bloogm.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
