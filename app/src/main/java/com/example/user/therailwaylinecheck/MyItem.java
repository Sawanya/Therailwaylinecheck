package com.example.user.therailwaylinecheck;

public class MyItem {
      private String mTextLine1;
      private String mTextLine2;//ตัวแปรฟิลด์สำหรับพักข้อมูล
      private String mTextLine3;
      private String mStation;
      private String mNumTrain;
      private String mTrainType;
      private String mtime;
      private String mSource;
      private String mDest;




    //คอนสตรักเตอร์ เพื่อรับข้อมูลเข้ามาในคลาส
      public MyItem(String Station,String NumTrain,String TrainType,String time,String Source,String Dest) {
         mStation = Station;
         mNumTrain = NumTrain;
         mTrainType = TrainType;
         mtime = time;

         mSource = Source;
         mDest = Dest;

      }

    public String getmStation() {
        return mStation;
    }

    public void setmStation(String Station) {
        this.mStation = Station;
    }

    public String getmNumTrain() {
        return mNumTrain;
    }

    public void setmNumTrain(String mNumTrain) {
        this.mNumTrain = mNumTrain;
    }

    public String getmTrainType() {
        return mTrainType;
    }

    public void setmTrainType(String mTrainType) {
        this.mTrainType = mTrainType;
    }

    public String getMtime() {
        return mtime;
    }

    public void setMtime(String mtime) {
        this.mtime = mtime;
    }

    public String getmSource() {
        return mSource;
    }

    public void setmSource(String mSource) {
        this.mSource = mSource;
    }

    public String getmDest() {
        return mDest;
    }

    public void setmDest(String mDest) {
        this.mDest = mDest;
    }
}
