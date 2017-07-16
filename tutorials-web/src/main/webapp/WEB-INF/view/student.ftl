<html>  
	<p>${pageTitle}</p>  
	
	<p>姓名：${studentList.name}</p>  
	<p>年龄：${studentList.age}</p>  
	<p>地址：${studentList.address}</p>  
	<p>其它：${studentList.ad!}</p>  
  
	Welcome ${user!}!  
	Welcome ${user!'your name'}!  
	或者  
	${user?if_exists}  
  
	${user?default('your name')}  
  
	如果user找不到值，会输出  
	Welcome !  
	Welcome your name!  
	否则freemarker会报错  
  
</html>  