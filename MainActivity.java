package com.cookandroid10_2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    Integer imageFileId[] = {
        R.drawable.pic1, R.drawable.pic2, R.drawable.pic3,
        R.drawable.pic4, R.drawable.pic5, R.drawable.pic6,
        R.drawable.pic7, R.drawable.pic8, R.drawable.pic9
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);

        ImageView resultImage = findViewById(R.id.result_image);
        ListView voteList = findViewById(R.id.vote_list);
        Button backButton = findViewById(R.id.back_button);

        // 예시: 첫 번째 이미지를 설정
        resultImage.setImageResource(imageFileId[0]);

        // 리스트 데이터 설정
        String[] voteItems = {
            "독서하는 소녀",
            "꽃장식 소녀",
            "부해물 든 소녀",
            "이젤에 놓은 베르양",
            "참자는 소녀",
            "테라스의 두 자매",
            "피아노: 레슨",
            "피아노 외의 소녀들",
            "해변에서"
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, voteItems);
        voteList.setAdapter(adapter);

        // 돌아가기 버튼 클릭 시 이전 화면으로 이동
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // 현재 액티비티 종료
            }
        });
    }
}

