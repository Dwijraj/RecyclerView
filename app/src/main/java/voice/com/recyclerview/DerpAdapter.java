package voice.com.recyclerview;

import android.app.LauncherActivity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1405214 on 22-10-2016.
 */

public class DerpAdapter extends RecyclerView.Adapter<DerpAdapter.DerpHolder> {

    private List<List_item> ListData;
    private LayoutInflater inflater;


    public DerpAdapter(List<List_item> listData, Context c) {
        this.ListData = listData;
        this.inflater=LayoutInflater.from(c);
    }

    @Override
    public DerpHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view=inflater.inflate(R.layout.list_item,parent,false);

        return new DerpHolder(view);
    }

    @Override
    public void onBindViewHolder(DerpHolder holder, int position) {

        List_item list_item=ListData.get(position);
        holder.textView.setText(list_item.getText());
        holder.icon.setImageResource(list_item.getResid());
    }

    @Override
    public int getItemCount() {
        return ListData.size();
    }

    class DerpHolder extends RecyclerView.ViewHolder
    {
        private TextView textView;
        private ImageView icon;
        private View container;

        public DerpHolder(View itemView) {
            super(itemView);

            textView=(TextView) itemView.findViewById(R.id.item_text);
            icon=(ImageView) itemView.findViewById(R.id.item_icon);
            container=itemView.findViewById(R.id.container_item_root);

        }
    }




}

