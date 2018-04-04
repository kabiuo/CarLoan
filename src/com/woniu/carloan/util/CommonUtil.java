package com.woniu.carloan.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.codec.digest.DigestUtils;

public final class CommonUtil {

    private CommonUtil() {
        throw new AssertionError();
    }

    public static String getFilenameWithoutSuffix(String filename){
        int pos = filename.lastIndexOf(".");
        return pos>0?filename.substring(0, pos):filename;
    }

    /**
     * 取出文件名中的后缀名
     * @param filename 文件名
     * @return 后缀名
     */
    public static String getSuffix(String filename){
        int pos =filename.lastIndexOf(".");
        return pos>0 && filename.length() > 2 ? filename.substring(pos):null;
    }

    /**
     * 获得基于MD5摘要的文件名
     * @param input 文件输入流
     * @param suffix 文件后缀名
     * @return MD5摘要形式的文件名
     * @throws IOException
     */
    public static String getMd5Filename(InputStream input, String suffix) throws IOException {
        String md5 = DigestUtils.md5Hex(input);
        return md5 + (suffix != null ? suffix : "");
    }
}
