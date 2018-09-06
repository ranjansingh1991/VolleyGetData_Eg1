package in.semicolonindia.volleygetdata_eg1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by RANJAN SINGH on 9/11/2017.
 */

@SuppressWarnings("ALL")
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    List<Hero> item;
    Context context;


    public RecyclerAdapter(Context context, List<Hero> item) {
        this.context = context;
        this.item = item;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, null);
        return new ViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        holder.textViewTitle.setText(item.get(position).getName());
        //holder.textViewUrl.setImageResource(Integer.parseInt(item.get(position).getImageUrl()));
        // piccaso use to set image using volley..
        Picasso.with(context).load(item.get(position).getImageUrl()).resize(200, 100).into(holder.image_view);
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
            // Declear All variable...
        TextView textViewTitle;
        ImageView image_view;;

        public ViewHolder(View itemView) {
            super(itemView);
            // Intializing All Variable...
            textViewTitle = itemView.findViewById(R.id.txtTitle);
            image_view=itemView.findViewById(R.id.image_view);

        }
    }
}


