package com.deemiensa.searchwithphp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText searchText;
    private Button searhBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchText = findViewById(R.id.search_text);
        searhBtn = findViewById(R.id.btn);

        searhBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String key = searchText.getText().toString();

                SearchBackgroundWorker searchBackgroundWorker = new SearchBackgroundWorker(MainActivity.this);
                searchBackgroundWorker.execute("post", key);
            }
        });
    }
}
