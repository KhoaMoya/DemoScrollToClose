package com.khoa.scrolltoclose;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.khoa.scrollabledialog.FullScreenDialog;
import com.khoa.scrollabledialog.OnTouchListener;
import com.khoa.scrollabledialog.ScrollableScrollView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_show).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Dialog dialog = new FullScreenDialog(this).getIntanse();
        dialog.setContentView(R.layout.layout_dialog);
        ScrollableScrollView scrollView = dialog.findViewById(R.id.scroll_view);
        RelativeLayout baseLayout = dialog.findViewById(R.id.base_layout);
        TextView textView = dialog.findViewById(R.id.text_view);
        textView.setText("Hiệu là Tố Như, Thanh Hiên, con Nguyễn Nghiễm, làng Tiên Điền, huyện Nghi Xuân (Nghệ Tĩnh) văn chương vượt hẳn bạn bè, nhưng học vị chỉ là tam trường (tú tài). Nguyễn Du gặp nhiều khó khăn hồi con thanh niên. Mười một tuổi mồ côi cha, mười ba tuổi mất mẹ, suốt đời trai trẻ ăn nhờ ở đâu: hoặc ở nhà anh ruột (Nguyễn Khản), nhà anh vợ (Đoàn Nguyễn Tuấn), có lúc làm con nuôi một võ quan họ Hà, và nhận chức nhỏ: chánh thủ hiệu uý. Do tình hình đất nước biến động, chính quyền Lê Trình sụp đổ, Tây Sơn quét sạch giặc Thanh, họ Nguyễn Tiên Điền cũng sa sút tiêu điều: \"Hồng Linh vô gia, huynh đệ tán\". Nguyễn Du trải qua 10 năm gió bụi. Năm 1802, ra làm quan với triều Nguyễn được thăng thưởng rất nhanh, từ tri huyện lên đến tham tri (1815), có được cử làm chánh sứ sang Tàu (1813). Ông mất vì bệnh thời khí (dịch tả), không trối trăng gì, đúng vào lúc sắp sửa làm chánh sứ sang nhà Thanh lần thứ hai." +
                "Hiệu là Tố Như, Thanh Hiên, con Nguyễn Nghiễm, làng Tiên Điền, huyện Nghi Xuân (Nghệ Tĩnh) văn chương vượt hẳn bạn bè, nhưng học vị chỉ là tam trường (tú tài). Nguyễn Du gặp nhiều khó khăn hồi con thanh niên. Mười một tuổi mồ côi cha, mười ba tuổi mất mẹ, suốt đời trai trẻ ăn nhờ ở đâu: hoặc ở nhà anh ruột (Nguyễn Khản), nhà anh vợ (Đoàn Nguyễn Tuấn), có lúc làm con nuôi một võ quan họ Hà, và nhận chức nhỏ: chánh thủ hiệu uý. Do tình hình đất nước biến động, chính quyền Lê Trình sụp đổ, Tây Sơn quét sạch giặc Thanh, họ Nguyễn Tiên Điền cũng sa sút tiêu điều: \"Hồng Linh vô gia, huynh đệ tán\". Nguyễn Du trải qua 10 năm gió bụi. Năm 1802, ra làm quan với triều Nguyễn được thăng thưởng rất nhanh, từ tri huyện lên đến tham tri (1815), có được cử làm chánh sứ sang Tàu (1813). Ông mất vì bệnh thời khí (dịch tả), không trối trăng gì, đúng vào lúc sắp sửa làm chánh sứ sang nhà Thanh lần thứ hai.");
        scrollView.setOnTouchListener(new OnTouchListener(baseLayout, scrollView, dialog));
        dialog.show();
    }
}
