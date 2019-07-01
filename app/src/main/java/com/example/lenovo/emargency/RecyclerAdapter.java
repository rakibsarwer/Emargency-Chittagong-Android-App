package com.example.lenovo.emargency;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;


import static android.content.ContentValues.TAG;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {



private Context context;
private String[]images;
private String[]titles;
private String[]details;
private String[]url;




public RecyclerAdapter(Context context, String[] images, String[] titles, String[] details, String[] url) {
        this.context=context;
        this.images=images;
        this.titles=titles;
        this.details=details;
        this.url=url;

        }


@Override
public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
        .inflate(R.layout.card_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;


        }

@Override
public void onBindViewHolder(final ViewHolder viewHolder, int i) {
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemDetail.setText(details[i]);
        viewHolder.itemImage.setText(images[i]);
    viewHolder.navManuBtn.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            PopupMenu popupMenu = new PopupMenu(context,viewHolder.navManuBtn);
            popupMenu.inflate(R.menu.manu_card_pop);
            popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                @Override
                public boolean onMenuItemClick(MenuItem item) {
                    switch (item.getItemId())
                    {

                        case R.id.menu1:
                            Intent callIntent = new Intent(Intent.ACTION_CALL);
                            callIntent.setData(Uri.parse(titles[viewHolder.getAdapterPosition()]));
                            context.startActivity(callIntent);
                            break;

                        case R.id.menu2:

                            Intent intent= new Intent(Intent.ACTION_VIEW);
                            intent.setData(Uri.parse(url[viewHolder.getAdapterPosition()]));
                            context.startActivity(intent);



                            break;
                        case R.id.menu3:

                            Intent intentt = new Intent(Intent.ACTION_SEND);
                            intentt.putExtra(Intent.EXTRA_TEXT, "Name :"
                                    + images[viewHolder.getAdapterPosition()] +
                                    "\n " + titles[viewHolder.
                                    getAdapterPosition()]+ "\n" + details[viewHolder.
                                    getAdapterPosition()]+ "\nMap Location : " + url[viewHolder.
                                    getAdapterPosition()]);
                            intentt.setType("text/plain");
                            context.startActivity(Intent.createChooser(intentt, "Send To"));

                            break;

                        default:
                            break;

                    }
                    return false;
                }
            });
            popupMenu.show();
        }
    });




        }

@Override
public int getItemCount() {
        return titles.length;
        }




static class ViewHolder extends RecyclerView.ViewHolder{

    public int currentItem;

    public TextView itemImage;
    public TextView itemTitle;
    public TextView itemDetail;
    public ImageButton itemUrl;
    public ImageButton navManuBtn;
    public ImageButton itemShare;


    public ViewHolder(View itemView) {

        super(itemView);
        itemImage = (TextView) itemView.findViewById(R.id.item_image);
        itemTitle = (TextView)itemView.findViewById(R.id.item_title);
        itemDetail =(TextView)itemView.findViewById(R.id.item_detail);
        //itemUrl= (ImageButton) itemView.findViewById(R.id.imageButton2);
        navManuBtn=(ImageButton)itemView.findViewById(R.id.imageButton);
       // itemShare=(ImageButton)itemView.findViewById(R.id.imageButton3);



        itemView.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                int position = getAdapterPosition();

                Snackbar.make(v, "Click detected on item " + position,
                        Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });
    }
}




}
