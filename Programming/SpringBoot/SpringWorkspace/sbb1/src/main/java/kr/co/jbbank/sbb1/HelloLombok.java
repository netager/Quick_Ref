package kr.co.jbbank.sbb1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloLombok {
    private String hello;
    private int lombok;

    public static void main(String args) {
        HelloLombok hellolombok = new HelloLombok();
        hellolombok.setHello("헬로~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        hellolombok.setLombok(5);

        System.out.println(hellolombok.getHello());
        System.out.println(hellolombok.getLombok());

    }
}
