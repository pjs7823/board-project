package org.practice.boardproject1.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
@Table(indexes= {
        @Index(columnList = "title"),
        @Index(columnList = "hashtag"),
        @Index(columnList = "createdBy"),
        @Index(columnList = "createdBy")
})
@Entity

public class ArticleComment {
    private Long id; // 댓글 ID
    private Article article; // 게시글 ID
    private String content; // 댓글 본문

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
