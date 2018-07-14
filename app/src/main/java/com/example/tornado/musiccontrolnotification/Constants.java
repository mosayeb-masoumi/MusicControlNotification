package com.example.tornado.musiccontrolnotification;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by Tornado on 7/14/2018.
 */

public class Constants {
    public interface ACTION {
        public static String MAIN_ACTION = "com.example.tornado.musiccontrolnotification.main";
        public static String INIT_ACTION = "com.example.tornado.musiccontrolnotification.init";
        public static String PREV_ACTION = "com.example.tornado.musiccontrolnotification.prev";
        public static String PLAY_ACTION = "com.example.tornado.musiccontrolnotification.play";
        public static String NEXT_ACTION = "com.example.tornado.musiccontrolnotification.next";
        public static String STARTFOREGROUND_ACTION = "com.example.tornado.musiccontrolnotification.startforeground";
        public static String STOPFOREGROUND_ACTION = "com.example.tornado.musiccontrolnotification.stopforeground";

    }

    public interface NOTIFICATION_ID {
        public static int FOREGROUND_SERVICE = 101;
    }

    public static Bitmap getDefaultAlbumArt(Context context) {
        Bitmap bm = null;
        BitmapFactory.Options options = new BitmapFactory.Options();
        try {
            bm = BitmapFactory.decodeResource(context.getResources(),
                    R.drawable.default_album_art, options);
        } catch (Error ee) {
        } catch (Exception e) {
        }
        return bm;
    }
}
