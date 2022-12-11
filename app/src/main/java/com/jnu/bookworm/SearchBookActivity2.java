package com.jnu.bookworm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jnu.bookworm.base.Book;
import com.jnu.bookworm.base.DataSaver;

import java.io.Serializable;
import java.util.ArrayList;

public class SearchBookActivity2 extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_book2);

        recyclerView=findViewById(R.id.serch_recycleview_books);
        ArrayList<Book>bookList=new ArrayList<>();
        ArrayList<Book>searchbookList=new ArrayList<>();
        //查询书籍数据
        DataSaver dataSaver=new DataSaver();
        bookList=dataSaver.Load(this);

        Intent intent=getIntent();
        String bookktitle=intent.getStringExtra("booktitle");

        for(Book book:bookList){
            if (book.getTitle().equals(bookktitle)) {
                searchbookList.add(book);
            }
        }
        if ((searchbookList.size()==0)) {
            Toast.makeText(this,"没有相关书籍",Toast.LENGTH_SHORT).show();
        }
        else{
            LinearLayoutManager layoutManager=new LinearLayoutManager(this);
            recyclerView.setLayoutManager(layoutManager);
            SearchBookAdapter searchBookAdapter=new SearchBookAdapter(searchbookList);
            searchBookAdapter.setmOnItemClickListener(new SearchBookAdapter.OnItemClickListener() {
                @Override
                public void onItemClick(View view, int position) {
                    Intent intent=new Intent(SearchBookActivity2.this,BookDesActivity.class);
                    Bundle b=new Bundle();
                    b.putSerializable("book",(Serializable)searchbookList.get(position));
                    intent.putExtras(b);
                    startActivity(intent);
                }
            });
            recyclerView.setAdapter(searchBookAdapter);
        }

    }
}