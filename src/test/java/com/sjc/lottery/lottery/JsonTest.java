package com.sjc.lottery.lottery;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.mysql.cj.conf.PropertyKey;
import jdk.nashorn.internal.objects.NativeArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Description: lottery
 * Created by s on 2019/5/25 21:48
 */
public class JsonTest {
    static String json = "{\"state\":0,\"message\":\"查询成功\",\"pageCount\":1,\"countNum\":0,\"Tflag\":0,\"result\":[{\"name\":\"双色球\",\"code\":\"2019059\",\"detailsLink\":\"/c/2019-05-23/453385.shtml\",\"videoLink\":\"/c/2019-05-23/453384.shtml\",\"date\":\"2019-05-23(四)\",\"week\":\"四\",\"red\":\"04,05,07,09,16,18\",\"blue\":\"06\",\"blue2\":\"\",\"sales\":\"345567246\",\"poolmoney\":\"561383166\",\"content\":\"湖北1注,广西1注,共2注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"2\",\"typemoney\":\"10000000\"},{\"type\":2,\"typenum\":\"125\",\"typemoney\":\"162165\"},{\"type\":3,\"typenum\":\"1542\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"75876\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"1380983\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"10926874\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019058\",\"detailsLink\":\"/c/2019-05-21/453275.shtml\",\"videoLink\":\"/c/2019-05-21/453274.shtml\",\"date\":\"2019-05-21(二)\",\"week\":\"二\",\"red\":\"07,08,12,21,23,27\",\"blue\":\"12\",\"blue2\":\"\",\"sales\":\"339299672\",\"poolmoney\":\"520571254\",\"content\":\"河北1注,黑龙江1注,上海1注,江苏4注,浙江1注,安徽2注,福建3注,山东1注,湖北1注,广东1注,广西1注,四川1注,云南1注,陕西1注,共20注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"20\",\"typemoney\":\"5260714\"},{\"type\":2,\"typenum\":\"127\",\"typemoney\":\"51321\"},{\"type\":3,\"typenum\":\"3726\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"152257\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"2179068\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"15353055\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019057\",\"detailsLink\":\"/c/2019-05-19/452965.shtml\",\"videoLink\":\"/c/2019-05-19/452964.shtml\",\"date\":\"2019-05-19(日)\",\"week\":\"日\",\"red\":\"04,05,06,08,13,18\",\"blue\":\"16\",\"blue2\":\"\",\"sales\":\"372560948\",\"poolmoney\":\"606231938\",\"content\":\"黑龙江2注,上海1注,湖南1注,四川1注,陕西1注,深圳1注,共7注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"7\",\"typemoney\":\"8216242\"},{\"type\":2,\"typenum\":\"127\",\"typemoney\":\"221591\"},{\"type\":3,\"typenum\":\"1311\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"74663\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"1509549\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"7205057\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019056\",\"detailsLink\":\"/c/2019-05-16/452952.shtml\",\"videoLink\":\"/c/2019-05-16/452951.shtml\",\"date\":\"2019-05-16(四)\",\"week\":\"四\",\"red\":\"13,14,17,19,21,29\",\"blue\":\"01\",\"blue2\":\"\",\"sales\":\"351267630\",\"poolmoney\":\"579319269\",\"content\":\"江西1注,共1注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"1\",\"typemoney\":\"10000000\"},{\"type\":2,\"typenum\":\"78\",\"typemoney\":\"245905\"},{\"type\":3,\"typenum\":\"1528\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"70105\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"1287687\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"12783341\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019055\",\"detailsLink\":\"/c/2019-05-14/452842.shtml\",\"videoLink\":\"/c/2019-05-14/452841.shtml\",\"date\":\"2019-05-14(二)\",\"week\":\"二\",\"red\":\"01,06,11,15,19,31\",\"blue\":\"10\",\"blue2\":\"\",\"sales\":\"350070872\",\"poolmoney\":\"531777347\",\"content\":\"河南1注,广东1注,共2注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"2\",\"typemoney\":\"10000000\"},{\"type\":2,\"typenum\":\"61\",\"typemoney\":\"368485\"},{\"type\":3,\"typenum\":\"1097\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"57238\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"1100504\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"11176109\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019054\",\"detailsLink\":\"/c/2019-05-12/452732.shtml\",\"videoLink\":\"/c/2019-05-12/452731.shtml\",\"date\":\"2019-05-12(日)\",\"week\":\"日\",\"red\":\"07,10,11,15,24,26\",\"blue\":\"11\",\"blue2\":\"\",\"sales\":\"376075414\",\"poolmoney\":\"484344441\",\"content\":\"北京1注,吉林1注,山东1注,湖北1注,湖南1注,广东1注,贵州2注,共8注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"8\",\"typemoney\":\"6741103\"},{\"type\":2,\"typenum\":\"132\",\"typemoney\":\"131901\"},{\"type\":3,\"typenum\":\"2374\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"102249\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"1678737\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"14054725\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019053\",\"detailsLink\":\"/c/2019-05-09/452619.shtml\",\"videoLink\":\"/c/2019-05-09/452618.shtml\",\"date\":\"2019-05-09(四)\",\"week\":\"四\",\"red\":\"04,16,22,25,29,31\",\"blue\":\"08\",\"blue2\":\"\",\"sales\":\"345533966\",\"poolmoney\":\"486040155\",\"content\":\"内蒙古1注,上海5注,江苏1注,湖北1注,四川4注,共12注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"12\",\"typemoney\":\"5969643\"},{\"type\":2,\"typenum\":\"109\",\"typemoney\":\"133437\"},{\"type\":3,\"typenum\":\"1869\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"80695\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"1364875\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"15147656\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019052\",\"detailsLink\":\"/c/2019-05-07/452509.shtml\",\"videoLink\":\"/c/2019-05-07/452508.shtml\",\"date\":\"2019-05-07(二)\",\"week\":\"二\",\"red\":\"03,06,09,13,16,19\",\"blue\":\"16\",\"blue2\":\"\",\"sales\":\"342251970\",\"poolmoney\":\"514041918\",\"content\":\"北京2注,天津12注,河北1注,山西3注,内蒙古2注,辽宁1注,黑龙江2注,上海5注,江苏3注,浙江26注,安徽3注,福建6注,江西3注,山东7注,重庆1注,河南5注,湖北23注,湖南3注,广东11注,广西1注,四川2注,贵州3注,云南7注,陕西16注,甘肃2注,深圳3注,共153注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"153\",\"typemoney\":\"5117604\"},{\"type\":2,\"typenum\":\"2295\",\"typemoney\":\"9800\"},{\"type\":3,\"typenum\":\"2162\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"76077\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"1276540\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"8653774\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019051\",\"detailsLink\":\"/c/2019-05-05/452398.shtml\",\"videoLink\":\"/c/2019-05-05/452399.shtml\",\"date\":\"2019-05-05(日)\",\"week\":\"日\",\"red\":\"08,09,10,13,15,28\",\"blue\":\"09\",\"blue2\":\"\",\"sales\":\"371316762\",\"poolmoney\":\"1229559631\",\"content\":\"山西1注,内蒙古1注,吉林1注,黑龙江1注,江苏1注,安徽1注,福建1注,重庆1注,河南1注,湖北1注,广东1注,西藏1注,新疆1注,共13注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"13\",\"typemoney\":\"5503869\"},{\"type\":2,\"typenum\":\"120\",\"typemoney\":\"68232\"},{\"type\":3,\"typenum\":\"3302\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"142819\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"2196456\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"17751864\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019050\",\"detailsLink\":\"/c/2019-05-02/452286.shtml\",\"videoLink\":\"/c/2019-05-02/452285.shtml\",\"date\":\"2019-05-02(四)\",\"week\":\"四\",\"red\":\"04,06,10,11,21,23\",\"blue\":\"02\",\"blue2\":\"\",\"sales\":\"311858860\",\"poolmoney\":\"1276546288\",\"content\":\"辽宁1注,吉林1注,上海1注,安徽1注,河南1注,广东4注,云南1注,深圳3注,共13注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"13\",\"typemoney\":\"6136790\"},{\"type\":2,\"typenum\":\"100\",\"typemoney\":\"184728\"},{\"type\":3,\"typenum\":\"1227\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"64622\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"1200423\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"10061963\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019049\",\"detailsLink\":\"/c/2019-04-30/452276.shtml\",\"videoLink\":\"/c/2019-04-30/452275.shtml\",\"date\":\"2019-04-30(二)\",\"week\":\"二\",\"red\":\"03,10,13,22,23,28\",\"blue\":\"15\",\"blue2\":\"\",\"sales\":\"333775314\",\"poolmoney\":\"1300906020\",\"content\":\"北京1注,天津1注,黑龙江1注,浙江2注,河南2注,湖北1注,新疆1注,共9注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"9\",\"typemoney\":\"6552485\"},{\"type\":2,\"typenum\":\"205\",\"typemoney\":\"85197\"},{\"type\":3,\"typenum\":\"2854\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"111093\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"1745138\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"9091215\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019048\",\"detailsLink\":\"/c/2019-04-28/452166.shtml\",\"videoLink\":\"/c/2019-04-28/452165.shtml\",\"date\":\"2019-04-28(日)\",\"week\":\"日\",\"red\":\"03,07,10,12,18,29\",\"blue\":\"10\",\"blue2\":\"\",\"sales\":\"379210874\",\"poolmoney\":\"1307482004\",\"content\":\"河北1注,江苏3注,湖南1注,广东3注,共8注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"8\",\"typemoney\":\"7251672\"},{\"type\":2,\"typenum\":\"153\",\"typemoney\":\"147168\"},{\"type\":3,\"typenum\":\"2209\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"101803\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"1730349\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"10291067\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019047\",\"detailsLink\":\"/c/2019-04-25/452053.shtml\",\"videoLink\":\"/c/2019-04-25/452052.shtml\",\"date\":\"2019-04-25(四)\",\"week\":\"四\",\"red\":\"03,11,18,25,30,33\",\"blue\":\"14\",\"blue2\":\"\",\"sales\":\"349665886\",\"poolmoney\":\"1297945208\",\"content\":\"广东1注,共1注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"1\",\"typemoney\":\"10000000\"},{\"type\":2,\"typenum\":\"388\",\"typemoney\":\"69165\"},{\"type\":3,\"typenum\":\"909\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"84327\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"1725198\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"5429364\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019046\",\"detailsLink\":\"/c/2019-04-23/451943.shtml\",\"videoLink\":\"/c/2019-04-23/451942.shtml\",\"date\":\"2019-04-23(二)\",\"week\":\"二\",\"red\":\"02,12,16,22,25,32\",\"blue\":\"06\",\"blue2\":\"\",\"sales\":\"349236650\",\"poolmoney\":\"1227436396\",\"content\":\"天津1注,黑龙江1注,上海5注,浙江1注,山东1注,河南3注,湖北1注,广东2注,海南1注,新疆1注,共17注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"17\",\"typemoney\":\"5847483\"},{\"type\":2,\"typenum\":\"132\",\"typemoney\":\"136431\"},{\"type\":3,\"typenum\":\"2121\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"81820\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"1392213\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"12488152\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019045\",\"detailsLink\":\"/c/2019-04-21/451833.shtml\",\"videoLink\":\"/c/2019-04-21/451832.shtml\",\"date\":\"2019-04-21(日)\",\"week\":\"日\",\"red\":\"01,06,17,19,27,31\",\"blue\":\"14\",\"blue2\":\"\",\"sales\":\"380577960\",\"poolmoney\":\"1272816559\",\"content\":\"辽宁1注,江苏1注,广东3注,甘肃1注,深圳1注,共7注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"7\",\"typemoney\":\"8172099\"},{\"type\":2,\"typenum\":\"83\",\"typemoney\":\"334408\"},{\"type\":3,\"typenum\":\"836\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"51802\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"1068768\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"10380725\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019044\",\"detailsLink\":\"/c/2019-04-18/451820.shtml\",\"videoLink\":\"/c/2019-04-18/451819.shtml\",\"date\":\"2019-04-18(四)\",\"week\":\"四\",\"red\":\"06,14,16,17,23,29\",\"blue\":\"07\",\"blue2\":\"\",\"sales\":\"350579948\",\"poolmoney\":\"1246753637\",\"content\":\"天津1注,浙江4注,安徽1注,湖南1注,广东1注,广西1注,宁夏1注,深圳2注,共12注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"12\",\"typemoney\":\"5956414\"},{\"type\":2,\"typenum\":\"188\",\"typemoney\":\"76309\"},{\"type\":3,\"typenum\":\"2205\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"95733\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"1552954\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"14621631\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019043\",\"detailsLink\":\"/c/2019-04-16/451710.shtml\",\"videoLink\":\"/c/2019-04-16/451709.shtml\",\"date\":\"2019-04-16(二)\",\"week\":\"二\",\"red\":\"01,06,12,13,24,32\",\"blue\":\"13\",\"blue2\":\"\",\"sales\":\"345296562\",\"poolmoney\":\"1275191954\",\"content\":\"山东1注,湖北1注,共2注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"2\",\"typemoney\":\"10000000\"},{\"type\":2,\"typenum\":\"99\",\"typemoney\":\"249954\"},{\"type\":3,\"typenum\":\"1162\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"57084\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"1034128\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"8993878\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019042\",\"detailsLink\":\"/c/2019-04-14/451600.shtml\",\"videoLink\":\"/c/2019-04-14/451599.shtml\",\"date\":\"2019-04-14(日)\",\"week\":\"日\",\"red\":\"15,17,19,22,25,26\",\"blue\":\"04\",\"blue2\":\"\",\"sales\":\"376134240\",\"poolmoney\":\"1220955571\",\"content\":\"河北1注,山西1注,福建1注,山东1注,共4注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"4\",\"typemoney\":\"10000000\"},{\"type\":2,\"typenum\":\"132\",\"typemoney\":\"195373\"},{\"type\":3,\"typenum\":\"1226\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"74347\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"1495803\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"9528585\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019041\",\"detailsLink\":\"/c/2019-04-11/451287.shtml\",\"videoLink\":\"/c/2019-04-11/451286.shtml\",\"date\":\"2019-04-11(四)\",\"week\":\"四\",\"red\":\"02,09,13,23,24,26\",\"blue\":\"16\",\"blue2\":\"\",\"sales\":\"347145834\",\"poolmoney\":\"1183587505\",\"content\":\"江西1注,河南1注,共2注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"2\",\"typemoney\":\"10000000\"},{\"type\":2,\"typenum\":\"103\",\"typemoney\":\"274965\"},{\"type\":3,\"typenum\":\"831\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"47335\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"1003320\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"6964501\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019040\",\"detailsLink\":\"/c/2019-04-09/451277.shtml\",\"videoLink\":\"/c/2019-04-09/451276.shtml\",\"date\":\"2019-04-09(二)\",\"week\":\"二\",\"red\":\"05,06,09,18,23,31\",\"blue\":\"11\",\"blue2\":\"\",\"sales\":\"335974062\",\"poolmoney\":\"1118623191\",\"content\":\"北京2注,黑龙江1注,江西1注,河南2注,广东1注,云南1注,共8注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"8\",\"typemoney\":\"6661238\"},{\"type\":2,\"typenum\":\"159\",\"typemoney\":\"104480\"},{\"type\":3,\"typenum\":\"2510\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"93201\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"1540542\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"11320428\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019039\",\"detailsLink\":\"/c/2019-04-07/451167.shtml\",\"videoLink\":\"/c/2019-04-07/451166.shtml\",\"date\":\"2019-04-07(日)\",\"week\":\"日\",\"red\":\"06,07,11,14,27,32\",\"blue\":\"08\",\"blue2\":\"\",\"sales\":\"363128750\",\"poolmoney\":\"1122075950\",\"content\":\"江苏3注,浙江5注,广西1注,陕西2注,共11注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"11\",\"typemoney\":\"6258711\"},{\"type\":2,\"typenum\":\"136\",\"typemoney\":\"127259\"},{\"type\":3,\"typenum\":\"2045\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"89894\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"1606282\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"13705464\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019038\",\"detailsLink\":\"/c/2019-04-04/451153.shtml\",\"videoLink\":\"/c/2019-04-04/451154.shtml\",\"date\":\"2019-04-04(四)\",\"week\":\"四\",\"red\":\"09,12,21,27,29,30\",\"blue\":\"05\",\"blue2\":\"\",\"sales\":\"335328036\",\"poolmoney\":\"1138999919\",\"content\":\"上海1注,浙江2注,重庆1注,湖北1注,四川2注,陕西1注,宁夏2注,共10注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"10\",\"typemoney\":\"6243868\"},{\"type\":2,\"typenum\":\"101\",\"typemoney\":\"153944\"},{\"type\":3,\"typenum\":\"2137\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"89846\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"1485224\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"12576975\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019037\",\"detailsLink\":\"/c/2019-04-02/451044.shtml\",\"videoLink\":\"/c/2019-04-02/451043.shtml\",\"date\":\"2019-04-02(二)\",\"week\":\"二\",\"red\":\"01,07,12,14,18,25\",\"blue\":\"10\",\"blue2\":\"\",\"sales\":\"344923376\",\"poolmoney\":\"1154793537\",\"content\":\"江苏1注,浙江5注,山东2注,河南1注,广东2注,云南1注,共12注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"12\",\"typemoney\":\"6514774\"},{\"type\":2,\"typenum\":\"213\",\"typemoney\":\"106674\"},{\"type\":3,\"typenum\":\"1458\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"70399\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"1325157\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"9284123\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019036\",\"detailsLink\":\"/c/2019-03-31/450933.shtml\",\"videoLink\":\"/c/2019-03-31/450934.shtml\",\"date\":\"2019-03-31(日)\",\"week\":\"日\",\"red\":\"02,10,13,16,23,32\",\"blue\":\"08\",\"blue2\":\"\",\"sales\":\"383547756\",\"poolmoney\":\"1164805979\",\"content\":\"天津1注,河北3注,辽宁1注,吉林1注,上海6注,浙江1注,安徽1注,河南2注,湖北1注,湖南2注,广东1注,陕西1注,共21注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"21\",\"typemoney\":\"5000000\"},{\"type\":2,\"typenum\":\"85\",\"typemoney\":\"6000\"},{\"type\":3,\"typenum\":\"2956\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"117550\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"1895239\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"28680477\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019035\",\"detailsLink\":\"/c/2019-03-28/450821.shtml\",\"videoLink\":\"/c/2019-03-28/450820.shtml\",\"date\":\"2019-03-28(四)\",\"week\":\"四\",\"red\":\"01,05,07,09,10,20\",\"blue\":\"16\",\"blue2\":\"\",\"sales\":\"354951028\",\"poolmoney\":\"1269805979\",\"content\":\"北京2注,河北1注,黑龙江2注,上海1注,江西1注,山东1注,广东1注,广西1注,深圳1注,共11注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"11\",\"typemoney\":\"7034000\"},{\"type\":2,\"typenum\":\"233\",\"typemoney\":\"120032\"},{\"type\":3,\"typenum\":\"1362\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"75341\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"1379602\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"5821154\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019034\",\"detailsLink\":\"/c/2019-03-26/450711.shtml\",\"videoLink\":\"/c/2019-03-26/450710.shtml\",\"date\":\"2019-03-26(二)\",\"week\":\"二\",\"red\":\"09,11,15,22,24,26\",\"blue\":\"03\",\"blue2\":\"\",\"sales\":\"354652922\",\"poolmoney\":\"1263277472\",\"content\":\"北京1注,河北1注,辽宁3注,上海1注,福建2注,山东1注,河南1注,共10注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"10\",\"typemoney\":\"6957743\"},{\"type\":2,\"typenum\":\"103\",\"typemoney\":\"237590\"},{\"type\":3,\"typenum\":\"1211\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"63789\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"1242428\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"9415538\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019033\",\"detailsLink\":\"/c/2019-03-24/450600.shtml\",\"videoLink\":\"/c/2019-03-24/450599.shtml\",\"date\":\"2019-03-24(日)\",\"week\":\"日\",\"red\":\"09,15,19,21,23,29\",\"blue\":\"15\",\"blue2\":\"\",\"sales\":\"385168218\",\"poolmoney\":\"1259439534\",\"content\":\"山西1注,江苏1注,浙江1注,河南3注,四川4注,陕西1注,深圳11注,共22注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"22\",\"typemoney\":\"6000111\"},{\"type\":2,\"typenum\":\"224\",\"typemoney\":\"122781\"},{\"type\":3,\"typenum\":\"1380\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"68477\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"1323149\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"9530663\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019032\",\"detailsLink\":\"/c/2019-03-21/450587.shtml\",\"videoLink\":\"/c/2019-03-21/450486.shtml\",\"date\":\"2019-03-21(四)\",\"week\":\"四\",\"red\":\"04,08,09,13,28,33\",\"blue\":\"04\",\"blue2\":\"\",\"sales\":\"353034100\",\"poolmoney\":\"1308932812\",\"content\":\"上海1注,江苏2注,广东1注,贵州1注,青海1注,共6注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"6\",\"typemoney\":\"8788636\"},{\"type\":2,\"typenum\":\"228\",\"typemoney\":\"124626\"},{\"type\":3,\"typenum\":\"951\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"52822\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"1080804\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"7020433\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019031\",\"detailsLink\":\"/c/2019-03-19/450477.shtml\",\"videoLink\":\"/c/2019-03-19/450476.shtml\",\"date\":\"2019-03-19(二)\",\"week\":\"二\",\"red\":\"03,13,15,18,21,33\",\"blue\":\"16\",\"blue2\":\"\",\"sales\":\"358344316\",\"poolmoney\":\"1276420305\",\"content\":\"江苏2注,重庆3注,共5注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"5\",\"typemoney\":\"9429639\"},{\"type\":2,\"typenum\":\"119\",\"typemoney\":\"232649\"},{\"type\":3,\"typenum\":\"976\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"60588\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"1236438\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"7487549\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]},{\"name\":\"双色球\",\"code\":\"2019030\",\"detailsLink\":\"/c/2019-03-17/450367.shtml\",\"videoLink\":\"/c/2019-03-17/450366.shtml\",\"date\":\"2019-03-17(日)\",\"week\":\"日\",\"red\":\"04,05,07,10,12,22\",\"blue\":\"16\",\"blue2\":\"\",\"sales\":\"392415448\",\"poolmoney\":\"1240512761\",\"content\":\"山西1注,吉林1注,浙江2注,安徽1注,福建2注,山东1注,河南2注,湖北2注,湖南2注,广东1注,云南1注,陕西1注,共17注。\",\"addmoney\":\"\",\"addmoney2\":\"\",\"msg\":\"\",\"z2add\":\"\",\"m2add\":\"\",\"prizegrades\":[{\"type\":1,\"typenum\":\"17\",\"typemoney\":\"6202265\"},{\"type\":2,\"typenum\":\"196\",\"typemoney\":\"130347\"},{\"type\":3,\"typenum\":\"1656\",\"typemoney\":\"3000\"},{\"type\":4,\"typenum\":\"83656\",\"typemoney\":\"200\"},{\"type\":5,\"typenum\":\"1625585\",\"typemoney\":\"10\"},{\"type\":6,\"typenum\":\"10427184\",\"typemoney\":\"5\"},{\"type\":7,\"typenum\":\"\",\"typemoney\":\"\"}]}]}\n";

//    public static final Object parse(String text); // 把JSON文本parse为JSONObject或者JSONArray
//    public static final JSONObject parseObject(String text)； // 把JSON文本parse成JSONObject
//    public static final <T> T parseObject(String text, Class<T> clazz); // 把JSON文本parse为JavaBean
//    public static final JSONArray parseArray(String text); // 把JSON文本parse成JSONArray
//    public static final <T> List<T> parseArray(String text, Class<T> clazz); //把JSON文本parse成JavaBean集合
//    public static final String toJSONString(Object object); // 将JavaBean序列化为JSON文本
//    public static final String toJSONString(Object object, boolean prettyFormat); // 将JavaBean序列化为带格式的JSON文本
//    public static final Object toJSON(Object javaObject); 将JavaBean转换为JSONObject或者JSONArray。

    public static void main1(String[] args) throws Exception {

        JSONObject jsonobj  = JSON.parseObject(json);
        JSONArray resultJson = jsonobj.getJSONArray("result");

        String lotteryPeriod = null;
        String lotteryType = null;
        String periodDate = null;
        String[] redBall = null;
        String blueBall = null;
        String nowPeriodMoney = null;
        String nextPeriodMoney = null;
        String content = null;

        String gradeType = null;
        String gradeNumber = null;
        String gradeMoney = null;

        for (int i = 0,num=resultJson.size(); i < num; i++) {
            JSONObject result =resultJson.getJSONObject(i);
            lotteryPeriod = result.getString("code");
            lotteryType="1";
            redBall = result.getString("red").split(",");
            periodDate = result.getString("date");
            blueBall = result.getString("blue");
            nowPeriodMoney = result.getString("sales");
            nextPeriodMoney = result.getString("poolmoney");
            content = result.getString("content");

            JSONArray prizegradesJSONArray=  result.getJSONArray("prizegrades");
            for (int k = 0,numk=prizegradesJSONArray.size(); k <numk ; k++) {
                JSONObject prizegrades = prizegradesJSONArray.getJSONObject(k);
                gradeType =  prizegrades.getString("type");
                gradeNumber =  prizegrades.getString("typenum");
                gradeMoney =  prizegrades.getString("typemoney");

            }
//            System.out.println(jss.getJSONObject(i));
//            System.out.println("--------------------------------------------------");
        }


    }
}



//package jansonDemo;
//
//        import com.alibaba.fastjson.JSON;
//        import com.alibaba.fastjson.JSONArray;
//        import com.alibaba.fastjson.JSONObject;
//
//public class TestJSON {
//    /**
//     * JSON实际上也是键值对（"key":"value"）
//     * key 必须是字符串，value 可以是合法的 JSON 数据类型（字符串, 数字, 对象, 数组, 布尔值或 null）
//     * value如果是字符串，用jsonobj.getString("key")获取
//     * value如果是数  字，用jsonobj.getIntValue("key"),jsonobj.getFloatValue("key")，jsonobj.getInteger("key")等基本数据类型及其包装类的方法获取
//     * value如果是布尔值，用jsonobj.getBoolean("key"),jsonobj.getBooleanValue("key")获取
//     * value如果是数  组，用jsonobj.getJSONArray("key")获取
//     * value如果是Object对象，用jsonobj.get("key")，获取
//     * value如果是JSONObject对象，用jsonobj.getJSONObject("key")获取
//     */
//
//    /**
//     * 该方法用于将已有的json字符串转换为json对象，并取出该对象中相应的key对应的value值
//     * 将已有的字符串转换成jsonobject，用JSON.parseObject(jsonStr)方法
//     * json中只要是{}就代表一个JSONObject,[]就代表一个JSONArray
//     * 获取JSONObject对象用JSONObject jsonobject.getJSONObject("key")方法
//     * 获取JSONArray对象用JSONObject jsonobject.getJSONArray("key")方法
//     */
//
//    private static void strWritedToJSONObject() {
//        //以下是一个json对象中嵌套一个json子对象
//        String myJsonObj = "{\n" +
//                "    \"name\":\"runoob\",\n" +
//                "    \"alexa\":10000,\n" +
//                "    \"sites\": {\n" +
//                "        \"site1\":\"www.runoob.com\",\n" +
//                "        \"site2\":\"m.runoob.com\",\n" +
//                "        \"site3\":\"c.runoob.com\"\n" +
//                "    }\n" +
//                "}";
//        JSONObject jsonobj = JSON.parseObject(myJsonObj); //将json字符串转换成jsonObject对象
//        /***获取JSONObject中每个key对应的value值时，可以根据实际场景中想得到什么类型就分别运用不到的方法***/
//        System.out.println(jsonobj.get("name")); //取出name对应的value值，得到的是一个object
//        System.out.println(jsonobj.getString("name")); //取出name对应的value值，得到的是一个String
//        System.out.println(jsonobj.getIntValue("alexa")); //取出name对应的value值，得到的是一个int
//        System.out.println(jsonobj.get("sites")); //取出sites对应的value值，得到的是一个object
//        System.out.println(jsonobj.getString("sites"));
//        System.out.println(jsonobj.getJSONObject("sites")); //取出sites对应的value值，得到一个JSONObject子对象
//        System.out.println(jsonobj.getJSONObject("sites").getString("site2")); //取出嵌套的JSONObject子对象中site2对应的value值，必须用getJSONObject()先获取JSONObject
//
//
//        /**
//         * 以下是一个json对象中包含数组，数组中又包含json子对象和子数组
//         */
//        String myJsonObj2 = "{\n" +
//                "    \"name\":\"网站\",\n" +
//                "    \"num\":3,\n" +
//                "    \"sites\": [\n" +
//                "        { \"name\":\"Google\", \"info\":[ \"Android\", \"Google 搜索\", \"Google 翻译\" ] },\n" +
//                "        { \"name\":\"Runoob\", \"info\":[ \"菜鸟教程\", \"菜鸟工具\", \"菜鸟微信\" ] },\n" +
//                "        { \"name\":\"Taobao\", \"info\":[ \"淘宝\", \"网购\" ] }\n" +
//                "    ]\n" +
//                "}";
//        JSONObject jsonobj2 = JSON.parseObject(myJsonObj2); //将json字符串转换成jsonObject对象
//        System.out.println(jsonobj2.get("sites"));
//        System.out.println(jsonobj2.getString("sites"));
//        System.out.println(jsonobj2.getJSONArray("sites")); //取出sites对应的value值，得到一个JSONOArray对象
//        //System.out.println(jsonobj2.getJSONObject("sites")); 不能用该方法，因为sites是一个JSONOArray对象
//        //取出json对象中sites对应数组中第一个json子对象的值
//        System.out.println(jsonobj2.getJSONArray("sites").getJSONObject(0)); //得到结果：{"name":"Google","info":["Android","Google 搜索","Google 翻译"]}
//        System.out.println(jsonobj2.getJSONArray("sites").get(0));
//        System.out.println(jsonobj2.getJSONArray("sites").getString(0));
//        //取出json对象中sites对应数组中第一个json子对象下面info对应的嵌套子数组值
//        System.out.println(jsonobj2.getJSONArray("sites").getJSONObject(0).getJSONArray("info")); //得到结果：["Android","Google 搜索","Google 翻译"]
//        //取出json对象中sites对应数组中第一个json子对象下面info对应的嵌套子数组中第二个值
//        System.out.println(jsonobj2.getJSONArray("sites").getJSONObject(0).getJSONArray("info").getString(1)); //得到结果：Google 搜索
//
//        //依次取出json对象中sites对应数组中的值
//        JSONArray array = jsonobj2.getJSONArray("sites");
//        getJsonArrayItem(array);
//        //依次取出json对象中sites对应数组中第二个json子对象下面info对应的嵌套子数组值
//        JSONArray arr = jsonobj2.getJSONArray("sites").getJSONObject(1).getJSONArray("info");
//        getJsonArrayItem(arr);
//    }
//
//    /**
//     * 手动添加对象到一个JSONObject
//     */
//    private static void writeStrToJSONObject() {
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("name","tom");
//        jsonObject.put("age",20);
//
//        JSONArray jsonArray = new JSONArray();
//        JSONObject jsonArrayObject1 = new JSONObject();
//        jsonArrayObject1.put("name","alibaba");
//        jsonArrayObject1.put("info","www.alibaba.com");
//        JSONObject jsonArrayObject2 = new JSONObject();
//        jsonArrayObject2.put("name","baidu");
//        jsonArrayObject2.put("info","www.baidu.com");
//
//        jsonArray.add(jsonArrayObject1);
//        jsonArray.add(jsonArrayObject2);
//
//        jsonObject.put("sites",jsonArray);
//
//        System.out.println(jsonObject);
//    }
//
//    /**
//     * 将字符串转为JSONArray
//     */
//    private static void strToJsonArray() {
//        String arrayStr = "[\n" +
//                "        {\n" +
//                "            \"name\":\"alibaba\",\n" +
//                "            \"info\":\"www.alibaba.com\"\n" +
//                "        },\n" +
//                "        {\n" +
//                "            \"name\":\"baidu\",\n" +
//                "            \"info\":\"www.baidu.com\"\n" +
//                "        }\n" +
//                "    ]";
//
//        JSONArray array = JSON.parseArray(arrayStr);
//        System.out.println(array);
//    }
//
//    /**
//     * 依次取出JSONArray中的值
//     */
//    private static void getJsonArrayItem(JSONArray array) {
//        for (int i=0; i<array.size(); i++) {
//            System.out.println(array.get(i));
//        }
//    }
//
//    //测试类
//    public static void main(String[] args) {
//        strWritedToJSONObject();
//        //writeStrToJSONObject();
//        //strToJsonArray();
//    }
//
//}
