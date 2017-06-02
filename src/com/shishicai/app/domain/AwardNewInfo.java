package com.shishicai.app.domain;

/**
 * Created by Administrator on 2017/5/17 0017.
 */

public class AwardNewInfo {

    /**
     * state : 200
     * items : {"time":1495946516334,"current":{"period":"040","date":"2017-05-28","time":"12:40","result":"0,0,1,0,3"},"next":{"period":"041","date":"2017-05-28","time":"12:50","interval":483665,"delayinterval":30},"state":true}
     * error : null
     */

    private int state;
    private ItemsBean items;
    private Object error;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public ItemsBean getItems() {
        return items;
    }

    public void setItems(ItemsBean items) {
        this.items = items;
    }

    public Object getError() {
        return error;
    }

    public void setError(Object error) {
        this.error = error;
    }

    public static class ItemsBean {
        /**
         * time : 1495946516334
         * current : {"period":"040","date":"2017-05-28","time":"12:40","result":"0,0,1,0,3"}
         * next : {"period":"041","date":"2017-05-28","time":"12:50","interval":483665,"delayinterval":30}
         * state : true
         */

        private long time;
        private CurrentBean current;
        private NextBean next;
        private boolean state;

        public long getTime() {
            return time;
        }

        public void setTime(long time) {
            this.time = time;
        }

        public CurrentBean getCurrent() {
            return current;
        }

        public void setCurrent(CurrentBean current) {
            this.current = current;
        }

        public NextBean getNext() {
            return next;
        }

        public void setNext(NextBean next) {
            this.next = next;
        }

        public boolean isState() {
            return state;
        }

        public void setState(boolean state) {
            this.state = state;
        }

        public static class CurrentBean {
            /**
             * period : 040
             * date : 2017-05-28
             * time : 12:40
             * result : 0,0,1,0,3
             */

            private String period;
            private String date;
            private String time;
            private String result;

            public String getPeriod() {
                return period;
            }

            public void setPeriod(String period) {
                this.period = period;
            }

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

            public String getResult() {
                return result;
            }

            public void setResult(String result) {
                this.result = result;
            }
        }

        public static class NextBean {
            /**
             * period : 041
             * date : 2017-05-28
             * time : 12:50
             * interval : 483665
             * delayinterval : 30
             */

            private String period;
            private String date;
            private String time;
            private int interval;
            private int delayinterval;

            public String getPeriod() {
                return period;
            }

            public void setPeriod(String period) {
                this.period = period;
            }

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

            public int getInterval() {
                return interval;
            }

            public void setInterval(int interval) {
                this.interval = interval;
            }

            public int getDelayinterval() {
                return delayinterval;
            }

            public void setDelayinterval(int delayinterval) {
                this.delayinterval = delayinterval;
            }
        }
    }
}
