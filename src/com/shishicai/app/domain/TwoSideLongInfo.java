package com.shishicai.app.domain;

import java.util.List;

/**
 * Created by Administrator on 2017/5/19 0019.
 */

public class TwoSideLongInfo {

    /**
     * state : 200
     * items : [{"name":"总和","result":"双","count":3},{"name":"总和","result":"小","count":3},{"name":"第二球","result":"小","count":2},{"name":"第二球","result":"合","count":2},{"name":"第二球","result":"双","count":2},{"name":"第一球","result":"大","count":2},{"name":"第三球","result":"单","count":1},{"name":"第四球","result":"质","count":1},{"name":"第四球","result":"大","count":1},{"name":"第四球","result":"单","count":1},{"name":"第五球","result":"小","count":1},{"name":"第五球","result":"合","count":1},{"name":"第五球","result":"双","count":1},{"name":"第一球","result":"双","count":1},{"name":"第一球","result":"合","count":1},{"name":"第三球","result":"质","count":1},{"name":"第三球","result":"大","count":1},{"name":"龙虎","result":"龙","count":1}]
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
         * name : 总和
         * result : 双
         * count : 3
         */

        private String name;
        private String result;
        private int count;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }
}
