package cn.myh.zz.myokhttputils_greendao.Bean;

import java.util.List;

/**
 * Created by lenovo on 2017/12/7.
 */

public class RentBean {

    /**
     * code : 200
     * message : ok
     * info : {"houseWanteds":[{"id":89,"accountId":121,"area":410108,"plotName":"","roomNum":3,"roomTing":1,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"1500-2000","decorateSituation":4,"intoDate":1512057600000,"createTime":1511405667000,"updateTime":null,"account":"18768851780","realName":"沈祥坤","areaName":"惠济区","offset":0,"pageNum":0,"pageSize":0},{"id":88,"accountId":123,"area":410104,"plotName":"","roomNum":2,"roomTing":1,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"1500-2000","decorateSituation":3,"intoDate":1511280000000,"createTime":1511335252000,"updateTime":null,"account":"18224512765","realName":"张韶垒","areaName":"管城回族区","offset":0,"pageNum":0,"pageSize":0},{"id":84,"accountId":123,"area":410102,"plotName":"","roomNum":1,"roomTing":1,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"2000-3000","decorateSituation":5,"intoDate":1511193600000,"createTime":1511334483000,"updateTime":null,"account":"18224512765","realName":"张韶垒","areaName":"中原区","offset":0,"pageNum":0,"pageSize":0},{"id":82,"accountId":121,"area":410103,"plotName":"","roomNum":1,"roomTing":1,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":2,"monthRentPrice":"800以内","decorateSituation":2,"intoDate":1511971200000,"createTime":1511330304000,"updateTime":null,"account":"18768851780","realName":"沈祥坤","areaName":"二七区","offset":0,"pageNum":0,"pageSize":0},{"id":81,"accountId":121,"area":410105,"plotName":"","roomNum":2,"roomTing":1,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"1200-1500","decorateSituation":3,"intoDate":1511539200000,"createTime":1511330265000,"updateTime":null,"account":"18768851780","realName":"沈祥坤","areaName":"金水区","offset":0,"pageNum":0,"pageSize":0},{"id":80,"accountId":123,"area":410108,"plotName":"","roomNum":2,"roomTing":1,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"1200-1500","decorateSituation":2,"intoDate":1512057600000,"createTime":1510643215000,"updateTime":null,"account":"18224512765","realName":"张韶垒","areaName":"惠济区","offset":0,"pageNum":0,"pageSize":0},{"id":79,"accountId":123,"area":410107,"plotName":"","roomNum":1,"roomTing":1,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"800-1200","decorateSituation":2,"intoDate":1514131200000,"createTime":1510643102000,"updateTime":null,"account":"18224512765","realName":"张韶垒","areaName":"高新区","offset":0,"pageNum":0,"pageSize":0},{"id":78,"accountId":123,"area":450046,"plotName":"","roomNum":4,"roomTing":3,"roomWei":3,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"4000-5000","decorateSituation":5,"intoDate":1513353600000,"createTime":1510642989000,"updateTime":null,"account":"18224512765","realName":"张韶垒","areaName":"郑东新区","offset":0,"pageNum":0,"pageSize":0},{"id":77,"accountId":123,"area":450046,"plotName":"","roomNum":3,"roomTing":2,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"2000-3000","decorateSituation":5,"intoDate":1511971200000,"createTime":1510564017000,"updateTime":null,"account":"18224512765","realName":"张韶垒","areaName":"郑东新区","offset":0,"pageNum":0,"pageSize":0},{"id":76,"accountId":123,"area":410107,"plotName":"","roomNum":2,"roomTing":1,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"1200-1500","decorateSituation":2,"intoDate":1511366400000,"createTime":1510563688000,"updateTime":null,"account":"18224512765","realName":"张韶垒","areaName":"高新区","offset":0,"pageNum":0,"pageSize":0}],"totalPage":6}
     */

    private String code;
    private String message;
    private InfoBean info;

    @Override
    public String toString() {
        return "RentBean{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", info=" + info +
                '}';
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

    public InfoBean getInfo() {
        return info;
    }

    public void setInfo(InfoBean info) {
        this.info = info;
    }

    public static class InfoBean {
        /**
         * houseWanteds : [{"id":89,"accountId":121,"area":410108,"plotName":"","roomNum":3,"roomTing":1,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"1500-2000","decorateSituation":4,"intoDate":1512057600000,"createTime":1511405667000,"updateTime":null,"account":"18768851780","realName":"沈祥坤","areaName":"惠济区","offset":0,"pageNum":0,"pageSize":0},{"id":88,"accountId":123,"area":410104,"plotName":"","roomNum":2,"roomTing":1,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"1500-2000","decorateSituation":3,"intoDate":1511280000000,"createTime":1511335252000,"updateTime":null,"account":"18224512765","realName":"张韶垒","areaName":"管城回族区","offset":0,"pageNum":0,"pageSize":0},{"id":84,"accountId":123,"area":410102,"plotName":"","roomNum":1,"roomTing":1,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"2000-3000","decorateSituation":5,"intoDate":1511193600000,"createTime":1511334483000,"updateTime":null,"account":"18224512765","realName":"张韶垒","areaName":"中原区","offset":0,"pageNum":0,"pageSize":0},{"id":82,"accountId":121,"area":410103,"plotName":"","roomNum":1,"roomTing":1,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":2,"monthRentPrice":"800以内","decorateSituation":2,"intoDate":1511971200000,"createTime":1511330304000,"updateTime":null,"account":"18768851780","realName":"沈祥坤","areaName":"二七区","offset":0,"pageNum":0,"pageSize":0},{"id":81,"accountId":121,"area":410105,"plotName":"","roomNum":2,"roomTing":1,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"1200-1500","decorateSituation":3,"intoDate":1511539200000,"createTime":1511330265000,"updateTime":null,"account":"18768851780","realName":"沈祥坤","areaName":"金水区","offset":0,"pageNum":0,"pageSize":0},{"id":80,"accountId":123,"area":410108,"plotName":"","roomNum":2,"roomTing":1,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"1200-1500","decorateSituation":2,"intoDate":1512057600000,"createTime":1510643215000,"updateTime":null,"account":"18224512765","realName":"张韶垒","areaName":"惠济区","offset":0,"pageNum":0,"pageSize":0},{"id":79,"accountId":123,"area":410107,"plotName":"","roomNum":1,"roomTing":1,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"800-1200","decorateSituation":2,"intoDate":1514131200000,"createTime":1510643102000,"updateTime":null,"account":"18224512765","realName":"张韶垒","areaName":"高新区","offset":0,"pageNum":0,"pageSize":0},{"id":78,"accountId":123,"area":450046,"plotName":"","roomNum":4,"roomTing":3,"roomWei":3,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"4000-5000","decorateSituation":5,"intoDate":1513353600000,"createTime":1510642989000,"updateTime":null,"account":"18224512765","realName":"张韶垒","areaName":"郑东新区","offset":0,"pageNum":0,"pageSize":0},{"id":77,"accountId":123,"area":450046,"plotName":"","roomNum":3,"roomTing":2,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"2000-3000","decorateSituation":5,"intoDate":1511971200000,"createTime":1510564017000,"updateTime":null,"account":"18224512765","realName":"张韶垒","areaName":"郑东新区","offset":0,"pageNum":0,"pageSize":0},{"id":76,"accountId":123,"area":410107,"plotName":"","roomNum":2,"roomTing":1,"roomWei":1,"roomChu":0,"roomYt":0,"rentType":1,"monthRentPrice":"1200-1500","decorateSituation":2,"intoDate":1511366400000,"createTime":1510563688000,"updateTime":null,"account":"18224512765","realName":"张韶垒","areaName":"高新区","offset":0,"pageNum":0,"pageSize":0}]
         * totalPage : 6
         */

        private int totalPage;
        private List<HouseWantedsBean> houseWanteds;

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

        public List<HouseWantedsBean> getHouseWanteds() {
            return houseWanteds;
        }

        public void setHouseWanteds(List<HouseWantedsBean> houseWanteds) {
            this.houseWanteds = houseWanteds;
        }

        public static class HouseWantedsBean {
            /**
             * id : 89
             * accountId : 121
             * area : 410108
             * plotName :
             * roomNum : 3
             * roomTing : 1
             * roomWei : 1
             * roomChu : 0
             * roomYt : 0
             * rentType : 1
             * monthRentPrice : 1500-2000
             * decorateSituation : 4
             * intoDate : 1512057600000
             * createTime : 1511405667000
             * updateTime : null
             * account : 18768851780
             * realName : 沈祥坤
             * areaName : 惠济区
             * offset : 0
             * pageNum : 0
             * pageSize : 0
             */

            private int id;
            private int accountId;
            private int area;
            private String plotName;
            private int roomNum;
            private int roomTing;
            private int roomWei;
            private int roomChu;
            private int roomYt;
            private int rentType;
            private String monthRentPrice;
            private int decorateSituation;
            private long intoDate;
            private long createTime;
            private Object updateTime;
            private String account;
            private String realName;
            private String areaName;
            private int offset;
            private int pageNum;
            private int pageSize;

            @Override
            public String toString() {
                return "HouseWantedsBean{" +
                        "id=" + id +
                        ", accountId=" + accountId +
                        ", area=" + area +
                        ", plotName='" + plotName + '\'' +
                        ", roomNum=" + roomNum +
                        ", roomTing=" + roomTing +
                        ", roomWei=" + roomWei +
                        ", roomChu=" + roomChu +
                        ", roomYt=" + roomYt +
                        ", rentType=" + rentType +
                        ", monthRentPrice='" + monthRentPrice + '\'' +
                        ", decorateSituation=" + decorateSituation +
                        ", intoDate=" + intoDate +
                        ", createTime=" + createTime +
                        ", updateTime=" + updateTime +
                        ", account='" + account + '\'' +
                        ", realName='" + realName + '\'' +
                        ", areaName='" + areaName + '\'' +
                        ", offset=" + offset +
                        ", pageNum=" + pageNum +
                        ", pageSize=" + pageSize +
                        '}';
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getAccountId() {
                return accountId;
            }

            public void setAccountId(int accountId) {
                this.accountId = accountId;
            }

            public int getArea() {
                return area;
            }

            public void setArea(int area) {
                this.area = area;
            }

            public String getPlotName() {
                return plotName;
            }

            public void setPlotName(String plotName) {
                this.plotName = plotName;
            }

            public int getRoomNum() {
                return roomNum;
            }

            public void setRoomNum(int roomNum) {
                this.roomNum = roomNum;
            }

            public int getRoomTing() {
                return roomTing;
            }

            public void setRoomTing(int roomTing) {
                this.roomTing = roomTing;
            }

            public int getRoomWei() {
                return roomWei;
            }

            public void setRoomWei(int roomWei) {
                this.roomWei = roomWei;
            }

            public int getRoomChu() {
                return roomChu;
            }

            public void setRoomChu(int roomChu) {
                this.roomChu = roomChu;
            }

            public int getRoomYt() {
                return roomYt;
            }

            public void setRoomYt(int roomYt) {
                this.roomYt = roomYt;
            }

            public int getRentType() {
                return rentType;
            }

            public void setRentType(int rentType) {
                this.rentType = rentType;
            }

            public String getMonthRentPrice() {
                return monthRentPrice;
            }

            public void setMonthRentPrice(String monthRentPrice) {
                this.monthRentPrice = monthRentPrice;
            }

            public int getDecorateSituation() {
                return decorateSituation;
            }

            public void setDecorateSituation(int decorateSituation) {
                this.decorateSituation = decorateSituation;
            }

            public long getIntoDate() {
                return intoDate;
            }

            public void setIntoDate(long intoDate) {
                this.intoDate = intoDate;
            }

            public long getCreateTime() {
                return createTime;
            }

            public void setCreateTime(long createTime) {
                this.createTime = createTime;
            }

            public Object getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(Object updateTime) {
                this.updateTime = updateTime;
            }

            public String getAccount() {
                return account;
            }

            public void setAccount(String account) {
                this.account = account;
            }

            public String getRealName() {
                return realName;
            }

            public void setRealName(String realName) {
                this.realName = realName;
            }

            public String getAreaName() {
                return areaName;
            }

            public void setAreaName(String areaName) {
                this.areaName = areaName;
            }

            public int getOffset() {
                return offset;
            }

            public void setOffset(int offset) {
                this.offset = offset;
            }

            public int getPageNum() {
                return pageNum;
            }

            public void setPageNum(int pageNum) {
                this.pageNum = pageNum;
            }

            public int getPageSize() {
                return pageSize;
            }

            public void setPageSize(int pageSize) {
                this.pageSize = pageSize;
            }
        }
    }
}
