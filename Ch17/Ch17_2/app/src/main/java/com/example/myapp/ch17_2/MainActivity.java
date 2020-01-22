package com.example.myapp.ch17_2;

import android.Manifest;
import android.app.ListActivity;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import android.support.v4.widget.CursorAdapter;
import android.support.v4.widget.SimpleCursorAdapter;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
    private static final int PERMISSIONS_REQUEST_READ_CONTACTS = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showContacts();   // 顯示聯絡人資料
    }
    // 檢查權限和顯示聯絡人資料
    private void showContacts() {
        //  檢查SDK版本, 確認是否獲得權限來讀取聯絡人資料.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M &&
                checkSelfPermission(Manifest.permission.READ_CONTACTS) !=
                        PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.READ_CONTACTS},
                    PERMISSIONS_REQUEST_READ_CONTACTS);
            // 等待onRequestPermissionsResult(int, String[], int[])覆寫方法來取得權限
        } else {
            Uri contacts = Uri.parse("content://contacts/people");
            Cursor c = getContentResolver().query(contacts, null, null, null, null);
            String[] columns = new String[]{
                    ContactsContract.Contacts.DISPLAY_NAME,
                    ContactsContract.Contacts._ID,
            };
            int[] views = new int[]{
                    R.id.contactName,
                    R.id.contactID,
            };
            // 建立SimpleCursorAdapter結合器物件
            SimpleCursorAdapter adapter = new SimpleCursorAdapter(
                    this, R.layout.list_item, c, columns, views, CursorAdapter.FLAG_REGISTER_CONTENT_OBSERVER);
            setListAdapter(adapter);  // 指定結合器物件
        }
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        if (requestCode == PERMISSIONS_REQUEST_READ_CONTACTS) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // 已經取得權限
                showContacts(); // 顯示聯絡人資料
            } else {
                Toast.makeText(this, "直到取得權限, 否則無法顯示聯絡人資料",
                        Toast.LENGTH_SHORT).show();
            }
        }
    }
    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        // 取得contactID的TextView元件
        TextView lblID = (TextView) v.findViewById(R.id.contactID);
        TextView lblName = (TextView) v.findViewById(R.id.contactName);
        // 取得_ID和姓名
        String cid = lblID.getText().toString();
        String name = lblName.getText().toString();
        // 查詢電話號碼
        Cursor pCur = getContentResolver().query(
                ContactsContract.CommonDataKinds.Phone.CONTENT_URI,
                null,
                ContactsContract.CommonDataKinds.Phone.CONTACT_ID +" = ?",
                new String[]{cid}, null);
        // 顯示電話號碼
        while (pCur.moveToNext()) {
            String phoneNo = pCur.getString(pCur.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER));
            Toast.makeText(this, "姓名: " + name + "\n電話號碼: " + phoneNo, Toast.LENGTH_SHORT).show();
        }
        pCur.close();
    }
}


