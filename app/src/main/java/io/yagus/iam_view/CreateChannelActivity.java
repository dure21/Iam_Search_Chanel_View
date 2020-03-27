package io.yagus.iam_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import io.yagus.iam_view.databinding.ActivityCreateChannelBinding;

public class CreateChannelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCreateChannelBinding binding = ActivityCreateChannelBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
