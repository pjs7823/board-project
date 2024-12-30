package org.practice.boardproject1;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link org.practice.boardproject1.domain.Article}
 */
public record ArticleDto(String title,
                         String content,
                         String hashtag,
                         LocalDateTime createdAt,
                         String createdBy,
                         LocalDateTime modifiedAt,
                         String modifiedBy
) implements Serializable {
}