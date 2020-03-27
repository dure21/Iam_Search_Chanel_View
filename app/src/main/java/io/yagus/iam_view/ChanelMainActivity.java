package io.yagus.iam_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import io.yagus.iam_view.databinding.ActivityChanelMainBinding;
import io.yagus.iam_view.databinding.ActivityCreateChannelBinding;

public class ChanelMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityChanelMainBinding binding = ActivityChanelMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btChanelUserList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ChanelUserListActivity.class);
                startActivity(intent);
            }
        });
    }
}
