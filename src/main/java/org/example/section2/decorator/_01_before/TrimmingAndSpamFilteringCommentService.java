package org.example.section2.decorator._01_before;

public class TrimmingAndSpamFilteringCommentService extends CommentService {

    @Override
    public void addComment(String comment) {

        if (comment.contains("http")) {
            return;
        }
        super.addComment(trim(comment));
    }

    private String trim(String comment) {

        return comment.replace("...", "");
    }
}
