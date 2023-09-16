package com.example.oop;

public class images {
}
//import android.graphics.Bitmap;
//        import android.graphics.BitmapFactory;
//        import android.os.AsyncTask;
//        import android.os.Bundle;
//        import android.support.v7.app.AppCompatActivity;
//        import android.view.View;
//        import android.widget.Button;
//        import android.widget.ImageView;
//        import java.io.InputStream;
//        import java.net.HttpURLConnection;
//        import java.net.URL;
//
//public class ImageDisplayActivity extends AppCompatActivity {
//
//    private ImageView imageView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_image_display);
//
//        imageView = findViewById(R.id.imageView);
//
//        // Define buttons and their corresponding image URLs
//        Button button1 = findViewById(R.id.button1);
//        Button button2 = findViewById(R.id.button2);
//        Button button3 = findViewById(R.id.button3);
//        Button button4 = findViewById(R.id.button4);
//
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new DownloadImageTask().execute("URL_OF_IMAGE_1");
//            }
//        });
//
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new DownloadImageTask().execute("URL_OF_IMAGE_2");
//            }
//        });
//
//        button3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new DownloadImageTask().execute("URL_OF_IMAGE_3");
//            }
//        });
//
//        button4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new DownloadImageTask().execute("URL_OF_IMAGE_4");
//            }
//        });
//    }
//
//    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
//
//        @Override
//        protected Bitmap doInBackground(String... params) {
//            String imageUrl = params[0];
//            Bitmap image = null;
//
//            try {
//                URL url = new URL(imageUrl);
//                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//                connection.setDoInput(true);
//                connection.connect();
//                InputStream input = connection.getInputStream();
//                image = BitmapFactory.decodeStream(input);
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            return image;
//        }
//
//        @Override
//        protected void onPostExecute(Bitmap result) {
//            if (result != null) {
//                imageView.setImageBitmap(result);
//            }
//        }
//    }
//}
//
