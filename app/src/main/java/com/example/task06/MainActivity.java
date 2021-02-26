package com.example.task06;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements BottomSheetDialog.BottomSheetListener {
    private Button mbtnOpenBottomSheet;
    private TextView mtextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtextView = findViewById(R.id.text_view_model_bottom);

        mbtnOpenBottomSheet = findViewById(R.id.button_open_model_bottom);
        mbtnOpenBottomSheet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog();
                bottomSheetDialog.show(getSupportFragmentManager(),"Bottom Sheet Dialog");
            }
        });
    }

    @Override
    public void onButtonClicked(String text) {
        mtextView.setText(text);
    }
}