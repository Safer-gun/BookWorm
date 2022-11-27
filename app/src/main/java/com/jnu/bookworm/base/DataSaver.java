package com.jnu.bookworm.base;

import android.content.Context;

import androidx.annotation.NonNull;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DataSaver {
    public void save(Context context, ArrayList<Book> data){
        try{
            FileOutputStream dataStream=context.openFileOutput("mydata.dat",Context.MODE_PRIVATE);
            ObjectOutputStream out=new ObjectOutputStream(dataStream);
            out.writeObject(data);
            out.close();
            dataStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @NonNull
    public ArrayList<Book> Load(Context context){
        ArrayList<Book>data=new ArrayList<>();
        try{
            FileInputStream filein=context.openFileInput("mydata.dat");
            ObjectInput in=new ObjectInputStream(filein);

            data=(ArrayList<Book>)in.readObject();
            in.close();
            filein.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}
