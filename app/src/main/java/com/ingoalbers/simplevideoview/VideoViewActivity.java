package com.ingoalbers.simplevideoview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class VideoViewActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_video_view);

    final VideoView videoView =
        (VideoView) findViewById(com.ingoalbers.simplevideoview.R.id.videoView);

    assert videoView != null;
    videoView.setVideoPath("http://clips.vorwaerts-gmbh.de/VfE_html5.mp4");
    videoView.start();
  }
}

