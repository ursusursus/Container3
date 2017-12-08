package sk.ursus.container3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import sk.ursus.library.Foo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Foo.bar();
        setContentView(R.layout.activity_main);
    }
}
