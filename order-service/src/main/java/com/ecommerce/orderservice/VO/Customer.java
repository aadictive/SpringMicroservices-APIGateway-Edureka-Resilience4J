package com.ecommerce.orderservice.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private Integer id;
    private String last;
    private String first;
    private String mobile;
    private String homephone;
    private String office_email;
    private String personal_email;
    private Character status;
}
