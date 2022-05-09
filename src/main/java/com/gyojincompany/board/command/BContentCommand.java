package com.gyojincompany.board.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gyojincompany.board.dao.BDao;
import com.gyojincompany.board.dto.BDto;

public class BContentCommand implements BCommand {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
		String bid = request.getParameter("bid");
		
		BDao dao = new BDao();
		BDto dto = dao.content_view(bid);
		
		request.setAttribute("content_view", dto);
	}

}
