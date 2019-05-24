package com.example.tabla_periodica;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter {
    Context mContext;
    LayoutInflater inflater;
    List<Elemento_id> ElementList;
    ArrayList<Elemento_id> arrayList;

    //constructor
    public ListViewAdapter(Context context, List<Elemento_id> elementList) {
        mContext = context;
        this.ElementList = elementList;
        inflater = LayoutInflater.from(mContext);
        this.arrayList = new ArrayList<Elemento_id>();
        this.arrayList.addAll(elementList);
    }

    public class ViewHolder{
        TextView mTitleTv, mDescTv;
        ImageView mIconIv;
    }

    @Override
    public int getCount() {
        return ElementList.size();
    }

    @Override
    public Object getItem(int i) {
        return ElementList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int postition, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view==null){
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.rows, null);

            //locate the views in row.xml
            holder.mTitleTv = view.findViewById(R.id.mainTitle);
            holder.mIconIv = view.findViewById(R.id.mainIcon);

            view.setTag(holder);
        }
        else {
            holder = (ViewHolder)view.getTag();
        }
        //set the results into textviews
        holder.mTitleTv.setText(ElementList.get(postition).getNombre());

        //set the result in imageview
        //holder.mIconIv.setImageResource(ElementList.get(postition));

        //listview item clicks
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code later
                Intent intent = new Intent(mContext, Vista.class);
                intent.putExtra("Elemento",ElementList.get(postition).getId());
                mContext.startActivity(intent);

            }
        });


        return view;
    }

    /*filter
    public void filter(String charText){
        charText = charText.toLowerCase(Locale.getDefault());
        ElementList.clear();
        if (charText.length()==0){
            ElementList.addAll(arrayList);
        }
        else {
            for (Elemento_id model : arrayList){
                if (model.getTitle().toLowerCase(Locale.getDefault())
                        .contains(charText)){
                    modellist.add(model);
                }
            }
        }
        notifyDataSetChanged();
    }*/
}
