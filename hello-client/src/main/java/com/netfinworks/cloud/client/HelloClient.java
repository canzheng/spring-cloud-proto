package com.netfinworks.cloud.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by canzheng on 6/17/15.
 */
@FeignClient("my-cloud-client")
public interface HelloClient {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    String hello();
}
