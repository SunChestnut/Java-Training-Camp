CREATE TABLE crown_user
(
    user_id     VARCHAR(32) NOT NULL PRIMARY KEY COMMENT "用户ID",
    login_name  VARCHAR(32) NOT NULL COMMENT "登录名",
    login_pwd   VARCHAR(50) NOT NULL COMMENT "登录密码",
    tel         INTEGER(11) DEFAULT NULL COMMENT "手机号",
    mail        VARCHAR(50) DEFAULT NULL COMMENT "邮箱",
    create_time TIMESTAMP   DEFAULT CURRENT_TIMESTAMP COMMENT "创建时间",
    update_time TIMESTAMP   DEFAULT NULL COMMENT "更新时间"
)
    COMMENT "用户表";

CREATE TABLE user_ship_addr
(
    ship_id           VARCHAR(32) NOT NULL PRIMARY KEY COMMENT "主键ID",
    user_id           VARCHAR(32) NOT NULL COMMENT "用户ID",
    receiver_name     varchar(20)  DEFAULT NULL COMMENT '收货姓名',
    receiver_phone    varchar(20)  DEFAULT NULL COMMENT '收货固定电话',
    receiver_mobile   varchar(20)  DEFAULT NULL COMMENT '收货移动电话',
    receiver_province varchar(20)  DEFAULT NULL COMMENT '省份',
    receiver_city     varchar(20)  DEFAULT NULL COMMENT '城市',
    receiver_district varchar(20)  DEFAULT NULL COMMENT '区/县',
    receiver_address  varchar(200) DEFAULT NULL COMMENT '详细地址',
    receiver_zip      varchar(6)   DEFAULT NULL COMMENT '邮编',
    create_time       TIMESTAMP    DEFAULT CURRENT_TIMESTAMP COMMENT "创建时间",
    update_time       TIMESTAMP    DEFAULT NULL COMMENT "更新时间"
)
    COMMENT "用户收货地址表";

CREATE TABLE category
(
    category_id    VARCHAR(32) NOT NULL PRIMARY KEY COMMENT "类目ID",
    category_level INTEGER     DEFAULT 0 COMMENT "层级",
    category_name  VARCHAR(50) DEFAULT NULL COMMENT "目录名",
    pid            varchar(32) DEFAULT NULL COMMENT "父级ID",
    is_del         SMALLINT    DEFAULT 0 COMMENT "是否已删除：0-否；1-是",
    reate_time     TIMESTAMP   DEFAULT CURRENT_TIMESTAMP COMMENT "创建时间",
    update_time    TIMESTAMP   DEFAULT NULL COMMENT "更新时间"
)
    COMMENT "类目表";

CREATE TABLE goods
(
    goods_id    VARCHAR(32) NOT NULL PRIMARY KEY COMMENT "商品ID",
    goods_name  VARCHAR(50) NOT NULL COMMENT "商品名",
    goods_desc  VARCHAR(255) DEFAULT NULL COMMENT "商品描述",
    goods_img   VARCHAR(50)  DEFAULT NULL COMMENT "商品图",
    goods_price INTEGER     NOT NULL COMMENT "价格",
    stock       INTEGER     NOT NULL COMMENT "库存量",
    is_del      SMALLINT     DEFAULT 0 COMMENT "是否已删除：0-否；1-是",
    reate_time  TIMESTAMP    DEFAULT CURRENT_TIMESTAMP COMMENT "创建时间",
    update_time TIMESTAMP    DEFAULT NULL COMMENT "更新时间"
))
COMMENT "商品表";

CREATE TABLE category_goods_relation
(
    id          VARCHAR(32) NOT NULL PRIMARY KEY COMMENT "主键ID",
    category_id VARCHAR(32) NOT NULL COMMENT "类目ID",
    goods_id    VARCHAR(32) NOT NULL COMMENT "商品ID"
)
    COMMENT "类目-商品关系表";

CREATE TABLE
    ORDER
(
    order_id     VARCHAR(32) NOT NULL PRIMARY KEY COMMENT "订单ID",
    order_no     bigint(20) DEFAULT NULL COMMENT "订单号",
    user_id      VARCHAR(32) NOT NULL COMMENT "用户ID",
    ship_id      VARCHAR(32) NOT NULL,
    payment      BIGINT      NOT NULL COMMENT "支付金额",
    payment_time TIMESTAMP   NOT NULL COMMENT "支付时间",
    order_status INT        DEFAULT NULL COMMENT "订单状态：0-已取消;10-未付款;20-已付款;40-已发货;50-交易成功;60-交易关闭"
)
    COMMENT "订单表";

CREATE TABLE order_item
(
    id          VARCHAR(32) NOT NULL PRIMARY KEY COMMENT "订单字表ID",
    order_no    bigint(20) DEFAULT NULL COMMENT "订单号",
    category_id VARCHAR(32) NOT NULL COMMENT "类目ID",
    goods_id    VARCHAR(32) NOT NULL COMMENT "商品ID",
    goods_name  VARCHAR(50) NOT NULL COMMENT "商品名",
    goods_price INTEGER     NOT NULL COMMENT "价格",
    quantity    int(10)    DEFAULT NULL COMMENT "商品数量",
    total_price BIGINT     DEFAULT NULL COMMENT "商品总价"
)
    COMMENT "订单子表";