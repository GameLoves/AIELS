package aeils.computer.programming.computeryourlanguage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class csharpList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csharp_list);
    }

    public void csharpIntroductionMethodButton(View view) {
        Intent intent = new Intent(this,csharp_Introduction.class);
        startActivity(intent);

    }

    public void csharpGetStartedMethod(View view) {


    }
}