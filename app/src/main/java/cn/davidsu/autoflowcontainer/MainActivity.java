package cn.davidsu.autoflowcontainer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import cn.davidsu.library.LineWrapContainer;

public class MainActivity extends AppCompatActivity {

    private LineWrapContainer lwc;
    private Button addBtn;
    private EditText etMaxLines;
    private Button doneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        initListener();
    }

    private void bindViews() {
        lwc = findViewById(R.id.view_lwc);
        addBtn = findViewById(R.id.add_btn);
        etMaxLines = findViewById(R.id.et_maxlines);
        doneBtn = findViewById(R.id.tv_done);
    }

    private void initListener() {
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = new TextView(MainActivity.this);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setText("add one add one");
                textView.setBackgroundResource(R.drawable.text_bg);
                textView.setPadding(10, 10, 10, 10);

                lwc.addView(textView);

            }
        });

        doneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    lwc.setMaxLins(Integer.parseInt(etMaxLines.getText().toString()));
                } catch (Exception e) {
                    lwc.setMaxLins(Integer.MAX_VALUE);
                }

                lwc.requestLayout();
            }
        });
    }
}
