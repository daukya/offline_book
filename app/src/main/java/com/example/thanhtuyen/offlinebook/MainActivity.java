package com.example.thanhtuyen.offlinebook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvSach;
    ArrayList<Sach> mangTheLoaiSach;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvSach = (ListView) findViewById(R.id.listViewSach);
        mangTheLoaiSach = new ArrayList<Sach>();

        mangTheLoaiSach.add(new Sach("Short Stories",23));
        mangTheLoaiSach.add(new Sach("Science Fiction",14));
        mangTheLoaiSach.add(new Sach("Action & adventure",52));
        mangTheLoaiSach.add(new Sach("Romance",57));
        mangTheLoaiSach.add(new Sach("Horror",76));

        SachAdapter adapter = new SachAdapter(
          MainActivity.this,
                R.layout.dong_the_loai,
                mangTheLoaiSach
        );
        lvSach.setAdapter(adapter);

    }
}
