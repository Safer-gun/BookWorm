package com.jnu.bookworm;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.jnu.bookworm.base.Book;
import com.jnu.bookworm.base.DataSaver;

import java.util.ArrayList;
import java.util.List;

public class SearchBookActivity2 extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_book2);

        recyclerView=findViewById(R.id.serch_recycleview_books);
        List<Book>bookList=new ArrayList<>();
        List<Book>searchbookList=new ArrayList<>();
        //查询书籍数据
        DataSaver dataSaver=new DataSaver();
        bookList=dataSaver.Load(this);

        Intent intent=getIntent();
        String bookktitle=intent.getStringExtra("booktitle");

        String bookk2title= "龙族";
//        Book book=new Book(bookktitle,R.drawable.book_2);
//        Book book2=new Book(bookk2title,R.drawable.book_2);
//        bookList.add(book);
//        bookList.add(book2);
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
            recyclerView.setAdapter(searchBookAdapter);
        }

    }
}