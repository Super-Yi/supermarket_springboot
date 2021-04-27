package com.superyi.supermarket_springboot.controller;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import cn.afterturn.easypoi.excel.entity.enmus.ExcelType;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.superyi.supermarket_springboot.model.entity.Bill;
import com.superyi.supermarket_springboot.service.impl.BillServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.DateUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.List;

/**
 * @author Super-Yi
 * @date 2021/3/12
 **/

@Validated
@Controller
@Api(tags = "订单管理")
@RequestMapping("/bill")
public class BillController {

    @Autowired
    BillServiceImpl billService;

    @GetMapping("/list")
    @ApiOperation("获取订单列表")
    public String billList(Model model,
                           @RequestParam(defaultValue = "1") Integer pageNum) {
        PageHelper.startPage(pageNum, 5);
        List<Bill> bills = billService.findBill();
        PageInfo<Bill> billPageInfo = new PageInfo<>(bills);
        model.addAttribute("bills", billPageInfo);
        return "bill/bill_list";
    }

    @GetMapping("/add")
    public String billAddView() {
        return "bill/bill_add";
    }

    @PostMapping("/add")
    @ApiOperation("添加订单")
    public String billAdd(@Valid Bill bill) {
        billService.addBill(bill);
        return "redirect:/bill/list";
    }

    @GetMapping("/update")
    @ApiOperation("查询需要修改的订单")
    public String billUpdateView(@RequestParam Integer id,Model model) {
        Bill bill = billService.findBillById(id);
        model.addAttribute("bill", bill);
        return "bill/bill_update";
    }

    @PostMapping("/update")
    @ApiOperation("修改订单")
    public String billUpdate(Bill bill) {
        billService.update(bill);
        return "redirect:/bill/list";
    }

    @GetMapping("/delete")
    @ApiOperation("删除订单")
    public String deleteBill(@RequestParam Integer id) {
        billService.deleteBill(id);
        return "redirect:/bill/list";
    }

    @GetMapping("/export")
    public void export(HttpServletResponse response) {
        List<Bill> list = billService.findBill();
        String fileName="hzy.xlsx";
        ExportParams exportParams = new ExportParams();
        exportParams.setTitle("订单信息");
        exportParams.setSheetName("订单信息表");
        exportParams.setType(ExcelType.XSSF);
        Workbook workbook = ExcelExportUtil.exportExcel(exportParams, Bill.class, list);
        downLoadExcel(fileName, response, workbook);
    }

    private static void downLoadExcel(String fileName, HttpServletResponse response, Workbook workbook) {
        try {
            response.setCharacterEncoding("UTF-8");
            //application/vnd.ms-excel表示输出流中的数据保存到Excel文件
            response.setHeader("content-Type", "application/vnd.ms-excel");
            //Content-Disposition的作用：告知浏览器以何种方式显示响应返回的文件，用浏览器打开还是以附件的形式下载到本地保存
            //attachment表示以附件方式下载   inline表示在线打开   "Content-Disposition:inline; filename=文件名.mp3"
            // filename表示文件的默认名称，因为网络传输只支持URL编码的相关支付，因此需要将文件名URL编码后进行传输,前端收到后需要反编码才能获取到真正的名称
            response.setHeader("Content-Disposition", "inline;filename=" + URLEncoder.encode(fileName, "UTF-8"));
            //将表单数据数据写入响应的输出流中
            workbook.write(response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
