package vtca.npa.minh.ui;

import android.graphics.drawable.Drawable;

/**
 * Created by MINH on 8 Aug 2016.
 */
public class Post {
    private String name;
    private int resPhoto;
    private String stt;

    public Post(String name, int resPhoto, String stt) {
        this.name = name;
        this.resPhoto = resPhoto;
        this.stt = stt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoto() {
        return resPhoto;
    }

    public void setPhoto(int photo) {
        this.resPhoto = resPhoto;
    }

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }
}
