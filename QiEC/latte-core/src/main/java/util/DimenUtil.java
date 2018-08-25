package util;

import android.content.res.Resources;
import android.util.DisplayMetrics;

import com.hfq.latte_core.app.Latte;

/**
 * Created by HanFQ on 2018/8/25 0025.
 */
public class DimenUtil {

    public static int getScreenWidth() {
        final Resources resources = Latte.getApplicationContext().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.widthPixels;
    }

    public static int getScreenHeight() {
        final Resources resources = Latte.getApplicationContext().getResources();
        final DisplayMetrics dm = resources.getDisplayMetrics();
        return dm.heightPixels;
    }
}
