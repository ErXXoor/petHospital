package org.petHospital.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.petHospital.mapper.UserMapper;
import org.petHospital.model.User;
import org.petHospital.model.UserEntity;
import org.petHospital.service.QueryService;
import org.petHospital.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import net.sf.json.JSONObject;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class UserController {
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;

//	private QueryService queryService;
	
//	private UserMapper userMapper;
	  @RequestMapping(value={"/","/index"})
	    public String index() {
		  JSONObject json = new JSONObject();
		  json.put("test","index");
	        return json.toString();
	    }

	/**
	 * 得到所有用户列表
	 * @return
	 */
	@GetMapping(path="/getAllUser")
	public List<User> findUserList(){
		return userService.findAllUser();
	}
	
	/**
	 * 用户注册
	 * @param username
	 * @param password
	 * @return
	 */
	@PostMapping(path="/register")
	public String register(@RequestParam String username, @RequestParam String password){
		JSONObject json = new JSONObject();

		if(checkUsername(username)){
			json.put("retCode", "0003");
			json.put("msg", "用户名已存在");
			return json.toString();
		}else{
			userService.addUser((int)System.currentTimeMillis(), username, password, 0);
			json.put("retCode", "0000");
			json.put("msg", "注册成功");
			return json.toString();
		}
	}
	
	/**
	 * 用户登录
	 * @param username
	 * @param password
	 * @return
	 */
	@PostMapping(path="/login")
	public String getInlogin(@RequestParam String username, @RequestParam String password){
		try{
		JSONObject json = new JSONObject();
		
		if(!checkUsername(username)){
			json.put("retCode", "0002");
			json.put("msg", "用户名不存在");
			return json.toString();
//			return "no account";
		}else{
			List<User>list = userService.findUserByNameAndPassword(username, password);
			if(list.size()>0){
				json.put("retCode", "0000");
				json.put("msg", "登录成功");
				return json.toString();
//				System.out.println("success");
//				return "success";
			} else{
				json.put("retCode","0001");
				json.put("msg", "密码错误");
				return json.toString();
//				return "error";
			}
		}
		} catch (Exception e){
			e.printStackTrace();
			return "";
		}
	}

	/**
	 * 校验用户是否存在
	 * @param username
	 * @return
	 */
	Boolean checkUsername(String username){
		return userService.checkUsername(username);
	}
	
	@RequestMapping(value = "validate",method = RequestMethod.POST)
    @ResponseBody
    @JsonIgnoreProperties(ignoreUnknown=true)
    public Map<String, String> validate(@RequestBody Map map,HttpSession session){
		Map<String, String> result = new HashMap<String, String>();
		result.put("isValidated", "true");
		result.put("userType","1");
		return result;
	}
  
  
}