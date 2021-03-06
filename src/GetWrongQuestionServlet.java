import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.jizhibackend.bean.Question;
import com.jizhibackend.bean.User;
import com.jizhibackend.bean.WrongQCount;
import com.jizhitest.service.QuestionDaoImpl;
import com.jizhitest.service.UserDaoImpl;

public class GetWrongQuestionServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		User user = (User) request.getSession().getAttribute("user");
		int userid = Integer.parseInt(request.getParameter("userid")) ;
		UserDaoImpl dao = new UserDaoImpl();
		if((user==null))
			user = dao.findUser(userid);
		String type = request.getParameter("type");
		QuestionDaoImpl qdImpl = new QuestionDaoImpl();
		if (type.equals("list")) {

			List<Question> list = qdImpl.getWrongQuestions(user.getUserid());
			JSONObject jo = new JSONObject();
			JSONArray ja1 = JSONArray.fromObject(list);
			jo.element("TestWrongQ", ja1);

			List<Question> list2 = qdImpl.getPracticeWrongQuestions(user
					.getUserid());
			JSONArray ja2 = JSONArray.fromObject(list2);
			jo.element("PracticeWrongQ", ja2);
//			System.out.println(jo);
			out.print(jo);

		} else {
			String collectionType = request.getParameter("collectionType");
			JSONObject jo = null;
			if (collectionType.equals("practice")) {
				Map map = qdImpl.getWrongQuestionMap(user.getUserid(),2);
				jo = JSONObject.fromObject(map);
			} else {
				Map map = qdImpl.getWrongQuestionMap(user.getUserid(),1);
				jo = JSONObject.fromObject(map);
			}
//			System.out.println(jo);
			jo.element("systime", System.currentTimeMillis());
			out.print(jo);
		}
		out.flush();
		out.close();
	}
}
