package osf.food;

import java.util.HashMap;
import java.util.Map;

import osf.food.controller.FoodController;

public class Execute {
	private FoodController fc = new FoodController();

	public static void main(String[] args) {
		Map<String, String> req = new HashMap<>(); //가상의 요청, 응답 객체
		Map<String, Object> res = new HashMap<>();
		Execute e = new Execute();
		try {
			req.put("cmd", "list");
			e.fc.doGet(req, res); 
			System.out.println(res);

			req = new HashMap<>();
			res = new HashMap<>();
			req.put("cmd", "food");
			req.put("foodNum", "2");
			e.fc.doGet(req, res);
			System.out.println(res);
			
			req = new HashMap<>();
			res= new HashMap<>();
			req.put("cmd", "update");
			req.put("foodNum", "2");
			req.put("foodName", "Pork");
			req.put("foodPrice", "30000");
			e.fc.doPost(req, res);
			System.out.println(res);
			
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}
