package com.jnu.bookworm;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jnu.bookworm.base.BaseActivity;
import com.jnu.bookworm.base.Book;
import com.jnu.bookworm.base.DataSaver;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends BaseActivity {

    public static final int MENU_ID_UPDATE = LinearAdapter.MENU_ID_1;
    public static final int MENU_ID_DELETE = LinearAdapter.MENU_ID_2;
    private DrawerLayout drawerLayout;
    private RecyclerView mRvMain;
    private ArrayList<Book> bookList = new ArrayList<Book>();



    private LinearAdapter linearAdapter;
    private ImageButton imgbtn2;
    private ImageButton imgbtn;
    private ImageButton mimgbtn;
    private Button drawsearchbtn;
    private Button drawbooksbtn;





    private ActivityResultLauncher<Intent>addDataLaunher=registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
            result -> {
                if (null!=result) {
                    Intent intent=result.getData();
                    if (result.getResultCode()==EditBookActivity.CODE_SUCCESS) {
                        Bundle bundle=intent.getExtras();
                        String title= bundle.getString("title");
                        String jianjie=bundle.getString("jianjie");
                        String bookcover=bundle.getString("bookcover");
                        String bookisbn=bundle.getString("isbn");
                        String bookauthor=bundle.getString("author");

                        int n=bookList.size();
                        bookList.add(n,new Book(title,jianjie,bookcover,bookisbn,bookauthor));
                        new DataSaver().save(this,bookList);
                        linearAdapter.notifyItemInserted(n);

                    }
                }
            });

    private int item;
    private ActivityResultLauncher<Intent> UpdateDataLaunher=registerForActivityResult(new ActivityResultContracts.StartActivityForResult()
            ,result -> {
                if (null!=result) {
                    Intent intent=result.getData();
                    if (result.getResultCode()==EditBookActivity.CODE_SUCCESS) {
                        Bundle bundle=intent.getExtras();
                        int position=bundle.getInt("position");
                        String title= bundle.getString("title");
                        String jianjie=bundle.getString("jianjie");
                        String bookcover=bundle.getString("bookcover");
                        String bookisbn=bundle.getString("isbn");
                        String bookauthor=bundle.getString("author");
                        bookList.get(position).setTitle(title);
                        bookList.get(position).setIsbn(bookisbn);
                        bookList.get(position).setAuthor(bookauthor);

                        linearAdapter.notifyItemChanged(position);
                        bookList.get(position).setJianjie(jianjie);
                        linearAdapter.notifyItemChanged(position);
                        bookList.get(position).setHeadId(bookcover);
                        new DataSaver().save(this,bookList);

                    }
                }
            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //找到各个按钮
        imgbtn=(ImageButton)findViewById(R.id.title_imgbtn);
        imgbtn2=(ImageButton) findViewById(R.id.title_imgbtn2);
        mRvMain=(RecyclerView) findViewById(R.id.recycle_view_books);
        mimgbtn=(ImageButton) findViewById(R.id.main_imgbtn);
        drawerLayout=(DrawerLayout) findViewById(R.id.main_drawerLayout);
        drawsearchbtn=(Button)findViewById(R.id.draw_search);
        drawbooksbtn=(Button)findViewById(R.id.draw_books);
        //设置各个按钮的监听事件
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                drawerLayout.openDrawer(GravityCompat.START);
            }
        });

        imgbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this, SearchBookActivity.class);
                startActivity(intent1);
            }
        });

        mimgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(MainActivity.this,EditBookActivity.class);
                intent2.putExtra("jianjie","");
                intent2.putExtra("isbn","");
                intent2.putExtra("author","");
                addDataLaunher.launch(intent2);
            }
        });
        drawsearchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,SearchBookActivity.class);
                startActivity(intent1);
            }
        });
        drawbooksbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.closeDrawer(GravityCompat.START);
            }
        });
        //增加数据测试
        linearAdapter = new LinearAdapter(bookList);
        mRvMain.setLayoutManager(new LinearLayoutManager(MainActivity.this));
//        //文件读取和保存
        DataSaver dataSaver=new DataSaver();
        bookList=dataSaver.Load(this);
        linearAdapter=new LinearAdapter(bookList);
//设置每一个item的点击事件
        linearAdapter.setmOnItemClickListener(new LinearAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent=new Intent(MainActivity.this,BookDesActivity.class);
                Bundle b=new Bundle();
                b.putSerializable("book",(Serializable)bookList.get(position));
                intent.putExtras(b);
                startActivity(intent);
            }
        });
        mRvMain.setAdapter(linearAdapter);
    }
//加载成功之后显示数据
    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case MENU_ID_UPDATE:
                Intent intent2=new Intent(MainActivity.this,EditBookActivity.class);
                intent2.putExtra("position",item.getOrder());
                intent2.putExtra("title",bookList.get(item.getOrder()).getTitle());
                intent2.putExtra("jianjie",bookList.get(item.getOrder()).getJianjie());
                intent2.putExtra("bookcover",bookList.get(item.getOrder()).getHeadId());
                intent2.putExtra("isbn",bookList.get(item.getOrder()).getIsbn());
                intent2.putExtra("author",bookList.get(item.getOrder()).getAuthor());
                UpdateDataLaunher.launch(intent2);
                break;
            case MENU_ID_DELETE:
                AlertDialog alertDialog= new AlertDialog.Builder(this)
                        .setTitle("Confirmation")
                        .setMessage("Are you sure to delete this book?")
                        .setNegativeButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i){
                                bookList.remove(item.getOrder());
                                new DataSaver().save(MainActivity.this,bookList);
                                linearAdapter.notifyItemRemoved(item.getOrder());
                            }
                        }).setPositiveButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        }).create();
                alertDialog.show();
                break;
        }
        return super.onContextItemSelected(item);
    }

}