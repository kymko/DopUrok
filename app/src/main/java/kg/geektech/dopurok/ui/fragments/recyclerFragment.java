package kg.geektech.dopurok.ui.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import kg.geektech.dopurok.model.Users;
import kg.geektech.dopurok.ui.adapter.MainAdapter;
import kg.geektech.dopurok.R;


public class recyclerFragment extends Fragment {

    private RecyclerView recyclerView;
    private MainAdapter mainAdapter = new MainAdapter();
    private ArrayList<Users> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_recycler, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        creatList();
        initRecycler(view);
    }

    private void initRecycler(View view) {
        recyclerView = view.findViewById(R.id.recycler_rv);

        mainAdapter.AddItems(list);

        recyclerView.setAdapter(mainAdapter);
    }

    private void creatList() {
       list.add(new Users("Abdy","Abdilazov", R.drawable.ic_launcher_background));
       list.add(new Users("Abdy","Abdilazov", R.drawable.ic_launcher_background));
       list.add(new Users("Abdy","Abdilazov", R.drawable.ic_launcher_background));
       list.add(new Users("Abdy","Abdilazov", R.drawable.ic_launcher_background));
       list.add(new Users("Abdy","Abdilazov", R.drawable.ic_launcher_background));
       list.add(new Users("Abdy","Abdilazov", R.drawable.ic_launcher_background));
       list.add(new Users("Abdy","Abdilazov", R.drawable.ic_launcher_background));
       list.add(new Users("Abdy","Abdilazov", R.drawable.ic_launcher_background));
       list.add(new Users("Abdy","Abdilazov", R.drawable.ic_launcher_background));
       list.add(new Users("Abdy","Abdilazov", R.drawable.ic_launcher_background));
       list.add(new Users("Abdy","Abdilazov", R.drawable.ic_launcher_background));
       list.add(new Users("Abdy","Abdilazov", R.drawable.ic_launcher_background));
       list.add(new Users("Abdy","Abdilazov", R.drawable.ic_launcher_background));
       list.add(new Users("Abdy","Abdilazov", R.drawable.ic_launcher_background));
       list.add(new Users("Abdy","Abdilazov", R.drawable.ic_launcher_background));
       list.add(new Users("Abdy","Abdilazov", R.drawable.ic_launcher_background));
       list.add(new Users("Abdy","Abdilazov", R.drawable.ic_launcher_background));
       list.add(new Users("Abdy","Abdilazov", R.drawable.ic_launcher_background));
       list.add(new Users("Abdy","Abdilazov", R.drawable.ic_launcher_background));
    }
}