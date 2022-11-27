package com.jnu.bookworm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SearchBookActivity extends AppCompatActivity {

    public static final int RESULT_CODE = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_book);

        EditText booktitle=findViewById(R.id.searchbooktitle);
        Button buttonOk=findViewById(R.id.search_btn_yes);
        Button buttonNo=findViewById(R.id.search_btn_no);
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent search2=new Intent();
//                Bundle bundle=new Bundle();
//                bundle.putString("title",BookTitle.getText().toString());
//                search2.putExtras(bundle);
//                setResult(RESULT_CODE,search2);
                Intent intent1=new Intent(SearchBookActivity.this, SearchBookActivity2.class);
                intent1.putExtra("booktitle",booktitle.getText().toString());
                startActivity(intent1);
//                Intent intent=new Intent();
//                Bundle bundle=new Bundle();
//                bundle.putString("title",BookTitle.getText().toString());
//                intent.putExtras(bundle);
//                setResult(RESULT_CODE,intent);
//                SearchBookActivity.this.finish();

            }
        });
        buttonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SearchBookActivity.this.finish();
            }
        });

    }
}