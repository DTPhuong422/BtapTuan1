package com.example.a7122023;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //khai bao bien
    EditText txt1, txt2;
    Button btn1;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //anh xa
        txt1 = findViewById(R.id.demotxt1);
        txt2 = findViewById(R.id.demotxt2);
        btn1 = findViewById(R.id.demobutton);
        tv1 = findViewById(R.id.tv1);

        //xu ly su kien
        btn1.setOnClickListener(v -> {
            //tinh tong
            tinhTong();
        });
    }

    // dinh nghia ham
    private void tinhTong() {

        // Lấy giá trị từ ô nhập liệu thứ nhất
        String str1 = txt1.getText().toString();
        float so1 = Float.parseFloat(str1);

        // Lấy giá trị từ ô nhập liệu thứ hai
        String str2 = txt2.getText().toString();
        float so2 = Float.parseFloat(str2);

        // Tính tổng
        float tong = so1 + so2;

        // Hiển thị kết quả trên TextView
        tv1.setText("Kết quả: " + String.valueOf(tong));

    }
}
