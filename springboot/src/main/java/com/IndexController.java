package com;

import com.iting.productorder.entity.ProductOrder;
import com.iting.productorder.service.ProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.*;


//
//@PropertySource("classpath:application.properties") // 於https://start.spring.io建立Spring Boot專案時, application.properties文件預設已經放在我們的src/main/resources 目錄中，它會被自動檢測到
@Controller
public class IndexController {

//    // @Autowired (●自動裝配)(Spring ORM 課程)
//    // 目前自動裝配了EmpService --> 供第66使用
    @Autowired
    ProductOrderService productOrderSvc;

//    // inject(注入資料) via application.properties
//    @Value("${welcome.message}")
    private String message;

    private List<String> myList = Arrays.asList("Spring Boot Quickstart 官網 : https://start.spring.io", "IDE 開發工具", "直接使用(匯入)官方的 Maven Spring-Boot-demo Project + pom.xml", "直接使用官方現成的 @SpringBootApplication + SpringBootServletInitializer 組態檔", "依賴注入(DI) HikariDataSource (官方建議的連線池)", "Thymeleaf", "Java WebApp (<font color=red>快速完成 Spring Boot Web MVC</font>)");
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", message);
        model.addAttribute("myList", myList);
        return "index"; //view
    }
//
//    // http://......../hello?name=peter1
//    @GetMapping("/hello")
//    public String indexWithParam(
//            @RequestParam(name = "name", required = false, defaultValue = "") String name, Model model) {
//        model.addAttribute("message", name);
//        return "index"; //view
//    }
//
//
//    //=========== 以下第63~75行是提供給 /src/main/resources/templates/back-end/emp/select_page.html 與 listAllEmp.html 要使用的資料 ===================
//
//
//    @GetMapping("/productorder/listAllProductOrder")
//    public String listAllProductOrder(Model model) {
//        return "backend/productorder/listAllProductOrder";
//    }
//
//    @ModelAttribute("productorderListData")  // for select_page.html 第97 109行用 // for listAllEmp.html 第85行用
//    protected List<ProductOrder> referenceListData(Model model) {
//
//        List<ProductOrder> list = productOrderSvc.getAll();
//        return list;
//    }
//
//    @ModelAttribute("productorderListData") // for select_page.html 第135行用
//    protected List<ProductOrder> referenceListData_Dept(Model model) {
//        model.addAttribute("ProductOrder", new ProductOrder()); // for select_page.html 第133行用
//        List<ProductOrder> list = productOrderSvc.getAll();
//        return list;
//    }
//
}