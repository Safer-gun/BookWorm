package com.jnu.bookworm.base;

import java.util.List;

public class BookJson {


    /**
     * resultcode : 200
     * reason : Success
     * result : {"data":[{"title":"向诸葛亮借智慧","catalog":"历史 心理学 管理 ","tags":"一本好书 三国历史 社会学好书推荐 管理书籍推荐 诸葛亮 ","sub1":"《向诸葛亮借智慧》","sub2":"《向诸葛亮借智慧》是中央电视台《百家讲坛》主讲人赵玉平老师编著的一 本管理学类图书。作品从管理学和心理学的角度出发，运用人力资源管理和组织行为学的知识，解读了三国睿智军师诸葛亮的一生。本书对三顾茅庐、舌战群儒、赤壁大战、空城计、斩马谡、六出祁山、七擒孟获等与诸葛亮相关的大事件进行了精辟的分析。 诸葛亮（公元181年7月23日\u2014234年8月28日），三国时期蜀国丞相，字孔明，号卧龙，琅琊阳都人，是三国时期杰出的政治家、军事家、发明家和文学家。诸葛亮上知天文、下知地理，雄才大略、才华横溢。为匡扶蜀汉政权，他呕心沥血，鞠躬尽瘁，死而后已。唐朝诗人杜甫有诗赞道：\u201c三顾频烦天下计，两朝开济老臣心。出师未捷身先死，长使英雄泪满襟。\u201d，可见诸葛亮受到后世人们极大的尊崇，是后世忠臣的楷模、智慧的化身。 《向诸葛亮借智慧》一书是管理学教授赵玉平\u201c麻辣说三国\u201d系列中的一部文学作品。赵玉平老师同易中天教授一起被权威机构评选为\u201c2009中国十大国学专家\u201d，是运用管理学、国学、心理学综合解析《水浒传》、三国历史人物的中国第一人，开辟了运用管理学和心理学解读传统经典的新领域。 隆中对策、舌战群儒、草船借箭、七擒孟获\u2026\u2026一个个璀璨如明珠的经典故事，成就了诸葛亮无人企及的智慧传奇。但是，孔明先生的智慧究竟从何而来呢？在千百年后的今天，他的卓越智慧又能给今天的我们带来哪些启迪和帮助呢？《向诸葛亮借智慧》一书从一个崭新的角度观察诸葛亮这个重要的历史人物和相关的历史事件，讲故事的同时也分析规律，并结合当今现实生活，古为今用，总结出能够运用于求职、求人、用人、管人等现实生活中的规律和技巧。 鲁迅说：\u201c关公之义近乎伪，诸葛之智近乎妖。\u201d 《向诸葛亮借智慧》，哪怕只借到了一点点，也足够让我们的生活过得更轻松、更顺心了。 《向诸葛亮借智慧》","img":"http://apis.juhe.cn/goodbook/img/379cdafe13f92d62e99388182a6d08ec.jpg","reading":"8091人阅读","online":"京东商城:http://book.jd.com/10483893.html 当当网:http://product.dangdang.com/product.aspx?product_id=21020821 苏宁易购:http://www.suning.com/emall/prd_10052_22001_-7_1006212_.html ","bytime":"2013年4月28日"}],"totalNum":"9","pn":0,"rn":"1"}
     */

    private String resultcode;
    private String reason;
    private ResultBean result;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * data : [{"title":"向诸葛亮借智慧","catalog":"历史 心理学 管理 ","tags":"一本好书 三国历史 社会学好书推荐 管理书籍推荐 诸葛亮 ","sub1":"《向诸葛亮借智慧》","sub2":"《向诸葛亮借智慧》是中央电视台《百家讲坛》主讲人赵玉平老师编著的一 本管理学类图书。作品从管理学和心理学的角度出发，运用人力资源管理和组织行为学的知识，解读了三国睿智军师诸葛亮的一生。本书对三顾茅庐、舌战群儒、赤壁大战、空城计、斩马谡、六出祁山、七擒孟获等与诸葛亮相关的大事件进行了精辟的分析。 诸葛亮（公元181年7月23日\u2014234年8月28日），三国时期蜀国丞相，字孔明，号卧龙，琅琊阳都人，是三国时期杰出的政治家、军事家、发明家和文学家。诸葛亮上知天文、下知地理，雄才大略、才华横溢。为匡扶蜀汉政权，他呕心沥血，鞠躬尽瘁，死而后已。唐朝诗人杜甫有诗赞道：\u201c三顾频烦天下计，两朝开济老臣心。出师未捷身先死，长使英雄泪满襟。\u201d，可见诸葛亮受到后世人们极大的尊崇，是后世忠臣的楷模、智慧的化身。 《向诸葛亮借智慧》一书是管理学教授赵玉平\u201c麻辣说三国\u201d系列中的一部文学作品。赵玉平老师同易中天教授一起被权威机构评选为\u201c2009中国十大国学专家\u201d，是运用管理学、国学、心理学综合解析《水浒传》、三国历史人物的中国第一人，开辟了运用管理学和心理学解读传统经典的新领域。 隆中对策、舌战群儒、草船借箭、七擒孟获\u2026\u2026一个个璀璨如明珠的经典故事，成就了诸葛亮无人企及的智慧传奇。但是，孔明先生的智慧究竟从何而来呢？在千百年后的今天，他的卓越智慧又能给今天的我们带来哪些启迪和帮助呢？《向诸葛亮借智慧》一书从一个崭新的角度观察诸葛亮这个重要的历史人物和相关的历史事件，讲故事的同时也分析规律，并结合当今现实生活，古为今用，总结出能够运用于求职、求人、用人、管人等现实生活中的规律和技巧。 鲁迅说：\u201c关公之义近乎伪，诸葛之智近乎妖。\u201d 《向诸葛亮借智慧》，哪怕只借到了一点点，也足够让我们的生活过得更轻松、更顺心了。 《向诸葛亮借智慧》","img":"http://apis.juhe.cn/goodbook/img/379cdafe13f92d62e99388182a6d08ec.jpg","reading":"8091人阅读","online":"京东商城:http://book.jd.com/10483893.html 当当网:http://product.dangdang.com/product.aspx?product_id=21020821 苏宁易购:http://www.suning.com/emall/prd_10052_22001_-7_1006212_.html ","bytime":"2013年4月28日"}]
         * totalNum : 9
         * pn : 0
         * rn : 1
         */

        private String totalNum;
        private int pn;
        private String rn;
        private List<DataBean> data;

        public String getTotalNum() {
            return totalNum;
        }

        public void setTotalNum(String totalNum) {
            this.totalNum = totalNum;
        }

        public int getPn() {
            return pn;
        }

        public void setPn(int pn) {
            this.pn = pn;
        }

        public String getRn() {
            return rn;
        }

        public void setRn(String rn) {
            this.rn = rn;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * title : 向诸葛亮借智慧
             * catalog : 历史 心理学 管理
             * tags : 一本好书 三国历史 社会学好书推荐 管理书籍推荐 诸葛亮
             * sub1 : 《向诸葛亮借智慧》
             * sub2 : 《向诸葛亮借智慧》是中央电视台《百家讲坛》主讲人赵玉平老师编著的一 本管理学类图书。作品从管理学和心理学的角度出发，运用人力资源管理和组织行为学的知识，解读了三国睿智军师诸葛亮的一生。本书对三顾茅庐、舌战群儒、赤壁大战、空城计、斩马谡、六出祁山、七擒孟获等与诸葛亮相关的大事件进行了精辟的分析。 诸葛亮（公元181年7月23日—234年8月28日），三国时期蜀国丞相，字孔明，号卧龙，琅琊阳都人，是三国时期杰出的政治家、军事家、发明家和文学家。诸葛亮上知天文、下知地理，雄才大略、才华横溢。为匡扶蜀汉政权，他呕心沥血，鞠躬尽瘁，死而后已。唐朝诗人杜甫有诗赞道：“三顾频烦天下计，两朝开济老臣心。出师未捷身先死，长使英雄泪满襟。”，可见诸葛亮受到后世人们极大的尊崇，是后世忠臣的楷模、智慧的化身。 《向诸葛亮借智慧》一书是管理学教授赵玉平“麻辣说三国”系列中的一部文学作品。赵玉平老师同易中天教授一起被权威机构评选为“2009中国十大国学专家”，是运用管理学、国学、心理学综合解析《水浒传》、三国历史人物的中国第一人，开辟了运用管理学和心理学解读传统经典的新领域。 隆中对策、舌战群儒、草船借箭、七擒孟获……一个个璀璨如明珠的经典故事，成就了诸葛亮无人企及的智慧传奇。但是，孔明先生的智慧究竟从何而来呢？在千百年后的今天，他的卓越智慧又能给今天的我们带来哪些启迪和帮助呢？《向诸葛亮借智慧》一书从一个崭新的角度观察诸葛亮这个重要的历史人物和相关的历史事件，讲故事的同时也分析规律，并结合当今现实生活，古为今用，总结出能够运用于求职、求人、用人、管人等现实生活中的规律和技巧。 鲁迅说：“关公之义近乎伪，诸葛之智近乎妖。” 《向诸葛亮借智慧》，哪怕只借到了一点点，也足够让我们的生活过得更轻松、更顺心了。 《向诸葛亮借智慧》
             * img : http://apis.juhe.cn/goodbook/img/379cdafe13f92d62e99388182a6d08ec.jpg
             * reading : 8091人阅读
             * online : 京东商城:http://book.jd.com/10483893.html 当当网:http://product.dangdang.com/product.aspx?product_id=21020821 苏宁易购:http://www.suning.com/emall/prd_10052_22001_-7_1006212_.html
             * bytime : 2013年4月28日
             */

            private String title;
            private String catalog;
            private String tags;
            private String sub1;
            private String sub2;
            private String img;
            private String reading;
            private String online;
            private String bytime;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getCatalog() {
                return catalog;
            }

            public void setCatalog(String catalog) {
                this.catalog = catalog;
            }

            public String getTags() {
                return tags;
            }

            public void setTags(String tags) {
                this.tags = tags;
            }

            public String getSub1() {
                return sub1;
            }

            public void setSub1(String sub1) {
                this.sub1 = sub1;
            }

            public String getSub2() {
                return sub2;
            }

            public void setSub2(String sub2) {
                this.sub2 = sub2;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getReading() {
                return reading;
            }

            public void setReading(String reading) {
                this.reading = reading;
            }

            public String getOnline() {
                return online;
            }

            public void setOnline(String online) {
                this.online = online;
            }

            public String getBytime() {
                return bytime;
            }

            public void setBytime(String bytime) {
                this.bytime = bytime;
            }
        }
    }
}
