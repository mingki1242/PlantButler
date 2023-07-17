package com.example.myapplication2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.time.LocalDate;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

public class Social_Board_pencil extends AppCompatActivity {

    Button enter;

    private FirebaseAuth mAuth = FirebaseAuth.getInstance();
    private FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_board_pencil);


        enter = (Button)findViewById(R.id.enter);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insert();

                Intent intent = new Intent(getApplicationContext(), F_SocialB.class);
                startActivity(intent);

            }
        });

    }


    private void insert(){

        FirebaseUser user = mAuth.getCurrentUser();

        String input_title = ((EditText) findViewById(R.id.input_title)).getText().toString();
        String input_content = ((EditText) findViewById(R.id.input_content)).getText().toString();
        LocalDate now = LocalDate.now();
        String uid = user.getUid();
        String board_id = uid.concat(input_title);

        SocialBoard social = new SocialBoard(board_id, uid, input_title, input_content, now.toString(), 0, true);
        db.collection("SocialBoard").add(social);
    }
}