package org.example.section2.decorator._01_before;

public class Client {

    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }

    public static void main(String[] args) {

        Client client = new Client(new CommentService());
        client.writeComment("write comment");
        client.writeComment("...제거 테스트..."); // 여기서 필요없는 문자(...)을 trim 하고 싶을땐, 가장 쉬운 방법은 CommentService 클래스를 확장
        client.writeComment("http://donghyun.me");

        System.out.println();

        Client client2 = new Client(new TrimmingCommentService());
        client2.writeComment("write comment");
        client2.writeComment("...제거 테스트...");
        client2.writeComment("http://donghyun.me");
//        // 여기까지는 trim 이 잘 됨. 그런데 광고를 제거하고 싶다면? 다시 CommentService 클래스를 확장해야 한다.
//
//        System.out.println();
//
        Client client4 = new Client(new SpamFilteringCommentService());
        client4.writeComment("write comment");
        client4.writeComment("...제거 테스트...");
        client4.writeComment("http://donghyun.me"); // CommentService를 상속받으면, trim이 되지 않음 -> 상속의 문제점이 여기서 발견됨 (단일상속만 되기 때문에) -> trim + filtering을 또 만들어야 함
//        // -> Trim + SpamFilter를 하고 싶다면??
//
//        System.out.println();
//
        Client client3 = new Client(new TrimmingAndSpamFilteringCommentService());
        client3.writeComment("write comment");
        client3.writeComment("...제거 테스트...");
        client3.writeComment("http://donghyun.me");
        // 그런데 다른 요구사항이 점차 추가된다면...?
    }
}
