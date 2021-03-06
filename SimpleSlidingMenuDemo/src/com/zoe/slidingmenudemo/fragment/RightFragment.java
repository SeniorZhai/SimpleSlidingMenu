package com.zoe.slidingmenudemo.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.zoe.slidingmenudemo.R;

public class RightFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_right, null);
		Button button = (Button)view.findViewById(R.id.btn_right);
		button.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Toast.makeText(getActivity(), "Right Button",Toast.LENGTH_SHORT).show();
			}
		});
		return view;
	}
}
