package com.shishicai.app.domain;

import java.util.List;

/**
 * Created by Administrator on 2017/5/17 0017.
 */

public class AwardReferInfo {

    /**
     * state : 200
     * items : [{"date":"2017-05-28","period":"094","result":"等待开奖","star":3,"data":[{"name":"第一球","data":[{"result":"0,4,6,7,9","state":0},{"result":"双","state":0},{"result":"大","state":0}]},{"name":"第二球","data":[{"result":"0,2,3,4,9","state":0},{"result":"双","state":0},{"result":"小","state":0}]},{"name":"第三球","data":[{"result":"0,6,7,8,9","state":0},{"result":"双","state":0},{"result":"大","state":0}]},{"name":"第四球","data":[{"result":"1,2,3,4,7","state":0},{"result":"单","state":0},{"result":"小","state":0}]},{"name":"第五球","data":[{"result":"1,3,4,5,7","state":0},{"result":"单","state":0},{"result":"小","state":0}]},{"name":"龙虎","data":[{"result":"龙","state":0}]}]},{"date":"2017-05-28","period":"093","result":"1,9,0,4,2","star":3,"data":[{"name":"第一球","data":[{"result":"0,1,6,7,9","state":1},{"result":"单","state":1},{"result":"大","state":2}]},{"name":"第二球","data":[{"result":"0,2,4,8,9","state":1},{"result":"双","state":2},{"result":"小","state":2}]},{"name":"第三球","data":[{"result":"2,4,5,7,8","state":2},{"result":"双","state":1},{"result":"大","state":2}]},{"name":"第四球","data":[{"result":"0,1,2,3,4","state":1},{"result":"双","state":1},{"result":"小","state":1}]},{"name":"第五球","data":[{"result":"0,1,4,5,8","state":2},{"result":"双","state":1},{"result":"小","state":1}]},{"name":"龙虎","data":[{"result":"虎","state":1}]}]},{"date":"2017-05-28","period":"092","result":"8,4,4,4,3","star":3,"data":[{"name":"第一球","data":[{"result":"0,1,3,5,7","state":2},{"result":"单","state":2},{"result":"小","state":2}]},{"name":"第二球","data":[{"result":"1,3,5,7,8","state":2},{"result":"单","state":2},{"result":"大","state":2}]},{"name":"第三球","data":[{"result":"1,4,5,7,9","state":1},{"result":"单","state":2},{"result":"大","state":2}]},{"name":"第四球","data":[{"result":"0,1,2,6,7","state":2},{"result":"双","state":1},{"result":"小","state":1}]},{"name":"第五球","data":[{"result":"0,1,2,5,7","state":2},{"result":"单","state":1},{"result":"小","state":1}]},{"name":"龙虎","data":[{"result":"虎","state":2}]}]},{"date":"2017-05-28","period":"091","result":"9,4,0,5,2","star":3,"data":[{"name":"第一球","data":[{"result":"0,1,3,7,9","state":1},{"result":"单","state":1},{"result":"小","state":2}]},{"name":"第二球","data":[{"result":"1,2,3,4,6","state":1},{"result":"双","state":1},{"result":"小","state":1}]},{"name":"第三球","data":[{"result":"1,4,6,7,9","state":2},{"result":"单","state":2},{"result":"大","state":2}]},{"name":"第四球","data":[{"result":"2,3,4,5,8","state":1},{"result":"双","state":2},{"result":"小","state":2}]},{"name":"第五球","data":[{"result":"1,2,3,5,9","state":1},{"result":"单","state":2},{"result":"小","state":1}]},{"name":"龙虎","data":[{"result":"虎","state":2}]}]},{"date":"2017-05-28","period":"090","result":"9,6,4,5,6","star":3,"data":[{"name":"第一球","data":[{"result":"3,4,6,7,8","state":2},{"result":"双","state":2},{"result":"大","state":1}]},{"name":"第二球","data":[{"result":"2,3,5,6,9","state":1},{"result":"单","state":2},{"result":"大","state":1}]},{"name":"第三球","data":[{"result":"0,5,6,7,8","state":2},{"result":"双","state":1},{"result":"大","state":2}]},{"name":"第四球","data":[{"result":"0,2,4,6,9","state":2},{"result":"双","state":2},{"result":"小","state":2}]},{"name":"第五球","data":[{"result":"0,2,4,6,7","state":1},{"result":"双","state":1},{"result":"小","state":2}]},{"name":"龙虎","data":[{"result":"龙","state":1}]}]},{"date":"2017-05-28","period":"089","result":"5,9,3,8,9","star":3,"data":[{"name":"第一球","data":[{"result":"0,4,5,8,9","state":1},{"result":"双","state":2},{"result":"大","state":1}]},{"name":"第二球","data":[{"result":"0,1,2,4,8","state":2},{"result":"双","state":2},{"result":"小","state":2}]},{"name":"第三球","data":[{"result":"0,3,5,8,9","state":1},{"result":"单","state":1},{"result":"大","state":2}]},{"name":"第四球","data":[{"result":"0,1,2,3,4","state":2},{"result":"双","state":1},{"result":"小","state":2}]},{"name":"第五球","data":[{"result":"0,1,3,4,6","state":2},{"result":"双","state":2},{"result":"小","state":2}]},{"name":"龙虎","data":[{"result":"龙","state":2}]}]},{"date":"2017-05-28","period":"088","result":"8,7,3,4,4","star":3,"data":[{"name":"第一球","data":[{"result":"1,3,4,5,8","state":1},{"result":"单","state":2},{"result":"小","state":2}]},{"name":"第二球","data":[{"result":"0,1,2,3,4","state":2},{"result":"双","state":2},{"result":"小","state":2}]},{"name":"第三球","data":[{"result":"1,6,7,8,9","state":2},{"result":"单","state":1},{"result":"大","state":2}]},{"name":"第四球","data":[{"result":"0,2,3,5,9","state":2},{"result":"单","state":2},{"result":"小","state":1}]},{"name":"第五球","data":[{"result":"0,1,3,5,8","state":2},{"result":"单","state":2},{"result":"小","state":1}]},{"name":"龙虎","data":[{"result":"龙","state":1}]}]},{"date":"2017-05-28","period":"087","result":"4,9,9,5,8","star":3,"data":[{"name":"第一球","data":[{"result":"0,3,6,8,9","state":2},{"result":"双","state":1},{"result":"大","state":2}]},{"name":"第二球","data":[{"result":"0,1,2,3,9","state":1},{"result":"单","state":1},{"result":"小","state":2}]},{"name":"第三球","data":[{"result":"1,4,5,6,8","state":2},{"result":"双","state":2},{"result":"大","state":1}]},{"name":"第四球","data":[{"result":"0,2,4,5,6","state":1},{"result":"双","state":2},{"result":"小","state":2}]},{"name":"第五球","data":[{"result":"0,1,4,8,9","state":1},{"result":"双","state":1},{"result":"小","state":2}]},{"name":"龙虎","data":[{"result":"龙","state":2}]}]},{"date":"2017-05-28","period":"086","result":"6,0,7,2,5","star":3,"data":[{"name":"第一球","data":[{"result":"0,4,5,6,7","state":1},{"result":"双","state":1},{"result":"大","state":1}]},{"name":"第二球","data":[{"result":"0,1,2,5,7","state":1},{"result":"单","state":2},{"result":"小","state":1}]},{"name":"第三球","data":[{"result":"2,3,6,7,8","state":1},{"result":"双","state":2},{"result":"大","state":1}]},{"name":"第四球","data":[{"result":"0,1,3,5,9","state":2},{"result":"单","state":2},{"result":"小","state":1}]},{"name":"第五球","data":[{"result":"1,3,4,7,8","state":2},{"result":"单","state":1},{"result":"小","state":2}]},{"name":"龙虎","data":[{"result":"龙","state":1}]}]},{"date":"2017-05-28","period":"085","result":"0,0,5,9,4","star":3,"data":[{"name":"第一球","data":[{"result":"5,6,7,8,9","state":2},{"result":"单","state":2},{"result":"大","state":2}]},{"name":"第二球","data":[{"result":"1,2,3,4,5","state":2},{"result":"单","state":2},{"result":"小","state":1}]},{"name":"第三球","data":[{"result":"0,1,5,7,9","state":1},{"result":"单","state":1},{"result":"大","state":1}]},{"name":"第四球","data":[{"result":"0,2,4,5,8","state":2},{"result":"双","state":2},{"result":"小","state":2}]},{"name":"第五球","data":[{"result":"1,2,3,4,8","state":1},{"result":"双","state":1},{"result":"小","state":1}]},{"name":"龙虎","data":[{"result":"龙","state":2}]}]},{"date":"2017-05-28","period":"084","result":"5,0,6,5,0","star":3,"data":[{"name":"第一球","data":[{"result":"0,3,5,6,8","state":1},{"result":"双","state":2},{"result":"大","state":1}]},{"name":"第二球","data":[{"result":"2,3,4,8,9","state":2},{"result":"双","state":1},{"result":"小","state":1}]},{"name":"第三球","data":[{"result":"1,5,6,7,9","state":1},{"result":"单","state":2},{"result":"大","state":1}]},{"name":"第四球","data":[{"result":"2,4,5,6,7","state":1},{"result":"双","state":2},{"result":"大","state":1}]},{"name":"第五球","data":[{"result":"1,2,3,5,7","state":2},{"result":"单","state":2},{"result":"小","state":1}]},{"name":"龙虎","data":[{"result":"平","state":2}]}]},{"date":"2017-05-28","period":"083","result":"6,2,6,6,9","star":3,"data":[{"name":"第一球","data":[{"result":"0,4,5,8,9","state":2},{"result":"双","state":1},{"result":"大","state":1}]},{"name":"第二球","data":[{"result":"0,1,2,3,4","state":1},{"result":"双","state":1},{"result":"小","state":1}]},{"name":"第三球","data":[{"result":"1,3,6,7,9","state":1},{"result":"单","state":2},{"result":"大","state":1}]},{"name":"第四球","data":[{"result":"1,2,4,5,6","state":1},{"result":"双","state":1},{"result":"小","state":2}]},{"name":"第五球","data":[{"result":"0,1,2,3,4","state":2},{"result":"双","state":2},{"result":"小","state":2}]},{"name":"龙虎","data":[{"result":"龙","state":2}]}]},{"date":"2017-05-28","period":"082","result":"7,7,1,6,0","star":3,"data":[{"name":"第一球","data":[{"result":"0,1,5,8,9","state":2},{"result":"单","state":1},{"result":"大","state":1}]},{"name":"第二球","data":[{"result":"0,1,2,4,7","state":1},{"result":"双","state":2},{"result":"小","state":2}]},{"name":"第三球","data":[{"result":"0,3,4,8,9","state":2},{"result":"双","state":2},{"result":"小","state":1}]},{"name":"第四球","data":[{"result":"1,2,3,4,7","state":2},{"result":"单","state":2},{"result":"小","state":2}]},{"name":"第五球","data":[{"result":"2,3,5,6,8","state":2},{"result":"双","state":1},{"result":"大","state":2}]},{"name":"龙虎","data":[{"result":"平","state":2}]}]},{"date":"2017-05-28","period":"081","result":"1,5,8,9,1","star":3,"data":[{"name":"第一球","data":[{"result":"0,6,7,8,9","state":2},{"result":"双","state":2},{"result":"大","state":2}]},{"name":"第二球","data":[{"result":"0,2,3,6,9","state":2},{"result":"双","state":2},{"result":"小","state":2}]},{"name":"第三球","data":[{"result":"0,1,7,8,9","state":1},{"result":"单","state":2},{"result":"大","state":1}]},{"name":"第四球","data":[{"result":"2,3,4,8,9","state":1},{"result":"双","state":2},{"result":"小","state":2}]},{"name":"第五球","data":[{"result":"0,1,3,4,7","state":1},{"result":"单","state":1},{"result":"小","state":1}]},{"name":"龙虎","data":[{"result":"龙","state":2}]}]},{"date":"2017-05-28","period":"080","result":"4,5,9,8,9","star":3,"data":[{"name":"第一球","data":[{"result":"0,5,6,7,8","state":2},{"result":"双","state":1},{"result":"大","state":2}]},{"name":"第二球","data":[{"result":"3,5,6,7,9","state":1},{"result":"单","state":1},{"result":"大","state":1}]},{"name":"第三球","data":[{"result":"0,1,3,5,7","state":2},{"result":"单","state":1},{"result":"小","state":2}]},{"name":"第四球","data":[{"result":"2,4,6,7,9","state":2},{"result":"双","state":1},{"result":"大","state":1}]},{"name":"第五球","data":[{"result":"2,4,5,6,8","state":2},{"result":"双","state":2},{"result":"大","state":1}]},{"name":"龙虎","data":[{"result":"平","state":2}]}]},{"date":"2017-05-28","period":"079","result":"2,9,4,5,3","star":3,"data":[{"name":"第一球","data":[{"result":"1,2,4,8,9","state":1},{"result":"双","state":1},{"result":"小","state":1}]},{"name":"第二球","data":[{"result":"0,2,3,5,7","state":2},{"result":"单","state":1},{"result":"小","state":2}]},{"name":"第三球","data":[{"result":"0,1,6,7,9","state":2},{"result":"单","state":2},{"result":"大","state":2}]},{"name":"第四球","data":[{"result":"1,2,4,5,8","state":1},{"result":"双","state":2},{"result":"小","state":2}]},{"name":"第五球","data":[{"result":"0,4,5,8,9","state":2},{"result":"双","state":2},{"result":"大","state":2}]},{"name":"龙虎","data":[{"result":"平","state":2}]}]},{"date":"2017-05-28","period":"078","result":"6,0,5,7,4","star":3,"data":[{"name":"第一球","data":[{"result":"1,4,5,7,8","state":2},{"result":"单","state":2},{"result":"大","state":1}]},{"name":"第二球","data":[{"result":"2,3,4,5,9","state":2},{"result":"单","state":2},{"result":"小","state":1}]},{"name":"第三球","data":[{"result":"0,5,7,8,9","state":1},{"result":"单","state":1},{"result":"大","state":1}]},{"name":"第四球","data":[{"result":"0,2,3,4,5","state":2},{"result":"双","state":2},{"result":"小","state":2}]},{"name":"第五球","data":[{"result":"2,3,4,5,7","state":1},{"result":"单","state":2},{"result":"小","state":1}]},{"name":"龙虎","data":[{"result":"龙","state":1}]}]},{"date":"2017-05-28","period":"077","result":"5,4,0,4,7","star":3,"data":[{"name":"第一球","data":[{"result":"1,4,7,8,9","state":2},{"result":"单","state":1},{"result":"大","state":1}]},{"name":"第二球","data":[{"result":"1,2,3,5,9","state":2},{"result":"单","state":2},{"result":"小","state":1}]},{"name":"第三球","data":[{"result":"1,6,7,8,9","state":2},{"result":"单","state":2},{"result":"大","state":2}]},{"name":"第四球","data":[{"result":"0,1,2,5,6","state":2},{"result":"双","state":1},{"result":"小","state":1}]},{"name":"第五球","data":[{"result":"0,1,2,3,4","state":2},{"result":"双","state":2},{"result":"小","state":2}]},{"name":"龙虎","data":[{"result":"龙","state":2}]}]},{"date":"2017-05-28","period":"076","result":"2,5,2,0,7","star":3,"data":[{"name":"第一球","data":[{"result":"0,6,7,8,9","state":2},{"result":"双","state":1},{"result":"大","state":2}]},{"name":"第二球","data":[{"result":"1,2,4,6,7","state":2},{"result":"双","state":2},{"result":"小","state":2}]},{"name":"第三球","data":[{"result":"3,6,7,8,9","state":2},{"result":"单","state":2},{"result":"大","state":2}]},{"name":"第四球","data":[{"result":"1,2,3,6,7","state":2},{"result":"单","state":2},{"result":"小","state":1}]},{"name":"第五球","data":[{"result":"0,2,3,4,7","state":1},{"result":"双","state":2},{"result":"小","state":2}]},{"name":"龙虎","data":[{"result":"龙","state":2}]}]},{"date":"2017-05-28","period":"075","result":"9,5,5,0,6","star":3,"data":[{"name":"第一球","data":[{"result":"3,4,5,6,9","state":1},{"result":"单","state":1},{"result":"大","state":1}]},{"name":"第二球","data":[{"result":"0,1,2,3,8","state":2},{"result":"双","state":2},{"result":"小","state":2}]},{"name":"第三球","data":[{"result":"0,1,7,8,9","state":2},{"result":"单","state":1},{"result":"大","state":1}]},{"name":"第四球","data":[{"result":"0,1,2,3,6","state":1},{"result":"双","state":1},{"result":"小","state":1}]},{"name":"第五球","data":[{"result":"2,3,4,6,7","state":1},{"result":"双","state":1},{"result":"小","state":2}]},{"name":"龙虎","data":[{"result":"龙","state":1}]}]},{"date":"2017-05-28","period":"074","result":"0,9,2,8,0","star":3,"data":[{"name":"第一球","data":[{"result":"3,5,6,7,8","state":2},{"result":"单","state":2},{"result":"大","state":2}]},{"name":"第二球","data":[{"result":"0,1,2,3,5","state":2},{"result":"单","state":1},{"result":"小","state":2}]},{"name":"第三球","data":[{"result":"0,4,5,8,9","state":2},{"result":"双","state":1},{"result":"大","state":2}]},{"name":"第四球","data":[{"result":"0,2,3,4,9","state":2},{"result":"双","state":1},{"result":"小","state":2}]},{"name":"第五球","data":[{"result":"0,3,4,5,6","state":1},{"result":"双","state":1},{"result":"小","state":1}]},{"name":"龙虎","data":[{"result":"龙","state":2}]}]}]
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
         * period : 094
         * result : 等待开奖
         * star : 3
         * data : [{"name":"第一球","data":[{"result":"0,4,6,7,9","state":0},{"result":"双","state":0},{"result":"大","state":0}]},{"name":"第二球","data":[{"result":"0,2,3,4,9","state":0},{"result":"双","state":0},{"result":"小","state":0}]},{"name":"第三球","data":[{"result":"0,6,7,8,9","state":0},{"result":"双","state":0},{"result":"大","state":0}]},{"name":"第四球","data":[{"result":"1,2,3,4,7","state":0},{"result":"单","state":0},{"result":"小","state":0}]},{"name":"第五球","data":[{"result":"1,3,4,5,7","state":0},{"result":"单","state":0},{"result":"小","state":0}]},{"name":"龙虎","data":[{"result":"龙","state":0}]}]
         */

        private String date;
        private String period;
        private String result;
        private int star;
        private List<DataBeanX> data;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
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

        public int getStar() {
            return star;
        }

        public void setStar(int star) {
            this.star = star;
        }

        public List<DataBeanX> getData() {
            return data;
        }

        public void setData(List<DataBeanX> data) {
            this.data = data;
        }

        public static class DataBeanX {
            /**
             * name : 第一球
             * data : [{"result":"0,4,6,7,9","state":0},{"result":"双","state":0},{"result":"大","state":0}]
             */

            private String name;
            private List<DataBean> data;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<DataBean> getData() {
                return data;
            }

            public void setData(List<DataBean> data) {
                this.data = data;
            }

            public static class DataBean {
                /**
                 * result : 0,4,6,7,9
                 * state : 0
                 */

                private String result;
                private int state;

                public String getResult() {
                    return result;
                }

                public void setResult(String result) {
                    this.result = result;
                }

                public int getState() {
                    return state;
                }

                public void setState(int state) {
                    this.state = state;
                }
            }
        }
    }
}
