package com.khoa.scrollabledialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.Window;
import android.widget.LinearLayout;

public class FullScreenDialog {

    private Dialog dialog;

    public FullScreenDialog(Context context) {
        this.dialog = new Dialog(context, R.style.Theme_Dialog);

        Window window = dialog.getWindow();
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        window.getAttributes().windowAnimations = R.style.Dialog_Animation;
        window.setGravity(Gravity.BOTTOM);
        window.setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
    }

    public Dialog getIntanse(){
        return this.dialog;
    }
}
