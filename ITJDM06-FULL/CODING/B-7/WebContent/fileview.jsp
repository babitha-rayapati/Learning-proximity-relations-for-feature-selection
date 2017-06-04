<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@page import="com.itextpdf.text.log.SysoCounter"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ page import="java.util.*" %>
<%@ page import="com.Dbconnection.*" %>

<%@page import="java.util.*" %>

<%@ page import="java.sql.Connection.*" %>
<%@ page import="java.sql.DriverManager.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.sql.*" %>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>TMPS00033</title>
<link href="css/styles.css" rel="stylesheet" type="text/css" />
</head>
<body>

<div class="header-wrap">
	<div class="logo">
		<h1>DATA-MINING</h1>
    </div>
</div><!---header-wrap-End--->

<div class="menu-wrap">
	<div class="menu">
		<ul>
        	<li><a href="home.jsp" >home</a></li>
           
             <li><a href="fileupload.jsp" >upload</a></li> 
              <li><a href="fileview.jsp" class="active">file view</a></li>      
            <li><a href="home.jsp">LOGOUT</a></li>
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
</div><!---menu-wrap-End--->

<div class="page-wrap">
<div class="wrap3">  
  <div class="leftcol">
  <div class="panel">
  
 
	
	<% String username=request.getSession().getAttribute("username").toString();
	System.out.println("username"+username);

	%>
	
	
	 <%	
		          PreparedStatement ps ;
					ResultSet rs ;
                  
					String query = "SELECT * FROM `itjdm06`.`upload` where username='"+username+"'";
					ps=Dbconnection.createConnection().prepareStatement(query);
					
					rs = ps.executeQuery();
			
        %>
        
     
        <form style="height:500px; margin-left: 30px;">

					<table style="width: 100%" border="1" cellspacing="5"
						cellpadding="5">

						<tr>
							
							  <th>USERNAME</th>
						      <th>FILE NAME</th>
							 <th>FILE TYPE</th>
							 <th>FILE SIZE</th>
 							
						</tr>
						<%
							while (rs.next()) {
						%>
						<tr>
							<td><%=rs.getString(1) %></td>
							<td><%=rs.getString(2) %></td>
							<td><%=rs.getString(3) %></td>
							<td><%=rs.getString(4) %></td>
						</tr>
						<%
							}
						%>
					</table>
				</form>
        
        
        
        
        
      
  </div>
 

  

	<!-- <form action="Fileupload" method="post" enctype="multipart/form-data" style="height:600px;">
	<center>
	<input type="file" name="file" style="margin-top: 180px;">
	
	</input>
   <input type="submit" value="upload" />
	</center>
	</form> -->
		<div id="message"></div>
	
    	</div>
    </div>
    </div>
  
<!--   <div class="rightcol">
  	<div class="panel">
  		<div class="title"><h1>Lorem ipsum <br /> Nulla varius libero</h1></div>
    	<div class="content">
        	<div class="icon"><img src="images/icon5.png" alt="icon" /></div>
            <spna>Fusce commodo </spna>
           
        </div>
        <div class="content marTop40">
        	<div class="icon"><img src="images/icon5.png" alt="icon" /></div>
            <spna>Donec lacinia </spna>
          
        </div>
        <div class="content marTop40">
        	<div class="icon"><img src="images/icon5.png" alt="icon" /></div>
            <spna>Vestibulum aliquam</spna>
            <p>Vestibulum fringilla nisl sit amet metus tristique</p>
            <div class="button marTop30"><a href="#">More Info</a></div>
        </div>
    </div>
  	<div class="panel marTop40">
  		<div class="title"><h1>Nulla facilisi<br />Suspendisse aliquet</h1></div>
    	<div class="content">
        	<p>Mauris ornare eros in purus cursus molliam nec gravida magna.</p>
            <ul>
            	<li><a href="#">- Lorem ipsum dolor sit amet, consect</a></li>
                <li><a href="#">- Duis varius lectus at nunc dignissim tin</a></li>
                <li><a href="#">- Morbi ac mauris lacus, ac mol</a></li>
                <li><a href="#">- Etiam sollicitudin nisi a leo porta</a></li>
                <li class="bg-bottom"><a href="#">- Pellen sepien gravids loreet ornare</a></li>
            </ul>
            <div class="button marTop30"><a href="#">More Info</a></div>
        </div>
    </div>
  </div>   -->
    
  <div class="clearing"></div>
</div>    
</div><!---page-wrap-End--->
<div class="footer-wrap">
  <div class="wrap">
   
     
    </div>
   
      <!---footer-wrap--->
<div class="clearing"></div>
<div class="copyright-wrap">
	<div class="wrap">
    	<div class="content">
       
        </div>
	</div>
</div><!---copyright-wrap-End--->
</body>
</html>
