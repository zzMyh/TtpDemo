package cn.myh.zz.myokhttputils_greendao.Bean;

import java.util.List;

/**
 * Created by lenovo on 2017/12/11.
 */

public class BaseInfo<T> {
    /**
     * code : 200
     * message : ok
     * info : {"houseWanteds":[{"id":75,"accountId":101,"area":410107,"plotName":"祝福红城","roomNum":1,"roomTing":0,"roomWei":0,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"800以下","decorateSituation":0,"intoDate":1510329600000,"createTime":1510039087000,"updateTime":null,"account":"13937113994","realName":"方振峰","areaName":"高新区","offset":0,"pageNum":0,"pageSize":0},{"id":73,"accountId":123,"area":410108,"plotName":"","roomNum":2,"roomTing":1,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"1500-2000","decorateSituation":2,"intoDate":1509984000000,"createTime":1510037912000,"updateTime":null,"account":"18224512765","realName":"张韶垒","areaName":"惠济区","offset":0,"pageNum":0,"pageSize":0},{"id":72,"accountId":123,"area":450046,"plotName":"","roomNum":4,"roomTing":2,"roomWei":2,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"3000-4000","decorateSituation":5,"intoDate":1511971200000,"createTime":1510018013000,"updateTime":null,"account":"18224512765","realName":"张韶垒","areaName":"郑东新区","offset":0,"pageNum":0,"pageSize":0},{"id":71,"accountId":123,"area":410107,"plotName":"","roomNum":2,"roomTing":1,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"1200-1500","decorateSituation":2,"intoDate":1509984000000,"createTime":1510017699000,"updateTime":null,"account":"18224512765","realName":"张韶垒","areaName":"高新区","offset":0,"pageNum":0,"pageSize":0},{"id":70,"accountId":101,"area":410182,"plotName":"海龙国际","roomNum":1,"roomTing":0,"roomWei":0,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"1200-1500","decorateSituation":3,"intoDate":1510156800000,"createTime":1509954655000,"updateTime":null,"account":"13937113994","realName":"方振峰","areaName":"荥阳","offset":0,"pageNum":0,"pageSize":0},{"id":68,"accountId":123,"area":410105,"plotName":"","roomNum":1,"roomTing":0,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":2,"monthRentPrice":"800以内","decorateSituation":3,"intoDate":1509897600000,"createTime":1509950392000,"updateTime":null,"account":"18224512765","realName":"张韶垒","areaName":"金水区","offset":0,"pageNum":0,"pageSize":0},{"id":67,"accountId":101,"area":410107,"plotName":"升龙又一城","roomNum":3,"roomTing":0,"roomWei":0,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"2000-3000","decorateSituation":2,"intoDate":1510675200000,"createTime":1509697859000,"updateTime":null,"account":"13937113994","realName":"方振峰","areaName":"高新区","offset":0,"pageNum":0,"pageSize":0},{"id":66,"accountId":101,"area":410107,"plotName":"万科","roomNum":1,"roomTing":1,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"800-1200","decorateSituation":3,"intoDate":1509897600000,"createTime":1509697818000,"updateTime":null,"account":"13937113994","realName":"方振峰","areaName":"高新区","offset":0,"pageNum":0,"pageSize":0},{"id":65,"accountId":96,"area":410101,"plotName":"谈谈让他","roomNum":2,"roomTing":1,"roomWei":0,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"1200-1500","decorateSituation":1,"intoDate":1511798400000,"createTime":1509689728000,"updateTime":1509689775000,"account":"13288888888","realName":"李四","areaName":"辖区","offset":0,"pageNum":0,"pageSize":0},{"id":64,"accountId":116,"area":410104,"plotName":"","roomNum":1,"roomTing":0,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":0,"monthRentPrice":"","decorateSituation":0,"intoDate":1511280000000,"createTime":1509688509000,"updateTime":null,"account":"15038353881","realName":"方振峰","areaName":"管城回族区","offset":0,"pageNum":0,"pageSize":0}],"totalPage":6}
     */

    private String code;
    private String message;
    private InfoBean<T> info;

    @Override
    public String toString() {
        return "BaseInfo{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", info=" + info +
                '}';
    }

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public static class InfoBean<T> {
        /**
         * houseWanteds : [{"id":89,"accountId":121,"area":410108,"plotName":"","roomNum":3,"roomTing":1,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"1500-2000","decorateSituation":4,"intoDate":1512057600000,"createTime":1511405667000,"updateTime":null,"account":"18768851780","realName":"沈祥坤","areaName":"惠济区","offset":0,"pageNum":0,"pageSize":0},{"id":88,"accountId":123,"area":410104,"plotName":"","roomNum":2,"roomTing":1,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"1500-2000","decorateSituation":3,"intoDate":1511280000000,"createTime":1511335252000,"updateTime":null,"account":"18224512765","realName":"张韶垒","areaName":"管城回族区","offset":0,"pageNum":0,"pageSize":0},{"id":84,"accountId":123,"area":410102,"plotName":"","roomNum":1,"roomTing":1,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"2000-3000","decorateSituation":5,"intoDate":1511193600000,"createTime":1511334483000,"updateTime":null,"account":"18224512765","realName":"张韶垒","areaName":"中原区","offset":0,"pageNum":0,"pageSize":0},{"id":82,"accountId":121,"area":410103,"plotName":"","roomNum":1,"roomTing":1,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":2,"monthRentPrice":"800以内","decorateSituation":2,"intoDate":1511971200000,"createTime":1511330304000,"updateTime":null,"account":"18768851780","realName":"沈祥坤","areaName":"二七区","offset":0,"pageNum":0,"pageSize":0},{"id":81,"accountId":121,"area":410105,"plotName":"","roomNum":2,"roomTing":1,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"1200-1500","decorateSituation":3,"intoDate":1511539200000,"createTime":1511330265000,"updateTime":null,"account":"18768851780","realName":"沈祥坤","areaName":"金水区","offset":0,"pageNum":0,"pageSize":0},{"id":80,"accountId":123,"area":410108,"plotName":"","roomNum":2,"roomTing":1,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"1200-1500","decorateSituation":2,"intoDate":1512057600000,"createTime":1510643215000,"updateTime":null,"account":"18224512765","realName":"张韶垒","areaName":"惠济区","offset":0,"pageNum":0,"pageSize":0},{"id":79,"accountId":123,"area":410107,"plotName":"","roomNum":1,"roomTing":1,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"800-1200","decorateSituation":2,"intoDate":1514131200000,"createTime":1510643102000,"updateTime":null,"account":"18224512765","realName":"张韶垒","areaName":"高新区","offset":0,"pageNum":0,"pageSize":0},{"id":78,"accountId":123,"area":450046,"plotName":"","roomNum":4,"roomTing":3,"roomWei":3,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"4000-5000","decorateSituation":5,"intoDate":1513353600000,"createTime":1510642989000,"updateTime":null,"account":"18224512765","realName":"张韶垒","areaName":"郑东新区","offset":0,"pageNum":0,"pageSize":0},{"id":77,"accountId":123,"area":450046,"plotName":"","roomNum":3,"roomTing":2,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"2000-3000","decorateSituation":5,"intoDate":1511971200000,"createTime":1510564017000,"updateTime":null,"account":"18224512765","realName":"张韶垒","areaName":"郑东新区","offset":0,"pageNum":0,"pageSize":0},{"id":76,"accountId":123,"area":410107,"plotName":"","roomNum":2,"roomTing":1,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"1200-1500","decorateSituation":2,"intoDate":1511366400000,"createTime":1510563688000,"updateTime":null,"account":"18224512765","realName":"张韶垒","areaName":"高新区","offset":0,"pageNum":0,"pageSize":0}]
         * totalPage : 6
         */
        private  int currentPage;
        private  int pageSize;
        private  int totalCount;
        private int totalPage;
        private List<T> houseWanteds;

        public int getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(int totalCount) {
            this.totalCount = totalCount;
        }

        public int getCurrentPage() {
            return currentPage;
        }

        public void setCurrentPage(int currentPage) {
            this.currentPage = currentPage;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        @Override
        public String toString() {
            return "InfoBean{" +
                    "totalPage=" + totalPage +
                    ", houseWanteds=" + houseWanteds +
                    '}';
        }

        public int getTotalPage() {
            return totalPage;
        }

        public void setTotalPage(int totalPage) {
            this.totalPage = totalPage;
        }

        public List<T> getHouseWanteds() {
            return houseWanteds;
        }

        public void setHouseWanteds(List<T> houseWanteds) {
            this.houseWanteds = houseWanteds;
        }
    }
}
