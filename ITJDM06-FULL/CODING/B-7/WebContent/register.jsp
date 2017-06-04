<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>TMPS00033</title>
<link href="css/styles.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.4/jquery.min.js"></script>
<script src="js/jquery.quicksand.js" type="text/javascript"></script>
<script src="js/jquery.easing.js" type="text/javascript"></script>
<script src="js/script.js" type="text/javascript"></script>
<script src="js/jquery.prettyPhoto.js" type="text/javascript"></script>
<link href="css/prettyPhoto.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="header-wrap">
  <div class="logo">
    <h1>DATA-MINING</h1>
  </div>
</div>
<!---header-wrap-End--->
<div class="menu-wrap">
  <div class="menu">
    <ul>
            <li><a href="home.jsp" >HOME</a></li>
            <li><a href="login.jsp">LOGIN</a></li>
            <li><a href="register.jsp" class="active">REGISTER</a></li>        
            <li><a href="contact.jsp">CONTACT</a></li>
    </ul>
  </div>
  <div class="socia-wrap">
    <div class="socail">
      <ul>
        <li><a href="#"><img src="images/aim.png" alt="" /></a></li>
        <li><a href="#"><img src="images/facebook.png" alt="" /></a></li>
        <li><a href="#"><img src="images/twwtter.png" alt="" /></a></li>
        <li><a href="#"><img src="images/linkedin.png" alt="" /></a></li>
      </ul>
    </div>
  </div>
</div>
<!---menu-wrap-End--->
<div class="page-wrapper">
  <div class="portfolio-content">
   
   
     <div class="lg-container" style="background-color: white; width:380px;">
		<h1 style="color:black;">REGISTER</h1>
		<form action="Register" id="lg-form" name="lg-form" method="post">
			
			<div>
				<label for="username">Username:</label>
				<input type="text" title="Username (letters and numbers only, no punctuation or special characters)" pattern="[A-Za-z0-9]+"  name="username" id="username" placeholder="username"/>
			</div>
			
			<div>
				<label for="email">email:</label>
<!-- 				     <input type="text" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" title="Please enter valid email address"  name="email" id="email" placeholder="email"/> -->
				     <input type="text"  title="Please enter valid email address"  name="email" id="email" placeholder="email"/>
			</div>
			
			<div>
				<label for="password">Password:</label>
				<input type="password" pattern=".{6,}" title="PLease  enter minimum six character"  name="password" id="password" placeholder="password" />
			</div>
			
			<div>
				<label for="password">confirmPassword:</label>
				<input type="password"  pattern=".{6,}" title="PLease  enter minimum six character" name="confirmpassword" id="confirmpassword" placeholder="confirmpassword" />
			</div>
			<div>
				<label for="gender">gender:</label>
			  <select name="gender" style="width:380px;">
				<option value="gender" style="text-align:center">----GENDER----</option>
				<option value="male">MALE</option>
				<option value="female">FEMALE</option>
				</input>
				</select>
			</div>
			
			
			<div>
				<label for="mobile">MOBILE:</label>
				<input type="text" pattern="[7-9]{1}[0-9]{9}" title="Mobile number starting with 9 or 8 or 7 and other 9 digit using any number"  title="PLease  enter must ten numbers" name="mobile" id="mobile" placeholder="mobile"/>
			</div>
			
			<div>
				<label for="address">Address:</label>
				<input type="text" name="address" id="address" placeholder="address"/>
			</div>
			
		<div>	
		<center>			
				<button type="submit" id="login" >REGISTER</button>
				
				
				</center>
				</form>
				</div>
			</div>
			<center>
        <a href="login.jsp" style="color:black;" ><span> CLICK HERE!</span>  already member? go to login</a>
      </center>
      <div class="column-clear"></div>
    </ul>
    <!--end portfolio-area -->
    
  </div>
</div>
<!---page-wrap-End--->
<div class="clearing"></div>
<div class="footer-wrap">
  <div class="wrap">
    <div class="panel marRight30">
      <div class="title">
        <h1>Testimoniala</h1>
      </div>
      <div class="content">
        <div class="testimonials"> Accusantium dolo remque la udantium totam  consequat tortor pretium sit amet volFusce pellentesque </div>
        <span>- John Goe</span> </div>
    </div>
    <div class="panel marRight30">
      <div class="title">
        <h1>Newsletter</h1>
      </div>
      <div class="content">
        <ul>
          <li>
            <input name="input" type="text"  class="input-newsletter"/>
          </li>
          <li>
            <input type="button" class="button" value="Signup" />
          </li>
        </ul>
        <p>Vivamus lorem lectus, gravida a euismod ut, semper eu lectus lorem ipsum.</p>
        <span><a href="#">Unsubscribe</a></span> </div>
    </div>
    <div class="panel">
      <div class="title">
        <h1>Contact us </h1>
      </div>
     <!--  <div class="cotact">
        <ul>
          <li><img src="images/icon6.png" alt="" />(000) 888 888888</li>
          <li><img src="images/icon7.png" alt="" /><a href="mailto:info@companyname.com">info@companyname.com</a></li>
          <li><img src="images/icon8.png" alt="" />Name of site owner</li>
        </ul>
      </div> -->
    </div>
    <div class="clearing"></div>
  </div>
</div>
<!---footer-wrap--->
<div class="clearing"></div>
<div class="copyright-wrap">
  <div class="wrap">
   <!--  <div class="content">
      <p>Copyright (c) websitename. All rights reserved.
        <<a href="www.alltemplateneeds.com" class="active"> www.alltemplateneeds.com</a> > 
        Images From:<a href="www.photorack.net"> www.photorack.net</a></p>
    </div> -->
  </div>
</div>
<!---copyright-wrap-End--->
</body>
</html>
