package org.example.section2.decorator._01_before;

public class SpamFilteringCommentService extends CommentService {

    @Override
    public void addComment(String comment) {
        if (comment.contains("http")) {
            return;
        }
        super.addComment(comment);
    }
}
