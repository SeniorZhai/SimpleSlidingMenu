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

public class LeftFragment extends Fragment implements OnClickListener {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_left, null);
		Button btn1 = (Button) view.findViewById(R.id.btn_1);
		Button btn2 = (Button) view.findViewById(R.id.btn_2);
		Button btn3 = (Button) view.findViewById(R.id.btn_3);
		Button btn4 = (Button) view.findViewById(R.id.btn_4);
		Button btn5 = (Button) view.findViewById(R.id.btn_5);
		Button btn6 = (Button) view.findViewById(R.id.btn_6);
		Button btn7 = (Button) view.findViewById(R.id.btn_7);
		Button btn8 = (Button) view.findViewById(R.id.btn_8);
		Button btn9 = (Button) view.findViewById(R.id.btn_9);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btn3.setOnClickListener(this);
		btn4.setOnClickListener(this);
		btn5.setOnClickListener(this);
		btn6.setOnClickListener(this);
		btn7.setOnClickListener(this);
		btn8.setOnClickListener(this);
		btn9.setOnClickListener(this);
		return view;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_1:
			Toast.makeText(getActivity(), "1", Toast.LENGTH_SHORT).show();
			break;
		case R.id.btn_2:
			Toast.makeText(getActivity(), "2", Toast.LENGTH_SHORT).show();
			break;
		case R.id.btn_3:
			Toast.makeText(getActivity(), "3", Toast.LENGTH_SHORT).show();
			break;
		case R.id.btn_4:
			Toast.makeText(getActivity(), "4", Toast.LENGTH_SHORT).show();
			break;
		case R.id.btn_5:
			Toast.makeText(getActivity(), "5", Toast.LENGTH_SHORT).show();
			break;
		case R.id.btn_6:
			Toast.makeText(getActivity(), "6", Toast.LENGTH_SHORT).show();
			break;
		case R.id.btn_7:
			Toast.makeText(getActivity(), "7", Toast.LENGTH_SHORT).show();
			break;
		case R.id.btn_8:
			Toast.makeText(getActivity(), "8", Toast.LENGTH_SHORT).show();
			break;
		case R.id.btn_9:
			Toast.makeText(getActivity(), "9", Toast.LENGTH_SHORT).show();
			break;

		default:
			break;
		}

	}
}
