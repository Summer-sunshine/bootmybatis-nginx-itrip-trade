package com.wzh.po;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号,开发时使用沙箱提供的APPID，生产环境改成自己的APPID
    public static String APP_ID = "2016101500691048";

    // 商户私钥，您的PKCS8格式RSA2私钥
    //public static String APP_PRIVATE_KEY = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCu2UMZX9IEXn+H2ptW9scAHoG+J0SSbmTz2EZb+44j1cM0WqGgPat7Edi3HVp0y4yj5qCpZxfKy1Dm2jwUAyWbBM/PyrxqeA0K9/kUDYIpF6PgT41EdLkwL2o4gg/bM+0CCdNbkghRxHbV7VC+z71ebEMiKDRo4Zg0s9LJZzt5jywkdAsAXeSIj49nXDAURduhik2K18xHKmPeXyVculQg1IQ/fBTIZWZXw1ViFa3q2NOg/LBkiguduIJHX9yhoTe69RjiiHYg9gDgl6XvDyWFV1jmIc/5pht3AOOJU57RAS+qTbF6Y+D5EzpSr4WSKwwqYQbKcofOrEaMl97HmOzBAgMBAAECggEARV/Y2rGFL8yaxzl6lwe1L5vrGJqV/4+jqIiwagCmhhtjp1sqc9zkNCGBni4cXOkCdWmlZ3GLJCCFigMfAUW6XwaKucST+56EdkyrXER713gUwoRt5bJ2Y+L8P02DoxK4QC3L2bJYcLEGAZ12gy8D0PodrOjM2qxf6tFKmjTGiVUWEbW+oi9fwZmnT1bcdW3ESaxUf5GoNE/yoiNBnFSq6qOTQ3Vwegxi7LDFxkPXI4vOQvw5z2/q8MQ8NRfs7IhNMKdJjkLtkwwoh36nPUnlLhOdyMf6HQ20RCw3WIY7Cyfz3AOpo1/KFZTHiJkxdLbBYmQPFM1SN1aA4jEzTh8CvQKBgQD57mJRgRiZnIOIg+kM2SNN5dhQ+377qIZ6/Qf/xdUlgCoM9S+b/0nL4LM2H2gfn0OZr0Zv09hz1surPg1hUmcoUO3cZ/9HrRAfQtumAWCtfXhREaqxvieYSjt6HxsihCgJEHQMuWbOPOLuQsiKcGdo+xTW0ytUMKi1JEjGPhdAwwKBgQCzGCbtaR6LEov7xgV0zdBNIryqrg/WBmAvtFcFdZi+NE6Ivr+eqhZnzUdeJmqstmlodsW7B9xJeQ8mbulgR8ggZbOcUIM3jL1Vd0ShqbhUNwBWcEFV9vmDTdh8f0N8l3u9uOp43UntwOpld+hg4Y2MRiI5JxdnZUKafNC4ZboEKwKBgQDIVObj87l3L3hTDYDZNpdQ0kIwr1Yae/vHS1iFENsHoxKRrlpKDTfmvqaHZGc+qZcy8cZgzoq6V1qLWUK6VqWvMCdousdpeXPpytpq1sHabi7ptGKA9C2iqSXBfntukEXS9ig/JsEb4Lv5RPif1vdcs50BkOQzKImiIIJgvNZApwKBgGbMrDuGJUQKx1MjnSoooTJFiCooc2qUik2XpIO7tosnFxUi+HaohufaSubeAklVAzg1RNZQcr+xv2J+M3NSgKsn9Wr6Q/d0z5DpPvnUo7ujPoxfLwGbHCmkW2lK23/+q8aBCAWMb80K+QB5TWee0FL+RtKrf6GX3B01G9FcguO1AoGBALim7j3BR1FHcJQujV5ZHGaOH+J7ZWXMcN4LSxwKwiu6DeG790VPu0con0EtkhsmTuZeDhER8SS0KMzdhaGN2utcDxV+D9xFt40jCEmQRY7QFUL3z7cHmohEAtK3zb4FQKH4OYGMQV4xiqFoBevN5rLLFhSl/+3Mlu6ZKNWxGLTu";
    public static String APP_PRIVATE_KEY ="MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCzOH+vZUnMRCmea+JGsqONroJbi3wc71ui9vJVIhAzQRyWnRYh6/9syCFPHIl7D/+mS4ljo29VqhMF8SFADZTOLupISkOVcAHmyOLwo4BVa0yEXLmA8Ij7Ih4+quhTfzZ5AlsKycPhoFuUYV7vBujEbhWGdHrBKB2/G2URpwOk3wMG7u/++C/EhrErcFtzfDXRsOuhFXsJ50NCsD4SHN82o2unVGkbMn/q+pTbdH8lGivlUdnNJ3f49cg4392u7c7PxHBsYkYZezMHmJMV7QOAMfALijikS2x0rXG673ehjcvDwA3X8/SzVPyr3uZerDqqfYUiVrdEWoXBo4f9CKkVAgMBAAECggEABgQnhSPJTmobW44Tknv8sYziI2CTUgVW9imECQeTs6TD6OptC8Z4VJaDR7yVgOQQmOyAODAMVLvY16I4k4XhMOqyQqr7idCwv6aOt7VFYZiwgOD7+TAZ6RREH6ZtFiB3G6jQlZQgVzqi2GBMZ4m71pw7bMAMPt+x3/BzfBw3Kxmi3okesqrGNriNhOiN1a41HIU5xo6npb0dYbf8pjNNKUQj5XpVL2GQmGv4bZTdDa4scPoMYDwEVD8QAX2fmVzmgTJgnscy1wu7OGZuCpIZyGwV9wR8mBDJkRC1zVUuOiPllOPVxoUs3sjSoIczdayxa0WgQxtTU73iSc7W4a1iAQKBgQD4VWboHDdTch16niWRT2SIngHpmKq9h21FWyP/pshNJwQeq/XWTPMuREOD6dl7xrFpTcpcL6Ug7THn6qWQjXTyMKiBXeD3/S/zlCEtc+/Z8FtF8WpHTfQwnyE1D4taCxPQaoPR8lWxOgr1QjAr6L25gBC/xZz9/yZahkAuQQ19MQKBgQC4wOSDQYjnUZ+ksdJiFaiS0aqNOqLNwTllXwKowPrP5oLFz9KgkeI7FAf01f5QVpYgtmzNaGbQCJPnsD/CixJ6KqSQ5n9BSDaBEJkXUeoJngzYSVDcU9pNTk0RJP47dLd0RnPHQl2i5YsHQXDTByK9rctP+35T6Och9XBNkoZhJQKBgEHk929zvUKJL0VQHYvXU0flFYDUn8m228nhi0XVDaVbSv6QhqUcuhJ2zqt8K9dqO71DhQS9J8X66pktbE1VG8kAHFZngMCNEGJD1iHnd6eO3clLa/YLu1YDg54+x61W7yUIfn4BHbfvPOUjcQDVuzIzxz37w9KqF5VBtloPrPKhAoGAFf3X9YvCeQ5tO1RzX3uGglt0urTlFirO4zMpBN9bu42LuXIgdz6GOFQNEma6i+OSoTg1wUmRG2g5+tUu8cBOJb6XsivNr/6hhkFsh6sXeaeXjdNETcWpcZRFdin6HSeqgqu0Ml7C+JXsM6PlgykRSJS8Y7vi8KgDgzZM9N7hIgUCgYBnSoO3dsV+aAKGhtpk2bNuySBPtIXwOLkioN7IV3LI6DYr3P68yXM1IW/0jMmjs/YxsGy2rXDFYGt/1CZ57oAHAeV22AKa2jJ4qB81BXCfMa86xrqkLbioiNvNDJ6U8P8VM0Rv2tGczYKAGgXLylHWcUZ7hj+8P5gDy7rW0A4DlQ==";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String ALIPAY_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAszh/r2VJzEQpnmviRrKjja6CW4t8HO9bovbyVSIQM0Eclp0WIev/bMghTxyJew//pkuJY6NvVaoTBfEhQA2Uzi7qSEpDlXAB5sji8KOAVWtMhFy5gPCI+yIePqroU382eQJbCsnD4aBblGFe7wboxG4VhnR6wSgdvxtlEacDpN8DBu7v/vgvxIaxK3Bbc3w10bDroRV7CedDQrA+EhzfNqNrp1RpGzJ/6vqU23R/JRor5VHZzSd3+PXION/dru3Oz8RwbGJGGXszB5iTFe0DgDHwC4o4pEtsdK1xuu93oY3Lw8AN1/P0s1T8q97mXqw6qn2FIla3RFqFwaOH/QipFQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://localhost:8095/alipay.trade.page.pay-JAVA-UTF-8/notify_url.html";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问(其实就是支付成功后返回的页面)
    public static String return_url = "http://localhost:8095/return_url.html";
    // 签名方式
    public static String sign_type = "RSA2";
    // 字符编码格式
    public static String CHARSET = "utf-8";
    // 支付宝网关，这是沙箱的网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
    // 日之路径头
    public static String log_path = "C:\\";

//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
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
