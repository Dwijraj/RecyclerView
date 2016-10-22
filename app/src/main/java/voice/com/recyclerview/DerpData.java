package voice.com.recyclerview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 1405214 on 22-10-2016.
 */

public class DerpData {

    private int b;
    private static final String[] hello={"Hello","Hi","Tell me why","Please go and die"};
    private static final int[] icons={android.R.drawable.alert_dark_frame,android.R.drawable.arrow_up_float
            ,android.R.drawable.arrow_down_float};

    public static List<List_item> getListData()
    {
        List<List_item> item=new ArrayList<>();

        for(int x=0;x<5;x++)
        {
            for(int i=0;(i<hello.length&& i<icons.length);i++)
            {
                List_item list_item=new List_item();
                list_item.setResid(icons[i]);
                list_item.setText(hello[i]);
                item.add(list_item);
            }

        }

        return item;
    }

}
