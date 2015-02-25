package com.android.sneha.chat_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by sneha on 25/2/15.
 */
public class ChatAdapter extends ArrayAdapter<String> {


    protected Context mContext;
    protected String[] sName, mMssg;


    public ChatAdapter(Context context, String[] name, String[] message) {
        super(context, R.layout.adapterchat, name);
        mContext = context;
        sName = name;
        mMssg = message;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        if(convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.adapterchat, null);
            holder = new ViewHolder();
            holder.text1 = (TextView)convertView.findViewById(R.id.mssgSender);
            holder.text2 = (TextView)convertView.findViewById(R.id.mssg);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder)convertView.getTag();
        }
        holder.text1.setText(sName[position]);
        holder.text2.setText(mMssg[position]);

        return convertView;
    }

    private  class ViewHolder{
        TextView text1;
        TextView text2;

    }
}
