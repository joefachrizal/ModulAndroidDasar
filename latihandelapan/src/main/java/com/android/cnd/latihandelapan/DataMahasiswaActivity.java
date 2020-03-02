package com.android.cnd.latihandelapan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.Toast;

import com.android.cnd.latihandelapan.adapter.ListMhsAdapter;
import com.android.cnd.latihandelapan.model.Mahasiswa;

import java.util.ArrayList;

public class DataMahasiswaActivity extends AppCompatActivity {
    private RecyclerView rvMahasiswa;
    private final ArrayList<Mahasiswa> listMhs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_mahasiswa);

        String title = getIntent().getStringExtra("TITLE_NAME");
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }

        rvMahasiswa = findViewById(R.id.rv_mahasiswa);
        rvMahasiswa.setHasFixedSize(true);

        listMhs.addAll(getListMahasiswa());
        showList();
    }

    private void showList() {
        rvMahasiswa.setLayoutManager(new LinearLayoutManager(this));
        ListMhsAdapter listMhsAdapter = new ListMhsAdapter(listMhs);
        rvMahasiswa.setAdapter(listMhsAdapter);

        listMhsAdapter.setOnItemClickCallback(data -> {
            Toast.makeText(DataMahasiswaActivity.this, "Hello " + data.getName(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(DataMahasiswaActivity.this, DetailActivity.class);
            intent.putExtra("NAME", data.getName());
            intent.putExtra("DESC", data.getDescription());
            intent.putExtra("PHOTO", data.getPhoto());
            startActivity(intent);
        });
    }

    private ArrayList<Mahasiswa> getListMahasiswa() {
        String[] dataName = getResources().getStringArray(R.array.data_name_mhs);
        String[] dataDesc = getResources().getStringArray(R.array.data_description);
        TypedArray dataPhoto = getResources().obtainTypedArray(R.array.data_foto_mhs);

        ArrayList<Mahasiswa> listMhs = new ArrayList<>();
        for (int i = 0; i < dataName.length; i++) {
            Mahasiswa mhs = new Mahasiswa();
            mhs.setName(dataName[i]);
            mhs.setDescription(dataDesc[i]);
            mhs.setPhoto(dataPhoto.getResourceId(i, 0));
//            cara setnya kalo lewat java
//            mhs.setPhoto(image_ids[i]);
            listMhs.add(mhs);
        }
        dataPhoto.recycle();
        return listMhs;
    }

    // kalo semisalnya mau di set dari javanya
    private final Integer[] data_foto_mhs = {
            R.drawable.foto,
            R.drawable.foto,
            R.drawable.foto,
            R.drawable.foto,
            R.drawable.foto,
            R.drawable.foto,
            R.drawable.foto,
    };
}
