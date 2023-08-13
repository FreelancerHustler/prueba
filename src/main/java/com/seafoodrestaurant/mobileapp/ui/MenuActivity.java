```java
package com.seafoodrestaurant.mobileapp.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.AdapterView;
import androidx.appcompat.app.AppCompatActivity;
import com.seafoodrestaurant.mobileapp.R;
import com.seafoodrestaurant.mobileapp.model.Menu;
import com.seafoodrestaurant.mobileapp.services.MenuService;

public class MenuActivity extends AppCompatActivity {

    private ListView menuList;
    private MenuService menuService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        menuService = new MenuService();
        menuList = findViewById(R.id.menuList);

        displayMenu();
    }

    private void displayMenu() {
        Menu[] menus = menuService.getMenus();

        MenuAdapter adapter = new MenuAdapter(this, menus);
        menuList.setAdapter(adapter);

        menuList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Menu selectedMenu = (Menu) parent.getItemAtPosition(position);
                openOrderActivity(selectedMenu);
            }
        });
    }

    private void openOrderActivity(Menu selectedMenu) {
        // This method will open the OrderActivity and pass the selected menu to it.
        // The implementation of this method is not included in this file.
    }
}
```