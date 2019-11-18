package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ExcelController {

	@RequestMapping("/excel")
	public MyExcelView excel(MyExcelView mav) {
		mav.addStaticAttribute("mydata", "myvalue");
		return mav;
	}
}
