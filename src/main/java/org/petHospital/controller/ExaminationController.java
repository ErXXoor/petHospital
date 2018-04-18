package org.petHospital.controller;

@Controller
//@RequestMapping("/")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ExaminationController {
  @Autowired
  private ExaminationService examinationService;

  /**
   * 获得指定页码的化验项目信息
   *
   * @param page 化验项目申请的页码
   * @return json数据信息
   */
  @RequestMapping(value = "admin/examination/{page}", method = RequestMethod.GET,produces = "text/html;charset=UTF-8")
  @ResponseBody
  public String getExamination(@PathVariable String page) {
      int pages = Integer.parseInt(page);
      List examinations = examinationService.getAllExamination();
      List<Examination> subexaminations = null;
      int total = (examinations.size()-1)/10+1;
      int fromIndex = (pages - 1) * 10;
      if (examinations.size() >= fromIndex) {
          int toIndex = pages * 10;
          if (examinations.size() >= toIndex) {
              subexaminations = examinations.subList(fromIndex, toIndex);
          } else {
              subexaminations = examinations.subList(fromIndex, examinations.size());
          }
      }
      class templateInfo {
          Integer id;
          String examinationName;
          Float examinationPrice;
          String description;
      }
      List<templateInfo> result = new ArrayList<templateInfo>();
      for (Examination examination : subexaminations) {
          templateInfo tempInfo = new templateInfo();//必须放在循环内
          tempInfo.id = examination.getId();
          tempInfo.examinationName = examination.getExaminationName();
          tempInfo.examinationPrice = examination.getExaminationPrice();
          tempInfo.description = examination.getDescription();
          result.add(tempInfo);
      }
      String json = null;
      ObjectMapper objectMapper = new ObjectMapper();
      objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
      try {
          json = objectMapper.writeValueAsString(result);
      } catch (JsonProcessingException e) {
          e.printStackTrace();
      }
      return "{\"data\":" + json + ",\"pages\":" + total + "}";
  }

  /**
   * 更新化验项目
   * @param examination 指定化验项目
   * @return 接口调用成功与否
   */
  @RequestMapping(value = "admin/examination",method = RequestMethod.PUT)
  @ResponseBody
  public String updateExamination(@RequestBody Examination examination){
      examinationService.updateExamination(examination);
      return "{\"result\":true}";
  }


  /**
   * 增加化验项目
   * @param examination 指定化验项目
   * @return 接口调用成功与否
   */
  @RequestMapping(value = "admin/examination", method = RequestMethod.POST)
  @ResponseBody
  public String saveExamination(@RequestBody Examination examination) {
      examinationService.saveExamination(examination);
      return "{\"result\":true}";
  }

  /**
   * 删除化验项目
   * @param examination 指定化验项目
   * @return 接口调用成功与否
   */
  @RequestMapping(value = "admin/examination",method = RequestMethod.DELETE)
  @ResponseBody
  public String deleteExamination(@RequestBody Examination examination) {
      Integer id = examination.getId();
      examinationService.deleteExamination(id);
      return "{\"result\":true}";
  }
}
