1、domain： 数据实体类
2、Dao： 数据接口访问层
3、Service： 数据服务接口层
4、Service Implements: 数据服务接口实现层
5、Controller: 前端控制器层
6、Config： 配置类
7、Dto： 数据传输对象
8、Vo： 视图包装对象 View Object用于封装客户端请求的数据，防止部分数据泄漏
9、Constant: 常量类


二、注解积累学习
1、@Controller和@RestController区别？
1) 如果只是使用@RestController注解Controller，则Controller中的方法无法返回jsp页面，或者html，配置的视图解析器 InternalResourceViewResolver不起作用，返回的内容就是Return 里的内容。
2) 如果需要返回到指定页面，则需要用 @Controller配合视图解析器InternalResourceViewResolver才行。
   如果需要返回JSON，XML或自定义mediaType内容到页面，则需要在对应的方法上加上@ResponseBody注解。