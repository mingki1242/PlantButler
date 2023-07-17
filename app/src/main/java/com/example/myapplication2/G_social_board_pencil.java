package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import java.time.LocalDate;

public class G_social_board_pencil extends AppCompatActivity {

    Button enter,back;

    private FirebaseAuth mAuth = FirebaseAuth.getInstance();
    private FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_board_pencil);

        FirebaseUser user = mAuth.getCurrentUser();

        String input_title = ((EditText) findViewById(R.id.input_title)).getText().toString();
        String input_content = ((EditText) findViewById(R.id.input_content)).getText().toString();


        enter = (Button) findViewById(R.id.enter);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LocalDate now;
                String board_id = user.getUid().concat(input_title);


                if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                    now = LocalDate.now();
                    SocialBoard social = new SocialBoard(board_id, user.getUid(), input_title, input_content, now, 0);
                    db.collection("SocialBoard").add(social);
                }
//                SocialBoard social = new SocialBoard(, user.getUid(), input_title, input_content, , 0);
            }
        });
    }
}