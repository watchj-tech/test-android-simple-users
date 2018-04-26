package com.watchj.simpleapp.view.users.add;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.watchj.simpleapp.R;

public class AddUserFragment extends Fragment {

    public AddUserFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_add_user, container, false);

        Button addNewUserButton = contentView.findViewById(R.id.add_new_user_button);
        addNewUserButton.setOnClickListener(v -> showToast(contentView, "New user added"));

        return contentView;
    }

    private void showToast(View view, String text) {
        Toast toast = Toast.makeText(view.getContext(), text, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
