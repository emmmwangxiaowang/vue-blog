package com.wang.common.lang;

import com.baomidou.mybatisplus.extension.api.R;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author: 王航
 * @Email: 954544828@qq.com
 * @Date: 2022/5/11
 */

@Data
@NoArgsConstructor
public class Result implements Serializable {

    private int code;
    private String msg;
    private Object data;

    public static Result succ(Object data){
        return succ(200,"操作成功",data);
    }

    private static Result succ(int code, String msg, Object data) {
        Result r = new Result();
        r.code = code;
        r.msg = msg;
        r.data = data;
        return r;
    }

    public static Result fail(String msg){
        return fail(400,msg,null);
    }

    public static Result fail(String msg, Object data){
        return fail(400,msg,data);
    }

    private static Result fail(int code, String msg, Object data) {
        Result r = new Result();
        r.code = code;
        r.msg = msg;
        r.data = data;
        return r;
    }


}
