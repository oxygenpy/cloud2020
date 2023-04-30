package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LiJinLong
 * @description TODO
 * @create 2023-04-30 22:14
 * @date 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;


    public CommonResult(Integer code, String message){
        this(code, message, null);
    }
}
