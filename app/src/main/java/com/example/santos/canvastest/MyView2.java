package com.example.santos.canvastest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class MyView2 extends View {

    private int rotateAngle = 0;

    private Paint p1;
    private Paint p2;
    private Paint p3;

    private int centerX;
    private int centerY;

    private int radiusStart = 300;
    private int radiusEnd = 550;
    private int strokeWidth = 10;

    public MyView2(Context context) {
        this(context, null);
    }

    public MyView2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MyView2(Context context, AttributeSet attributeSet, int theme) {
        super(context, attributeSet, theme);

        p1 = new Paint();
        p1.setColor(Color.RED);

        p2 = new Paint();
        p2.setColor(Color.GREEN);
        p2.setStrokeWidth(strokeWidth);

        p3 = new Paint();
        p3.setColor(Color.CYAN);
        p3.setStrokeWidth(strokeWidth);
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


        //绘制代表时钟刻度的第一条绿线
        canvas.drawLine(0, 0, 0, radiusEnd, p2);

        //将画布选中30度
        canvas.rotate(30);
        //绘制代表时钟刻度的第二条线
        canvas.drawLine(0, 0, 0, radiusEnd, p3);

        canvas.rotate(60);
        canvas.drawLine(0, 0, 0, radiusEnd, p2);

        canvas.rotate(90);
        canvas.drawLine(0, 0, 0, radiusEnd, p3);
    }

}