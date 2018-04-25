package tw.edu.ntut.csie.app04_105590024;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<CharSequence> arrAdapstudent =
                ArrayAdapter.createFromResource(this,R.array.student,
                                            android.R.layout.simple_list_item_1);
        setListAdapter(arrAdapstudent);
    }
}
