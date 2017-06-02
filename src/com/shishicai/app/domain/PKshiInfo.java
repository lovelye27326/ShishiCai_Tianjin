package com.shishicai.app.domain;

import java.util.List;

/**
 * Created by Administrator on 2017/5/7 0007.
 */

public class PKshiInfo {

    /**
     * state : 200
     * items : [{"date":"2017-05-28","time":"14:20","period":"050","result":"4,0,9,7,9"},{"date":"2017-05-28","time":"14:10","period":"049","result":"2,3,2,0,0"},{"date":"2017-05-28","time":"14:00","period":"048","result":"0,5,9,5,3"},{"date":"2017-05-28","time":"13:50","period":"047","result":"7,7,9,8,6"},{"date":"2017-05-28","time":"13:40","period":"046","result":"0,7,0,5,0"},{"date":"2017-05-28","time":"13:30","period":"045","result":"5,1,6,2,4"},{"date":"2017-05-28","time":"13:20","period":"044","result":"0,4,3,8,1"},{"date":"2017-05-28","time":"13:10","period":"043","result":"2,1,8,8,3"},{"date":"2017-05-28","time":"13:00","period":"042","result":"6,3,4,2,3"},{"date":"2017-05-28","time":"12:50","period":"041","result":"4,7,2,5,8"},{"date":"2017-05-28","time":"12:40","period":"040","result":"0,0,1,0,3"},{"date":"2017-05-28","time":"12:30","period":"039","result":"1,3,6,8,4"},{"date":"2017-05-28","time":"12:20","period":"038","result":"7,6,1,8,4"},{"date":"2017-05-28","time":"12:10","period":"037","result":"8,9,7,2,5"},{"date":"2017-05-28","time":"12:00","period":"036","result":"8,6,8,2,0"},{"date":"2017-05-28","time":"11:50","period":"035","result":"6,9,6,8,3"},{"date":"2017-05-28","time":"11:40","period":"034","result":"2,6,6,4,4"},{"date":"2017-05-28","time":"11:30","period":"033","result":"1,7,8,0,7"},{"date":"2017-05-28","time":"11:20","period":"032","result":"4,4,0,5,1"},{"date":"2017-05-28","time":"11:10","period":"031","result":"7,9,9,5,9"},{"date":"2017-05-28","time":"11:00","period":"030","result":"2,6,4,0,5"},{"date":"2017-05-28","time":"10:50","period":"029","result":"3,9,6,6,4"},{"date":"2017-05-28","time":"10:40","period":"028","result":"9,4,2,0,1"},{"date":"2017-05-28","time":"10:30","period":"027","result":"5,0,4,0,7"},{"date":"2017-05-28","time":"10:20","period":"026","result":"9,6,6,6,7"},{"date":"2017-05-28","time":"10:10","period":"025","result":"9,4,9,2,5"},{"date":"2017-05-28","time":"10:00","period":"024","result":"8,4,0,0,1"},{"date":"2017-05-28","time":"01:55","period":"023","result":"3,6,0,7,8"},{"date":"2017-05-28","time":"01:50","period":"022","result":"2,2,6,3,9"},{"date":"2017-05-28","time":"01:45","period":"021","result":"5,3,1,5,9"},{"date":"2017-05-28","time":"01:40","period":"020","result":"4,2,0,1,2"},{"date":"2017-05-28","time":"01:35","period":"019","result":"4,0,4,1,3"},{"date":"2017-05-28","time":"01:30","period":"018","result":"8,5,7,4,7"},{"date":"2017-05-28","time":"01:25","period":"017","result":"6,9,9,5,6"},{"date":"2017-05-28","time":"01:20","period":"016","result":"8,4,6,5,0"},{"date":"2017-05-28","time":"01:15","period":"015","result":"7,0,1,2,9"},{"date":"2017-05-28","time":"01:10","period":"014","result":"1,8,0,7,8"},{"date":"2017-05-28","time":"01:05","period":"013","result":"3,4,7,6,4"},{"date":"2017-05-28","time":"01:00","period":"012","result":"3,6,1,9,3"},{"date":"2017-05-28","time":"00:55","period":"011","result":"2,3,0,8,7"},{"date":"2017-05-28","time":"00:50","period":"010","result":"9,6,2,2,5"},{"date":"2017-05-28","time":"00:45","period":"009","result":"8,9,7,5,1"},{"date":"2017-05-28","time":"00:40","period":"008","result":"4,6,5,6,1"},{"date":"2017-05-28","time":"00:35","period":"007","result":"7,2,1,3,2"},{"date":"2017-05-28","time":"00:30","period":"006","result":"3,8,9,1,7"},{"date":"2017-05-28","time":"00:25","period":"005","result":"2,4,0,2,3"},{"date":"2017-05-28","time":"00:20","period":"004","result":"5,0,5,6,5"},{"date":"2017-05-28","time":"00:15","period":"003","result":"1,3,6,2,4"},{"date":"2017-05-28","time":"00:10","period":"002","result":"2,4,6,6,6"},{"date":"2017-05-28","time":"00:05","period":"001","result":"2,1,6,0,5"},{"date":"2017-05-27","time":"00:00","period":"120","result":"7,4,6,4,0"},{"date":"2017-05-27","time":"23:55","period":"119","result":"2,7,2,0,9"},{"date":"2017-05-27","time":"23:50","period":"118","result":"1,8,1,1,9"},{"date":"2017-05-27","time":"23:45","period":"117","result":"8,9,2,1,6"},{"date":"2017-05-27","time":"23:40","period":"116","result":"2,0,0,4,4"},{"date":"2017-05-27","time":"23:35","period":"115","result":"3,8,3,9,6"},{"date":"2017-05-27","time":"23:30","period":"114","result":"2,9,1,7,2"},{"date":"2017-05-27","time":"23:25","period":"113","result":"7,8,6,9,8"},{"date":"2017-05-27","time":"23:20","period":"112","result":"3,8,4,8,4"},{"date":"2017-05-27","time":"23:15","period":"111","result":"2,7,7,7,6"},{"date":"2017-05-27","time":"23:10","period":"110","result":"8,6,2,8,9"},{"date":"2017-05-27","time":"23:05","period":"109","result":"1,3,2,8,0"},{"date":"2017-05-27","time":"23:00","period":"108","result":"7,3,0,4,1"},{"date":"2017-05-27","time":"22:55","period":"107","result":"9,1,3,7,6"},{"date":"2017-05-27","time":"22:50","period":"106","result":"9,7,6,0,6"},{"date":"2017-05-27","time":"22:45","period":"105","result":"3,9,3,5,7"},{"date":"2017-05-27","time":"22:40","period":"104","result":"6,7,0,3,2"},{"date":"2017-05-27","time":"22:35","period":"103","result":"3,6,7,6,3"},{"date":"2017-05-27","time":"22:30","period":"102","result":"3,1,4,2,1"},{"date":"2017-05-27","time":"22:25","period":"101","result":"4,0,2,3,2"},{"date":"2017-05-27","time":"22:20","period":"100","result":"7,1,3,9,6"},{"date":"2017-05-27","time":"22:15","period":"099","result":"6,4,2,0,6"},{"date":"2017-05-27","time":"22:10","period":"098","result":"1,9,0,7,2"},{"date":"2017-05-27","time":"22:05","period":"097","result":"3,6,9,6,3"},{"date":"2017-05-27","time":"22:00","period":"096","result":"9,3,2,0,5"},{"date":"2017-05-27","time":"21:50","period":"095","result":"7,5,7,7,3"},{"date":"2017-05-27","time":"21:40","period":"094","result":"2,4,2,3,0"},{"date":"2017-05-27","time":"21:30","period":"093","result":"5,4,6,5,3"},{"date":"2017-05-27","time":"21:20","period":"092","result":"6,0,1,1,2"},{"date":"2017-05-27","time":"21:10","period":"091","result":"4,6,5,0,1"},{"date":"2017-05-27","time":"21:00","period":"090","result":"0,9,8,8,7"},{"date":"2017-05-27","time":"20:50","period":"089","result":"3,8,1,7,5"},{"date":"2017-05-27","time":"20:40","period":"088","result":"2,1,7,0,1"},{"date":"2017-05-27","time":"20:30","period":"087","result":"7,4,5,6,9"},{"date":"2017-05-27","time":"20:20","period":"086","result":"4,9,3,7,7"},{"date":"2017-05-27","time":"20:10","period":"085","result":"3,7,5,2,7"},{"date":"2017-05-27","time":"20:00","period":"084","result":"5,6,3,6,6"},{"date":"2017-05-27","time":"19:50","period":"083","result":"4,1,1,4,8"},{"date":"2017-05-27","time":"19:40","period":"082","result":"4,2,8,2,7"},{"date":"2017-05-27","time":"19:30","period":"081","result":"3,4,6,4,5"},{"date":"2017-05-27","time":"19:20","period":"080","result":"3,6,7,9,3"},{"date":"2017-05-27","time":"19:10","period":"079","result":"7,4,0,6,3"},{"date":"2017-05-27","time":"19:00","period":"078","result":"2,7,7,5,2"},{"date":"2017-05-27","time":"18:50","period":"077","result":"9,8,3,1,6"},{"date":"2017-05-27","time":"18:40","period":"076","result":"2,3,9,7,9"},{"date":"2017-05-27","time":"18:30","period":"075","result":"5,5,5,8,5"},{"date":"2017-05-27","time":"18:20","period":"074","result":"4,6,6,4,3"},{"date":"2017-05-27","time":"18:10","period":"073","result":"1,0,3,1,6"},{"date":"2017-05-27","time":"18:00","period":"072","result":"8,0,3,6,8"},{"date":"2017-05-27","time":"17:50","period":"071","result":"8,2,2,5,9"},{"date":"2017-05-27","time":"17:40","period":"070","result":"2,8,6,2,4"},{"date":"2017-05-27","time":"17:30","period":"069","result":"1,1,5,7,9"},{"date":"2017-05-27","time":"17:20","period":"068","result":"4,2,5,4,0"},{"date":"2017-05-27","time":"17:10","period":"067","result":"0,7,0,8,9"},{"date":"2017-05-27","time":"17:00","period":"066","result":"8,8,8,1,3"},{"date":"2017-05-27","time":"16:50","period":"065","result":"1,9,5,7,3"},{"date":"2017-05-27","time":"16:40","period":"064","result":"9,9,6,8,9"},{"date":"2017-05-27","time":"16:30","period":"063","result":"0,0,2,0,4"},{"date":"2017-05-27","time":"16:20","period":"062","result":"6,8,6,0,8"},{"date":"2017-05-27","time":"16:10","period":"061","result":"0,3,1,8,9"},{"date":"2017-05-27","time":"16:00","period":"060","result":"2,2,3,2,3"},{"date":"2017-05-27","time":"15:50","period":"059","result":"3,4,2,0,0"},{"date":"2017-05-27","time":"15:40","period":"058","result":"9,2,3,1,9"},{"date":"2017-05-27","time":"15:30","period":"057","result":"2,4,2,8,9"},{"date":"2017-05-27","time":"15:20","period":"056","result":"9,8,7,1,4"},{"date":"2017-05-27","time":"15:10","period":"055","result":"1,6,7,1,0"},{"date":"2017-05-27","time":"15:00","period":"054","result":"7,5,4,7,8"},{"date":"2017-05-27","time":"14:50","period":"053","result":"0,0,0,9,1"},{"date":"2017-05-27","time":"14:40","period":"052","result":"8,3,0,8,0"},{"date":"2017-05-27","time":"14:30","period":"051","result":"6,2,8,7,0"}]
     * error : null
     */

    private int state;
    private Object error;
    private List<ItemsBean> items;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }

    public static class ItemsBean {
        /**
         * date : 2017-05-28
         * time : 14:20
         * period : 050
         * result : 4,0,9,7,9
         */

        private String date;
        private String time;
        private String period;
        private String result;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getPeriod() {
            return period;
        }

        public void setPeriod(String period) {
            this.period = period;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }
    }
}
