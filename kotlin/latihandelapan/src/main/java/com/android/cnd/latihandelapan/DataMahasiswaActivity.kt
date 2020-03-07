package com.android.cnd.latihandelapan

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.cnd.latihandelapan.adapter.ListMhsAdapter
import com.android.cnd.latihandelapan.model.Mahasiswa
import java.util.*

class DataMahasiswaActivity : AppCompatActivity() {
    private lateinit var rvMahasiswa: RecyclerView
    private val listMhs = ArrayList<Mahasiswa>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_mahasiswa)
        val title = intent.getStringExtra("TITLE_NAME")
        if (supportActionBar != null) {
            supportActionBar?.title = title
        }
        rvMahasiswa = findViewById(R.id.rv_mahasiswa)
        rvMahasiswa.setHasFixedSize(true)
        listMhs.addAll(listMahasiswa)
        showList()
    }

    private fun showList() {
        rvMahasiswa.layoutManager = LinearLayoutManager(this)
        val listMhsAdapter = ListMhsAdapter(listMhs)
        rvMahasiswa.adapter = listMhsAdapter
        listMhsAdapter.setOnItemClickCallback(object : ListMhsAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Mahasiswa) {
                Toast.makeText(this@DataMahasiswaActivity, "Hello " + data.name, Toast.LENGTH_SHORT).show()
                val intent = Intent(this@DataMahasiswaActivity, DetailActivity::class.java)
                intent.putExtra("NAME", data.name)
                intent.putExtra("DESC", data.description)
                intent.putExtra("PHOTO", data.photo)
                startActivity(intent)
            }
        })

    }

    // cara setnya kalo lewat java
//            mhs.setPhoto(image_ids[i]);
    private val listMahasiswa: ArrayList<Mahasiswa>
        get() {
            val dataName = resources.getStringArray(R.array.data_name_mhs)
            val dataDesc = resources.getStringArray(R.array.data_description)
            val dataPhoto = resources.obtainTypedArray(R.array.data_foto_mhs)
            val listMhs = ArrayList<Mahasiswa>()
            for (i in dataName.indices) {
                val mhs = Mahasiswa()
                mhs.name = dataName[i]
                mhs.description = dataDesc[i]
                mhs.photo = dataPhoto.getResourceId(i, 0)
                // cara setnya kalo lewat java
//           mhs.setPhoto(image_ids[i]);
                listMhs.add(mhs)
            }
            dataPhoto.recycle()
            return listMhs
        }

    // kalo semisalnya mau di set dari javanya
    private val data_foto_mhs = arrayOf(
            R.drawable.foto,
            R.drawable.foto,
            R.drawable.foto,
            R.drawable.foto,
            R.drawable.foto,
            R.drawable.foto,
            R.drawable.foto)
}