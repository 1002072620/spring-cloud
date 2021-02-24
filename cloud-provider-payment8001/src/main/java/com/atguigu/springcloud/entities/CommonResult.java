package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author shkstart
 * @create 2021-02-23 15:43
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
//返回前端通用的json实体串
public class CommonResult<T>
{
    private Integer code;
    private String message;
    private T      data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }


}
