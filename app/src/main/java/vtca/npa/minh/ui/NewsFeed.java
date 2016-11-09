package vtca.npa.minh.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsFeed extends AppCompatActivity {

    ListView lstPost;
    PostAdapter postAdapter;
    ArrayList<Post> posts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_feed);

        lstPost = (ListView) findViewById(R.id.lstPost);
        posts = Test.getTestPost();
        postAdapter = new PostAdapter(this, R.layout.cell_post, posts);
        lstPost.setAdapter(postAdapter);
    }

    class PostAdapter extends ArrayAdapter<Post> {
        private Context context;
        private ArrayList<Post> posts;
        private int resource;

        public PostAdapter(Context context, int resource, ArrayList<Post> posts) {
            super(context, resource, posts);
            this.context = context;
            this.posts = posts;
            this.resource = resource;
        }

        @Override
        public int getCount() {
            return posts.size();
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            View v = inflater.inflate(resource, null);

            ImageView avt = (ImageView) v.findViewById(R.id.avt);
            TextView name = (TextView) v.findViewById(R.id.name);
            TextView stt = (TextView) v.findViewById(R.id.stt);

            Post p = posts.get(position);
            avt.setImageResource(p.getPhoto());
            name.setText(p.getName());
            stt.setText(p.getStt());

            return v;
        }
    }
}