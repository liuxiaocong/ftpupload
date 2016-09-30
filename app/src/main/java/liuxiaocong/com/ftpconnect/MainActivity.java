package liuxiaocong.com.ftpconnect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    FTPUtils ftpUtils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ftpUtils = FTPUtils.getInstance();
        new Thread(new Runnable() {
            @Override
            public void run() {
                boolean flag = ftpUtils.initFTPSetting("198.252.109.87", 21, "hiro", "3zmfKz59VNPPq38");
            }
        }).start();
    }
}
