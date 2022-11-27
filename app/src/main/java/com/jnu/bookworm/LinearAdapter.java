package com.jnu.bookworm;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.jnu.bookworm.base.Book;

import java.util.ArrayList;

public class LinearAdapter extends RecyclerView.Adapter<LinearAdapter.LinearViewHolder>{
    public static final int MENU_ID_1 = 1;
    public static final int MENU_ID_2 = 2;
    private ArrayList<Book> bookList;

    private OnItemClickListener mOnItemClickListener;//声明点击时间对象名称

    //设置点击时间对象
    public void setmOnItemClickListener(OnItemClickListener listener){
        this.mOnItemClickListener=listener;
    }



    public LinearAdapter(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    private Context mContext;
    public LinearAdapter(Context context){
        this.mContext=context;
    }

    @NonNull
    @Override
    //加载布局
    public LinearAdapter.LinearViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview=LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_linear_item,parent,false);
        LinearViewHolder myViewHoder=new LinearViewHolder(itemview);
        return myViewHoder;
    }

    @Override
    //设置数据
    public void onBindViewHolder(@NonNull LinearAdapter.LinearViewHolder holder, int position) {
        Book book=bookList.get(position);
        holder.title.setText(book.getTitle());
        holder.head.setImageResource(book.getHeadId());

        holder.jianjie.setText(book.getJianjie());
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    public interface OnItemClickListener{//定义点击事件回调接口
        void onItemClick(View view,int position);
    }

    class LinearViewHolder extends RecyclerView.ViewHolder implements View.OnCreateContextMenuListener, View.OnClickListener {
        TextView title;
        ImageView head;
        TextView jianjie;

        public LinearViewHolder(@NonNull View itemView) {
            super(itemView);
            this.title = itemView.findViewById(R.id.text_view_book_title);
            this.head = itemView.findViewById(R.id.image_view_book_cover);
            this.jianjie=itemView.findViewById(R.id.text_view_book_jianjie);
            itemView.setOnCreateContextMenuListener(this);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            contextMenu.add(0, MENU_ID_1,getAdapterPosition(),"Update");
            contextMenu.add(0, MENU_ID_2,getAdapterPosition(),"Delete");

        }

        @Override
        public void onClick(View view) {
            //点击事件对象调用方法
            if(mOnItemClickListener!=null){
                mOnItemClickListener.onItemClick(view,getAdapterPosition());
//                Toast.makeText(itemView.getContext(),"点击了第"+getAdapterPosition()+1+"个",Toast.LENGTH_SHORT).show();
            }
        }
    }
}
