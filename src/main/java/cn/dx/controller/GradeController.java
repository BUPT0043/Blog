package cn.dx.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.dx.model.Grade;
import cn.dx.service.GradeService;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class GradeController {

	protected final Log log = LogFactory.getLog(GradeController.class);

	@Autowired
	@Qualifier("GradeService")
	private GradeService gradeService;

	@RequestMapping(value = "/gradeList", method = { RequestMethod.GET })
	private String gradeList(HttpServletRequest request, Model model,
			@RequestParam(required = false, defaultValue = "1") int pageNum,
			@RequestParam(required = false, defaultValue = "10") int pageSize) {
		// 分页请求参数
		model.addAttribute("url", "gradeList");
		PageHelper.startPage(pageNum, pageSize);
		List<Grade> list = gradeService.getPageList();
		PageInfo<Grade> page = new PageInfo<Grade>(list);
		model.addAttribute("page", page);
		log.info("请求分页成功");
		return "grade/gradeList";
	}

	@RequestMapping(value = "/gradeAdd", method = { RequestMethod.GET })
	private String inAdd(HttpServletRequest request, Model model) {
		log.info("进入添加班级成功");
		return "grade/gradeAdd";
	}

	@RequestMapping(value = "/gradeAdd", method = { RequestMethod.POST })
	private String add(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		Grade grade = new Grade();
		grade.setName(name);
		grade.setDescription(description);
		this.gradeService.add(grade);
		log.info("添加班级成功");
		return "redirect:gradeList";
	}

	@RequestMapping(value = "/gradeDel{id}", method = { RequestMethod.GET })
	private String del(HttpServletRequest request, Model model,
			@PathVariable("id") int id) {
		this.gradeService.delete(this.gradeService.getGrade(id));
		log.info("删除班级成功");
		return "redirect:gradeList";
	}

	@RequestMapping(value = "/gradeEdit{id}", method = { RequestMethod.GET })
	private String edit(HttpServletRequest request, Model model,
			@PathVariable("id") int id) {
		Grade grade = this.gradeService.getGrade(id);
		model.addAttribute("grade", grade);
		return "grade/gradeEdit";
	}

	@RequestMapping(value = "/gradeEdit", method = { RequestMethod.POST })
	private String update(HttpServletRequest request, Model model) {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		Grade grade = this.gradeService.getGrade(id);
		grade.setName(name);
		grade.setDescription(description);
		this.gradeService.update(grade);
		log.info("更新成功");
		return "redirect:gradeList";
	}
}
