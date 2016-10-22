package voice.com.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private DerpAdapter derpAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=(RecyclerView)findViewById(R.id.rec_list);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));  //this is required or else code wuill run without error but nothing will be displayed

        derpAdapter=new DerpAdapter(DerpData.getListData(),this);
        recyclerView.setAdapter(derpAdapter);


    }
}
