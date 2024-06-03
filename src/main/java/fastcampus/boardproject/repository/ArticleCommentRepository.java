package fastcampus.boardproject.repository;

import fastcampus.boardproject.domain.Article;
import fastcampus.boardproject.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {

}
