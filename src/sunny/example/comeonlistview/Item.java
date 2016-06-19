package sunny.example.comeonlistview;

public class Item {

	 int imgId;
	public String textView;
	public Item(int imgId,String textView){
		this.imgId = imgId;
		this.textView = textView;
	}
	public void setImage(int imgId){
		this.imgId = imgId;
	}
	public int getImage(){
		return imgId;
	}
	public void setTextView(String str){
		this.textView = str;
	}
	public String getTextView(){
		return textView;
	}
}
