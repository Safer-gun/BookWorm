package com.jnu.bookworm;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.jnu.bookworm.base.Book;

import java.util.ArrayList;

public class SearchBookAdapter extends RecyclerView.Adapter<SearchBookAdapter.MyViewHolder>{
    private ArrayList<Book> bookList;

    public SearchBookAdapter(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    private SearchBookAdapter.OnItemClickListener mOnItemClickListener;//声明点击时间对象名称

    //设置点击时间对象
    public void setmOnItemClickListener(SearchBookAdapter.OnItemClickListener listener){
        this.mOnItemClickListener=listener;
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
        holder.jianjie.setText(book.getJianjie());

    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }


    public interface OnItemClickListener{//定义点击事件回调接口
        void onItemClick(View view,int position);
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        ImageView head;
        TextView jianjie;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.title = itemView.findViewById(R.id.text_view_book_title);
            this.head = itemView.findViewById(R.id.image_view_book_cover);
            this.jianjie=itemView.findViewById(R.id.text_view_book_jianjie);
        }
        public void onClick(View view) {
            //点击事件对象调用方法
            if(mOnItemClickListener!=null){
                mOnItemClickListener.onItemClick(view,getAdapterPosition());
            }
        }

        }
}
