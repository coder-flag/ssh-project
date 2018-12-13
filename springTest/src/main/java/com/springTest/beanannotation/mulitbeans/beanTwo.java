package com.springTest.beanannotation.mulitbeans;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author: 邹家辉
 * @Description:
 * @Date: Create in 14:57 2018/12/13
 * @Modified By:
 **/
@Order(1)
@Component
public class beanTwo implements beaninterface {
}
