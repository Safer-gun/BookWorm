package com.jnu.bookworm;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.jnu.bookworm.base.Book;

public class BookDesActivity extends AppCompatActivity {
    private TextView booktitle;
    private TextView bookauthor;
    private ImageView bookcover;
    private TextView bookisbn;
    private TextView bookintro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_des);
        booktitle=(TextView) findViewById(R.id.bookdestitle);
        bookauthor=(TextView)findViewById(R.id.bookdesauthor);
        bookcover=(ImageView)findViewById(R.id.bookdescover);
        bookisbn=(TextView)findViewById(R.id.bookdesisbn);
        bookintro=(TextView)findViewById(R.id.bookdesjianjie);


        Bundle b=getIntent().getExtras();
        Book book=(Book)b.getSerializable("book");
        booktitle.setText(book.getTitle());
        bookintro.setText(book.getJianjie());
        Glide.with(this).load(book.getHeadId()).into(bookcover);
//        bookcover.setImageResource(book.getHeadId());向诸葛亮借智慧


//        Intent intent=getIntent();
//        String booktitle=intent.getStringExtra("title");
//        String bookjianjie=intent.getStringExtra("jianjie");
//        String bookcover=intent.getStringExtra("head");


    }
}