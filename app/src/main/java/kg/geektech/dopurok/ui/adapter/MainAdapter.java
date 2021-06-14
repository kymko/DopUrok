package kg.geektech.dopurok.ui.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import kg.geektech.dopurok.R;
import kg.geektech.dopurok.model.Users;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    private ArrayList<Users> name = new ArrayList<>();

    public void AddItems(ArrayList<Users> list){
        this.name.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(name.get(position));

    }

    @Override
    public int getItemCount() {
        return name.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView txtName,txtFio;
        ImageView imgLogo;
        
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txt_item_name);
            txtFio = itemView.findViewById(R.id.txt_item_fio);
            imgLogo = itemView.findViewById(R.id.img_logo);
        }

        public void onBind(Users user) {
            txtName.setText(user.getName());
            txtFio.setText(user.getFio());
            imgLogo.setImageResource(user.getImage());
        }
    }
}
