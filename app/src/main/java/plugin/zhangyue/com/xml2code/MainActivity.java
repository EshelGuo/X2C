package plugin.zhangyue.com.xml2code;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhangyue.we.x2c.X2C;
import com.zhangyue.we.x2c.ano.Xml;
import com.zhangyue.we.x2c.demo.R;


@Xml(layouts = {R.layout.activity_main
        ,R.layout.head})
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        X2C.instance().setContentView(this, R.layout.activity_main);
    }
}
