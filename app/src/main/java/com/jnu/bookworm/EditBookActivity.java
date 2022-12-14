package com.jnu.bookworm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class EditBookActivity extends AppCompatActivity {
    String i="12";
    public static final int CODE_SUCCESS = 666;
    private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_book);
        position=this.getIntent().getIntExtra("position",0);
        String title=this.getIntent().getStringExtra("title");
        String jianjie=this.getIntent().getStringExtra("jianjie");
        String bookcover=this.getIntent().getStringExtra("bookcover");
        String bookisbn=this.getIntent().getStringExtra("isbn");
        String bookauthor=this.getIntent().getStringExtra("author");
        EditText editTextTitle=findViewById(R.id.editTextbooktitle);
        EditText editJianjie=findViewById(R.id.editbookjianjie);
        EditText editbookcover=findViewById(R.id.editTextbookcover);
        EditText editbookisbn=findViewById(R.id.editbookisbn);
        EditText editbookauthor=findViewById(R.id.editTextbookauthor);


        if((null!=title)){
            editTextTitle.setText(title);
        }
        if((null!=bookcover)){
            editbookcover.setText(bookcover);
        }
        if((jianjie.equals("暂无简介"))){
            editJianjie.setText("");
        }
        else{
            editJianjie.setText(jianjie);
        }
        if((bookisbn.equals("暂未录入ISBN"))){
            editbookisbn.setText("");
        }
        else{
            editbookisbn.setText(bookisbn);
        }
        if((bookauthor.equals("暂未录入作者"))){
            editbookauthor.setText("");
        }
        else{
            editbookauthor.setText(bookauthor);
        }



        Button buttonOk=findViewById(R.id.edit_btn_yes);
        Button buttonNo=findViewById(R.id.edit_btn_no);
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                Bundle bundle=new Bundle();
                bundle.putString("title",editTextTitle.getText().toString());
                bundle.putString("bookcover",editbookcover.getText().toString());
                if(editJianjie.getText().toString().equals(""))
                {
                    bundle.putString("jianjie","暂无简介");
                }
                else
                {
                    bundle.putString("jianjie",editJianjie.getText().toString());
                }
                if(editbookisbn.getText().toString().equals(""))
                {
                    bundle.putString("isbn","暂未录入isbn");
                }
                else
                {
                    bundle.putString("isbn",editbookisbn.getText().toString());
                }
                if(editbookauthor.getText().toString().equals(""))
                {
                    bundle.putString("author","暂未录入作者");
                }
                else
                {
                    bundle.putString("author",editbookauthor.getText().toString());
                }
                bundle.putInt("position",position);
                intent.putExtras(bundle);
                setResult(CODE_SUCCESS,intent);
                EditBookActivity.this.finish();
            }
        });
        buttonNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditBookActivity.this.finish();
            }
        });
    }
}