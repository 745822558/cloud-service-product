package com.lax.springcloud.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName Payment
 * @Description 支付实体类
 * @Author liAnXin
 * @Date 2022/11/4 10:44
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_payment")
public class Payment implements Serializable {

    /**
     * id
     */
    private String id;

    /**
     * 流水号
     */
    private String serial;
}
