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
	@Autowired
    private UserService userService;

    //log工厂
    private final Log log = LogFactory.getLog(getClass());

    /**
     * 获得指定页码的用户信息
     * @param page 用户申请的页码
     * @return json数据信息
     */
    @RequestMapping(value = "admin/user/{page}",method = RequestMethod.GET,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String getUsers(@PathVariable String page) {
        int pages = Integer.parseInt(page);
        List users = userService.getAllUser();
        List<User> subusers = null;
        int total = (users.size()-1)/10+1;
        int fromIndex = (pages - 1) * 10;
        if (users.size() >= fromIndex) {
            int toIndex = pages * 10;
            if (users.size() >= toIndex) {
                subusers = users.subList(fromIndex, toIndex);
            } else {
                subusers = users.subList(fromIndex, users.size());
            }
        }
        class templateInfo {
            Integer id;
            String userName;
            Integer userType;
        }
        List<templateInfo> result = new ArrayList<templateInfo>();
        for (User user : subusers) {
            templateInfo tempInfo = new templateInfo();//必须放在循环内
            tempInfo.id = user.getId();
            tempInfo.userName = user.getUserName();
            tempInfo.userType = user.getUserType();
            result.add(tempInfo);
        }

        log.info(result);
        log.info("templateInfo构建完成");
        String json = null;
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        try {
            json = objectMapper.writeValueAsString(result);
        } catch (JsonProcessingException e) {
            log.error(e);
            e.printStackTrace();
        }
        return "{\"data\":"+json+",\"pages\":"+total+"}";
    }

    /**
     * 更新用户
     * @param user 指定用户
     * @return 接口调用成功与否
     */
    @RequestMapping(value = "admin/user",method = RequestMethod.PUT)
    @ResponseBody
    public String updateUser(@RequestBody User user){
        try {
            userService.updateUser(user);
        }catch(Exception e) {
            return "{\"result\":false}";
        }
        return "{\"result\":true}";
    }

    /**
     * 增加用户
     * @param user 指定用户
     * @return 接口调用成功与否
     */
    @RequestMapping(value = "admin/user",method = RequestMethod.POST)
    @ResponseBody
    public String saveUser(@RequestBody User user){
        try {
            userService.saveUser(user);
        }catch(Exception e){
            return "{\"result\":false";
        }
        return "{\"result\":true}";
    }

    /**
     * 删除用户
     * @param user 指定用户
     * @return 接口调用成功与否
     */
    @RequestMapping(value = "admin/user",method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteUser(@RequestBody User user) {
        Integer id = user.getId();
        userService.deleteUser(id);
        return "{\"result\":true}";
    }

    /**
     * 认证用户登录信息
     * @param map 用户名与密码的映射
     * @param session 会话
     * @return 用户是否合法及用户类型
     */
    @RequestMapping(value = "validate",method = RequestMethod.POST)
    @ResponseBody
    @JsonIgnoreProperties(ignoreUnknown=true)
    public Map<String, String> validate(@RequestBody Map map,HttpSession session) {
        BufferedReader in= null;
        String captcha =  "";
        try {
            in = new BufferedReader(new FileReader("code.txt"));
            captcha = in.readLine();
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map<String, String> result = new HashMap<String, String>();
        if (map.get("captcha").toString().equalsIgnoreCase(captcha) || captcha.equals("")) {  //忽略验证码大小写
            User u = userService.getUser(map.get("userName").toString());
            if (u != null && u.getUserPwd().equals(map.get("userPwd").toString())) {
                result.put("isValidated", "true");
                result.put("userType", u.getUserType().toString());
            } else {
                result.put("isValidated", "false");
                result.put("err", "填写信息错误");
            }
        } else {
            result.put("isValidated", "false");
            result.put("err", "填写信息错误");
        }
        return result;
    }
}