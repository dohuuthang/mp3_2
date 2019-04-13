package com.example.mp3_2;

import android.content.Intent;
import android.media.MediaPlayer;
import android.nfc.Tag;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    ListView lvten;
    TextView tvname;
    ArrayList<song> arraysong;



    int position = 0;
//    MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvten = (ListView) findViewById(R.id.lvten);
        tvname = (TextView) findViewById(R.id.tvname);
        //      anhxa();
        addSong();

        final customadapter customadapter = new customadapter(this, R.layout.item_name, arraysong);
        lvten.setAdapter(customadapter);




        lvten.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent mh2 = new Intent(MainActivity.this, Main2Activity.class);
                mh2.putExtra("pos", position);
                startActivity(mh2);

            }
        });

    }


    private void addSong() {
        arraysong = new ArrayList<>();
        arraysong.add(new song("Cảm Giác Lúc Ấy Sẽ Ra Sao", R.raw.camgiaclucayserasao));
        arraysong.add(new song("Chỉ Là Người Anh Trai", R.raw.chilanguoianhtrai));
        arraysong.add(new song("Cuộc Vui Cô Đơn", R.raw.cuocvuivodon));
        arraysong.add(new song("Đời Là Thế Thôi", R.raw.doi_la_the_thoi));
        arraysong.add(new song("Đúng Người Đúng Thời Điểm", R.raw.dung_nguoi_dung_thoi_diem));
        arraysong.add(new song("Em Sẽ Là Cô Dâu", R.raw.em_se_la_co_dau));
        arraysong.add(new song("Em Đã Thấy Anh Cùng Người Ấy", R.raw.emdathayanhcungnguoiay));
        arraysong.add(new song("Hồng Nhan", R.raw.hong_nhan));
        arraysong.add(new song("Khuôn Mặt Đáng Thương", R.raw.khuon_mat_dang_thuong));
        arraysong.add(new song("Một Đêm Say", R.raw.mot_dem_say));
        arraysong.add(new song("Nếu Ta Ngược Lối", R.raw.neutanguocloi));
        arraysong.add(new song("Về Đây Em Lo", R.raw.ve_day_em_lo));
        arraysong.add(new song("Xin Một Lần Ngoại Lệ", R.raw.xinmotlanngoaile));

    }


}
