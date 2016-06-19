package sunny.example.comeonlistview;

import android.widget.ArrayAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
public class ItemAdapter extends ArrayAdapter<Item>{

	List<Item> list ;
	private int resourceId;
	public ItemAdapter(Context context, int textViewResourceId,List<Item> objects) {
		super(context, textViewResourceId, objects);
		// TODO Auto-generated constructor stub
		list = new ArrayList<Item>();
		this.list = objects;
		this.resourceId = textViewResourceId;
	}

	//public View getView (int position, View convertView, ViewGroup parent) 
	@SuppressLint("ViewHolder")
	@Override
	public View getView(int position,View convertView,ViewGroup parent){
		
		ViewHolder mViewHolder = new ViewHolder();
		Item mItem = getItem(position);
		View view = LayoutInflater.from(getContext()).inflate(resourceId, null);
		if(convertView == null){
			
			mViewHolder.mImageView = (ImageView) view.findViewById(R.id.img);
			mViewHolder.mTextView = (TextView) view.findViewById(R.id.tv);
			view.setTag(mViewHolder);
		}else{
			view = convertView;
			//上面只定义了ViewHolder mViewHolder = new ViewHolder()
			//若无这句，报空指针
			mViewHolder = (ViewHolder)view.getTag();
		}
		//设置显示的图片和文字
		mViewHolder.mImageView.setImageResource(mItem.getImage());
		mViewHolder.mTextView.setText(mItem.getTextView());
		return view;
	}
	 
}

 class ViewHolder{
	 ImageView mImageView;
	 TextView mTextView;
 }
