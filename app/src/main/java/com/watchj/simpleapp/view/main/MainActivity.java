package com.watchj.simpleapp.view.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.watchj.simpleapp.R;
import com.watchj.simpleapp.view.users.add.AddUserFragment;
import com.watchj.simpleapp.view.users.list.ListUsersFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListUsersFragment listUsersFragment = new ListUsersFragment();
        AddUserFragment addUserFragment = new AddUserFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.list_users_fragment, listUsersFragment)
                .replace(R.id.edit_user_fragment, addUserFragment)
                .commit();
    }
}
