package org.petHospital.controller;

@Controller
//@RequestMapping("/")
@CrossOrigin(origins = "*", maxAge = 3600)
public class CodeController {
  private int width = 90;//定义图片的width
  private int height = 20;//定义图片的height
  private int codeCount = 4;//定义图片上显示验证码的个数
  private int xx = 15;
  private int fontHeight = 18;
  private int codeY = 16;
  char[] codeSequence = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
          'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
          'X', 'Y', 'Z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

  /**
   * 生成验证码
   *
   * @param request  从客户端取数据的对象
   * @param response 向客户端发送数据的对象
   * @throws IOException
   */
  @RequestMapping(value = "captcha",method = RequestMethod.GET)
  public void getCode(HttpServletRequest request, HttpServletResponse response)
          throws IOException {

      // 定义图像buffer
      BufferedImage buffImg = new BufferedImage(width, height,
              BufferedImage.TYPE_INT_RGB);
//		Graphics2D gd = buffImg.createGraphics();
      //Graphics2D gd = (Graphics2D) buffImg.getGraphics();
      Graphics gd = buffImg.getGraphics();
      // 创建一个随机数生成器类
      Random random = new Random();
      // 将图像填充为白色
      gd.setColor(Color.WHITE);
      gd.fillRect(0, 0, width, height);

      // 创建字体，字体的大小应该根据图片的高度来定。
      Font font = new Font("Fixedsys", Font.BOLD, fontHeight);
      // 设置字体。
      gd.setFont(font);

      // 画边框。
      gd.setColor(Color.BLACK);
      gd.drawRect(0, 0, width - 1, height - 1);

      // 随机产生40条干扰线，使图象中的认证码不易被其它程序探测到。
      gd.setColor(Color.BLACK);
      for (int i = 0; i < 40; i++) {
          int x = random.nextInt(width);
          int y = random.nextInt(height);
          int xl = random.nextInt(12);
          int yl = random.nextInt(12);
          gd.drawLine(x, y, x + xl, y + yl);
      }

      // randomCode用于保存随机产生的验证码，以便用户登录后进行验证。
      StringBuffer randomCode = new StringBuffer();
      int red = 0, green = 0, blue = 0;

      // 随机产生codeCount数字的验证码。
      for (int i = 0; i < codeCount; i++) {
          // 得到随机产生的验证码数字。
          String code = String.valueOf(codeSequence[random.nextInt(36)]);
          // 产生随机的颜色分量来构造颜色值，这样输出的每位数字的颜色值都将不同。
          red = random.nextInt(255);
          green = random.nextInt(255);
          blue = random.nextInt(255);

          // 用随机产生的颜色将验证码绘制到图像中。
          gd.setColor(new Color(red, green, blue));
          gd.drawString(code, (i + 1) * xx, codeY);

          // 将产生的四个随机数组合在一起。
          randomCode.append(code);
      }
      // 将四位数字的验证码保存到Session中。
      HttpSession session = request.getSession();
      System.out.print(randomCode);

      FileWriter writer=new FileWriter("code.txt");
      writer.write(randomCode.toString());
      writer.close();

      session.setAttribute("captcha", randomCode.toString());

      // 禁止图像缓存。
      response.setHeader("Pragma", "no-cache");
      response.setHeader("Cache-Control", "no-cache");
      response.setDateHeader("Expires", 0);

      response.setContentType("image/jpeg");

      // 将图像输出到Servlet输出流中。
      ServletOutputStream sos = response.getOutputStream();
      ImageIO.write(buffImg, "jpeg", sos);
      sos.close();
  }
}
