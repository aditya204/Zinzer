package com.example.lutto;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;




public class CategoryAdaptor extends RecyclerView.Adapter<CategoryAdaptor.ViewHolder> {

    private List<CategoryModel> categoryModelList;


    public CategoryAdaptor(List<CategoryModel> categoryModelList) {
        this.categoryModelList = categoryModelList;
    }

    @NonNull
    @Override


    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i ) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.category_item,viewGroup,false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdaptor.ViewHolder viewHolder, int position) {

        int image =categoryModelList.get(position).getCategoryImagelink();
        String name=categoryModelList.get(position).getCategoryName();
        viewHolder.setCategory(name);
        viewHolder.setCategoryImage( image );

    }

    @Override
    public int getItemCount() {
        return categoryModelList.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder{


        private ImageView categoryImage;
        private TextView categoryName;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            categoryImage=itemView.findViewById(R.id.category_image);
            categoryName=itemView.findViewById(R.id.category_name);

        }

        private void setCategoryImage(int resource){
            categoryImage.setImageResource( resource );


        }

        private void setCategory(final String name){
            categoryName.setText(name);
            itemView.setOnClickListener( new View.OnClickListener( ) {
                @Override
                public void onClick(View view) {
                    Intent categoryIntent=new Intent( itemView.getContext(), Category_Restaurant_Activity.class);
                    categoryIntent.putExtra( "CategoryName",name );
                    itemView.getContext().startActivity(categoryIntent);
                }
            } );

        }




    }

}


