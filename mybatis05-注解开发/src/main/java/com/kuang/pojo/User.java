package com.kuang.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author ：fzj
 * @date ：2021/1/8
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;  //id
    private String name;   //姓名
    private String pwd;   //密码
}
