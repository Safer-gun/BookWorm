package com.jnu.bookworm;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.jnu.bookworm.base.Book;

import java.util.List;

public class SearchBookAdapter extends RecyclerView.Adapter<SearchBookAdapter.MyViewHolder>{
    private List<Book> bookList;

    public SearchBookAdapter(List<Book> bookList) {
        this.bookList = bookList;
    }
    private Context mContext;
    public SearchBookAdapter(Context context){
        this.mContext=context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_linear_item,parent,false);
        MyViewHolder myViewHolder=new MyViewHolder(itemView);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Book book=bookList.get(position);
        holder.title.setText(book.getTitle());
//        holder.head.setImageResource(book.getHeadId());
        Glide.with(holder.itemView).load(book.getHeadId()).into(holder.head);
//        holder..setText(book.getJianjie());

    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView head;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.title = itemView.findViewById(R.id.text_view_book_title);
            this.head = itemView.findViewById(R.id.image_view_book_cover);
        }

        }
}
