package cf.jamesmarc.cloudDisk.entity;

import java.awt.image.BufferedImage;
import java.io.Serializable;

/**
 * 验证码对象
 * Created by xinhu on 2017/11/6.
 */
public class VerifyCode implements Serializable{
    //默认四位
    private int verifySize = 4;
    //验证码
    private String verifyCode;
    //图片
    BufferedImage image;

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public int getVerifySize() {
        return verifySize;
    }

    public void setVerifySize(int verifySize) {
        this.verifySize = verifySize;
    }
}
