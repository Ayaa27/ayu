package com.unpam.materi.listview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
public class DipilihActivity extends Activity implements
OnClickListener{
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_dipilih);
TextView mataKuliahTV = (TextView)
findViewById(R.id.mataKuliahTextView);
mataKuliahTV.setText(getIntent().getExtras().getString("mataKuliah"));
findViewById(R.id.kembaliButton).setOnClickListener(this);
}
@Override
public boolean onCreateOptionsMenu(Menu menu) {
getMenuInflater().inflate(R.menu.activity_dipilih, menu);
return true;
}
public void onClick(View v) {
// TODO Auto-generated method stub
switch (v.getId()){
case R.id.kembaliButton:
finish();
}
}
}