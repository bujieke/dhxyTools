package com.zy.dhxytools.model;

import com.zy.dhxytools.bean.GuoShiJFbean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by  zy on 2017/7/17.
 * //                            _ooOoo_
 * //                           o8888888o
 * //                           88" . "88
 * //                           (| -_- |)
 * //                            O\ = /O
 * //                        ____/`---'\____
 * //                      .   ' \\| |// `.
 * //                       / \\||| : |||// \
 * //                     / _||||| -:- |||||- \
 * //                       | | \\\ - /// | |
 * //                     | \_| ''\---/'' | |
 * //                      \ .-\__ `-` ___/-. /
 * //                   ___`. .' /--.--\ `. . __
 * //                ."" '< `.___\_<|>_/___.' >'"".
 * //               | | : `- \`.;`\ _ /`;.`/ - ` : | |
 * //                 \ \ `-. \_ __\ /__ _/ .-` / /
 * //         ======`-.____`-.___\_____/___.-`____.-'======
 * //                            `=---='
 * //
 * //         .............................................
 * //                  佛祖保佑             永无BUG
 * //          佛曰:
 * //                  写字楼里写字间，写字间里程序员；
 * //                  程序人员写程序，又拿程序换酒钱。
 * //                  酒醒只在网上坐，酒醉还来网下眠；
 * //                  酒醉酒醒日复日，网上网下年复年。
 * //                  但愿老死电脑间，不愿鞠躬老板前；
 * //                  奔驰宝马贵者趣，公交自行程序员。
 * //                  别人笑我忒疯癫，我笑自己命太贱；
 * //                  不见满街漂亮妹，哪个归得程序员？
 */
public class GuoShiModel {

    //计算
    private List<String> Calculation(GuoShiJFbean bean) {
        List<String> list = new ArrayList<String>();
        if (bean.getQmdprice() > 0) {
            //获取亲密丹的
            double price = bean.getQmdprice() / 4;
            double totalprice = price * 75;
            list.add("每积分需要" + price + "万" + "每颗宝石共需要" + totalprice + "万");

        }
        if (bean.getDijijhprice() > 0) {
            double price = bean.getDijijhprice() / 5;
            double totalprice = price * 75;
            list.add("每积分需要" + price + "万" + "每颗宝石共需要" + totalprice + "万");
        }
        if (bean.getGaojijhprice() > 0) {

            double price = bean.getGaojijhprice() / 50;
            double totalprice = price * 75;
            list.add("每积分需要" + price + "万" + "每颗宝石共需要" + totalprice + "万");
        }

        if (bean.getPanguprice() > 0) {

            double price = bean.getPanguprice() / 33;
            double totalprice = price * 75;

            list.add("每积分需要" + price + "万" + "每颗宝石共需要" + totalprice + "万");
        }
        if (bean.getGaojijls() > 0) {

            double price = bean.getGaojijls() / 800;
            double totalprice = price * 75;

            list.add("每积分需要" + price + "万" + "每颗宝石共需要" + totalprice + "万");
        }
        if (bean.getJcprice() > 0) {
            double price = bean.getDijijhprice() / 2;
            double totalprice = price * 75;
            list.add("每积分需要" + price + "万" + "每颗宝石共需要" + totalprice + "万");
        }
        if (list.size() > 0) {
            return list;
        } else {
            return null;
        }
    }
}
