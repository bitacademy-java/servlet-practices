package jstlel;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/01")
public class _01Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 값
		int iVal = 10;
		long lVal = 10;
		float fVal = 3.14f;
		boolean bVal = true;
		String sVal = "가나다라마바사";
		
		// 객체 테스트
		UserVo userVo = new UserVo();
		userVo.setNo(10L);
		userVo.setName("안대혁");
		
		Object obj = null;
		
		// Map을 사용하여 여러 값을 한 번에 넘기기
		Map<String, Object> map = new HashMap<>();
		map.put("ival", iVal);
		map.put("fval", fVal);
		map.put("sval", sVal);
		map.put("bval", bVal);
		
		
		
		request.setAttribute("iVal", iVal);
		request.setAttribute("lVal", lVal);
		request.setAttribute("fVal", fVal);
		request.setAttribute("bVal", bVal);
		request.setAttribute("sVal", sVal);
		
		request.setAttribute("vo", userVo);
		request.setAttribute("obj", obj);
		
		request.setAttribute("map", map);
		
		request.getRequestDispatcher("/WEB-INF/views/01.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
