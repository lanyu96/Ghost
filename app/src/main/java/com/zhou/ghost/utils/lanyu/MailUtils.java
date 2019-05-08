package com.zhou.ghost.utils.lanyu;

import java.util.Date;

import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailUtils {
    /**
     * 创建一封只包含文本的简单邮件
     *
     * @param session     和服务器交互的会话
     * @param sendMail    发件人邮箱
     * @param receiveMail 收件人邮箱
     * @return
     * @throws Exception
     */


    public static MimeMessage createMimeMessage(Session session, String sendMail, String receiveMail,String sendInfo,String date) throws Exception {
        // 1. 创建一封邮件
        MimeMessage message = new MimeMessage(session);


        // 2. From: 发件人
        message.setFrom(new InternetAddress(sendMail, "发件人", "UTF-8"));


        // 3. To: 收件人(可以增加多个收件人、抄送、密送)
        message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(receiveMail, "收件人", "UTF-8"));


        // 4. Subject: 邮件主题
        message.setSubject("蓝域工具箱报告"+date, "UTF-8");


        // 5. Content: 邮件正文(可以使用html标签)
        message.setContent(sendInfo, "text/html;charset=UTF-8");
//        message.setContent(sendInfo, "charset=UTF-8");

        // 6. 设置发件时间
        message.setSentDate(new Date());


        // 7. 保存设置
        message.saveChanges();


        return message;
    }
}


