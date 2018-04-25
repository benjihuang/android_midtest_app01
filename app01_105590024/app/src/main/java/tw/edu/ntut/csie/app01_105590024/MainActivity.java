package tw.edu.ntut.csie.app01_105590024;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mEdtScore;
    private Button mBtnOK;
    private TextView mTxtR;
    private letterGrade grade = new letterGrade();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtScore = (EditText) findViewById(R.id.editText);
        mBtnOK = (Button) findViewById(R.id.button1);
        mTxtR = (TextView) findViewById(R.id.textView3);

        mBtnOK.setOnClickListener(btnOKOnClick);
    }
    private View.OnClickListener btnOKOnClick= new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            int score = Integer.parseInt(mEdtScore.getText().toString());
            mTxtR.setText(grade.grade(score));
        }
    };
}

