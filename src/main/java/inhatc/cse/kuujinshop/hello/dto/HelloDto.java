package inhatc.cse.kuujinshop.hello.dto;

import lombok.*;


@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class HelloDto {
    private String name;
    private int grade;
    private String dept;


}
