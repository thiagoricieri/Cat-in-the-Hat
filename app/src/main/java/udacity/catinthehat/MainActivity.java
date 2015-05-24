package udacity.catinthehat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ButterKnife.inject(this);
	}

	@OnClick(R.id.btn_the_cat)
	public void onTheCatClick(View v){
		Toast.makeText(this,
		    getString(R.string.the_cat),
		    Toast.LENGTH_LONG).show();
	}

	@OnClick(R.id.btn_thing1)
	public void onThing1Click(View v){
		Toast.makeText(this,
			getString(R.string.thing1),
			Toast.LENGTH_LONG).show();
	}

	@OnClick(R.id.btn_thing2)
	public void onThing2Click(View v){
		Toast.makeText(this,
			getString(R.string.thing2),
			Toast.LENGTH_LONG).show();
	}

	@OnClick(R.id.btn_sally)
	public void onSallyClick(View v){
		Toast.makeText(this,
			getString(R.string.sally),
			Toast.LENGTH_LONG).show();
	}

	@OnClick(R.id.btn_nick)
	public void onNickClick(View v){
		Toast.makeText(this,
			getString(R.string.nick),
			Toast.LENGTH_LONG).show();
	}

	@OnClick(R.id.btn_thingj)
	public void onThingjClick(View v){
		Toast.makeText(this,
			getString(R.string.thingamajigger),
			Toast.LENGTH_LONG).show();
	}

	@OnClick(R.id.btn_seuss)
	public void onSeussClick(View v){
		Toast.makeText(this,
			getString(R.string.dr_seuss),
			Toast.LENGTH_LONG).show();
	}
}
