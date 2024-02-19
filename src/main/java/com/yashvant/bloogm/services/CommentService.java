package com.yashvant.bloogm.services;

import com.yashvant.bloogm.payloads.CommentDto;

public interface CommentService {

	CommentDto createComment(CommentDto commentDto, Integer postId);

	void deleteComment(Integer commentId);

}
