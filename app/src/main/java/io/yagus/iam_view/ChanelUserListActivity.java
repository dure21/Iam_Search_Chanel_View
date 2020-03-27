package io.yagus.iam_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import io.yagus.iam_view.databinding.ActivityChanelUserListBinding;

public class ChanelUserListActivity extends AppCompatActivity {

    private ChanelUserListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityChanelUserListBinding binding = ActivityChanelUserListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.recyclerView.setHasFixedSize(true);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ChanelUserListAdapter();
        binding.recyclerView.setAdapter(adapter);
    }
}
