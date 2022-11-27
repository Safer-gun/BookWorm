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
        EditText editTextTitle=findViewById(R.id.editTextbooktitle);
        EditText editJianjie=findViewById(R.id.editbookjianjie);

        if((null!=title)){
            editTextTitle.setText(title);
        }
        if((jianjie.equals("暂无简介"))){
            editJianjie.setText("");
        }
        else{
            editJianjie.setText(jianjie);
        }



        Button buttonOk=findViewById(R.id.edit_btn_yes);
        Button buttonNo=findViewById(R.id.edit_btn_no);
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                Bundle bundle=new Bundle();
                bundle.putString("title",editTextTitle.getText().toString());
                if(editJianjie.getText().toString().equals(""))
                {
                    bundle.putString("jianjie","暂无简介");
                }
                else
                {
                    bundle.putString("jianjie",editJianjie.getText().toString());
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