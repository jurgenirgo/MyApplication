package com.example.jurgen.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailAct extends AppCompatActivity {
    TextView keajaibanTitle, keajaibanDesc;
    ImageView imgPoster;

    public final static String EXTRA_NAME = "extra_name";
    public final static String EXTRA_DESCRIPTION = "extra_description";
    public final static String EXTRA_PHOTO = "extra_image_data";
    public static final String EXTRA_REMARKS = "extra_remarks";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        keajaibanTitle = findViewById(R.id.keajaiban_item_name);
        keajaibanDesc = findViewById(R.id.keajaiban_item_description);
        imgPoster = findViewById(R.id.img_item_photo);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        String title = getIntent().getStringExtra(EXTRA_NAME);
        String remarks = getIntent().getStringExtra(EXTRA_REMARKS);
        String desc = getIntent().getStringExtra(EXTRA_DESCRIPTION);
        String photo = getIntent().getStringExtra(EXTRA_PHOTO);

        keajaibanTitle.setText(title);
        keajaibanDesc.setText(remarks + "\n\n" + desc);

        Glide.with(this)
                .load(photo)
                .into(imgPoster);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home)
            finish();

        return super.onOptionsItemSelected(item);
    }
}
