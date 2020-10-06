# 小程序接口文档

市场监管助手小程序接口文档端请求数据的规范及说明：非固定格式、随时修改维护

说明：方法GET/POST暂时并不清晰、但是写上的一定要通过测试

# 企业端

## 个人中心

### 登录

`/sys/user/loginTest`

postman访问地址：

`https://www.yiwifi1.com:8088/sys/user/loginTest?loginName=mini&password=123456%2B`

方法：GET/POST

- 参数：
```javascript
{
    "loginName": "mini",
    "password": "123456+"
}
```
- 返回值
```json
{
    "status": "success",
    "data": true
}
```

### 人脸识别时输入企业账号密码

`/mini/userLogin`

postman访问地址：

`http://www.yiwifi1.com:8088/mini/userLogin?loginName=mini&password=123456%2B&weChatId=1235a`

方法：get

- 参数：

  ```javascript
  {
  "loginName":mini,
  
  "password":123456%2B,
  
  "weChatId":1235a
  }
  ```

- 返回值

  ```json
  {
    "code": 200,
    "msg": "请求成功",
    "data": {
     "flag": true,//首次登录为false 非首次登录为true
     "enterpriseId": 296661,//首次登录时用该企业id作为参数从企业人员中 选出 自己的userId
     "userId": 1507 //如果首次登录该参数为空
    }
  }
  ```

### 首次登录时选择userId

`/supervision/ca/firstLoginByEnterpriseId`

postman访问地址：

`https://www.yiwifi1.com:8088/supervision/ca/firstLoginByEnterpriseId`

方法：GET

> 首次登录调用此接口选择自己 并将id作为下一个接口的userId的参数

- 参数

```javascript
{

"enterprId":296661

}
```

- 返回值

  ```json
  {
  
    "status": "success",
  
    "data": [
  
      {
  
        "id": 1497,//作为下面接口的userId参数
  
        "companyId": 296661,
  
        "companyName": "市场主体名称/石油大学",
  
  	 "name": "人脸比对",//姓名
  
       ......
  
        "operateTime": "2020-09-07T04:13:08.000+0000",
  
        "operator": "zcc",
  
        "operateIp": "124.214.124"
  
      },
  
      {
  
        "id": 1499,
  
        "companyId": 296661,
  
        "companyName": "市场主体名称*",
  
       "name": "人脸",
  
        ........
  
        "operateTime": "2020-09-21T11:07:35.000+0000",
  
       "operator": "zcc",
  
       "operateIp": "124.214.124"
  
     }]
  
  }
  ```

### 人脸识别登录接口

`/mini/faceLogin`

postman访问地址：

`https://www.yiwifi1.com:8088/mini/faceLogin`

方法：GET

- 参数

```javascript
{

     userId:1499,
	 loginName:"mini",
     wechatId:"",

}
```

- 返回值

```json
{

	status: "success", 

	data: {

	name:"人脸比对"//用户名

	}

}
```



### 登出

`/sys/user/logoutTest`

postman访问地址：

`https://www.yiwifi1.com:8088/sys/user/logoutTest`

方法：GET

- 参数：
```json
无
```
- 返回值
```json
{
    "status": "success",
    "data": null
}
```

### 修改密码
`sys/user/changeUserPsd`

postman访问地址：

`https://www.yiwifi1.com:8088/sys/user/changeUserPsd`

方法：GET

- 参数：
```javascript
{
  	oldPassword: "12345"	// 旧密码
		newPassword: "123456" // 新密码
}
```
- 返回值
```json
{
    "status": "success",
    "data": null
}
```

## 主页
`/mini/getHomePageInfo`

postman访问地址：

`https://www.yiwifi1.com:8088/mini/getHomePageInfo`

方法：GET/POST

- 参数：无

- 返回值
```json
{
    "code": 200,
    "msg": "请求成功",
    "data": {
        "enterpriseRating": {
            "average": 4.66667,
            "vote1": 4.66667,
            "vote5": 4.66667,
            "count": 3,
            "vote4": 4.66667,
            "vote3": 4.66667,
            "vote2": 4.66667,
            "enterprise_id": 296661
        },
        "enterpriseIcon": "http://127.0.0.1:8080/upload/picture/202008/1596985549919.png",
        "cantactWay": "联系电话",
        "idNumber": "统一信用代码*",
        "enterpriseName": "市场主体名称/石油大学",
        "dynamicGrade": "A",
        "yearAssessment": "优秀",
        "introduction": "企业基本介绍"
    }
}
```

### 营业时间/联系电话（董志涵）

`/mini/getConnet`

postman访问地址：

`https://www.yiwifi1.com:8088/mini/getConnet`

方法：GET/POST

- 参数：无

- 返回值
```json
{
    "status": "success",
    "data": {
        "route": {
            "bus": "3路、8路、12路", //公交路线
            "destination": "石油大学站", //到达站
            "operationTime": "6:00-20:00" //公交车运营时间
        },
        "manageTime": "9:00 - 20:00", //营业时间
        "cantactWay1": "联系电话", //联系电话1
        "cantactWay2": "" //联系电话2
    }
}
```

### 企业简介（董志涵）

`/mini/getBusinessIntroduce`

postman访问地址：

`https://www.yiwifi1.com:8088/mini/getBusinessIntroduce`

方法：GET/POST

- 参数：无

- 返回值
```json
{
    "status": "success",
    "data": {
        "businessLicensePhoto": "http://127.0.0.1:8080/upload/picture/202008/1597073014062.JPG",//证照
        "enterpriseIcon": "http://127.0.0.1:8080/upload/picture/202008/1596985549919.png",//门头照片
        "propaganda": "http://127.0.0.1:8080/upload/picture/202008/1596985549919.png",//宣传文件
        "foodBusinessPhoto": "http://127.0.0.1:8080/upload/picture/202008/1597075448907.JPG",//证照
        "introduction": "企业基本介绍"//企业介绍
    }
}
```
## 规范经营之消毒

负责人：刘宁

### 根据日期查看消毒台账（刘宁）

`/mini/getDisinfectionRecord`

postman访问地址：

`https://www.yiwifi1.com:8088/mini/getDisinfectionRecord`

方法：GET

- 参数：
```javascript
{
		date: "2020-9-10"
}
```

- 返回值
```json
{
  	"status": "success",
    "data": [{
        "id": 29434,
        "unit": 296661,
        "area": 1,
        "name": "碗、筷、碟",
        "amount": 500,
        "date": "2020-09-09T16:00:00.000+0000",
        "caId": 1497,
        "person": "王鹏皓",
        "start1": 19,
        "start2": 20,
        "end1": 49,
        "end2": 19,
        "way": "热力消毒",
        "remark": "",
        "operator": "操作人",
        "operatorIp": "124.124.124",
        "operatorTime": "2020-09-10T11:49:25.000+0000"
    }]
}

```

### 新增消毒台账（刘宁）

`/formatdisinfection/insert`

postman访问地址：

`https://www.yiwifi1.com:8088/formatdisinfection/insert`

方法：GET

- 参数：
```javascript
{
    name: "碗", //物品名称
    amount: 25, //数量
    date: "2020-09-17", //消毒日期
    way: "蒸汽消毒", //消毒方式
    start1: 6, //开始的小时
    start2: 5, //开始的分钟
    end1: 6, //结束的小时
    end2: 21, //结束的分钟
    person: "张三", //消毒人员姓名
    caId: 1499 //supervision_ca的id
}
```

- 返回值
```json
{
    "status": "success",
    "data": null
}
```
### 更新消毒台账（刘宁）

`/formatdisinfection/insert`

postman访问地址：

`https://www.yiwifi1.com:8088/formatdisinfection/update`

方法：GET

- 参数：

```javascript
{
  	id: 29434,
    name: "碗", //物品名称
    amount: 25, //数量
    date: "2020-09-17", //消毒日期
    way: "蒸汽消毒", //消毒方式
    start1: 6, //开始的小时
    start2: 5, //开始的分钟
    end1: 6, //结束的小时
    end2: 21, //结束的分钟
    person: "张三", //消毒人员姓名
    caId: 1499 //supervision_ca的id
}
```

- 返回值

```json
{
    "status": "success",
    "data": null
}
```

### 删除消毒台账（刘宁）

`/formatdisinfection/delete`

postman访问地址：

`https://www.yiwifi1.com:8088/formatdisinfection/delete`

方法：GET

- 参数：

```javascript
{
		id: 29434,
}
```

- 返回值

```json
// 成功删除
{
    "status": "success",
    "data": null
}
// 如果没有该条记录
{
    "status": "fail",
    "data": {
        "errCode": 40001,
        "errMsg": "所选条目不存在，无法删除 ",
        "errList": null
    }
}
```

### 企业从业人员列表（刘宁）

**备注**：需要删除分页，但是后期可能不需要从业人员列表、暂时不做更改

`supervision/ca/getSelectByEnterpriseId`

postman访问地址：

`https://www.yiwifi1.com:8088/supervision/ca/getSelectByEnterpriseId`

方法：GET/POST

- 参数：
```javascript
// 要传一个空
{}
```

- 返回值
```json
{
    "status": "success",
    "data": {
        "data": [
            {
                "id": 1497,
                "companyId": 296661,
                "companyName": "市场主体名称/石油大学",
                "name": "王鹏皓",
                "idNumber": "4103291997XXXX4018",
                "sexy": 0,
                "telephone": "",
                "workType": 1,
                "industry": 1,
                "electronicNumber": "",
                "health": "合格",
                "train": "已培训",
                "education": "研究生",
                "healthNumber": "1234567890",
                "startTime": "2020-08-30T23:32:41.000+0000",
                "endTime": "2021-08-30T23:32:55.000+0000",
                "issuingAuthority": "发证机关",
                "photo": "[{\"uid\":\"rc-upload-1598857539988-2\",\"xhr\":{},\"size\":407699,\"lastModifiedDate\":\"2019-09-27T06:11:38.043Z\",\"response\":{\"data\":\"202008/1598859248625.jpg\",\"status\":\"success\"},\"name\":\"19-9-28合唱.jpg\",\"lastModified\":1569564698043,\"type\":\"image/jpeg\",\"percent\":100,\"originFileObj\":{\"uid\":\"rc-upload-1598857539988-2\"},\"status\":\"done\"}]",
                "operateTime": "2020-09-07T04:13:08.000+0000",
                "operator": "zcc",
                "operateIp": "124.214.124"
            }]
    }
}
```



## 食品留样

### 新增食品留样（刘宁）

`/formatleave/miniInsert`

postman访问地址：

`https://www.yiwifi1.com:8088/formatleave/miniInsert`

方法：POST  'content-type': 'application/json'
注意

>1 MainFood 主食 2 MainCourse 热菜 3 CoolCourse凉菜 4 soup 汤/奶 5 fruit /水果
- 参数：
```json
{
    "date":"2020-09-10",//留样日期
    "meal":"晚餐",//餐次
    "number":"100",//就餐人数
    "person":"",//留样人员姓名  
    "list":[
    {
        "name":"西柿",//菜品名称
        "num":"125",//留样量 
        "picture":"",//图片路径
        "type":1,//对应上面的五个数
        "material1":"鸡蛋"//主要原料
    }]
}
```

- 返回值
```json
{
    "status": "success",
    "data": null
}
```

### 修改食品留样（刘宁）

`/formatleave/miniUpdate`

postman访问地址：

`https://www.yiwifi1.com:8088/formatleave/miniUpdate`

方法：POST 'content-type': 'application/json'
注意

>1 MainFood 主食 2 MainCourse 热菜 3 CoolCourse凉菜 4 soup 汤/奶 5 fruit /水果
- 参数：
```json
{
    "id":,
    "date":"2020-09-10",//留样日期
    "meal":"晚餐",//餐次
    "number":"100",//就餐人数
    "person":"",//留样人员姓名  
    "list":[
    {
        "name":"西柿",//菜品名称
        "num":"125",//留样量 
        "picture":"",//图片路径
        "type":1,//对应上面的五个数
        "material1":"鸡蛋"//主要原料
    }]
}
```

- 返回值
```json
{
    "status": "success",
    "data": null
}
```

### 删除食品留样（刘宁）

`/formatleave/delete`

postman访问地址：

`https://www.yiwifi1.com:8088/formatleave/delete`

方法：GET
注意

>1 MainFood 主食 2 MainCourse 热菜 3 CoolCourse凉菜 4 soup 汤/奶 5 fruit /水果
- 参数：
```javascript
{
		id: 256,
}
```

- 返回值
```json
{
    "status": "success",
    "data": null
}
```

### 根据日期查看食品留样（刘宁）

`/formatleave/getFormatLeaveSampleByDate`

postman访问地址：

`https://www.yiwifi1.com:8088/formatleave/getFormatLeaveSampleByDate`

方法：POST 
注意

>1 MainFood 主食 2 MainCourse 热菜 3 CoolCourse凉菜 4 soup 汤/奶 5 fruit /水果
- 参数：
```

   {"start":"2020-09-10"}

```

- 返回值
```json
 "data": [
        {
            "id": 239,
            "unit": 296661,
            "area": 1,
            "type": "好饿",
            "date": "2020-09-10T08:28:16.000+0000",
            "meal": "午餐",
            "matter": "ww",
            "number": "ww",
            "person": "ww",
            "document": "[]",
            "operator": "zcc",
            "operatorIp": "124.124.124",
            "operatorTime": "2020-09-10T08:28:49.000+0000"
        },
        {
            "id": 253,
            "unit": 296661,
            "area": 1,
            "type": null,
            "date": "2020-09-10T08:28:16.000+0000",
            "meal": "晚餐",
            "matter": null,
            "number": "100",
            "person": null,
            "document": null,
            "operator": "zcc",
            "operatorIp": "124.124.124",
            "operatorTime": "2020-09-10T09:36:13.000+0000"
        }]
```

### 根据留样Id查看菜品（刘宁）

`/formatleave/getById`

postman访问地址：

`https://www.yiwifi1.com:8088/formatleave/getById`

方法：GET 
注意

>1 MainFood 主食 2 MainCourse 热菜 3 CoolCourse凉菜 4 soup 汤/奶 5 fruit /水果
- 参数：
```
{ 
   id:262 
}
```

- 返回值
```json
 {
    "status": "success",
    "data": {
        "id": 253,
        "unit": 296661,
        "area": 1,
        "type": null,
        "date": "2020-09-10T08:28:16.000+0000",
        "meal": "晚餐",
        "matter": null,
        "number": "100",
        "person": null,
        "document": null,
        "operator": "zcc",
        "operatorIp": "124.124.124",
        "operatorTime": "2020-09-10T09:36:13.000+0000",
        "list": [
            {
                "id": 281,
                "parentId": 253,
                "seq": null,
                "name": "西柿",
                "material1": "鸡蛋",
                "state": null,
                "type": 1,
                "picture": null,
                "num": "125",
                "operator": "zcc",
                "operatorIp": "124.124.124",
                "operatorTime": "2020-09-10T09:36:14.000+0000"
            }
        ]
    }
    }
```
### 获取原料(按照类型获取)（刘宁）

`/formatorigin/getOrigin`

postman访问地址：

`https://www.yiwifi1.com:8088/formatorigin/getOrigin`

方法：POST 'content-type': 'application/json'

- 参数：
```
{
    "type":"肉" //为空时获取所有原料
}
```
- 返回值
```json
{ "status": "success",
    "data": [
        {
            "id": 141,
            "type": "肉类",
            "explains": "猪肉、羊肉等肉类制品",
            "operator": "操作人",
            "operatorIp": "124.124.124",
            "operatorTime": "2019-12-17T23:47:56.000+0000"
        },
        {
            "id": 140,
            "type": "水果蔬菜",
            "explains": "水果、蔬菜类",
            "operator": "操作人",
            "operatorIp": "124.124.124",
            "operatorTime": "2019-12-17T23:48:08.000+0000"
        }
    ]
}
```

## 新增索证索票

### 添加索证索票（刘宁）

`/formatOriginRecordEx/miniInsert`

postman访问地址：

`https://www.yiwifi1.com:8088/formatOriginRecordEx/miniInsert`

方法：POST 'content-type': 'application/json'

- 参数：
```javascript
    [{
        "originType":"散装产品",//食品类型
        "recordTime":"2020-08-15",//采购日期
        "originName":"原料名称",//原料名称
        "originTypeEx":"肉类",//原料类型
        "brand":"品牌",//品牌产地
        "netContent":"净含量/规格",//规格
        "produceTime":"2020-08-15",//生产日期
        "keepTime":7,//保质期
        "keepTimeType":"天",//保质期单位
        "goodsIn":"7",//采购数量
        "goodsType":"吨",//采购数量单位
        "supplier":"供应商名称*",//供应商
        "money":11.5//金额(float类型)
        },{
        "originType":"散装产品",
        "recordTime":"2020-08-15",
        "originName":"原料名称",
        "originTypeEx":"肉类",
        "brand":"品牌",
        "netContent":"净含量/规格",
        "produceTime":"2020-08-15",
        "keepTime":7,
        "keepTimeType":"天",
        "goodsIn":"7",
        "goodsType":"吨",
        "supplier":"供应商名称*",
        "money":12
    }]
```

- 返回值
```json
{
    "status": "success",
    "data": null
}
```
### 修改索证索票（刘宁）

`/formatOriginRecordEx/update`

postman访问地址：

`https://www.yiwifi1.com:8088/formatOriginRecordEx/update`

方法：POST  'content-type': 'application/json'

- 参数：
```javascript
    {
        "id":
        "originType":"散装产品",//食品类型
        "originName":"原料名称",//原料名称
        "originTypeEx":"肉类",//原料类型
        "brand":"品牌",//品牌产地
        "netContent":"净含量/规格",//规格
        "produceTime":"2020-08-15",//生产日期
        "keepTime":7,//保质期
        "keepTimeType":"天",//保质期单位
        "goodsIn":"7",//采购数量
        "goodsType":"吨",//采购数量单位
        "supplier":"供应商名称*",//供应商
        "money":11.5//金额(float类型)
    }
```

### 删除索证索票（刘宁）

`/formatOriginRecordEx/delete`

postman访问地址：

`https://www.yiwifi1.com:8088/formatOriginRecordEx/delete`

方法：GET

- 参数：
```
    {
        "id":365
    }
```

- 返回值
```json
{
    "status": "success",
    "data": null
}
```

### 根据日期查询索证索票（刘宁）

`/formatOriginRecordEx/getRecordExByDate`

postman访问地址：

`https://www.yiwifi1.com:8088/formatOriginRecordEx/getRecordExByDate`

方法：GET
>注意 该接口返回的billList需要在下面查看票据照片的时候用
- 参数：
```
 {
        "recordTime":"2020-8-15"
 }
```

- 返回值
```json
{
    "status": "success",
    "data": [
        {
            "id": 3662,
            "enterprise": 296661,
            "area": 1,
            "originType": "散装产品",
            "recordTime": "2020-08-16",
            "originName": "原料名称",
            "originTypeEx": "肉类",
            "producer": null,
            "brand": "品牌",
            "netContent": "净含量/规格",
            "produceTime": "2020-08-15",
            "keepTime": "7",
            "keepTimeType": "天",
            "deadTime": null,
            "goodsIn": 7.0,
            "goodsType": "吨",
            "supplier": "供应商名称*",
            "supplierType": null,
            "goodsOut": null,
            "goods": null,
            "money": 12.0,
            "state": null,
            "person": null,
            "document": null,
            "operator": "操作人",
            "operatorIp": "124.124.124",
            "operatorTime": "2020-09-16T02:00:10.000+0000",
            "enterpriseName": null,
            "areaName": null,
            "billList": "4,3" //需要在下面查看票据照片的时候用
        },
        {
            "id": 3663,
            "enterprise": 296661,
            "area": 1,
            "originType": "散装产品",
            "recordTime": "2020-08-16",
            "originName": "原料名称",
            "originTypeEx": "肉类",
            "producer": null,
            "brand": "品牌",
            "netContent": "净含量/规格",
            "produceTime": "2020-08-15",
            "keepTime": "7",
            "keepTimeType": "天",
            "deadTime": null,
            "goodsIn": 7.0,
            "goodsType": "吨",
            "supplier": "供应商名称*",
            "supplierType": null,
            "goodsOut": null,
            "goods": null,
            "state": null,
            "person": null,
            "document": null,
            "operator": "操作人",
            "operatorIp": "124.124.124",
            "operatorTime": "2020-09-16T02:00:08.000+0000",
            "enterpriseName": null,
            "areaName": null,
            "billList": "4"
        },
    ]
}
```

### 索证索票查看票据照片（刘宁）

`/billReport/getBillReportByBillId`

postman访问地址：

`https://www.yiwifi1.com:8088/billReport/getBillReportByBillId`

方法：GET

- 参数：
```
    {
        "billList":"3,5"
    }
```

- 返回值
```json
{
    "status": "success",
    "data": [
        {
            "id": 3,
            "enterpriseId": 296661,
            "name": "食品安全",
            "picture": "pic",
            "date": "2020-08-16",
            "operator": "mini",
            "operatorIp": "127.0.0.1",
            "operatorTime": "2020-09-16T09:39:07.000+0000",
            "recordList": null
        },
        {
            "id": 5,
            "enterpriseId": 296661,
            "name": "食品安全",
            "picture": "pic",
            "date": "2020-08-16",
            "operator": "mini",
            "operatorIp": "127.0.0.1",
            "operatorTime": "2020-09-16T09:02:41.000+0000",
            "recordList": null
        }
    ]
}
```

## 票据上报

### 添加票据上报（刘宁）

`/billReport/insert`

postman访问地址：

`https://www.yiwifi1.com:8088/billReport/insert`

方法：POST  'content-type': 'application/json'

- 参数：
```
    {
    "name":"食品安全",// 票据名称           
    "picture":"pic", //票据图片的地址
    "date":"2020-8-16",//上报时间
    "idList":[3662,3665]//关联的产品id
    }
```

- 返回值
```json
{
    "status": "success",
    "data": null
}
```
### 修改票据数据（刘宁）

`/billReport/update`

postman访问地址：

`https://www.yiwifi1.com:8088/billReport/update`

方法：POST  'content-type': 'application/json'

- 参数：
```
    {
    "id":3,//需要修改的票据id
    "name":"食品安全",// 票据名称           
    "picture":"pic", //票据图片的地址
    "date":"2020-8-16",//上报时间
    "idList":[3662,3665]//关联的产品id
    }
```

- 返回值
```json
{
    "status": "success",
    "data": null
}
```

### 删除票据数据（刘宁）

`/billReport/delete`

postman访问地址：

`https://www.yiwifi1.com:8088/billReport/delete`

方法：GET

- 参数：
```
    {
        "id":6//票据的id
    }
```

- 返回值
```json
{
    "status": "success",
    "data": null
}
```
### 根据日期查询票据（刘宁）

`/billReport/getBillReport`

postman访问地址：

`https://www.yiwifi1.com:8088/billReport/getBillReport`

方法：GET

- 参数：
```
    {
        "date":"2020-8-16"
    }
```

- 返回值
```json
{
    "status": "success",
    "data": [
        {
            "id": 4,
            "enterpriseId": 296661,
            "name": "动物检疫",
            "picture": "pic",
            "date": "2020-08-16",
            "operator": "mini",
            "operatorIp": "127.0.0.1",
            "operatorTime": "2020-09-16T02:51:18.000+0000",
            "recordList": "原料名称,原料名称,原料名称" //关联产品
        },
        {
            "id": 5,
            "enterpriseId": 296661,
            "name": "食品安全",
            "picture": "pic",
            "date": "2020-08-16",
            "operator": "mini",
            "operatorIp": "127.0.0.1",
            "operatorTime": "2020-09-16T09:02:41.000+0000",
            "recordList": "原料名称,狗不理88号" //关联产品
        }
    ]
}
```
## 食品添加剂（刘宁）

### 新增食品添加剂

`远程：https://www.yiwifi1.com:8088/foodAdditive/insert`

方法：POST  'content-type': 'application/json'

- 参数

```json
{
"useDate":"2020-9-28 11:25:22",
"safeManager":"啦啦",
"additiveName":"食盐",
"useAmount":"100",
"useRange":"使用",
"additiveRatio":"1/500",
"gotPerson":"李磊",
"produceCompany":"海尔",
"produceDate":"2020-8-16",
"remark":"wdnmdddddddd"}
```

- 返回值

```json
{
    "status": "success",
    "data": null
}
```

### 更新食品添加剂

`远程：https://www.yiwifi1.com:8088/foodAdditive/update`

方法：POST  'content-type': 'application/json'

- 参数

```json
{
"id":1,
"useDate":"2020-9-28 11:25:22",
"safeManager":"啦啦",
"additiveName":"食盐",
"useAmount":"100",
"useRange":"使用",
"additiveRatio":"1/500",
"gotPerson":"李磊",
"produceCompany":"海尔",
"produceDate":"2020-8-16",
"remark":"wdnmdddddddd"}
```

- 返回值

```json
{
    "status": "success",
    "data": null
}
```

### 删除食品添加剂

`远程：https://www.yiwifi1.com:8088/foodAdditive/delete`

方法：POST  'content-type': 'application/json'

- 参数

```json
{
"id":1
}
```

- 返回值

```json
{
    "status": "success",
    "data": null
}
```

### 按照日期查询食品添加剂

`远程：https://www.yiwifi1.com:8088/foodAdditive/selectByDate`

方法：POST  'content-type': 'application/json'

- 参数

```json
{
    "startDate":"2020-09-28",
    "endDate":"2020-09-30"
}
```

- 返回值

```json
{
    "status": "success",
    "data": [
        {
            "id": 1,
            "enterpriseId": 296661,
            "useDate": "2020-09-28 00:00:00",
            "safeManager": "啦啦",
            "additiveName": "食盐",
            "useAmount": 100,
            "useRange": "使用",
            "additiveRatio": "1/500",
            "gotPerson": "李磊",
            "produceCompany": "海尔",
            "produceDate": "2020-08-16",
            "remark": "wdnmdddddddd",
            "operator": "mini",
            "operatorIp": "127.0.0.1",
            "operatorTime": "2020-09-29"
        },
        {
            "id": 2,
            "enterpriseId": 296661,
            "useDate": "2020-09-29 00:00:00",
            "safeManager": "啦啦",
            "additiveName": "十三香",
            "useAmount": 100,
            "useRange": "使用",
            "additiveRatio": "1/500",
            "gotPerson": "小明",
            "produceCompany": "海尔",
            "produceDate": "2020-08-16",
            "remark": "wdnmdddddddd",
            "operator": "mini",
            "operatorIp": "127.0.0.1",
            "operatorTime": "2020-09-28"
        }]
}
```



### 按照日期导出食品添加剂

`远程：https://www.yiwifi1.com:8088/foodAdditive/standingFoodAdditive`

方法：POST  'content-type': 'application/json'

```json
{
    "startDate":"2020-09-28",
    "endDate":"2020-09-30"
}
```



## 新增废弃物（董志涵）

`远程：https://www.yiwifi1.com:8088/formatwaste/insert`

方法：GET

- 参数：
```
disposaltime=2020-09-04 //处置时间
kind=种类 //废弃物种类
number=100 //数量
disposalperson=处置人 //处置人员
recyclingenterprises=回收企业 //回收单位
recycler=回收人 //回收人
extra=备注 //备注
```

- 返回值
```json
{
    "status": "success",
    "data": null
}
```

## 按时间获取废弃物记录（董志涵）
`远程：https://www.yiwifi1.com:8088/mini/getWasteByDate`

方法：GET

- 参数：
```json
{
    "start1":"2019-12-17"
}
```

- 返回值
```json
{
    "status": "success",
    "data": [
        {
            "id": 46,
            "enterprise": 1497,
            "area": 11,
            "disposaltime": "2019-12-17T16:00:00.000+0000",//处置时间
            "kind": "餐厨垃圾",//废弃物种类
            "number": "2桶",//数量
            "disposalperson": "罗文浩",//处置人
            "registrationtime": "2019-12-17T16:00:00.000+0000",
            "recyclingenterprises": "武夷山社区回收站",//回收单位
            "recycler": "武夷山回收站",//回收人
            "extra": "",//备注
            "operator": "操作人",
            "operatorIp": "124.124.124",
            "operatorTime": "2019-12-18T08:31:56.000+0000"
        }
    ]
}
```

## 修改废弃物（董志涵）
`远程：https://www.yiwifi1.com:8088/formatwaste/update`

方法：GET

- 参数：
```
disposaltime=2020-09-04 //处置时间
kind=种类 //废弃物种类
number=100 //数量
disposalperson=处置人 //处置人员
recyclingenterprises=回收企业 //回收单位
recycler=回收人 //回收人
extra=备注 //备注
```

- 返回值
```json
{
    "status": "success",
    "data": null
}
```

## 删除废弃物（董志涵）
`远程：https://www.yiwifi1.com:8088/formatwaste/delete`

方法：GET

- 参数：
```
id=46 //废弃物id
```

- 返回值
```json
{
    "status": "success",
    "data": null
}
```

## 生成废弃物Excel（董志涵）
`远程：https://www.yiwifi1.com:8088/formatwaste/standingBook`

方法：POST

- 参数：
```
{
    "start1":"2020-09-08",//开始日期
    "end1":"2020-09-12"//结束日期
}
```

- 返回值
```json
{
    "status":"success",
    "data":"upload/standingBook/202009/废弃物处理296661.xlsx" //Excel路径
}
```

## 新增回收单位（董志涵）
`远程：https://www.yiwifi1.com:8088/formatrecovery/insert`

方法：GET

- 参数：
```
recoveryEnterprise=测试回收单位 //回收单位名称
charger=负责人 //联系人
phone=1111111 //联系方式
address=地址 //地址
```

- 返回值
```json
{
    "status": "success",
    "data": null
}
```

## 获取回收单位（董志涵）
`远程：https://www.yiwifi1.com:8088/mini/getRecoveryUnit`

方法：GET

- 返回值
```json
{
    "status": "success",
    "data": [
        {
            "id": 24,
            "enterpriseId": 296661,
            "enterpriseName": "市场主体名称*",
            "areaId": 1,
            "recoveryEnterprise": "测试回收单位",//回收单位名称
            "charger": "负责人",//联系人
            "address": "地址",
            "phone": "1111111",//联系电话
            "operator": "操作人",
            "operatorIp": "124.124.124",
            "operatorTime": "2020-09-05T12:07:25.000+0000"
        }
    ]
}
```

## 修改回收单位（董志涵）
`远程：https://www.yiwifi1.com:8088/formatrecovery/update`

方法：GET

- 参数：
```
id=1 //回收单位id
recoveryEnterprise=测试回收单位 //回收单位名称
charger=负责人 //联系人
phone=1111111 //联系方式
address=地址 //地址
```

- 返回值
```json
{
    "status": "success",
    "data": null
}
```

## 删除回收单位（董志涵）
`远程：https://www.yiwifi1.com:8088/formatrecovery/delete`

方法：GET

- 参数：
```
id=24 //回收单位id
```

- 返回值
```json
{
    "status": "success",
    "data": null
}
```

## 根据回收单位名称查询回收单位（董志涵）
`远程：https://www.yiwifi1.com:8088/mini/getRecoveryUnit?`

方法：GET

- 参数：
```
name=回收 //回收单位名称
```

- 返回值
```json
{
    "status": "success",
    "data": [
        {
            "id": 24,
            "enterpriseId": 296661,
            "enterpriseName": "市场主体名称*",
            "areaId": 1,
            "recoveryEnterprise": "测试回收单位",//回收单位名称
            "charger": "负责人",//联系人
            "address": "地址",
            "phone": "1111111",//联系电话
            "operator": "操作人",
            "operatorIp": "124.124.124",
            "operatorTime": "2020-09-05T04:07:25.000+0000"
        }
    ]
}
```

## 线上售卖备案（晁展）

### 获取线上售卖备案

接口名：/mini/getOnlineBusiness

方法：POST

前端传入企业Id

```
{

  "enterpriseId":"22"

}
```

返回值：

```
{
    "code": 200,
    "msg": "请求成功",
    "data": {
        "examFlag": null,//审核标志
        "phone": "adaas",//外卖电话
        "name": "asdhb",//外卖店铺名称
        "id": 2,  
        "enterpriseId": 22, //企业Id
        "splat": [
            1,//美团
            2,//饿了么
            3,//百度外卖
            4//其他
        ]，//外卖平台
        "address": "sadad",//商铺地址
        "answer": null,    //审核答复
        "elm": {//饿了么外卖公示
            "elmFoodSafe": null,   //饿了么食品安全档案
            "elmHomePage": null,   //饿了么商铺首页
            "elmFoodLicence": null,//饿了么食品经营许可证
            "elmBusinessLicence": null//饿了么营业执照
        },
        "bd": {//百度外卖公示
            "bdHomePage": null,
            "bdFoodLicence": null,
            "bdBusinessLicence": null,
            "bdFoodSafe": null
        },
        "cs": {  //场所校验图
            "license": null,     //证件公示
            "enterpriseIcon": null,//商铺门头
            "operationArea": null  //操作区域
        },
        "mt": {//饿了么外卖公示
            "mtHomePage": "sada",
            "mtBusinessLicense": null,
            "mtFoodLicense": null,
            "mtFoodSafe": null
        }
    }
}
```

### 新增或修改线上售卖备案

方法：POST

接口名称：/mini/insertOnlineBusiness

注解：关于上传文件前端传入upLoad/picture返回地址

前端：

```
{

  "enterpriseId":222,  //企业Id,不可为空

  "name":"aaaaaaaaaasd",//外卖店铺名,不可为空

  "address":"sadad",//店铺地址,不可为空

  "phone":"adaas",   //订餐电话,不可为空

  "splatList":[1,2,3],   //企业平台1代表美团，2代表饿了么，3代表百度外卖，4代表其他

  "examFlag":"",  //审核，0未审核/1通过/2不通过

  "answer":"",//	审核答复

  "enterpriseIcon":"",//商铺门头

  "operationArea":"",//操作区域

  "license":"",//证件公示

  "mtHomePage":"",//美团商铺首页

  "mtFoodSafe":"",//美团食品安全档案

  "mtFoodLicense":"sada",//美团食品经营许可证

  "mtBusinessLicense":"",//美团营业执照

  "elmHomePage":"",

  "elmFoodSafe":"",

  "elmFoodLicence":"",

  "elmBusinessLicence":"",

  "bdHomePage":"",

  "bdFoodSafe":"",

  "bdFoodLicence":"",

  "bdBusinessLicence":"",

  "otherHomePage":"",

  "otherFoodSafe":"",

  "otherFoodLicence":"",

  "otherBusinessLicence":""

}
```

返回值：

```
{

  "code": 200,

  "msg": "请求成功",

  "data": "成功！"

}
```

## 证照公示

### 获取证照公示（晁展）

```
接口：/supervision/enterprise/getLicensePhotos
```

方法：post

参数：无

返回值：

```
{
    "status": "success",
    "data": {
        "FoodBusinessPhotos":  "http://127.0.0.1:8080/upload/picture/202005/1590720552005.png",  //食品经营许可证
        "FoodProducePhotos": "http://127.0.0.1:8080/upload/picture/202005/1590720552005.png",
        "SmallWorkshopPhotos": "http://127.0.0.1:8080/upload/picture/202005/1590720552005.png",
        "MedicalProducePhotos": "http://127.0.0.1:8080/upload/picture/202005/1590720552005.png",
        "SmallCaterPhotos": "http://127.0.0.1:8080/upload/picture/202005/1590720552005.png",
        "IndustrialProductsPhotos": "http://127.0.0.1:8080/upload/picture/202005/1590720552005.png",
        "OtherPhotos": "http://127.0.0.1:8080/upload/picture/202005/1590720552005.png",
        "BusinessLicensePhoto": "http://127.0.0.1:8080/upload/picture/202005/1590720552005.png",  ////营业执照
        "DrugsBusinessPhotos": "http://127.0.0.1:8080/upload/picture/202005/1590720552005.png",
        "DrugsProducePhotos": "http://127.0.0.1:8080/upload/picture/202005/1590720552005.png",
        "CertificatePhotos": "http://127.0.0.1:8080/upload/picture/202005/1590720552005.png",
        "MedicalBusinessPhotos": "http://127.0.0.1:8080/upload/picture/202005/1590720552005.png",
        "CosmeticsUsePhotos": "http://127.0.0.1:8080/upload/picture/202005/1590720552005.png",
        "PublicityPhotos": "http://127.0.0.1:8080/upload/picture/202005/1590720552005.png"
    }
}
```

### 新增或修改证照公示（晁展）

```
接口：/supervision/enterprise/changeLicensePhoto
```

方法：post

前端传入upLoad/picture返回地址

参数：

```
{
    "businessLicensePhoto":[{"uid":"rc-upload-1590720301161-6","size":22849,"lastModifiedDate":"2020-05-29T02:48:56.134Z","response":{"data":"202005/1590720552005.png"},"name":"12(_{~EMWN]~QTF[~9WCKKP.png","lastModified":1590720536134,"type":"image/png","percent":100,"originFileObj":{"uid":"rc-upload-1590720301161-6"},"status":"done"}],     //营业执照
    "foodBusinessPhotos":[{"uid":"rc-upload-1590720301161-6","size":22849,"lastModifiedDate":"2020-05-29T02:48:56.134Z","response":{"data":"202005/1590720552005.png"},"name":"12(_{~EMWN]~QTF[~9WCKKP.png","lastModified":1590720536134,"type":"image/png","percent":100,"originFileObj":{"uid":"rc-upload-1590720301161-6"},"status":"done"}],    //食品经营许可证
    "smallCaterPhotos":[{"uid":"rc-upload-1590720301161-6","size":22849,"lastModifiedDate":"2020-05-29T02:48:56.134Z","response":{"data":"202005/1590720552005.png"},"name":"12(_{~EMWN]~QTF[~9WCKKP.png","lastModified":1590720536134,"type":"image/png","percent":100,"originFileObj":{"uid":"rc-upload-1590720301161-6"},"status":"done"}],
    "smallWorkshopPhotos":[{"uid":"rc-upload-1590720301161-6","size":22849,"lastModifiedDate":"2020-05-29T02:48:56.134Z","response":{"data":"202005/1590720552005.png"},"name":"12(_{~EMWN]~QTF[~9WCKKP.png","lastModified":1590720536134,"type":"image/png","percent":100,"originFileObj":{"uid":"rc-upload-1590720301161-6"},"status":"done"}],
    "foodProducePhotos":[{"uid":"rc-upload-1590720301161-6","size":22849,"lastModifiedDate":"2020-05-29T02:48:56.134Z","response":{"data":"202005/1590720552005.png"},"name":"12(_{~EMWN]~QTF[~9WCKKP.png","lastModified":1590720536134,"type":"image/png","percent":100,"originFileObj":{"uid":"rc-upload-1590720301161-6"},"status":"done"}],
    "drugsBusinessPhotos":[{"uid":"rc-upload-1590720301161-6","size":22849,"lastModifiedDate":"2020-05-29T02:48:56.134Z","response":{"data":"202005/1590720552005.png"},"name":"12(_{~EMWN]~QTF[~9WCKKP.png","lastModified":1590720536134,"type":"image/png","percent":100,"originFileObj":{"uid":"rc-upload-1590720301161-6"},"status":"done"}],
    "drugsProducePhotos":[{"uid":"rc-upload-1590720301161-6","size":22849,"lastModifiedDate":"2020-05-29T02:48:56.134Z","response":{"data":"202005/1590720552005.png"},"name":"12(_{~EMWN]~QTF[~9WCKKP.png","lastModified":1590720536134,"type":"image/png","percent":100,"originFileObj":{"uid":"rc-upload-1590720301161-6"},"status":"done"}],
    "cosmeticsUsePhotos":[{"uid":"rc-upload-1590720301161-6","size":22849,"lastModifiedDate":"2020-05-29T02:48:56.134Z","response":{"data":"202005/1590720552005.png"},"name":"12(_{~EMWN]~QTF[~9WCKKP.png","lastModified":1590720536134,"type":"image/png","percent":100,"originFileObj":{"uid":"rc-upload-1590720301161-6"},"status":"done"}],
    "medicalProducePhotos":[{"uid":"rc-upload-1590720301161-6","size":22849,"lastModifiedDate":"2020-05-29T02:48:56.134Z","response":{"data":"202005/1590720552005.png"},"name":"12(_{~EMWN]~QTF[~9WCKKP.png","lastModified":1590720536134,"type":"image/png","percent":100,"originFileObj":{"uid":"rc-upload-1590720301161-6"},"status":"done"}],
    "medicalBusinessPhotos":[{"uid":"rc-upload-1590720301161-6","size":22849,"lastModifiedDate":"2020-05-29T02:48:56.134Z","response":{"data":"202005/1590720552005.png"},"name":"12(_{~EMWN]~QTF[~9WCKKP.png","lastModified":1590720536134,"type":"image/png","percent":100,"originFileObj":{"uid":"rc-upload-1590720301161-6"},"status":"done"}],
    "industrialProductsPhotos":[{"uid":"rc-upload-1590720301161-6","size":22849,"lastModifiedDate":"2020-05-29T02:48:56.134Z","response":{"data":"202005/1590720552005.png"},"name":"12(_{~EMWN]~QTF[~9WCKKP.png","lastModified":1590720536134,"type":"image/png","percent":100,"originFileObj":{"uid":"rc-upload-1590720301161-6"},"status":"done"}],
    "publicityPhotos":[{"uid":"rc-upload-1590720301161-6","size":22849,"lastModifiedDate":"2020-05-29T02:48:56.134Z","response":{"data":"202005/1590720552005.png"},"name":"12(_{~EMWN]~QTF[~9WCKKP.png","lastModified":1590720536134,"type":"image/png","percent":100,"originFileObj":{"uid":"rc-upload-1590720301161-6"},"status":"done"}],
    "certificatePhotos":[{"uid":"rc-upload-1590720301161-6","size":22849,"lastModifiedDate":"2020-05-29T02:48:56.134Z","response":{"data":"202005/1590720552005.png"},"name":"12(_{~EMWN]~QTF[~9WCKKP.png","lastModified":1590720536134,"type":"image/png","percent":100,"originFileObj":{"uid":"rc-upload-1590720301161-6"},"status":"done"}],
    "otherPhotos":[{"uid":"rc-upload-1590720301161-6","size":22849,"lastModifiedDate":"2020-05-29T02:48:56.134Z","response":{"data":"202005/1590720552005.png"},"name":"12(_{~EMWN]~QTF[~9WCKKP.png","lastModified":1590720536134,"type":"image/png","percent":100,"originFileObj":{"uid":"rc-upload-1590720301161-6"},"status":"done"}]
}
```

返回值：

```
{

  "code": 200,

  "msg": "请求成功",

  "data": "新增或修改成功"

}
```



### 获取企业VR（晁展）

```
远程：https://www.yiwifi1.com:8088/supervision/enterprise/getVrUrl
```

方法：POST

参数：无

返回值：

```
{

  "code": 200,

  "msg": "请求成功",

  "data": {

​    "vrUrl":      "https://720yun.com/t/8fvknbrmdq9#scene_id=32741409\r\nhttps://720yun.com/t/8fvknbrmdq9#scene_id=32741409\r\nhttps://720yun.com/t/8fvknbrmdq9#scene_id=32741409\r\nhttps://720yun.com/t/8fvknbrmdq9#scene_id=32741409\r\nhttps://720yun.com/t/8fvknbrmdq9#scene_id=32741409\r\nhttps://720yun.com/t/8fvknbrmdq9#scene_id=32741409"    //企业VR的URL

  }

}
```

## 校园陪餐（晁展）

### 新增陪餐

```
远程：https://www.yiwifi1.com:8088/Accompany/insert
```

方法：POST

参数：

```
{

  "mealDate":"2020-9-10",   //陪餐日期

  "mealTime":"午餐",        //餐次类别（早中晚）

  "mealAccompanys":"chao", //陪餐人员

  "canteenHealth":"满意",   //餐厅卫生

  "foodQuality":"满意",     //饭菜质量

  "mealNumber":"满意",      //饭菜数量

  "staffAttitude":"满意",   //员工态度

  "staffSpecifications":"满意",//工作人员规范

  "totalSatisfaction":"满意",  //总体满意度

  "diningWindow":"aaa",       //分餐窗口，url

  "mealRecord":"aaa",         //菜品记录，url

  "diningEnvironment":"aaa"   //就餐环境url

}
```

返回值：

```
{

  "status": "success",

  "data": **null**

}
```

### 修改陪餐

```
远程：https://www.yiwifi1.com:8088/Accompany/update
```

方法：POST

参数：

```
{

  "id":"1",       //校园陪餐对应记录id

  "mealDate":"2020-9-10",

  "mealTime":"餐次",

  "mealAccompanys":"bbbbbbbbbb",

  "canteenHealth":"1",

  "foodQuality":"1",

  "mealNumber":"1",

  "staffAttitude":"1",

  "staffSpecifications":"1",

  "totalSatisfaction":"1",

  "diningWindow":"aaa",   //url

  "mealRecord":"aaa",     //url

  "diningEnvironment":"aaa"  //url

}
```

返回值：

```
{

  "status": "success",

  "data": **null**

}
```

### 获取所有校园陪餐

```
远程：https://www.yiwifi1.com:8088/startSelfInspection/update
```

方法：POST

参数：不传参

```
{

  "status": "success",

  "data": [

​    {

​      "id": 1,

​      "enterpriseId": 296661,

​      "mealDate": "2020-09-10",

​      "mealTime": "餐次",

​      "mealAccompanys": "bbbbbbbbbb",

​      "canteenHealth": "1",

​      "foodQuality": "1",

​      "mealNumber": "1",

​      "staffAttitude": "1",

​      "staffSpecifications": "1",

​      "totalSatisfaction": "1",

​      "diningWindow": "aaa",

​      "mealRecord": "aaa",

​      "diningEnvironment": "aaa",

​      "operator": "mini",

​      "operatorIp": "127.0.0.1",

​      "operatorTime": "2020-10-02T13:43:07.000+0000"

​    },

​    {

​      "id": 11,

​      "enterpriseId": 296661,

​      "mealDate": "2020-09-03",

​      "mealTime": "午餐",

​      "mealAccompanys": "chao",

​      "canteenHealth": "满意",

​      "foodQuality": "满意",

​      "mealNumber": "满意",

​      "staffAttitude": "满意",

​      "staffSpecifications": "满意",

​      "totalSatisfaction": "满意",

​      "diningWindow": "C:\\Users\\my\\Desktop\\weixin2\\IMDY\\upload\\picture\\202009\\1600786481356.png",

​      "mealRecord": "C:\\Users\\my\\Desktop\\weixin2\\IMDY\\upload\\picture\\202009\\1600786481356.png",

​      "diningEnvironment": "C:\\Users\\my\\Desktop\\weixin2\\IMDY\\upload\\picture\\202009\\1600786481356.png",

​      "operator": "mini",

​      "operatorIp": "127.0.0.1",

​      "operatorTime": "2020-09-30T14:14:04.000+0000"

​    }

  ]
```

### 删除校园陪餐

```
远程：https://www.yiwifi1.com:8088:8088/Accompany/delete
```

方法：POST

参数:

```
{

  "id":2

}

```

返回值：

```
{

  "status": "success",

  "data": **null**

}

```

### 导出校园陪餐word

```
远程：https://www.yiwifi1.com:8088/startSelfInspection/standingAccompanyRecord
```

方法：POST

参数：

```
{

​    "id":11  //校园陪餐记录Id

}
```

返回值：

```
{

  "status": "success",

  "data": **null**

}
```

### 按日期查找校园陪餐记录

```
远程：https://www.yiwifi1.com:8088/Accompany/getAccompanyRecordByDate
```

方法：POST

参数：

```
{

​     "date":"2020-9-10"

}
```

返回值：

```
{

  "status": "success",

  "data": [

​    {

​      "id": 1,

​      "enterpriseId": 296661,

​      "mealDate": "2020-09-10",

​      "mealTime": "餐次",

​      "mealAccompanys": "bbbbbbbbbb",

​      "canteenHealth": "1",

​      "foodQuality": "1",

​      "mealNumber": "1",

​      "staffAttitude": "1",

​      "staffSpecifications": "1",

​      "totalSatisfaction": "1",

​      "diningWindow": "aaa",

​      "mealRecord": "aaa",

​      "diningEnvironment": "aaa",

​      "operator": "mini",

​      "operatorIp": "127.0.0.1",

​      "operatorTime": "2020-10-02T13:43:07.000+0000"

​    },

​    {

​      "id": 12,

​      "enterpriseId": 296661,

​      "mealDate": "2020-09-10",

​      "mealTime": "午餐",

​      "mealAccompanys": "chao",

​      "canteenHealth": "满意",

​      "foodQuality": "满意",

​      "mealNumber": "满意",

​      "staffAttitude": "满意",

​      "staffSpecifications": "满意",

​      "totalSatisfaction": "满意",

​      "diningWindow": "aaa",

​      "mealRecord": "aaa",

​      "diningEnvironment": "aaa",

​      "operator": "mini",

​      "operatorIp": "127.0.0.1",

​      "operatorTime": "2020-10-02T13:40:25.000+0000"

​    }

  ]

}
```



## 新增自查（董志涵）

`远程：https://www.yiwifi1.com:8088/startSelfInspection/insert`

方法：GET

- 参数：
```json
{
    "inspectionPosition":"3号厨房",//自查位置
    "startSelfInspectionList":[
        {
            "positionArea":"加工区",//位置区域
            "inspector":"董志涵测试",//监察人
            "inspectTime":"2020-09-09",//检查时间
            "positionCatch":"位置抓取",//位置抓取
            "picture":""//照片
        },
        {
            "positionArea":"操作间",
            "inspector":"董志涵测试",
            "inspectTime":"2020-09-09",
            "positionCatch":"位置抓取",
            "picture":""
        }
    ]
}
```

- 返回值
```json
{
    "status": "success",
    "data": null
}
```

## 按照时间获取自查位置（董志涵）
`远程：http://www.yiwifi1.com:8088/startSelfInspection/getInspectionPositionByDate`

方法：GET

- 参数：
```
    start1=2019-12-17 //日期
```

- 返回值
```json
{
    "status": "success",
    "data": [
        {
            "id": 1, //自查位置id
            "enterprise": 296661,
            "inspectionPositionName": "1号厨房", //自查位置
            "inspectionTime": "2020-09-09T00:00:00.000+0000", //检查时间
            "inspector": "董志涵测试", //监察人
            "operator": "",
            "operatorTime": "2020-09-15T01:47:48.000+0000",
            "operatorIp": ""
        },
        {
            "id": 2,
            "enterprise": 296661,
            "inspectionPositionName": "2号厨房",
            "inspectionTime": "2020-09-09T00:00:00.000+0000",
            "inspector": "董志涵测试",
            "operator": "",
            "operatorTime": "2020-09-15T01:49:55.000+0000",
            "operatorIp": ""
        }
    ]
}
```

## 按照自查位置id获取详细内容（董志涵）
`远程：http://www.yiwifi1.com:8088/startSelfInspection/getInspectionByPosition`

方法：GET

- 参数：
```
    positionId=1 //自查位置id
```

- 返回值
```json
{
    "status": "success",
    "data": [
        {
            "id": 6, //详细内容（位置区域）id
            "enterprise": 296661,
            "positionArea": "加工区", //位置区域
            "inspector": "董志涵测试", //检查人
            "inspectTime": "2020-09-09T00:00:00.000+0000", //检查时间
            "positionCatch": "位置抓取", //位置抓取
            "picture": "", //照片
            "operator": "用户名称",
            "operatorIp": "124.124.124",
            "operatorTime": "2020-09-15T01:47:48.000+0000",
            "inspectionPosition": 1
        },
        {
            "id": 7,
            "enterprise": 296661,
            "positionArea": "操作间",
            "inspector": "董志涵测试",
            "inspectTime": "2020-09-09T00:00:00.000+0000",
            "positionCatch": "位置抓取",
            "picture": "",
            "operator": "用户名称",
            "operatorIp": "124.124.124",
            "operatorTime": "2020-09-15T01:47:48.000+0000",
            "inspectionPosition": 1
        }
    ]
}
```

## 修改自查（董志涵）
`远程：https://www.yiwifi1.com:8088/startSelfInspection/update`

方法：GET

- 参数：
```json
{
    "inspectionPosition":"3号厨房修改测试", //自查位置
    "inspectionPositionId":3, //自查位置记录的id
    "startSelfInspectionList":[
        {
            "id":10, //详细信息id
            "positionArea":"加工区", //位置区域
            "inspector":"董志涵测试修改", //检查人
            "inspectTime":"2020-09-09", //检查时间
            "positionCatch":"位置抓取", //位置抓取
            "picture":"" //照片
        },
        {
            "id":11,
            "positionArea":"操作间",
            "inspector":"董志涵测试修改",
            "inspectTime":"2020-09-09",
            "positionCatch":"位置抓取",
            "picture":""
        }
    ]
}
```

- 返回值
```json
{
    "status": "success",
    "data": null
}
```

## 删除自查（董志涵）
`远程：https://www.yiwifi1.com:8088/startSelfInspection/delete`

方法：GET

- 参数：
```
    id=1 //自查位置记录的id
```

- 返回值
```json
{
    "status": "success",
    "data": null
}
```

## 健康证 

### 通过身份证号获取人员培训信息 (刘宁)

`/supervision/ca/getByIdNumber`

postman访问地址：

`https://www.yiwifi1.com:8088/supervision/ca/getByIdNumber`

方法：GET

- 参数：
```
{idNumber:12} //身份证号
```

- 返回值
    - 如果没有该人员 返回
```json

{
    "status": "fail",
    "data": {
        "errCode": 10001,
        "errMsg": "该人员未注册",
        "errList": null
    }
}

```
-如果有该人员 返回  
```json
    {
    "status": "success",
    "data": {
        "id": 1493,
        "companyId": 305563,
        "companyName": "测试公司",
        "name": "测222",
        "idNumber": "123",
        "sexy": 0,
        "telephone": "",
        "workType": 1,
        "industry": 1,
        "electronicNumber": "",
        "health": "合格",
        "train": "已培训",
        "education": "研究生",
        "healthNumber": "1",
        "startTime": "2020-07-13T21:18:40.000+0000",
        "endTime": "2020-07-17T21:18:42.000+0000",
        "issuingAuthority": "1",
        "photo": "",
        "operateTime": "2020-09-06T23:10:34.000+0000",
        "operator": "",
        "operateIp": ""
    }
}    
```


### 新增人员信息(刘宁)

>注意 主页接口/mini/getEPInfoById 有修改 目前返回有 企业id(itemId为1)和企业名称(itemId为2)

接口:
如果该人员用上面==通过身份证号获取人员培训信息==获取不到该人员信息，则调用
`/supervision/ca/insert`

postman访问地址：

`https://www.yiwifi1.com:8088/supervision/ca/insert`

方法：POST 'content-type': 'application/json'

- 参数：
```json
{
"companyId": 296661,//公司id 从之前获取主页的接口处得到
"companyName": "市场主体名称*",//公司名称 从之前获取主页的接口得到
"startTime": "2020-09-07T01:01:02.000Z",//有效期限起
"endTime": "2020-09-08T01:07:12.046Z",//有效期限至
"health": "合格",//体检情况
"healthNumber": "123456",//健康证号
"idNumber": "160703020",//身份证号
"issuingAuthority": "wwwww",//发证机关
"name": "Liuning",//姓名
"industry":1,//所属行业
"workType": 1,//工作种类
"sexy": 0
}
```

- 返回值
```json
{
    "status": "success",
    "data": null
}
```
如果能获取到信息则调用

`/supervision/ca/update`

方法：POST 'content-type': 'application/json'

- 参数：
```json
{
"id":1498//对应supervision_ca的id，是从上面的接口 通过身份证号获取人员培训信息获得
"companyId": 296661,//公司id 从之前获取主页的接口处得到
"companyName": "市场主体名称*",//公司名称 从之前获取主页的接口得到
"startTime": "2020-09-07T01:01:02.000Z",//有效期限起
"endTime": "2020-09-08T01:07:12.046Z",//有效期限至
"health": "合格",//体检情况
"healthNumber": "123456",//健康证号
"idNumber": "160703020",//身份证号
"issuingAuthority": "wwwww",//发证机关
"name": "Liuning",//姓名
"industry":1,//所属行业
"workType": 1,//工作种类
"sexy": 0
}
```

- 返回值
```json
{
    "status": "success",
    "data": null
}
```

### 获取行业类别和工作种类列表 做选择(刘宁)
`/exam/subject/getIndustryAndWorkType`

postman访问地址：

`https://www.yiwifi1.com:8088/exam/subject/getIndustryAndWorkType`

方法：GET

- 返回值
```json
{
    "status": "success",
    "data": {
        "allWorkType": [
            {
                "id": 1,
                "industryId": 1,//对应下面industry列表的Id
                "name": "食品安全员",
                "operator": "操作人",
                "operateTime": "2019-09-02T01:30:37.000+0000",
                "operateIp": "124.214.124"
            }
        ],
        "allIndustry": [
            {
                "id": 1,
                "name": "食品经营",
                "number": 0,
                "premissName": "食品经营企业",
                "status": 0,
                "remark": "foodBusiness",
                "operator": "操作人",
                "operateTime": "2019-09-01T09:29:28.000+0000",
                "operateIp": "124.124.124"
            }
        ]
    }
}
```
### 删除员工/如果设置成离岗(刘宁)
`/supervision/ca/delete`

postman访问地址：

`https://www.yiwifi1.com:8088/supervision/ca/delete`

方法：GET

- 参数：
```
{
	caId:1493
}
```

- 返回值
```json
{
    "status": "success",
    "data": null
}
```

## 配货单
### 新增配货单（董志涵）
`远程：https://www.yiwifi1.com:8088/distribution/insert`

方法：GET

- 参数：
```
    listName=名字 //配货单名称
    explainText=说明 //说明
```

- 返回值
```json
{
    "status": "success",
    "data": null
}
```

### 按企业获取配货单（董志涵）
`远程：https://www.yiwifi1.com:8088/distribution/getByEnterpriseId`

方法：GET

- 参数：
```
无
```

- 返回值
```json
{
    "status": "success",
    "data": [
        {
            "id": 1,
            "enterprise": 296661,
            "listName": "配货单名字",//配货单名称
            "explainText": "说明测试",//说明
            "operator": "用户名称",
            "operatorIp": "124.124.124",
            "operatorTime": "2020-09-07T15:36:28.000+0000"
        },
        {
            "id": 2,
            "enterprise": 296661,
            "listName": "配货单名字",
            "explainText": "说明",
            "operator": "用户名称",
            "operatorIp": "124.124.124",
            "operatorTime": "2020-09-07T15:30:12.000+0000"
        }
    ]
}
```

### 修改配货单（董志涵）
`远程：https://www.yiwifi1.com:8088/distribution/update`

方法：GET

- 参数：
```
    id=1 //配货单的id
    listName=名字 //配货单名称
    explainText=说明 //说明
```

- 返回值
```json
{
    "status": "success",
    "data": null
}
```

### 删除配货单（董志涵）
`远程：https://www.yiwifi1.com:8088/distribution/delete`

方法：GET

- 参数：
```
    id=1 //配货单的id
```

- 返回值
```json
{
    "status": "success",
    "data": null
}
```

## 供应商
### 根据供应商名称查询供应商（董志涵）
`远程：https://www.yiwifi1.com:8088/mini/getSupplier`

方法：GET

- 参数：
```
name=回收 //供应商名称
```

- 返回值
```json
{
    "status": "success",
    "data": [
        {
            "id": 21,
            "enterpriseId": 296661,
            "enterpriseName": "市场主体名称*",
            "areaId": 1,
            "stype": "生产企业",
            "address": "地址*",
            "principal": "负责人*",//联系人
            "type": "主体类型",
            "organ": "发证机关",
            "phone": "联系电话*",//联系方式
            "name": "供应商名称*",//供应商名称
            "number": "食品经营许可证号*",//许可证号
            "license": "社会信用代码证号*",//社会信用代码
            "supplierSize": "许可范围*",
            "person": "供应商联系人*",
            "start": "2020-08-14T07:45:09.000+0000",//开始时间
            "end": "2020-08-14T07:45:09.000+0000",//截止时间
            "document": "",//文件
            "operator": "操作人",
            "operatorIp": "124.124.124",
            "operatorTime": "2020-08-14T07:45:09.000+0000"
        }
    ]
}
```

### 获取供应商（董志涵）
`远程：https://www.yiwifi1.com:8088/mini/getSupplier`

方法：GET

- 参数：
```
无
```

- 返回值
```json
{
    "status": "success",
    "data": [
        {
            "id": 21,
            "enterpriseId": 296661,
            "enterpriseName": "市场主体名称*",
            "areaId": 1,
            "stype": "生产企业",
            "address": "地址*",
            "principal": "负责人*",
            "type": "主体类型",
            "organ": "发证机关",
            "phone": "联系电话*",//联系方式
            "name": "供应商名称*",//供应商名称
            "number": "食品经营许可证号*",//许可证号
            "license": "社会信用代码证号*",//社会信用代码
            "supplierSize": "许可范围*",
            "person": "供应商联系人*",//联系人
            "start": "2020-08-14T07:45:09.000+0000",//开始时间
            "end": "2020-08-14T07:45:09.000+0000",//截止时间
            "document": "",//文件
            "operator": "操作人",
            "operatorIp": "124.124.124",
            "operatorTime": "2020-08-14T07:45:09.000+0000"
        }
    ]
}
```

### 根据名称获取供应商（董志涵）
`远程：https://www.yiwifi1.com:8088/mini/getSupplier`

方法：GET

- 参数：
```
name=回收 //供应商名称
```

- 返回值
```json
{
    "status": "success",
    "data": [
        {
            "id": 21,
            "enterpriseId": 296661,
            "enterpriseName": "市场主体名称*",
            "areaId": 1,
            "stype": "生产企业",
            "address": "地址*",
            "principal": "负责人*",
            "type": "主体类型",
            "organ": "发证机关",
            "phone": "联系电话*",//联系方式
            "name": "供应商名称*",//供应商名称
            "number": "食品经营许可证号*",//许可证号
            "license": "社会信用代码证号*",//社会信用代码
            "supplierSize": "许可范围*",
            "person": "供应商联系人*",//联系人
            "start": "2020-08-14T07:45:09.000+0000",//开始时间
            "end": "2020-08-14T07:45:09.000+0000",//截止时间
            "document": "",//文件
            "operator": "操作人",
            "operatorIp": "124.124.124",
            "operatorTime": "2020-08-14T07:45:09.000+0000"
        }
    ]
}
```

## 通知公告
### 获取全部通知（董志涵）
`远程：https://www.yiwifi1.com:8088/sys/notice/getPage2`

方法：GET

- 参数：
```
无
```

- 返回值
```json
{
    "status": "success",
    "data": [
        {
            "id": 1,
            "sendObject": "test1",
            "type": "A",//类别
            "title": "test1",//标题
            "author": "A",
            "pudate": "2019-08-19T15:11:33.000+0000",//发布时间
            "enclosure": "http://127.0.0.1:8080/upload/picture/1566312468135.png",//附件
            "remarkerId": 0,
            "remarkerName": "",
            "status": 0,
            "operator": "",
            "operateTime": "2019-08-19T15:09:12.000+0000",
            "operateIp": "",
            "content": null//内容
        }
    ]
}
```

### 按照类别获取通知（董志涵）
`远程：https://www.yiwifi1.com:8088/sys/notice/getPage2`

方法：GET

- 参数：
```
type=类别 //类别
```

- 返回值
```json
{
    "status": "success",
    "data": [
        {
            "id": 1,
            "sendObject": "test1",
            "type": "A",//类别
            "title": "test1",//标题
            "author": "A",
            "pudate": "2019-08-19T15:11:33.000+0000",//发布时间
            "enclosure": "http://127.0.0.1:8080/upload/picture/1566312468135.png",//附件
            "remarkerId": 0,
            "remarkerName": "",
            "status": 0,
            "operator": "",
            "operateTime": "2019-08-19T15:09:12.000+0000",
            "operateIp": "",
            "content": null//内容
        }
    ]
}
```

### 按照标题名称获取通知（董志涵）
`远程：https://www.yiwifi1.com:8088/sys/notice/getPage2`

方法：GET

- 参数：
```
tile=标题 //标题
```

- 返回值
```json
{
    "status": "success",
    "data": [
        {
            "id": 1,
            "sendObject": "test1",
            "type": "A",//类别
            "title": "test1",//标题
            "author": "A",
            "pudate": "2019-08-19T15:11:33.000+0000",//发布时间
            "enclosure": "http://127.0.0.1:8080/upload/picture/1566312468135.png",//附件
            "remarkerId": 0,
            "remarkerName": "",
            "status": 0,
            "operator": "",
            "operateTime": "2019-08-19T15:09:12.000+0000",
            "operateIp": "",
            "content": null//内容
        }
    ]
}
```

## 采购单信息
### 新增采购单信息（董志涵）
`远程：https://www.yiwifi1.com:8088/formatoriginextra/insertList`

方法：POST

- 参数：
```
[
    {
        "materialcategory":"肉类", //种类
        "materialname":"测试修改猪肉", //名称
        "specifications":"规格1", //规格
        "manufacturer":"生产商1", //供应商
        "brand":"品牌1", //品牌
        "listId":1, //所属的配货单id
        "qualityGuaranteePeriod":14, //保质期
        "foodType":"食品类型" //食品类型
    },
    {
        "materialcategory":"肉类",
        "materialname":"测试修改鸡肉",
        "specifications":"规格2",
        "manufacturer":"生产商2",
        "brand":"品牌2",
        "listId":1,
        "qualityGuaranteePeriod":14,
        "foodType":"食品类型"
    }
]
```

- 返回值
```json
{
    "status": "success",
    "data": null
}
```

### 修改采购单信息（董志涵）
`远程：https://www.yiwifi1.com:8088/formatoriginextra/updateList`

方法：POST

- 参数：
```
[
    {
        "id":6144, //采购单id
        "materialcategory":"肉类", //种类
        "materialname":"测试修改猪肉", //名称
        "specifications":"规格1", //规格
        "manufacturer":"生产商1", //供应商
        "brand":"品牌1", //品牌
        "listId":1, //所属的配货单id
        "qualityGuaranteePeriod":14, //保质期
        "foodType":"食品类型" //食品类型
    },
    {
        "id":6145,
        "materialcategory":"肉类",
        "materialname":"测试修改鸡肉",
        "specifications":"规格2",
        "manufacturer":"生产商2",
        "brand":"品牌2",
        "listId":1,
        "qualityGuaranteePeriod":14,
        "foodType":"食品类型"
    }
]
```

- 返回值
```json
{
    "status": "success",
    "data": null
}
```

### 删除采购单信息（董志涵）
`远程：https://www.yiwifi1.com:8088/formatoriginextra/delete`

方法：GET

- 参数：
```
id=1 //采购单信息id
```

- 返回值
```json
{
    "status": "success",
    "data": null
}
```

### 获取本企业某个配货单的采购单信息（董志涵）
`远程：https://www.yiwifi1.com:8088/formatoriginextra/getPageByListId`

方法：GET

- 参数：
```
listId=1 //配货单id
```

- 返回值
```json
{
    "status": "success",
    "data": [
        {
            "id": 6142,
            "enterpriseId": 296661,
            "enterpriseName": "市场主体名称/石油大学",
            "areaId": 1,
            "materialcategory": "肉类",//类型
            "materialname": "鸡肉", //名称
            "specifications": "规格", //规格
            "manufacturer": "生产商", //供应商
            "brand": "品牌", //品牌
            "state": "",
            "extra": "",
            "operator": "操作人",
            "operatorIp": "124.124.124",
            "operatorTime": "2020-09-09T10:24:49.000+0000",
            "listId": 1,
            "qualityGuaranteePeriod": 14, //保质期
            "foodType": "食品类型" //食品类型
        }
    ]
}
```



## 模板下载和数据导出

### 数据导出

`废弃物：https://www.yiwifi1.com:8088/formatwaste/standingBook`

`消毒：https://www.yiwifi1.com:8088/formatdisinfection/standingBook`

`食品留样：https://www.yiwifi1.com:8088/formatleave/standingBook`

`索证索票：https://www.yiwifi1.com:8088/formatOriginRecordEx/standingOriginRecord`

方法：POST

- 参数：

```
废弃物的：
{
    "start1":"2020-09-08",//开始日期
    "end1":"2020-09-12"//结束日期
}
消毒、食品留样的：
{
    "start":"2020-09-08",//开始日期
    "end":"2020-09-12"//结束日期
}
索证索票的：
{
    "start2":"2020-09-08",//开始日期
    "end2":"2020-09-12"//结束日期
}
```

- 返回值

```json
{
    "status":"success",
    "data":"upload/standingBook/202009/废弃物处理296661.xlsx" //Excel路径
}
```

### 模板下载

`废弃物模板：https://www.yiwifi1.com:8088/upload/template/【导出】废弃物处理模板.xlsx`

`消毒模板：https://www.yiwifi1.com:8088/upload/template/【导出】清洗消毒模板.xlsx`

`食品留样模板：https://www.yiwifi1.com:8088/upload/template/【导出】食品留样模板.xlsx`

`索证索票模板：https://www.yiwifi1.com:8088/upload/template/【导出】原料索证模版.xlsx`

方法：POST

- 参数：

```

```

- 返回值

```json

```





# 公众端

## 游客登录（董志涵）

`远程：https://www.yiwifi1.com:8088/formatoriginextra/insert`

方法：GET

- 参数：
```
id= 296661 //点击的企业的id
```

- 返回值
```json
{
    "status": "success",
    "data": null
}
```

## 游客获取全部企业（董志涵）
`远程：https://www.yiwifi1.com:8088/supervision/enterprise/getAll`

方法：GET

- 参数：
```
无
```

- 返回值
```json
{
    "status": "success",
    "data": [
    {
        "id": 296445, //企业id
            "enterpriseName": "东营区胜百灯具店",//企业名
            "shopName": null, //店招名称
            "postalCode": null,
            "registeredAddress": null, //地址
            "businessAddress": null,
            "legalPerson": "姚敏敏",
            "idNumber": "92370502MA3R3MA82L",
            "licenseNumber": null,
            "cantacts": null,
            "cantactWay": "92370502MA3R3MA82L", //联系电话
            "regulators": 13,
            "area": 2,
            "grid": 0,
            "supervisor": "",
            "enterpriseScale": "",
            "gridPerson": null,
            "riskRating": null,
            "riskRatingLastyear": null,
            "dynamicGrade": null,
            "yearAssessment": null,
            "email": null,
            "officePhone": null,
            "patrolFrequency": null,
            "transformationType": null,
            "businessStatus": null,
            "permissionState": null,
            "permissionType": null,
            "ipIdNumber": null,
            "ipMobilePhone": null,
            "ipSexy": null,
            "ipEducation": null,
            "ipPoliticalOutlook": null,
            "ipCurrentAddress": null,
            "ipNation": null,
            "ipEmail": null,
            "ipPostalCode": null,
            "spName": null,
            "spidNumber": null,
            "spOfficePhone": null,
            "spMobilePhone": null,
            "spEmail": null,
            "spSexy": null,
            "spEducation": null,
            "spCurrentAddress": null,
            "spTraining": null,
            "operationMode": "个体",
            "housingProperty": null,
            "owner": null,
            "ownerIdNumber": null,
            "ownerMobilePhone": null,
            "agent": null,
            "agentIdNumber": null,
            "agentMobilePhone": null,
            "otherPhone": null,
            "integrityLevel": null,
            "productionArea": null,
            "fixedAssets": null,
            "practitioners": null,
            "examinationPopulation": null,
            "warehouse1": null,
            "warehouse2": null,
            "warehouse3": null,
            "abbreviation": null,
            "introduction": null,
            "culture": null,
            "classification": null,
            "propagandaEnclosure": null,
            "businessTermStart": null,
            "businessTermEnd": null,
            "businessTermFlag": null,
            "givenDate": null,
            "givenGov": null,
            "businessScale": null,
            "businessState": 1,
            "abnormalId": 0,
            "abnormalContent": "",
            "isStop": 0,
            "gpsFlag": null,
            "operateTime": null,
            "operateIp": null,
            "operator": null
    }
    ]
}
```