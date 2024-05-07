package org.example.section2.decorator._01_before;

public class TrimmingCommentService extends CommentService {

    @Override
    public void addComment(String comment) {
        System.out.println(trim(comment));
    }

    private String trim(String comment) {

        return comment.replace("...", "");
    }

}
