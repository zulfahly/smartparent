package pnj.ti.b2013.smartparent.view.notification;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import pnj.ti.b2013.smartparent.R;
import pnj.ti.b2013.smartparent.view.BaseActivity;

public class NotificationActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        initUI();
    }

    private void initUI() {
        setToolbar("Notifikasi",true);

    }

    @Override
    public void receive(int type, boolean success, Bundle extras) {

    }
}
