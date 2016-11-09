package vtca.npa.minh.ui;

import java.util.ArrayList;

/**
 * Created by MINH on 8 Aug 2016.
 */
public class Test {
    public static ArrayList<Post> getTestPost() {
        ArrayList<Post> posts = new ArrayList<>();

        Post p1 = new Post("Nguyễn Phạm Anh Minh", R.drawable.minh,
                "Đừng nói câu lừa dối, đừng bắt anh phải mong chờ");
        Post p2 = new Post("Tony Stark", R.drawable.tony,
                "Đừng trách anh lặng thinh, vì rằng em đã vô tình");
        Post p3 = new Post("Steve Rogers", R.drawable.steve,
                "Qua ngày mai sẽ chỉ còn lại đây, trên con đường một mình anh đi");
        Post p4 = new Post("Bruce Banner", R.drawable.bruce,
                "Và sẽ không còn nữa, và sẽ không cần quay về");
        Post p5 = new Post("Thor", R.drawable.thor,
                "Sẽ không chờ em và đợi em yêu nữa!!!");
        Post p6 = new Post("Natasha Romanova", R.drawable.natasha,
                "Sẽ không còn gì, sẽ không còn gì đâu. Em yêu!");
        Post p7 = new Post("Clint Barton", R.drawable.clint,
                "Tại anh đã vô tâm hay tại anh không quan tâm em mỗi ngày. " +
                        "Để giờ đây khi lời anh nói em không tin anh nữa vậy");
        Post p8 = new Post("Peter Parker", R.drawable.peter,
                "Trong tình yêu, đôi lúc ta hay giận hờn anh biết. " +
                        "Nhưng anh thấy giờ em không còn yêu anh");
        Post p9 = new Post("Bucky Barnes", R.drawable.bucky,
                "Vậy thôi anh cho em đi về nơi em chưa bắt đầu. " +
                        "Nơi mà em khi chưa quen anh anh thấy em vui hơn nhiều");
        Post p10 = new Post("Vision", R.drawable.vision,
                "Anh xin lỗi, vì đã cướp mất khoảng trời của em. " +
                        "Nhưng có người sẽ cho em lại một bầu trời!");

        posts.add(p1);
        posts.add(p2);
        posts.add(p3);
        posts.add(p4);
        posts.add(p5);
        posts.add(p6);
        posts.add(p7);
        posts.add(p8);
        posts.add(p9);
        posts.add(p10);

        return posts;
    }
}
