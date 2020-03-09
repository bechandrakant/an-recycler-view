package com.ppstudios.recyclerviewdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;

import com.ppstudios.recyclerviewdemo.adapters.RecipeAdapter;
import com.ppstudios.recyclerviewdemo.models.RecipeModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.recycler_view);

        ArrayList<RecipeModel> recipes = new ArrayList<>();

        recipes.add(new RecipeModel(R.drawable.ic_launcher_background, "Something"));
        recipes.add(new RecipeModel(R.drawable.ic_launcher_background, "Something"));
        recipes.add(new RecipeModel(R.drawable.ic_launcher_background, "Something"));
        recipes.add(new RecipeModel(R.drawable.ic_launcher_background, "Something"));
        recipes.add(new RecipeModel(R.drawable.ic_launcher_background, "Something"));
        recipes.add(new RecipeModel(R.drawable.ic_launcher_background, "Something"));
        recipes.add(new RecipeModel(R.drawable.ic_launcher_background, "Something"));
        recipes.add(new RecipeModel(R.drawable.ic_launcher_background, "Something"));
        recipes.add(new RecipeModel(R.drawable.ic_launcher_background, "Something"));
        recipes.add(new RecipeModel(R.drawable.ic_launcher_background, "Something"));
        recipes.add(new RecipeModel(R.drawable.ic_launcher_background, "Something"));
        recipes.add(new RecipeModel(R.drawable.ic_launcher_background, "Something"));

        RecipeAdapter recipeAdapter = new RecipeAdapter(recipes, this);
        recyclerView.setAdapter(recipeAdapter);

        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3,
                StaggeredGridLayoutManager.VERTICAL));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.gridLayout:
                recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
                break;
            case R.id.linearLayout:
                recyclerView.setLayoutManager(new LinearLayoutManager(this));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
