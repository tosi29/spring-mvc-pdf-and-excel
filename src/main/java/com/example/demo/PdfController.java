package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PdfController {
	
	@RequestMapping("/pdf")
	public MyPdfView pdf(MyPdfView mav) {
		List<String> words = new ArrayList<>();
		words.add("First word");
		words.add("Second word");
		mav.addStaticAttribute("wordList", words);
		return mav;
	}

}
