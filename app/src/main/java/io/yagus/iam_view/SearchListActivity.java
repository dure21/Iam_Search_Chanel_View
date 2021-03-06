package io.yagus.iam_view;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import io.yagus.iam_view.databinding.ActivitySearchListBinding;

public class SearchListActivity extends AppCompatActivity {

    ActivitySearchListBinding binding;

    private ChanelListAdapter adapter;

    String[] spinner_str = {"최신순", "참여인원많은순"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySearchListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btChanelList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.btUserList.setCardBackgroundColor(Color.parseColor("#7E57C2"));
                binding.btChanelList.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                binding.etSearch.setHint("채널을 검색하세요");
                binding.userOptionSet.setVisibility(View.INVISIBLE);
                binding.channelOptionSet.setVisibility(View.VISIBLE);
            }
        });

        binding.btUserList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.btChanelList.setCardBackgroundColor(Color.parseColor("#7E57C2"));
                binding.btUserList.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                binding.etSearch.setHint("유저를 검색하세요");
                binding.userOptionSet.setVisibility(View.VISIBLE);
                binding.channelOptionSet.setVisibility(View.INVISIBLE);

            }
        });


        final ArrayAdapter<String> adpter = new ArrayAdapter<String> (this,R.layout.support_simple_spinner_dropdown_item,spinner_str){
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View v = super.getView(position, convertView, parent);
                ((TextView)v).setTextColor(Color.parseColor("#7E57C2"));
                return v;
            }

            @Override
            public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                View v = super.getDropDownView(position, convertView, parent);
                ((TextView)v).setTextColor(Color.parseColor("#7E57C2"));
                return v;
            }
        };
        binding.spinner.setAdapter(adpter);

        binding.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(binding.spinner.getSelectedItemPosition()>0) {
                    Log.v("알림", binding.spinner.getSelectedItem().toString()+"is selected");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        binding.btMoveToCreateChanel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CreateChannelActivity.class);
                startActivity(intent);
            }
        });

        binding.btUserFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        binding.recyclerView.setHasFixedSize(true);
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ChanelListAdapter();
        binding.recyclerView.setAdapter(adapter);
    }
}
