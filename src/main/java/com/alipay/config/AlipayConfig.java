package com.alipay.config;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.io.FileWriter;
import java.io.IOException;
/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */
@ComponentScan
public class AlipayConfig {


    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016103000778524";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCWvx0C0ntLD48YKr7vVMcQwvyv6wumR+sURL5ghpTf5VHFjHnzSz1/B8cJaeodTJ2xgEPKS/bdCGcAhlPytlrdrk14kQ1EdLgmCLjN5oB6KCtEcQ0s7jNjT6AO2K/ANatUNVA3simz/xwMAbgJRQlM0Yyl2B1VK8ut4HWswBMt65RyoN+uGZjK/OQxfvL4GG9dTXHD8VkwKY8zoYDoiT0h+G0sbQtgr8Og/wqXqWwWUk29Ksf2nDbVTflnTIvlQV/uVebSO4YEbjAG84lVqIo2XU7anXBvYXi8LlCPRuBo4YitqFvEUowC355Kxz9Bc/HxSgJFQzhBJhxXYJGwQAZhAgMBAAECggEAeOUWUCAbjwwQV3JYpDoaV7/4xOC8/ALrbdrfzyu/k3wmw0awusSZshm7rzoI7qx2P1c9hqy7c3J8oLgZ9Sn335cdPFcgC8mLsb0G8OIuIUm7wWzlAyaZgcjm9WEkOgMQvzzuc2xn85nhlWN/g7ehCMF5ibuzco3oEC9WUE/OUeFENQftvw0Z+3VL3Hr/xCFjk6NOvviIQw0DkffczJuyucoE6S7i1V9TB0k52Jg0vE62xulBCgl2oU5BPWBIerTIi1U33cOCbK5YZgGMnHq8+VXYhLAg/2fVfcAIAA6Q0GS6pzsxXCPJ6nNbvhJLYNQUmyo3NPKoZXt1I4Rs2CIJfQKBgQDOev+XvLvc0jKmIirmUaWMirK9WkM8KDa1fph+wXtReSB57sqw+X/KTN86v/lCir+rV1FPXHu3vlTtZHjusUauKU7Q2n+TzwwVSuXQFIYSs2ZkeO3Y5CxNk5NhgCa14nzPzPLFsweTOkmk5+FdsajxvOP8Kpity6ggtinYIJzMLwKBgQC65kth1K7o0tOHgaoJLT6/Fgo6SHmgG+NUTF8BxTWA0+blHVyftk06+mANFnnuHDdd0KtFyNHu86VmQeoaVjCd7P94zytD8+1Ba8UUKo1i+K5NuhxRUK/VTfTI/7ZCBEKGT2gnTksBcUgiYYxxW/ifaGEzNMnaX0NMKYwY1Z7ibwKBgELn8DJG4cjoA6l5oNUI18/2kXxx5x9zGGcvIlLQdxkrWq6oBd3auuHejucGlcpOE1V98cb5fM1JS1OxHs6ZewGsOPHMG1LV4GB16InIXLlqkF82IDwLk59/ll4dnG2Lek4LZw9Qt7+pP3vD927YxpmuT2HCm76VI2GWJXD3AFfZAoGBAJOzi780pUW51xEvl4DJEN1SPaLxw6yUXYMxF6P+hdnZnI9UNO7C0yXY2C9/o7xY8Chjz/bGTaHZSs0VKjzGAIXN1ddTYY3CJ62bzZOyTSn5/UXP3rEkYtDfWqO98fsaArjB6D2n0f7B14/UJ3kuhbz0cFxXS24X+sclzmGR8I5hAoGBAMnpBhYdFEnEqDyxDKAjN+O9uN2CDd4wDkb/8fwulC9w3vjPTrHgYwbRRCEn5w+NT29kdqHPVgFAL/56506tkVGJ80V/FEUa3kfLN2KKiGEwXClNTLcoWoWmdz5Osy5Ms7+4Vn7r9XkS4YhXwkldqD6LAbLQJC5PwOmqCbUGZJhP";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAi7hujyVFL6E1zD+rYkrMcfnttWC/1YXGBO1S4d0ae4CC/IbOXd8zlIKZa8MBfL/ZOZD9pyjsaWKFhl7WhlD5cNV6sNnzNjjtodJvbxFLsbq90Q1ye7w8dfC0VLfqDAlYQctGjCuX/HBLd6tNEkuXOPaNflZapZUgHbPi4eZK+4FvxV4WlAK52Gqv61EqMoq50FK0Ppddc9+TZhmosQPivfhi2srGrWf2aSQ/V8oLi8x1j4e5P7gyQwga7cq2/460u17n9kJkvXik2GTS7Wvd261iPRFnJCl5A/qYfM/L9IaktMBCtZ188onIW2pZOHpJlJw8AGWLrtWcnzXmPRfo2wIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://www.baidu.com/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://www.baidu.com/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

