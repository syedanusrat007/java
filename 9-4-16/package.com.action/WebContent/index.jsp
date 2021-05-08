<html>
<head>
<title>AJAX in Servlet using JQuery and JSON</title>
<script src="js/jquery-1.11.1.js" type="text/javascript"></script>

<script>
        $(document).ready(function() {

                $('.ajax-link').click(function() {
                        $('.page-content').hide();
                        var category = $(this).attr("data-category");
                       // the URL for the request
                        $.get('ajaxAction', {
                                // Parameter to be sent to server side
                                category : category
                        }, function(jsonResponse) {
                                $.each(jsonResponse, function(index, value) {
                                        $("#" + index).html(value);
                                        if (index % 2 == 0) {
                                                $("#" + index).addClass("lightblue");
                                        }
                                });                             
                                
                                $('.page-content').show();      
                        });
                });
        });
</script>
</head>
<body>
     <div class="main-content">
        <div>
             <h3>Click on the links</h3>
              <ul>
                <li><a href="#" class="ajax-link" data-category="serial">Top 5 Serial</a></li>
                <li><a href="#" class="ajax-link" data-category="movies">Top 5 Movies</a></li>
                <li><a href="#" class="ajax-link" data-category="sports">Top 5 Sports</a></li>
              </ul>

                <h3>Result will be displayed below via Ajax</h3>
                <div class="page-content">
                        <div id="0"></div>
                        <div id="1"></div>
                        <div id="2"></div>
                        <div id="3"></div>
                        <div id="4"></div>
                </div>
        </div>                  
      </div>
</body>
</html>