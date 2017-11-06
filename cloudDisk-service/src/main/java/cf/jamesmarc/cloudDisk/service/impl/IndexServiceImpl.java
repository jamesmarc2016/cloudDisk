package cf.jamesmarc.cloudDisk.service.impl;

import cf.jamesmarc.cloudDisk.entity.VerifyCode;
import cf.jamesmarc.cloudDisk.service.IndexService;
import cf.jamesmarc.cloudDisk.utils.VerifyCodeUtils;

import java.io.IOException;

/**
 * Created by xinhu on 2017/11/6.
 */
public class IndexServiceImpl implements IndexService {

    public void getLoginImg(VerifyCode verifyCode){
        try {
            VerifyCodeUtils.generateVerifyCode(verifyCode);
        } catch (IOException e) {
            //TODO
            e.printStackTrace();
        }

    }



}
