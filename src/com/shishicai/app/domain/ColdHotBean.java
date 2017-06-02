package com.shishicai.app.domain;

import java.util.List;

/**
 * Created by Administrator on 2017/5/23 0023.
 */

public class ColdHotBean {

    /**
     * state : 200
     * items : [{"ball":"num1","hot":[8],"warm":[1,9,4,7,5,3,2],"cold":[0,6]},{"ball":"num2","hot":[],"warm":[6,2,0,7,3,1,4,9,5,8],"cold":[]},{"ball":"num3","hot":[4],"warm":[7,2,9,0,3,8,1],"cold":[5,6]},{"ball":"num4","hot":[9,6],"warm":[5,8,3,0,2,7,4],"cold":[1]},{"ball":"num5","hot":[2],"warm":[6,4,5,0,9,8,7,3],"cold":[1]}]
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
         * ball : num1
         * hot : [8]
         * warm : [1,9,4,7,5,3,2]
         * cold : [0,6]
         */

        private String ball;
        private List<Integer> hot;
        private List<Integer> warm;
        private List<Integer> cold;

        public String getBall() {
            return ball;
        }

        public void setBall(String ball) {
            this.ball = ball;
        }

        public List<Integer> getHot() {
            return hot;
        }

        public void setHot(List<Integer> hot) {
            this.hot = hot;
        }

        public List<Integer> getWarm() {
            return warm;
        }

        public void setWarm(List<Integer> warm) {
            this.warm = warm;
        }

        public List<Integer> getCold() {
            return cold;
        }

        public void setCold(List<Integer> cold) {
            this.cold = cold;
        }
    }
}
