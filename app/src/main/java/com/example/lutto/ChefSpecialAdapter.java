package com.example.lutto;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChefSpecialAdapter extends RecyclerView.Adapter<ChefSpecialAdapter.ViewHolder> {

    private List<ChefSpecialModel> chefSpecialModelList;

    public ChefSpecialAdapter(List<ChefSpecialModel> chefSpecialModelList) {
        this.chefSpecialModelList = chefSpecialModelList;
    }

    @NonNull
    @Override
    public ChefSpecialAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from( parent.getContext() ).inflate( R.layout.chefspecial_item,parent,false );
        return new ViewHolder( view ) ;
    }

    @Override
    public void onBindViewHolder(@NonNull ChefSpecialAdapter.ViewHolder holder, int position) {
        int image=chefSpecialModelList.get( position ).getChefSpecialImage();
        String name=chefSpecialModelList.get( position ).getChefSpecialName();
        String restName=chefSpecialModelList.get( position ).getChefSpecialRestaurnt();

        holder.setChefSpecialImage( image );
        holder.setChefSpecialName( name );
        holder.setChefSpecialRestaurant( restName );

    }

    @Override
    public int getItemCount() {
        return chefSpecialModelList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView chefSpecialName;
        private TextView chefSpecialRestaurant;
        private ImageView chefSpecialImage;


        public ViewHolder(@NonNull View itemView) {
            super( itemView );


            chefSpecialImage=itemView.findViewById( R.id.chefSpecialImage );
            chefSpecialName=itemView.findViewById( R.id.chefSpecialName );
            chefSpecialRestaurant=itemView.findViewById( R.id.chefSpecialRestaurant );
        }

        private void setChefSpecialName(String name){
            chefSpecialName.setText( name );
        }

        private void setChefSpecialImage(int resource){
            chefSpecialImage.setImageResource( resource );
        }

        private void setChefSpecialRestaurant(String rest){
            chefSpecialRestaurant.setText( rest );
        }
    }
}
