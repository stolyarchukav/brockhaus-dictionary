package org.forzaverita.brefdic.menu;

import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import org.forzaverita.brefdic.BrEfDicActivity;
import org.forzaverita.brefdic.R;
import org.forzaverita.brefdic.history.BookmarksActivity;
import org.forzaverita.brefdic.history.HistoryActivity;
import org.forzaverita.brefdic.preferences.AppPreferenceActivity;

public class MenuUtils {

	public static boolean createOptionsMenu(Menu menu, Activity activity) {
		MenuInflater inflater = activity.getMenuInflater();
	    inflater.inflate(R.menu.main_menu, menu);
	    return true;
	}
	
	public static boolean optionsItemSelected(MenuItem item, Activity activity) {
		switch (item.getItemId()) {
			case R.id.menu_settings :
				activity.startActivity(new Intent(activity, AppPreferenceActivity.class));
				return true;
			case R.id.menu_seacrh :
				activity.onSearchRequested();
				return true;
			case R.id.menu_history :
				activity.startActivity(new Intent(activity, HistoryActivity.class));
				return true;
			case R.id.menu_bookmarks :
				activity.startActivity(new Intent(activity, BookmarksActivity.class));
				return true;
			case R.id.menu_home:
				activity.startActivity(new Intent(activity, BrEfDicActivity.class));
				return true;
			default:
				return true;
		}
	}
	
}
