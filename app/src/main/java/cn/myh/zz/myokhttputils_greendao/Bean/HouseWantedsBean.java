package cn.myh.zz.myokhttputils_greendao.Bean;

import java.io.Serializable;

public class HouseWantedsBean implements Serializable{
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