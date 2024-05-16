package org.example.section2.decorator._02_after;

public class Application {

    private static boolean enabledSpamFiltering = true;
    private static boolean enabledTrimming = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if (enabledSpamFiltering) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }

        if (enabledTrimming) {
            commentService = new TrimmingCommentDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("write comment");
        client.writeComment("...제거 테스트...");
        client.writeComment("http://donghyun.me");
    }
}
