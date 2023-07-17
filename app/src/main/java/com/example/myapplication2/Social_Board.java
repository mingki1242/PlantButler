//package com.example.myapplication2;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.widget.Button;
//import android.widget.ImageButton;
//import android.widget.ImageView;
//import android.widget.LinearLayout;
//import android.widget.TextView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import java.util.ArrayList;
//
//public class Social_Board extends AppCompatActivity {
//    ArrayList<String> title_List;
//    ArrayList<String> phoneList;
//    LayoutInflater layoutInflater;
//    LinearLayout container;
//    View view;
//    View view2;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_social_board);
//
//        title_List = new ArrayList();phoneList = new ArrayList();
//        title_List.add("    첫번째 글");phoneList.add("10");
//        title_List.add("    두번째 ");phoneList.add("20");
//        title_List.add("    세번째 ");phoneList.add("20");
//        title_List.add("    네번째 ");phoneList.add("20");
//        title_List.add("    다섯번째 ");phoneList.add("20");
//        title_List.add("    여섯번째 ");phoneList.add("20");
//
//
//        container = findViewById(R.id.container );
//        layoutInflater = LayoutInflater.from(this);
//
//        for(int i = 0; i < (title_List.size()); i++) {
//            view = layoutInflater.inflate(R.layout.social_board_btn, null, false);
//            //사진
//            Button w_btn = view.findViewById(R.id.w1);
//            w_btn.setText(title_List.get(i));
//            //번호
//            TextView phoneText = view.findViewById(R.id.writing_like1);
//            phoneText.setText(phoneList.get(i));
//            container.addView(view);
//        }
//
//        view2 = layoutInflater.inflate(R.layout.social_board_pencil_btnpart, null, false);
//        container.addView(view2);
//
//        Button b_btn = (Button) findViewById(R.id.back);
//        b_btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), D_CommunityMainActivity.class);
//                startActivity(intent);
//            }
//        });
//
//    }
//}