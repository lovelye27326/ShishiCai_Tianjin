package com.shishicai.app.domain;

import java.util.List;

/**
 * Created by Administrator on 2017/5/10 0010.
 */

public class AwardStatisticInfo {

    /**
     * state : 200
     * items : [{"date":"2017-05-28","data":"44,29,43,36,44,38,38,43,31,34"},{"date":"2017-05-27","data":"59,57,64,76,58,43,56,63,61,63"},{"date":"2017-05-26","data":"63,70,55,63,65,61,48,59,55,61"},{"date":"2017-05-25","data":"47,63,77,74,52,60,53,55,58,61"},{"date":"2017-05-24","data":"76,54,59,64,62,51,47,57,66,64"},{"date":"2017-05-23","data":"66,60,60,67,54,70,61,55,56,51"},{"date":"2017-05-22","data":"56,72,54,46,69,53,60,76,58,56"},{"date":"2017-05-21","data":"64,52,62,71,53,50,60,73,49,66"},{"date":"2017-05-20","data":"63,56,57,61,49,59,81,61,54,59"},{"date":"2017-05-19","data":"64,62,54,58,57,49,87,65,56,48"},{"date":"2017-05-18","data":"59,69,62,67,59,57,51,54,74,48"},{"date":"2017-05-17","data":"52,60,69,53,65,53,78,61,55,54"},{"date":"2017-05-16","data":"54,55,59,67,57,76,64,52,52,64"},{"date":"2017-05-15","data":"57,64,49,66,63,55,60,66,65,55"},{"date":"2017-05-14","data":"63,62,60,61,53,68,57,73,47,56"},{"date":"2017-05-13","data":"67,63,57,69,45,53,54,73,64,55"},{"date":"2017-05-12","data":"75,52,64,56,53,57,72,57,61,53"},{"date":"2017-05-11","data":"54,66,57,54,60,64,55,71,54,65"},{"date":"2017-05-10","data":"42,52,57,71,63,55,55,63,77,65"},{"date":"2017-05-09","data":"54,59,71,53,83,57,52,50,65,56"},{"date":"2017-05-08","data":"61,61,68,66,60,61,57,47,42,77"},{"date":"2017-05-07","data":"61,57,59,67,49,59,61,66,63,58"},{"date":"2017-05-06","data":"62,59,46,60,75,57,64,56,62,59"},{"date":"2017-05-05","data":"55,59,58,70,58,54,61,61,75,49"},{"date":"2017-05-04","data":"58,69,48,55,60,58,62,59,64,67"},{"date":"2017-05-03","data":"69,56,62,76,59,60,54,60,47,57"},{"date":"2017-05-02","data":"46,63,46,69,48,62,66,60,72,68"},{"date":"2017-05-01","data":"44,64,58,59,57,70,57,80,44,67"},{"date":"2017-04-30","data":"52,51,69,58,70,50,62,68,52,68"},{"date":"2017-04-29","data":"60,54,64,52,78,61,56,50,69,56"},{"date":"2017-04-28","data":"59,48,59,55,58,59,82,66,51,63"}]
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
         * data : 44,29,43,36,44,38,38,43,31,34
         */

        private String date;
        private String data;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }
    }
}
