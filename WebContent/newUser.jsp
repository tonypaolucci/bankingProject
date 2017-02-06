<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.bankOps.User" %>
    <% User user = (User) session.getAttribute("user"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>What's in Your Wallet</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
<link rel="stylesheet" href="http://www.w3schools.com/lib/w3-theme-black.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="./css/styles.css">
<link rel="stylesheet" href="./css/bootstrap.min.css">
</head>
<style>
html,body,h1,h2,h3,h4,h5,h6 {font-family: "Roboto", sans-serif}
.w3-sidenav a,.w3-sidenav h4 {padding: 12px;}
.w3-navbar li a {
    padding-top: 12px;
    padding-bottom: 12px;
}
</style>
<body>

<!-- Navbar -->
<div class="w3-top">
  <ul class="w3-navbar w3-theme w3-top w3-left-align w3-large">
    <li class="w3-opennav w3-right w3-hide-large">
      <a class="w3-hover-white w3-large w3-theme-l1" href="javascript:void(0)" onclick="w3_open()"><i class="fa fa-bars"></i></a>
    </li>
	<!-- <Style>
	color= #c4bb2d;
	</style> -->
    <li><a href="#" class="w3-theme-l1"> What's in Your Wallet Bank and Trust</a></li>
    <li class="w3-hide-small"><a href="#" class="w3-hover-white">About</a></li>
    <!--<li class="w3-hide-small"><a href="#" class="w3-hover-white">Values</a></li>-->
    <li class="w3-hide-small"><a href="#" class="w3-hover-white">News</a></li>
    <li class="w3-hide-small"><a href="#" class="w3-hover-white">Contact</a></li>
    <!-- <li class="w3-hide-medium w3-hide-small"><a href="#" class="w3-hover-white">Clients</a></li>
    <li class="w3-hide-medium w3-hide-small"><a href="#" class="w3-hover-white">Partners</a></li> -->
  </ul>
</div>

<!-- Sidenav -->
<nav class="w3-sidenav w3-collapse w3-theme-l5 w3-animate-left" style="z-index:3;width:250px;margin-top:51px;" id="mySidenav">
  <a href="javascript:void(0)" onclick="w3_close()" class="w3-right w3-xlarge w3-padding-large w3-hover-black w3-hide-large" title="close menu">
    <i class="fa fa-remove"></i>
  </a>
  <h4><b>Menu</b></h4>
  <a href=".\acctOpen.html" class="w3-hover-black">Open new account</a>
  <a href=".\acctClose.html" class="w3-hover-black">Close an account</a>
  <a href=".\acctTransfers.html" class="w3-hover-black">Funds Transfer</a>
  <a href=".\acctBalance.html" class="w3-hover-black">Check Balance</a>
  <a href=".\orderChecks.html" class="w3-hover-black">Order Checks</a>
</nav>

<!-- Overlay effect when opening sidenav on small screens -->
<div class="w3-overlay w3-hide-large" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<!-- Main content: shift it to the right by 250 pixels when the sidenav is visible -->
<div class="w3-main" style="margin-left:250px">

  <div class="w3-row w3-padding-64">
    <div class="w3-twothird w3-container">
      <h1 class="w3-text-teal">Welcome to<br>What's in Your Wallet Bank and Trust</h1> 
      <h2 class="w3-text-teal">You're new here, tell us about yourself. We'll Take your money next.</h2> 
   <div class="row">
   <form class="formContainer"  action= "NewUserServlet" method= "post">
    <div class="form-group">
    <label for="userName">User Name</label>
    <input type="text" class="form-control" id="userName" name=userName placeholder="User Name">
  </div>
  <div class="form-group">
    <label for="password">Password</label>
    <input type="password" class="form-control" id="password" name=password placeholder="Password">
  </div>
  <div class="form-group">
    <label for="firstName">First Name<span class="redClass">*</span></label>
    <input type="text" class="form-control" id="firstName" name=firstName placeholder="First Name">
  </div>
   <div class="form-group">
    <label for="lastName">Last Name<span class="redClass">*</span></label>
    <input type="text" class="form-control" id="lastName" name=lastName placeholder="Last Name">
  </div>
   <div class="form-group">
    <label for="address">Address<span class="redClass">*</span></label>
    <input type="text" class="form-control" id="address" name=address placeholder="Address">
  </div>
   <div class="form-group">
    <label for="Phone">Phone Number<span class="redClass">*</span></label>
    <input type="text" class="form-control" id="phone" name=phone placeholder="Phone Number">
  </div>
  
  <div class="form-group">
    <label for="email">Email Address</label>
    <input type="email" class="form-control" id="email" name=email placeholder="Email">
  </div>
 
<!--   <div class="form-group"> -->
<!--     <label for="exampleInputFile">File input</label> -->
<!--     <input type="file" id="exampleInputFile"> -->
<!--     <p class="help-block">Example block-level help text here.</p> -->
<!--   </div> -->
<!--   <div class="checkbox"> -->
<!--     <label> -->
<!--       <input type="checkbox"> Check me out -->
<!--     </label> -->
<!--   </div> -->
  <button type="submit" class="btn btn-default">Submit</button> 
</form>
		   </div>
        </div><!--/.col-xs-12.col-sm-9-->
</div>

  <footer id="myFooter">
    <div class="w3-container w3-theme-l2 w3-padding-32">
      <h4>Footer</h4>
    </div>

    <div class="w3-container w3-theme-l1">
      <p>Powered by <a href="http://www.w3schools.com/w3css/default.asp" target="_blank">w3.css</a></p>
    </div>
  </footer>

<!-- END MAIN -->
</div>

<script>
// Get the Sidenav
var mySidenav = document.getElementById("mySidenav");

// Get the DIV with overlay effect
var overlayBg = document.getElementById("myOverlay");

// Toggle between showing and hiding the sidenav, and add overlay effect
function w3_open() {
    if (mySidenav.style.display === 'block') {
        mySidenav.style.display = 'none';
        overlayBg.style.display = "none";
    } else {
        mySidenav.style.display = 'block';
        overlayBg.style.display = "block";
    }
}

// Close the sidenav with the close button
function w3_close() {
    mySidenav.style.display = "none";
    overlayBg.style.display = "none";
}
</script>

<script type="text/javascript" style='display:none;'>
var __ez_dims = (function() {
	var setCookie = function( name, content, expiry ) {
		return document.cookie = name+'='+content+((expiry)?';expires='+(new Date(Math.floor(new Date().getTime()+expiry*1000)).toUTCString()):'');
	};
	var ffid = 1;
	var oh = window.screen.height;
	var ow = window.screen.width;
	var h = ffid === 1 ? oh : (oh > ow) ? oh : ow;
	var w = ffid === 1 ? ow : (oh > ow) ? ow : oh;
	var uh = window.innerHeight || document.documentElement.clientHeight || document.getElementsByTagName('body')[0].clientHeight;
	var uw = window.innerWidth || document.documentElement.clientWidth || document.getElementsByTagName('body')[0].clientWidth;
	setCookie('ezds', encodeURIComponent('ffid='+ffid+',w='+w+',h='+h), (31536e3*7));
	setCookie('ezohw', encodeURIComponent('w='+uw+',h='+uh), (31536e3*7));
})();
</script><script type='text/javascript' src='//www.w3schools.com/utilcave_com/inc/ezf-min.php?a=a&cb=143-3&shcb=5' style='display:none;'></script>
   <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
<!--     <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
    <script src="D:\Godfather00\Documents\bankProject\script/js/bootstrap.min.js"></script>
 -->    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
   <!--  <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
    <script src="offcanvas.js"></script> -->
</body>
</html>