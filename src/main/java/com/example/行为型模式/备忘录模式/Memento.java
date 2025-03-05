package com.example.行为型模式.备忘录模式;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 备忘录对象
 *
 * @author zrj
 * @since 2021/11/8
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Memento {
    //角色名称
    private String name;
    //攻击力
    private int vit;
    //防御力
    private int def;
}

