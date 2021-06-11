package com.example.financeapp;


import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class model implements Serializable {


    /**
     * resultcode : 200
     * reason : SUCCESSED!
     * result : [{"1":{"variety":"Au100g","latestpri":"387.50","openpri":"383.78","maxpri":"387.50","minpri":"383.76","limit":"0.24%","yespri":"386.56","totalvol":"38.00","time":"2021-06-11 01:08:55"},"2":{"variety":"Au(T+N1)","latestpri":"383.70","openpri":"382.85","maxpri":"383.70","minpri":"382.85","limit":"-0.38%","yespri":"385.15","totalvol":"22.00","time":"2021-06-11 02:22:05"},"3":{"variety":"Au(T+D)","latestpri":"387.38","openpri":"383.94","maxpri":"387.50","minpri":"383.21","limit":"0.65%","yespri":"384.89","totalvol":"10184.00","time":"2021-06-11 02:26:32"},"4":{"variety":"Au99.99","latestpri":"387.00","openpri":"383.20","maxpri":"387.00","minpri":"382.01","limit":"0.59%","yespri":"384.73","totalvol":"7272.00","time":"2021-06-11 02:26:24"},"5":{"variety":"Au99.95","latestpri":"387.00","openpri":"387.00","maxpri":"387.00","minpri":"387.00","limit":"0.56%","yespri":"384.86","totalvol":"72.00","time":"2021-06-11 02:20:25"},"6":{"variety":"Au50g","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"255.00","totalvol":"--","time":"2021-06-10 20:00:00"},"7":{"variety":"Ag99.99","latestpri":"--","openpri":"5606.00","maxpri":"5606.00","minpri":"5606.00","limit":"--","yespri":"5606.00","totalvol":"--","time":"2021-06-10 20:00:00"},"8":{"variety":"Ag(T+D)","latestpri":"5634.00","openpri":"5580.00","maxpri":"5640.00","minpri":"5558.00","limit":"0.95%","yespri":"5581.00","totalvol":"3235372.00","time":"2021-06-11 02:26:32"},"9":{"variety":"Au(T+N2)","latestpri":"388.80","openpri":"384.20","maxpri":"388.80","minpri":"384.20","limit":"0.66%","yespri":"386.25","totalvol":"104.00","time":"2021-06-11 02:23:33"},"10":{"variety":"Pt99.95","latestpri":"241.90","openpri":"242.60","maxpri":"242.80","minpri":"241.90","limit":"-0.71%","yespri":"243.62","totalvol":"286.00","time":"2021-06-11 02:25:20"},"11":{"variety":"AU995","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"384.00","totalvol":"--","time":"2021-06-10 20:00:00"},"12":{"variety":"AU99.99","latestpri":"387.00","openpri":"383.20","maxpri":"387.00","minpri":"382.01","limit":"0.59%","yespri":"384.73","totalvol":"72724.00","time":"2021-06-11 02:26:24"},"13":{"variety":"MAUTD","latestpri":"387.40","openpri":"383.64","maxpri":"387.48","minpri":"383.45","limit":"0.72%","yespri":"384.62","totalvol":"19984.00","time":"2021-06-11 02:26:32"},"14":{"variety":"IAU99.99","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"387.00","totalvol":"--","time":"2021-06-10 20:00:00"},"15":{"variety":"IAU100G","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"371.50","totalvol":"--","time":"2021-06-10 20:00:00"},"16":{"variety":"IAU99.5","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"237.80","totalvol":"--","time":"2021-06-10 20:00:00"}}]
     * error_code : 0
     */

    private String resultcode;
    private String reason;
    private int error_code;
    private List<ResultBean> result;

    @Data
    public static class ResultBean implements Serializable {
        /**
         * 1 : {"variety":"Au100g","latestpri":"387.50","openpri":"383.78","maxpri":"387.50","minpri":"383.76","limit":"0.24%","yespri":"386.56","totalvol":"38.00","time":"2021-06-11 01:08:55"}
         * 2 : {"variety":"Au(T+N1)","latestpri":"383.70","openpri":"382.85","maxpri":"383.70","minpri":"382.85","limit":"-0.38%","yespri":"385.15","totalvol":"22.00","time":"2021-06-11 02:22:05"}
         * 3 : {"variety":"Au(T+D)","latestpri":"387.38","openpri":"383.94","maxpri":"387.50","minpri":"383.21","limit":"0.65%","yespri":"384.89","totalvol":"10184.00","time":"2021-06-11 02:26:32"}
         * 4 : {"variety":"Au99.99","latestpri":"387.00","openpri":"383.20","maxpri":"387.00","minpri":"382.01","limit":"0.59%","yespri":"384.73","totalvol":"7272.00","time":"2021-06-11 02:26:24"}
         * 5 : {"variety":"Au99.95","latestpri":"387.00","openpri":"387.00","maxpri":"387.00","minpri":"387.00","limit":"0.56%","yespri":"384.86","totalvol":"72.00","time":"2021-06-11 02:20:25"}
         * 6 : {"variety":"Au50g","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"255.00","totalvol":"--","time":"2021-06-10 20:00:00"}
         * 7 : {"variety":"Ag99.99","latestpri":"--","openpri":"5606.00","maxpri":"5606.00","minpri":"5606.00","limit":"--","yespri":"5606.00","totalvol":"--","time":"2021-06-10 20:00:00"}
         * 8 : {"variety":"Ag(T+D)","latestpri":"5634.00","openpri":"5580.00","maxpri":"5640.00","minpri":"5558.00","limit":"0.95%","yespri":"5581.00","totalvol":"3235372.00","time":"2021-06-11 02:26:32"}
         * 9 : {"variety":"Au(T+N2)","latestpri":"388.80","openpri":"384.20","maxpri":"388.80","minpri":"384.20","limit":"0.66%","yespri":"386.25","totalvol":"104.00","time":"2021-06-11 02:23:33"}
         * 10 : {"variety":"Pt99.95","latestpri":"241.90","openpri":"242.60","maxpri":"242.80","minpri":"241.90","limit":"-0.71%","yespri":"243.62","totalvol":"286.00","time":"2021-06-11 02:25:20"}
         * 11 : {"variety":"AU995","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"384.00","totalvol":"--","time":"2021-06-10 20:00:00"}
         * 12 : {"variety":"AU99.99","latestpri":"387.00","openpri":"383.20","maxpri":"387.00","minpri":"382.01","limit":"0.59%","yespri":"384.73","totalvol":"72724.00","time":"2021-06-11 02:26:24"}
         * 13 : {"variety":"MAUTD","latestpri":"387.40","openpri":"383.64","maxpri":"387.48","minpri":"383.45","limit":"0.72%","yespri":"384.62","totalvol":"19984.00","time":"2021-06-11 02:26:32"}
         * 14 : {"variety":"IAU99.99","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"387.00","totalvol":"--","time":"2021-06-10 20:00:00"}
         * 15 : {"variety":"IAU100G","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"371.50","totalvol":"--","time":"2021-06-10 20:00:00"}
         * 16 : {"variety":"IAU99.5","latestpri":"--","openpri":"--","maxpri":"--","minpri":"--","limit":"--","yespri":"237.80","totalvol":"--","time":"2021-06-10 20:00:00"}
         */

        @SerializedName("1")
        private _$1Bean _$1;
        @SerializedName("2")
        private _$2Bean _$2;
        @SerializedName("3")
        private _$3Bean _$3;
        @SerializedName("4")
        private _$4Bean _$4;
        @SerializedName("5")
        private _$5Bean _$5;
        @SerializedName("6")
        private _$6Bean _$6;
        @SerializedName("7")
        private _$7Bean _$7;
        @SerializedName("8")
        private _$8Bean _$8;
        @SerializedName("9")
        private _$9Bean _$9;
        @SerializedName("10")
        private _$10Bean _$10;
        @SerializedName("11")
        private _$11Bean _$11;
        @SerializedName("12")
        private _$12Bean _$12;
        @SerializedName("13")
        private _$13Bean _$13;
        @SerializedName("14")
        private _$14Bean _$14;
        @SerializedName("15")
        private _$15Bean _$15;
        @SerializedName("16")
        private _$16Bean _$16;

        @Data
        public static class _$1Bean implements Serializable {
            /**
             * variety : Au100g
             * latestpri : 387.50
             * openpri : 383.78
             * maxpri : 387.50
             * minpri : 383.76
             * limit : 0.24%
             * yespri : 386.56
             * totalvol : 38.00
             * time : 2021-06-11 01:08:55
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;
        }

        @Data
        public static class _$2Bean implements Serializable {
            /**
             * variety : Au(T+N1)
             * latestpri : 383.70
             * openpri : 382.85
             * maxpri : 383.70
             * minpri : 382.85
             * limit : -0.38%
             * yespri : 385.15
             * totalvol : 22.00
             * time : 2021-06-11 02:22:05
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;
        }

        @Data
        public static class _$3Bean implements Serializable {
            /**
             * variety : Au(T+D)
             * latestpri : 387.38
             * openpri : 383.94
             * maxpri : 387.50
             * minpri : 383.21
             * limit : 0.65%
             * yespri : 384.89
             * totalvol : 10184.00
             * time : 2021-06-11 02:26:32
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;
        }

        @Data
        public static class _$4Bean implements Serializable {
            /**
             * variety : Au99.99
             * latestpri : 387.00
             * openpri : 383.20
             * maxpri : 387.00
             * minpri : 382.01
             * limit : 0.59%
             * yespri : 384.73
             * totalvol : 7272.00
             * time : 2021-06-11 02:26:24
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;
        }

        @Data
        public static class _$5Bean implements Serializable {
            /**
             * variety : Au99.95
             * latestpri : 387.00
             * openpri : 387.00
             * maxpri : 387.00
             * minpri : 387.00
             * limit : 0.56%
             * yespri : 384.86
             * totalvol : 72.00
             * time : 2021-06-11 02:20:25
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;
        }

        @Data
        public static class _$6Bean implements Serializable {
            /**
             * variety : Au50g
             * latestpri : --
             * openpri : --
             * maxpri : --
             * minpri : --
             * limit : --
             * yespri : 255.00
             * totalvol : --
             * time : 2021-06-10 20:00:00
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;
        }

        @Data
        public static class _$7Bean implements Serializable {
            /**
             * variety : Ag99.99
             * latestpri : --
             * openpri : 5606.00
             * maxpri : 5606.00
             * minpri : 5606.00
             * limit : --
             * yespri : 5606.00
             * totalvol : --
             * time : 2021-06-10 20:00:00
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;
        }

        @Data
        public static class _$8Bean implements Serializable {
            /**
             * variety : Ag(T+D)
             * latestpri : 5634.00
             * openpri : 5580.00
             * maxpri : 5640.00
             * minpri : 5558.00
             * limit : 0.95%
             * yespri : 5581.00
             * totalvol : 3235372.00
             * time : 2021-06-11 02:26:32
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;
        }

        @Data
        public static class _$9Bean implements Serializable {
            /**
             * variety : Au(T+N2)
             * latestpri : 388.80
             * openpri : 384.20
             * maxpri : 388.80
             * minpri : 384.20
             * limit : 0.66%
             * yespri : 386.25
             * totalvol : 104.00
             * time : 2021-06-11 02:23:33
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;
        }

        @Data
        public static class _$10Bean implements Serializable {
            /**
             * variety : Pt99.95
             * latestpri : 241.90
             * openpri : 242.60
             * maxpri : 242.80
             * minpri : 241.90
             * limit : -0.71%
             * yespri : 243.62
             * totalvol : 286.00
             * time : 2021-06-11 02:25:20
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;
        }

        @Data
        public static class _$11Bean implements Serializable {
            /**
             * variety : AU995
             * latestpri : --
             * openpri : --
             * maxpri : --
             * minpri : --
             * limit : --
             * yespri : 384.00
             * totalvol : --
             * time : 2021-06-10 20:00:00
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;
        }

        @Data
        public static class _$12Bean implements Serializable {
            /**
             * variety : AU99.99
             * latestpri : 387.00
             * openpri : 383.20
             * maxpri : 387.00
             * minpri : 382.01
             * limit : 0.59%
             * yespri : 384.73
             * totalvol : 72724.00
             * time : 2021-06-11 02:26:24
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;
        }

        @Data
        public static class _$13Bean implements Serializable {
            /**
             * variety : MAUTD
             * latestpri : 387.40
             * openpri : 383.64
             * maxpri : 387.48
             * minpri : 383.45
             * limit : 0.72%
             * yespri : 384.62
             * totalvol : 19984.00
             * time : 2021-06-11 02:26:32
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;
        }

        @Data
        public static class _$14Bean implements Serializable {
            /**
             * variety : IAU99.99
             * latestpri : --
             * openpri : --
             * maxpri : --
             * minpri : --
             * limit : --
             * yespri : 387.00
             * totalvol : --
             * time : 2021-06-10 20:00:00
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;
        }

        @Data
        public static class _$15Bean implements Serializable {
            /**
             * variety : IAU100G
             * latestpri : --
             * openpri : --
             * maxpri : --
             * minpri : --
             * limit : --
             * yespri : 371.50
             * totalvol : --
             * time : 2021-06-10 20:00:00
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;
        }

        @Data
        public static class _$16Bean implements Serializable {
            /**
             * variety : IAU99.5
             * latestpri : --
             * openpri : --
             * maxpri : --
             * minpri : --
             * limit : --
             * yespri : 237.80
             * totalvol : --
             * time : 2021-06-10 20:00:00
             */

            private String variety;
            private String latestpri;
            private String openpri;
            private String maxpri;
            private String minpri;
            private String limit;
            private String yespri;
            private String totalvol;
            private String time;
        }
    }
}
