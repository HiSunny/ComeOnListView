package sunny.example.comeonlistview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import android.widget.Toast;
import android.view.View;
import android.util.Log;
public class MainActivity extends ActionBarActivity {

	Item[]  mItem;
	ArrayList<Item> list;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		float xdpi = getResources().getDisplayMetrics().xdpi;
		float ydpi = getResources().getDisplayMetrics().ydpi;
		Log.d("xdpi","" + xdpi);
		Log.d("ydpi",""+ydpi);
		final ListView mListView = (ListView)findViewById(R.id.list);
		list = new ArrayList<Item>();
		
		mItem = new Item[15];
		for(int i = 0;i <mItem.length;i++){
			mItem[i] = new Item(R.drawable.ic_launcher,"" + i);
			list.add(mItem[i]);
		}
		
		final ItemAdapter adapter = new ItemAdapter(this, R.layout.item, list);
		mListView.setAdapter(adapter);
		
		mListView.setOnItemClickListener(new OnItemClickListener(){
			@Override
			public void onItemClick(AdapterView<?> parent,View view,int position,long id){
				Item mItem = list.get(position);
				mItem.setImage(R.drawable.qq);
				mListView.setAdapter(adapter);
				//Toast.makeText(MainActivity.this, "tt", Toast.LENGTH_LONG).show();
			}
		});
	}

	/*public void initItem(){
		mItem = new Item[15];
		for(int i = 0;i < mItem.length;i++){
			mItem[i] = new Item(R.drawable.ic_launcher,"" + i);
		}
	}*/
	
}
