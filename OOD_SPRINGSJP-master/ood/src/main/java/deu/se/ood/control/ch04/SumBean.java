/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.se.ood.control.ch04;

import deu.se.ood.control.*;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class SumBean {
      public int n;
    public int result;

    public SumBean() {
        n = 0;
        result = 0;
        log.debug("SumBean 생성자 호출");
    }

    public void calculate() {
        result = n * (n + 1) / 2;
    }
}
