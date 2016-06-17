<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Electronics EShop</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="/Product">Home</a></li>
      <li><a href="About">About Us</a></li>
      <li><a href="Contact">Contact Us</a></li> 
      <li><a data-toggle="modal" data-target="#myModal">Login</a></li> 
      <li><a href="Register">Register</a></li> 
      <li><a  href="disp?prd=4">View All</a></li>
      <li><a href="add">Add Product</a></li>
    </ul>
  </div>
</nav>
<div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div style="background-color:lightgreen;"  class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4  class="modal-title">LOGIN</h4>
        </div>
        <div class="modal-body">
        <form role="form">
    <div  class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" placeholder="Enter email">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password">
    </div>
    <div class="checkbox">
      <label><input type="checkbox"> Remember me</label>
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
          
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>