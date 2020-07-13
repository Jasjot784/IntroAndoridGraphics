package com.jasjotsingh.introandroidgraphics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
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
        greenPaint.setStyle(Paint.Style.FILL);
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
        myLines.moveTo(50,300);
        myLines.lineTo(160,280);
        myLines.lineTo(300,280);
        myLines.lineTo(380,370);
        myLines.lineTo(280,450);
        myLines.lineTo(100,390);
        myLines.lineTo(160,380);
        myLines.close();
        //canvas.drawPath(myLines,greenPaint);
        //canvas.drawCircle(204,364,250,greenPaint);
        LinearGradient linearGradient = new LinearGradient(50,300,160,380,Color.BLUE,Color.RED, Shader.TileMode.MIRROR);
        Paint gradietnPaint = new Paint();
        gradietnPaint.setStyle(Paint.Style.FILL);
        gradietnPaint.setShader(linearGradient);
        canvas.drawPath(myLines,gradietnPaint);
    }
}