package org.java.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author：邱泽英
 * @Date：2019/8/3 11:27
 * @Description：文件
 */
@RestController
public class GitController {

    @GetMapping("init")
    public String init() {

        return "hello...12345";
    }
}
