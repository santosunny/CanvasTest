package com.example.santos.canvastest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class MyView3 extends View {

    private Paint p1;
    private Paint p2;
    private Paint p3;

    private int centerX;
    private int centerY;

    public MyView3(Context context) {
        this(context, null);
    }

    public MyView3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MyView3(Context context, AttributeSet attributeSet, int theme) {
        super(context, attributeSet, theme);

        p1 = new Paint();
        p1.setColor(Color.RED);

        p2 = new Paint();
        p2.setColor(Color.GREEN);

        p3 = new Paint();
        p3.setColor(Color.CYAN);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        centerX = getWidth() / 2;
        centerY = getHeight() / 2;
        //将坐标的中心点从屏幕左上角移动到屏幕中心
        canvas.translate(centerX, centerY);

        //绘制当前坐标系
        canvas.drawLine(-centerX, 0, centerX, 0, p1);
        canvas.drawLine(0, -centerY, 0, centerY, p1);

        canvas.save();
        Rect rect = new Rect(0, 0, 200, 100);
        canvas.drawRect(rect, p1);
        canvas.rotate(45);

        //绘制当前坐标系
        canvas.drawLine(-centerX, 0, centerX, 0, p2);
        canvas.drawLine(0, -centerY, 0, centerY, p2);

        Rect rect1 = new Rect(0, 0, 200, 100);
        canvas.drawRect(rect1, p2);
        canvas.restore();



//        //绘制当前坐标系
//        canvas.drawLine(-centerX, 0, centerX, 0, p3);
//        canvas.drawLine(0, -centerY, 0, centerY, p3);
//
//        Rect rect2 = new Rect(0, 0, 100, 50);
//        canvas.drawRect(rect2, p3);
    }

}