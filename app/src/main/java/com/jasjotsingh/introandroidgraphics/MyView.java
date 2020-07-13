package com.jasjotsingh.introandroidgraphics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

public class MyView extends View {
    private Paint redPaint;
    private Paint bluePaint;
    private Paint greenPaint;


    public MyView(Context context) {
        super(context, null);
        //Add your initialisation code here
        redPaint=new Paint(Paint.ANTI_ALIAS_FLAG);
        redPaint.setStyle(Paint.Style.STROKE);//stroke only no fill
        redPaint.setColor(0xffff0000);//color red
        redPaint.setStrokeWidth(5);//set the line stroke width to 5

        bluePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        bluePaint.setStyle(Paint.Style.STROKE);
        bluePaint.setColor(Color.BLUE);

        greenPaint = new Paint();
        greenPaint.setARGB(255,0,255,0);//a-alpha(transparency),r-red,g-green,b-blue
        greenPaint.setStyle(Paint.Style.STROKE);
        greenPaint.setStrokeWidth(15);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //Add your drawing code here
       // canvas.drawRect(30,30,200,200,redPaint);
        //canvas.drawCircle(300,300,250,bluePaint);
//        canvas.drawRect(500,500,700,700,redPaint);
//        canvas.drawCircle(600,600,145,redPaint);
        Path myLines = new Path();
        myLines.moveTo(130,230);
        myLines.lineTo(70,270);
        myLines.lineTo(570,630);
        myLines.lineTo(800,100);
        canvas.drawPath(myLines,greenPaint);
    }
}